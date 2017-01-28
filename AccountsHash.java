/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.HashMap;
/**
 *
 * @author Andreas
 */
public class AccountsHash {
     
    private HashMap<String, Account> accounts;
    
    
    public AccountsHash(){
        this.accounts= new HashMap<>();
    }
    
    public boolean add(Account account) {
      if (accounts.containsKey(account.getUsername())) {
            return false;
        } else {
            accounts.put(account.getUsername(), account);
        }

        return true;
    }
   
   
    public  HashMap<String, Account> getHash(){
        return accounts;
    }
    
    public boolean check_email_uniqueness(String email){
        for (Account value : accounts.values()) {
            if(value.getEmail().equals(email))
                   return true;
        } 
        return false;
    }
    public String create_html_edit_account_page(String edit_account_id){
        
        Account new_account= accounts.get(edit_account_id);
        
        return ("<!DOCTYPE html>")+
                ("<html>")+
                ("<head>")+
                ("<title>Servlet NewServlet</title>")+
                ("</head>")+
                ("<body>")+
                ("<div class='container-fluid'><div class='col-md-12'><h1 style='text-align: center;'>"
                    + "My profile</h1></div>"
                + "</div><br><br>")+
                
                ("<div class='container-fluid'><div class='col-md-3'>"
                    +"<img src=\"images/ee.jpg\" class=\"img-thumbnail\" alt=\"default image by the system\">"
                    + "<button type=\"button\" onClick='editableTable(true)' class=\"btn btn-info\">Edit profile</button>"
                    + "<button type=\"button\" class=\"btn btn-warning\">Change password</button>"
                    + "</div>")+
                (          
                     "<div class='col-md-6'><table  class=\"table table-striped\" id=\"table_item2\">"
                    +"<tr>"
                    +"<th>Username: </th>"
                    +"<th class='table_rows'  id='username' contenteditable='true'>"+new_account.getUsername() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Email: </th>"
                    +"<th class='table_rows' id='email' contenteditable='true'>"+new_account.getEmail() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Firstname: </th>"
                    +"<th class='table_rows' id='firstname' contenteditable='true'>"+new_account.getFirstname() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Lastname: </th>"
                    +"<th class='table_rows' id='lastname' contenteditable='true'>"+new_account.getLastname() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>City: </th>"
                    +"<th class='table_rows' id='city' contenteditable='true'>"+new_account.getCity() +"</th>"
                    +"</tr>"
                    + "</table>"
                +"<div id=\"class_date\" class=\"form-group \">\n" +
                "         <label for='date of birth'>Date of Birth:</label> <br>\n" +
                "        <input id='date' type='date' name='date' class=\"date\" value=\"1994-12-07\" />\n" +
                "    \n" +
                "          <span id=\"span_date\" ></span>\n" +
                "    </div>"
                  
                +"   <div>\n" +
"        <label for='gender'>Gender:</label> <br>\n" +
"        <label class=\"radio-inline\">\n" +
"            <input type=\"radio\" id=\"male\" name=\"optradio1\">Male\n" +
"        </label>\n" +
"        \n" +
"        <label class=\"radio-inline\">\n" +
"            <input type=\"radio\" id=\"female\" name=\"optradio2\">Female\n" +
"        </label>\n" +
"\n" +
"    </div>"   
                +"\n" +
"    <div>\n" +
"        <label for='country'>Country:</label>\n" +
"        <select name=\"country\" id=\"country\" class=\"form-control\"  >\n" +
"            <option value=\"\">Country...</option>\n" +
"            <option value=\"AF\">Afghanistan</option>\n" +
"            <option value=\"AL\">Albania</option>\n" +
"            <option value=\"DZ\">Algeria</option>\n" +
"            <option value=\"AS\">American Samoa</option>\n" +
"            <option value=\"AD\">Andorra</option>\n" +
"            <option value=\"AG\">Angola</option>\n" +
"            <option value=\"AI\">Anguilla</option>\n" +
"            <option value=\"AG\">Antigua &amp; Barbuda</option>\n" +
"            <option value=\"AR\">Argentina</option>\n" +
"            <option value=\"AA\">Armenia</option>\n" +
"            <option value=\"AW\">Aruba</option>\n" +
"            <option value=\"AU\">Australia</option>\n" +
"            <option value=\"AT\">Austria</option>\n" +
"            <option value=\"AZ\">Azerbaijan</option>\n" +
"            <option value=\"BS\">Bahamas</option>\n" +
"            <option value=\"BH\">Bahrain</option>\n" +
"            <option value=\"BD\">Bangladesh</option>\n" +
"            <option value=\"BB\">Barbados</option>\n" +
"            <option value=\"BY\">Belarus</option>\n" +
"            <option value=\"BE\">Belgium</option>\n" +
"            <option value=\"BZ\">Belize</option>\n" +
"            <option value=\"BJ\">Benin</option>\n" +
"            <option value=\"BM\">Bermuda</option>\n" +
"            <option value=\"BT\">Bhutan</option>\n" +
"            <option value=\"BO\">Bolivia</option>\n" +
"            <option value=\"BL\">Bonaire</option>\n" +
"            <option value=\"BA\">Bosnia &amp; Herzegovina</option>\n" +
"            <option value=\"BW\">Botswana</option>\n" +
"            <option value=\"BR\">Brazil</option>\n" +
"            <option value=\"BC\">British Indian Ocean Ter</option>\n" +
"            <option value=\"BN\">Brunei</option>\n" +
"            <option value=\"BG\">Bulgaria</option>\n" +
"            <option value=\"BF\">Burkina Faso</option>\n" +
"            <option value=\"BI\">Burundi</option>\n" +
"            <option value=\"KH\">Cambodia</option>\n" +
"            <option value=\"CM\">Cameroon</option>\n" +
"            <option value=\"CA\">Canada</option>\n" +
"            <option value=\"IC\">Canary Islands</option>\n" +
"            <option value=\"CV\">Cape Verde</option>\n" +
"            <option value=\"KY\">Cayman Islands</option>\n" +
"            <option value=\"CF\">Central African Republic</option>\n" +
"            <option value=\"TD\">Chad</option>\n" +
"            <option value=\"CD\">Channel Islands</option>\n" +
"            <option value=\"CL\">Chile</option>\n" +
"            <option value=\"CN\">China</option>\n" +
"            <option value=\"CI\">Christmas Island</option>\n" +
"            <option value=\"CS\">Cocos Island</option>\n" +
"            <option value=\"CO\">Colombia</option>\n" +
"            <option value=\"CC\">Comoros</option>\n" +
"            <option value=\"CG\">Congo</option>\n" +
"            <option value=\"CK\">Cook Islands</option>\n" +
"            <option value=\"CR\">Costa Rica</option>\n" +
"            <option value=\"CT\">Cote D'Ivoire</option>\n" +
"            <option value=\"HR\">Croatia</option>\n" +
"            <option value=\"CU\">Cuba</option>\n" +
"            <option value=\"CB\">Curacao</option>\n" +
"            <option value=\"CY\">Cyprus</option>\n" +
"            <option value=\"CZ\">Czech Republic</option>\n" +
"            <option value=\"DK\">Denmark</option>\n" +
"            <option value=\"DJ\">Djibouti</option>\n" +
"            <option value=\"DM\">Dominica</option>\n" +
"            <option value=\"DO\">Dominican Republic</option>\n" +
"            <option value=\"TM\">East Timor</option>\n" +
"            <option value=\"EC\">Ecuador</option>\n" +
"            <option value=\"EG\">Egypt</option>\n" +
"            <option value=\"SV\">El Salvador</option>\n" +
"            <option value=\"GQ\">Equatorial Guinea</option>\n" +
"            <option value=\"ER\">Eritrea</option>\n" +
"            <option value=\"EE\">Estonia</option>\n" +
"            <option value=\"ET\">Ethiopia</option>\n" +
"            <option value=\"FA\">Falkland Islands</option>\n" +
"            <option value=\"FO\">Faroe Islands</option>\n" +
"            <option value=\"FJ\">Fiji</option>\n" +
"            <option value=\"FI\">Finland</option>\n" +
"            <option value=\"FR\">France</option>\n" +
"            <option value=\"GF\">French Guiana</option>\n" +
"            <option value=\"PF\">French Polynesia</option>\n" +
"            <option value=\"FS\">French Southern Ter</option>\n" +
"            <option value=\"GA\">Gabon</option>\n" +
"            <option value=\"GM\">Gambia</option>\n" +
"            <option value=\"GE\">Georgia</option>\n" +
"            <option value=\"DE\">Germany</option>\n" +
"            <option value=\"GH\">Ghana</option>\n" +
"            <option value=\"GI\">Gibraltar</option>\n" +
"            <option value=\"GB\">Great Britain</option>\n" +
"            <option value=\"GR\" selected>Greece</option>\n" +
"            <option value=\"GL\">Greenland</option>\n" +
"            <option value=\"GD\">Grenada</option>\n" +
"            <option value=\"GP\">Guadeloupe</option>\n" +
"            <option value=\"GU\">Guam</option>\n" +
"            <option value=\"GT\">Guatemala</option>\n" +
"            <option value=\"GN\">Guinea</option>\n" +
"            <option value=\"GY\">Guyana</option>\n" +
"            <option value=\"HT\">Haiti</option>\n" +
"            <option value=\"HW\">Hawaii</option>\n" +
"            <option value=\"HN\">Honduras</option>\n" +
"            <option value=\"HK\">Hong Kong</option>\n" +
"            <option value=\"HU\">Hungary</option>\n" +
"            <option value=\"IS\">Iceland</option>\n" +
"            <option value=\"IN\">India</option>\n" +
"            <option value=\"ID\">Indonesia</option>\n" +
"            <option value=\"IA\">Iran</option>\n" +
"            <option value=\"IQ\">Iraq</option>\n" +
"            <option value=\"IR\">Ireland</option>\n" +
"            <option value=\"IM\">Isle of Man</option>\n" +
"            <option value=\"IL\">Israel</option>\n" +
"            <option value=\"IT\">Italy</option>\n" +
"            <option value=\"JM\">Jamaica</option>\n" +
"            <option value=\"JP\">Japan</option>\n" +
"            <option value=\"JO\">Jordan</option>\n" +
"            <option value=\"KZ\">Kazakhstan</option>\n" +
"            <option value=\"KE\">Kenya</option>\n" +
"            <option value=\"KI\">Kiribati</option>\n" +
"            <option value=\"NK\">Korea North</option>\n" +
"            <option value=\"KS\">Korea South</option>\n" +
"            <option value=\"KW\">Kuwait</option>\n" +
"            <option value=\"KG\">Kyrgyzstan</option>\n" +
"            <option value=\"LA\">Laos</option>\n" +
"            <option value=\"LV\">Latvia</option>\n" +
"            <option value=\"LB\">Lebanon</option>\n" +
"            <option value=\"LS\">Lesotho</option>\n" +
"            <option value=\"LR\">Liberia</option>\n" +
"            <option value=\"LY\">Libya</option>\n" +
"            <option value=\"LI\">Liechtenstein</option>\n" +
"            <option value=\"LT\">Lithuania</option>\n" +
"            <option value=\"LU\">Luxembourg</option>\n" +
"            <option value=\"MO\">Macau</option>\n" +
"            <option value=\"MK\">Macedonia</option>\n" +
"            <option value=\"MG\">Madagascar</option>\n" +
"            <option value=\"MY\">Malaysia</option>\n" +
"            <option value=\"MW\">Malawi</option>\n" +
"            <option value=\"MV\">Maldives</option>\n" +
"            <option value=\"ML\">Mali</option>\n" +
"            <option value=\"MT\">Malta</option>\n" +
"            <option value=\"MH\">Marshall Islands</option>\n" +
"            <option value=\"MQ\">Martinique</option>\n" +
"            <option value=\"MR\">Mauritania</option>\n" +
"            <option value=\"MU\">Mauritius</option>\n" +
"            <option value=\"ME\">Mayotte</option>\n" +
"            <option value=\"MX\">Mexico</option>\n" +
"            <option value=\"MI\">Midway Islands</option>\n" +
"            <option value=\"MD\">Moldova</option>\n" +
"            <option value=\"MC\">Monaco</option>\n" +
"            <option value=\"MN\">Mongolia</option>\n" +
"            <option value=\"MS\">Montserrat</option>\n" +
"            <option value=\"MA\">Morocco</option>\n" +
"            <option value=\"MZ\">Mozambique</option>\n" +
"            <option value=\"MM\">Myanmar</option>\n" +
"            <option value=\"NA\">Nambia</option>\n" +
"            <option value=\"NU\">Nauru</option>\n" +
"            <option value=\"NP\">Nepal</option>\n" +
"            <option value=\"AN\">Netherland Antilles</option>\n" +
"            <option value=\"NL\">Netherlands (Holland, Europe)</option>\n" +
"            <option value=\"NV\">Nevis</option>\n" +
"            <option value=\"NC\">New Caledonia</option>\n" +
"            <option value=\"NZ\">New Zealand</option>\n" +
"            <option value=\"NI\">Nicaragua</option>\n" +
"            <option value=\"NE\">Niger</option>\n" +
"            <option value=\"NG\">Nigeria</option>\n" +
"            <option value=\"NW\">Niue</option>\n" +
"            <option value=\"NF\">Norfolk Island</option>\n" +
"            <option value=\"NO\">Norway</option>\n" +
"            <option value=\"OM\">Oman</option>\n" +
"            <option value=\"PK\">Pakistan</option>\n" +
"            <option value=\"PW\">Palau Island</option>\n" +
"            <option value=\"PS\">Palestine</option>\n" +
"            <option value=\"PA\">Panama</option>\n" +
"            <option value=\"PG\">Papua New Guinea</option>\n" +
"            <option value=\"PY\">Paraguay</option>\n" +
"            <option value=\"PE\">Peru</option>\n" +
"            <option value=\"PH\">Philippines</option>\n" +
"            <option value=\"PO\">Pitcairn Island</option>\n" +
"            <option value=\"PL\">Poland</option>\n" +
"            <option value=\"PT\">Portugal</option>\n" +
"            <option value=\"PR\">Puerto Rico</option>\n" +
"            <option value=\"QA\">Qatar</option>\n" +
"            <option value=\"ME\">Republic of Montenegro</option>\n" +
"            <option value=\"RS\">Republic of Serbia</option>\n" +
"            <option value=\"RE\">Reunion</option>\n" +
"            <option value=\"RO\">Romania</option>\n" +
"            <option value=\"RU\">Russia</option>\n" +
"            <option value=\"RW\">Rwanda</option>\n" +
"            <option value=\"NT\">St Barthelemy</option>\n" +
"            <option value=\"EU\">St Eustatius</option>\n" +
"            <option value=\"HE\">St Helena</option>\n" +
"            <option value=\"KN\">St Kitts-Nevis</option>\n" +
"            <option value=\"LC\">St Lucia</option>\n" +
"            <option value=\"MB\">St Maarten</option>\n" +
"            <option value=\"PM\">St Pierre &amp; Miquelon</option>\n" +
"            <option value=\"VC\">St Vincent &amp; Grenadines</option>\n" +
"            <option value=\"SP\">Saipan</option>\n" +
"            <option value=\"SO\">Samoa</option>\n" +
"            <option value=\"AS\">Samoa American</option>\n" +
"            <option value=\"SM\">San Marino</option>\n" +
"            <option value=\"ST\">Sao Tome &amp; Principe</option>\n" +
"            <option value=\"SA\">Saudi Arabia</option>\n" +
"            <option value=\"SN\">Senegal</option>\n" +
"            <option value=\"RS\">Serbia</option>\n" +
"            <option value=\"SC\">Seychelles</option>\n" +
"            <option value=\"SL\">Sierra Leone</option>\n" +
"            <option value=\"SG\">Singapore</option>\n" +
"            <option value=\"SK\">Slovakia</option>\n" +
"            <option value=\"SI\">Slovenia</option>\n" +
"            <option value=\"SB\">Solomon Islands</option>\n" +
"            <option value=\"OI\">Somalia</option>\n" +
"            <option value=\"ZA\">South Africa</option>\n" +
"            <option value=\"ES\">Spain</option>\n" +
"            <option value=\"LK\">Sri Lanka</option>\n" +
"            <option value=\"SD\">Sudan</option>\n" +
"            <option value=\"SR\">Suriname</option>\n" +
"            <option value=\"SZ\">Swaziland</option>\n" +
"            <option value=\"SE\">Sweden</option>\n" +
"            <option value=\"CH\">Switzerland</option>\n" +
"            <option value=\"SY\">Syria</option>\n" +
"            <option value=\"TA\">Tahiti</option>\n" +
"            <option value=\"TW\">Taiwan</option>\n" +
"            <option value=\"TJ\">Tajikistan</option>\n" +
"            <option value=\"TZ\">Tanzania</option>\n" +
"            <option value=\"TH\">Thailand</option>\n" +
"            <option value=\"TG\">Togo</option>\n" +
"            <option value=\"TK\">Tokelau</option>\n" +
"            <option value=\"TO\">Tonga</option>\n" +
"            <option value=\"TT\">Trinidad &amp; Tobago</option>\n" +
"            <option value=\"TN\">Tunisia</option>\n" +
"            <option value=\"TR\">Turkey</option>\n" +
"            <option value=\"TU\">Turkmenistan</option>\n" +
"            <option value=\"TC\">Turks &amp; Caicos Is</option>\n" +
"            <option value=\"TV\">Tuvalu</option>\n" +
"            <option value=\"UG\">Uganda</option>\n" +
"            <option value=\"UA\">Ukraine</option>\n" +
"            <option value=\"AE\">United Arab Emirates</option>\n" +
"            <option value=\"GB\">United Kingdom</option>\n" +
"            <option value=\"US\">United States of America</option>\n" +
"            <option value=\"UY\">Uruguay</option>\n" +
"            <option value=\"UZ\">Uzbekistan</option>\n" +
"            <option value=\"VU\">Vanuatu</option>\n" +
"            <option value=\"VS\">Vatican City State</option>\n" +
"            <option value=\"VE\">Venezuela</option>\n" +
"            <option value=\"VN\">Vietnam</option>\n" +
"            <option value=\"VB\">Virgin Islands (Brit)</option>\n" +
"            <option value=\"VA\">Virgin Islands (USA)</option>\n" +
"            <option value=\"WK\">Wake Island</option>\n" +
"            <option value=\"WF\">Wallis &amp; Futana Is</option>\n" +
"            <option value=\"YE\">Yemen</option>\n" +
"            <option value=\"ZR\">Zaire</option>\n" +
"            <option value=\"ZM\">Zambia</option>\n" +
"            <option value=\"ZW\">Zimbabwe</option>\n" +
"</select>\n" +   
"    </div>" 
                  +" <div class=\"form-group\">\n" +
                  "      <label for=\"comment\">Extra info:</label>\n" +
                    "      <textarea class=\"form-control\" rows=\"5\" id=\"extrainfo\" placeholder=\"Describe yourself here...(max 500 characters)\">"
                + new_account.getExtra_info()
                + "</textarea>\n" + 
                "    </div>"
                + "<button type=\"button\" id='submit_button2' onClick=\"sendAjaxGET('edit_done')\" class=\"btn btn-primary\">Submit changes</button>"
                + "<button type=\"button\" onClick=\"back_to_my_profile('back')\" class=\"btn btn-info\">Back </button>"

                +"<p id=\"error_par\" style=\"background-color: lightgrey;\"></p></div>"
                +"<div class='col-md-1'><button onclick=\"location.href='http://localhost:8084/WebApplication1/newjsp.jsp';\" type=\"button\" class=\"btn btn-default btn-sm\">\n" +
                    "<span class=\"glyphicon glyphicon-log-out\"></span> Log out\n" +
                    "</button></div>"
                
                + "</div>")+
                ("</body>")+
                ("</html>") 
                ;
    
    }
    
    
     
