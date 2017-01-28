/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  
 * @author Andreas
 */
@WebServlet(urlPatterns = {"/EchoData"})
public class EchoData extends HttpServlet {

    private AccountsHash accounts;
    
    @Override
     public void init() {
        accounts = new AccountsHash();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     
       
     /*
     * Request types:
     *1.edit 
     *2.edit_done
     *3.change_pas  
     *4.change_pas_conf
     *5.back
     *6.users_list
     *7.login
     *8.existing_account
     *9.login_page
     */ 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        Account new_user = new Account(
                      request.getParameter("username"), request.getParameter("email"), request.getParameter("password"), request.getParameter("firstname"), request.getParameter("lastname"), request.getParameter("date_of_birth")
                      , request.getParameter("gender"),request.getParameter("country"), request.getParameter("city"), request.getParameter("extrainfo")
              );
        Cookie[] cookies = null;
        cookies = request.getCookies();
        
       
        if(request.getParameter("type").equals("edit") && accounts.getHash().containsKey(cookies[1].getValue().toString())){
            System.out.println("!!!!!EDIT!!!!!");
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(accounts.create_html_edit_account_page(cookies[1].getValue().toString()));
            }
        }
        
        
        else if(request.getParameter("type").equals("change_pas")){
            System.out.println("!!!!!CHANGE PASSWORD!!!!!");
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(accounts.create_html_change_password(cookies[1].getValue().toString()));
            }
        }
        
        
        else if(request.getParameter("type").equals("change_pas_conf")){   
            System.out.println("!!!!!CHANGE PASSWORD CONFIRM!!!!!");
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
               Account user12= accounts.getHash().get(cookies[1].getValue().toString());
               if(user12.getPassword().equals(request.getParameter("oldpassword"))){
                    Account temp9= new Account(user12);
                    temp9.setPassword(request.getParameter("newpassword"));
                    accounts.getHash().put(cookies[1].getValue().toString(), temp9);
                   out.println(accounts.create_html_account_page(user12));
               }else{
                    response.sendError(412, "wrong old password");
               }
            }
        }
        
        
        else if(request.getParameter("type").equals("back")){
            System.out.println("!!!!!BACK!!!!!");
            try (PrintWriter out = response.getWriter()) {
                Account temp_back =accounts.getHash().get(cookies[1].getValue().toString());
                out.println(accounts.create_html_account_page(temp_back));
            }
        }
        
        
        else if(request.getParameter("type").equals("login_page")){
            System.out.println("!!!!!LOGIN PAGE!!!!!");
            try (PrintWriter out = response.getWriter()) {
                out.println(accounts.create_login_page());
            }
        }
        
        
        else if(request.getParameter("type").equals("existing_account")){       
            System.out.println("!!!!!EXISTING ACCOUNT!!!!!");            
            Account existing_user = accounts.getHash().get(request.getParameter("username"));
            if(existing_user ==null){
                response.sendError(412, "the user doesn't exist");
            } 
            else if(!request.getParameter("password").equals(existing_user.getPassword())){
                System.out.println("wrong password\n");
                response.sendError(412, "wrong password");
            }else{
                Cookie myCookie =
                new Cookie("username", request.getParameter("username"));
                response.addCookie(myCookie);
                response.setContentType("text/html;charset=UTF-8");
                System.out.println("Current number of users:   "+accounts.getHash().size());  
                try (PrintWriter out = response.getWriter()) {
                    out.println(accounts.create_html_account_page(existing_user));
                }
            }
        }
        
        
        else if(request.getParameter("type").equals("users_list")){
            System.out.println("!!!!!USERS LIST!!!!!");
            try (PrintWriter out = response.getWriter()) {
                System.out.println("cookie value(apo edit done): "+cookies[1].getValue().toString());
                out.println(accounts.create_html_all_accounts());
            }
        }
        
        
        else if(request.getParameter("type").equals("edit_done")){
            System.out.println("!!!!!EDIT DONE!!!!!");
            if(request.getParameter("username").equals("")) {
                response.sendError(412, "INVALID USERNAME");            
                return ;
            }
            Account user2 = accounts.getHash().get(cookies[1].getValue().toString());
            Account endiamesos = new Account();
            endiamesos.setPassword(user2.getPassword());
            endiamesos.setCity(request.getParameter("city"));
            endiamesos.setCountry(request.getParameter("country"));
            endiamesos.setDate_of_birth(request.getParameter("date_of_birth"));
            endiamesos.setEmail(request.getParameter("email"));
            endiamesos.setExtra_info(request.getParameter("extrainfo"));
            endiamesos.setFirstname(request.getParameter("firstname"));
            endiamesos.setGender(request.getParameter("gender"));
            endiamesos.setLastname(request.getParameter("lastname"));
            endiamesos.setUsername(request.getParameter("username")); 
            int error_flag_edit=0;            
            accounts.getHash().remove(user2.getUsername());
            if(accounts.check_email_uniqueness(request.getParameter("email"))){
                error_flag_edit++;    
                response.sendError(412, "this email is already in use");
            }else if(accounts.getHash().containsKey(endiamesos.getUsername())){
               error_flag_edit++;      
               response.sendError(412, "this username is already in use");
            }else{
                accounts.add(endiamesos);
                Cookie myCookie =
                new Cookie("username", request.getParameter("username"));
                response.addCookie(myCookie);
                response.setContentType("text/html;charset=UTF-8");
                System.out.println("Current number of users:   "+accounts.getHash().size());  
                try (PrintWriter out = response.getWriter()) {
                    out.println(accounts.create_html_account_page(endiamesos));
                }
            }
            if(error_flag_edit!=0){
                accounts.add(user2);
            }
        }
        
        
        else if(request.getParameter("type").equals("login")){
            System.out.println("!!!!LOGIN!!!!!");
            if(accounts.check_email_uniqueness(new_user.getEmail()))  {
                response.sendError(412, "this email is already in use");
            }else if(request.getParameter("username").equals("")) {
                response.sendError(412, "INVALID USERNAME");            
            }else if(!accounts.add(new_user)) {
                response.sendError(412, "this username is already in use");            
            }else{           
                Cookie myCookie =
                new Cookie("username", request.getParameter("username"));
                response.addCookie(myCookie);
                response.setContentType("text/html;charset=UTF-8");
                System.out.println("Current number of users:   "+accounts.getHash().size());  
                try (PrintWriter out = response.getWriter()) {
                    out.println(accounts.create_html_account_page(new_user));
                }
            }
        }
        
        
        else{
            System.out.println("!!wrong call!!");
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