    public String create_html_account_page(Account new_account){
        return ("<!DOCTYPE html>")+
                ("<html>")+      
                ("<head>")+ 
                ("<title>Servlet NewServlet</title>")+
                ("</head>")+
                ("<body>")+
                ("<div class='container-fluid'>"    
                    + "<div class='col-md-11'><h1 style='text-align: center;'>"
                    + "My profile</h1></div>"+
                "<div class='col-md-1'><button onclick=\"location.href='http://localhost:8084/WebApplication1/newjsp.jsp';\" type=\"button\" class=\"btn btn-default btn-sm\">" +
                "<span class=\"glyphicon glyphicon-log-out\"></span> Log out " +
                "</button></div>"
                + "</div><br><br>")+
                   
                ("<div class='container-fluid'><div class='col-md-3'>"
                    +"<img src=\"images/ee.jpg\" class=\"img-thumbnail\" alt=\"default image by the system\">"
                    + "<button type=\"button\" onClick='editableTable(true)' class=\"btn btn-info\">Edit profile</button>"
                    + "<button type=\"button\" onClick=\"change_password('change_pas');\" class=\"btn btn-warning\">Change password</button>"
                    + "</div>")+
                (        
                     "<div class='col-md-6'><table  class=\"table table-striped\" id=\"table_item\">"
                    +"<tr>"  
                    +"<th>Username: </th>"
                    +"<th class='table_rows' contenteditable='false'> "+new_account.getUsername() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Email: </th>"
                    +"<th class='table_rows' contenteditable='false'>"+new_account.getEmail() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Firstname: </th>"
                    +"<th class='table_rows' contenteditable='false'>"+new_account.getFirstname() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Lastname: </th>"
                    +"<th class='table_rows' contenteditable='false'>"+new_account.getLastname() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Gender: </th>"
                    +"<th class='table_rows' contenteditable='false'>"+new_account.getGender() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>Date of birth: </th>"
                    +"<th class='table_rows' contenteditable='false'>"+new_account.getDate_of_birth() +"</th>"
                    +"</tr>"        
                    +"<tr>"
                    +"<th>Country: </th>"
                    +"<th class='table_rows' contenteditable='false'>"+new_account.getCountry() +"</th>"
                    +"</tr>"
                    +"<tr>"
                    +"<th>City: </th>"
                    +"<th class='table_rows' contenteditable='false'>"+new_account.getCity() +"</th>"
                    +"</tr>"    
                    + "</table>"
                    +" <div class=\"form-group\">\n" +
                  "      <label for=\"comment\">Extra info:</label>\n" +
                    "      <textarea readonly class=\"form-control\" rows=\"5\" id=\"extrainfo\" placeholder=\"Describe yourself here...(max 500 characters)\">"
                + new_account.getExtra_info()
                + "</textarea>\n" +
                "    </div>"
                + "</div>"
                
                 
                +"<div><button type=\"button\" onClick=\"users_info('users_list')\" class=\"btn btn-info\">Info</button></div><br><br>"
                
           
                
                + "</div>")+
                ("</body>")+
                ("</html>")
                ;
    }


    public String create_html_edit_done_page(String user_id){
        Account new_account = accounts.get(user_id);
        System.out.println(new_account.getUsername());
        return create_html_account_page(new_account);

    }


    public String create_html_change_password(String user_id){
        return "<!DOCTYPE html>\n" +
        "<html>\n" +
        "    <head>\n" +
        "     \n" +
        "\n" +
        "    </head>\n" +
        "    <body>\n" +
        "    <div class=\"container-fluid\" id=\"cont_page\" >\n" +
        "        <div class=\"col-md-3 \"></div>\n" +
        "        <div class=\"col-md-6 outset\" style=\"border: solid 1px blue; border-radius: 10px;\">\n" +
        "            <h1 style=\" text-align: center;\">Change password</h1><br>    <br> <br> \n" +
        
                
        "            <div id=\"class_old_password\" class=\"form-group \">\n" +
        "                <label for='old_password'>*oldpassword:</label>\n" +
        "                <input id='oldpassword' type='password' class=\"form-control\" name='old_password'  /><br>\n" +
        "                <span id=\"span_old_password\"></span>\n" +
        "            </div>\n" +
                 
       "            <div id=\"class_new_password\" class=\"form-group \">\n" +
        "                <label for='new_password'>*new password:</label>\n" +
        "                <input id='newpassword' type='password' class=\"form-control\" name='new_password'  /><br>\n" +
        "                <span id=\"span_new_password\"></span>\n" +
        "            </div>\n" +
                
                "            <div id=\"class_conf_new_password\" class=\"form-group \">\n" +
        "                <label for='conf_new_password'>*confirm new password:</label>\n" +
        "                <input id='conf_new_password' type='password' class=\"form-control\" name='conf_new_password'  /><br>\n" +
        "                <span id=\"span_conf_new_password\"></span>\n" +
        "            </div>\n" +
 
        "                   <input type='button' value='Confirm' onClick=\"change_passord_confirm('change_pas_conf');\"  class=\"btn btn-primary\" >\n" +
                       "<button type=\"button\" onClick=\"back_to_my_profile('back')\" class=\"btn btn-info\">Back </button>"+
                "<p id=\"error_par\" style=\"background-color: lightgrey;\"></p></div>"+
                "                   <br><br>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    </body>\n" + 
        "</html>\n" +
        "";


    } 

public String create_html_all_accounts(){
    String first_part= "<!DOCTYPE html>\n" +
           "<html>\n" +
           "    <head>\n" +
           "     \n" +  
           "\n" +
           "    </head>\n" +
           "    <body>\n" +
           "    <div class=\"container-fluid\" id=\"cont_page\" >\n" +
           "        <div class=\"col-md-11 outset\" style=\"border: solid 1px blue; border-radius: 10px;\">\n" +
            
           "            <h1 style=\" text-align: center;\">Users List:</h1><br>    <br> <br> "
            +"<div class='col-md-6'><table  class=\"table table-striped\" id=\"table_item\">"
          

            ; 
    String second_part="</table>"  
             + "<button type=\"button\" onClick=\"back_to_my_profile('back')\" class=\"btn btn-info\">Back </button></div>"
            + "<br>\n" + 
           "                   <br><br>\n" +
           "        </div>\n" + 
           "    </div>\n" + "<div id='xss'></div>"+
           "    </body>\n" +
           "</html>\n";
      
    String return_value=first_part;

    return_value+="<tr>"
                     +"<th>Username </th>"
                     +"<th>Email</th>"
                     +"<th>Firstname</th>"
                     +"<th>Lastname</th>"
                     +"<th>Gender</th>"
                     +"<th>Date_of_birth</th>"
                     +"<th>Country</th>"
                     +"<th>City</th>"

                    +"</tr>";
    
        for (Account value : accounts.values()) {
          
        return_value+="<tr>"   
                     +"<td class='table_rows'>"+value.getUsername()+"</td>"
                     +"<td class='table_rows'>"+value.getEmail()+"</td>"
                     +"<td class='table_rows'>"+value.getFirstname()+"</td>"
                     +"<td class='table_rows'>"+value.getLastname()+"</td>"
                     +"<td class='table_rows'>"+value.getGender()+"</td>"
                     +"<td class='table_rows'>"+value.getDate_of_birth()+"</td>"
                     +"<td class='table_rows'>"+value.getCountry()+"</td>"
                     +"<td class='table_rows'>"+value.getCity()+"</td>"

                    +"</tr>";
    } 
    
    return_value+=second_part;
    return return_value;


}

public String create_login_page(){
    String first_part= "<!DOCTYPE html>\n" +
           "<html>\n" +
           "    <head>\n" +
           "     \n" +
           "\n" +
           "    </head>\n" +
           "    <body>\n" +

            "<div class=\"col-md-3 \"></div>"+
           "        <div class=\"col-md-6 outset\" style=\"border: solid 1px blue; border-radius: 10px;\">\n" +
            
           "            <h1 style=\" text-align: center;\">Log In:</h1><br>    <br> <br> ";

     String second_part="</div><br>\n" +
           "                   <br><br>\n" +
           "        </div>\n" + 
           "    </body>\n" +
           "</html>\n";
     String return_val=first_part; 
     
     return_val+="  <div id=\"class_username\" class=\"form-group \">\n" +
"                <label for='username'>username:</label>\n" +
"                <input id='username' type='text' class=\"form-control\" name='username'   /><br>\n" +
"                <span id=\"span_username\"></span>\n" +
"            </div>\n" +
"\n" +
"            <div id=\"class_password\" class=\"form-group \">\n" +
"                <label for='password'>password:</label>\n" +
"                <input id='password' type='password' name='password' class=\"form-control\" /><br>\n" +
"                <span id=\"span_password\" ></span>\n" +
"            </div>";
     return_val+="<button type=\"button\" class=\"btn btn-primary\" onclick=\"login_existing_account('existing_account');\">Log in</button>" ;
     return_val+= "<button type=\"button\" onclick=\"location.href='http://localhost:8084/WebApplication1/newjsp.jsp';\" class=\"btn btn-info\">Back </button><br><br>";
            return_val+="<p id=\"error_par\" style=\"background-color: lightgrey;\"></p></div>";
             return_val+=second_part;
     return return_val;
}




}

