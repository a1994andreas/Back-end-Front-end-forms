// Hello.
//
// This is JSHint, a tool that helps to detect errors and potential
// problems in your JavaScript code.
//
// To start, simply enter some JavaScript anywhere on this page. Your
// report will appear on the right side.
//
// Additionally, you can toggle specific options in the Configure
// menu.

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*globals $:false */

function sendAjaxGET(type) {
    console.log(type);
  var xhr;
  var username;
  var email  ;
  var fname ;
  var lname ;
  var pass ;
  var rpass ;
  var male ;
  var female;
  var city;
  var date_of_birth;
  var country ;
  var extrainfo;
  var gender;
  if(type===("login")) {
         username = document.getElementById('username').value;
         email = document.getElementById('email').value;
         fname =document.getElementById('firstname').value;
         lname =document.getElementById('lastname').value;
         pass = document.getElementById('password').value;
         rpass = document.getElementById('rewrite_password').value;
         male = document.getElementById('male').checked;
         female = document.getElementById('female').checked;
         city = document.getElementById('city').value;
         date_of_birth = document.getElementById('date').value;
         country = document.getElementById('country').value;
         extrainfo =  document.getElementById('extrainfo').value;
        console.log(extrainfo);
         gender="";
        if(male===true){
          gender="male";
        }else if(female===true){
          gender="female";
        }else{
          gender="unknown "; 
        }
        
       username=change_scripted_fields(username);
       email=change_scripted_fields(email);
       fname=change_scripted_fields(fname);
       lname=change_scripted_fields(lname);
       pass=change_scripted_fields(pass);
       rpass=change_scripted_fields(rpass);
       city=change_scripted_fields(city);
       extrainfo=change_scripted_fields(extrainfo);
        
        
        
        console.log(username);
        //var xhr;

         xhr = new XMLHttpRequest();

        xhr.open('GET', 'EchoData?username=' + username + '&email=' + email +'&firstname='+fname+'&lastname='+lname+'&password='+pass+'&city='+city +'&date_of_birth='+date_of_birth+'&country='+country+'&gender='+gender+'&type='+type+'&extrainfo='+extrainfo);
        xhr.onload = function () {
        if (xhr.status === 200) {
        document.getElementById('cont_page')
        .innerHTML = xhr.responseText;
        } else if(xhr.status ===412){

           document.getElementById('error_par').innerHTML= xhr.responseText;
        }
        else if (xhr.status !== 200) {
        alert('Request failed. Returned status of ' + xhr.status);
        }
        };
        xhr.send();
    }else if (type===("edit")  ){

     //   var xhr;
        xhr = new XMLHttpRequest();
        xhr.open('GET', 'EchoData?type='+type);
        xhr.onload = function () {
        if (xhr.status === 200) {
            document.getElementById('cont_page')
            .innerHTML = xhr.responseText;
        } else if (xhr.status !== 200) {
            alert('Request failed. Returned status of ' + xhr.status);
        }
        };
        xhr.send();

        
        
    }else if(type===("edit_done")){
        var error_num = validate_data("edit_done");
        if(error_num===0){
             username =$("#username").text();
             email = $("#email").text();
             fname =$("#firstname").text();
             lname =$("#lastname").text();
             pass =$("#password").text();
             rpass = $("#rewrite_password").text();
             male = $('input[name=optradio1]:radio:checked').val();           
             female = $('input[name=optradio2]:radio:checked').val();       
             city = $("#city").text();
             date_of_birth = $("#date").val();
             extrainfo = $('#extrainfo').val();
           // country =$("#country").text();
             country= $('#country').find(":selected").text();        
            console.log(extrainfo);
            gender="";
            if(male==="on"){
                 gender="male";
            }else if(female==="on"){
                 gender="female";
            }else{
                 gender="unknown "; 
            }

            username=change_scripted_fields(username);
            email=change_scripted_fields(email);
            fname=change_scripted_fields(fname);
            lname=change_scripted_fields(lname);
            pass=change_scripted_fields(pass);
            rpass=change_scripted_fields(rpass);
            city=change_scripted_fields(city);
            extrainfo=change_scripted_fields(extrainfo);


            xhr = new XMLHttpRequest();

           xhr.open('GET', 'EchoData?username=' + username + '&email=' + email+'&firstname='+fname+'&lastname='+lname+'&password='+pass+'&city='+city+'&date_of_birth='+date_of_birth+'&country='+country+'&gender='+gender+'&type='+type+'&extrainfo='+extrainfo);
           
           xhr.onload = function () {
           if (xhr.status === 200) {
           document.getElementById('cont_page')
           .innerHTML = xhr.responseText;
           } else if (xhr.status === 412){
               document.getElementById('error_par')
           .innerHTML = xhr.responseText;
           }
           
               else if (xhr.status !== 200) {
           alert('Request failed. Returned status of ' + xhr.status);
           }
           };
           xhr.send();
        }
    }

}

function sendAjaxPOST() {
var username = document.getElementById('username').value;
var email = document.getElementById('email').value;
var xhr = new XMLHttpRequest();
xhr.open('POST', 'EchoData');
xhr.onload = function () {
if (xhr.status === 200) {
document.getElementById('ajaxContent')
.innerHTML = xhr.responseText;
} else if (xhr.status !== 200) {
alert('Request failed. Returned status of ' + xhr.status);
}
};
xhr.send('username=' + username + '&email=' + email);
}




function validate_data(type){
    
        var username , email ,fname ,lname ,pass ;
    var rpass , male ,female ,city ,date_of_birth;
    if(type==="edit_done"){
        console.log("validate date : type edit done");
        username = $("#username").text();
        email = $("#email").text();
        fname =$("#firstname").text();
        lname =$("#lastname").text();
        pass =$("#password").text();
        rpass = $("#rewrite_password").text();
        //male = $("#male").text();
        //female = document.getElementById('female').checked;
        city = $("#city").text();
        date_of_birth = $("#date").val();
    }else if(type==="login"){
        console.log("validate date : type login");
        username = document.getElementById('username').value;
        email = document.getElementById('email').value;
        fname =document.getElementById('firstname').value;
        lname =document.getElementById('lastname').value;
        pass = document.getElementById('password').value;
        rpass = document.getElementById('rewrite_password').value;
        male = document.getElementById('male').checked;
        female = document.getElementById('female').checked;
        city = document.getElementById('city').value;
        date_of_birth = document.getElementById('date').value;  
        
    }
    console.log(username);
    
    
    var today = new Date();
    var yyyy = today.getFullYear();
    
    var error_messages ="" ; 
    var error_num=0;
    if(username.length <8){
        wrong_input("#class_username","#span_username");
        error_messages+=(++error_num)+".username must be at least 8 chars<br>";
    }else {
        correct_input("#class_username" , "#span_username");
    }
    var mail_cond = /[a-zA-Z]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]+/.test(email);
    if(!mail_cond){
        wrong_input("#class_email","#span_email");
        error_messages+=(++error_num)+".email pattern is chars@chars.chars<br>";
        //alert("email must contains at least one  '@' and one '.'");
    }else{
         correct_input("#class_email" , "#span_email");
    }
    if(email.length>25){
        wrong_input("#class_email","#span_email");
        error_messages+=(++error_num)+".email length must be less than 25 characters<br>";
        //alert("email must contains at least one  '@' and one '.'");
    }else{
         correct_input("#class_email" , "#span_email");
    }  
    
    if((fname.length <3) || (fname.length>20)){
        wrong_input("#class_firstname","#span_firstname");
        error_messages+=(++error_num)+".firstname must be between 3-20 letters<br>";
    }else{
        correct_input("#class_firstname" , "#span_firstname");
       
    }
    
    if(lname.length <4 || lname.length>20){
        wrong_input("#class_lastname","#span_lastname");
        error_messages+=(++error_num)+".lastname must be between 4-20 letters<br>";
        //alert("lastname must be 3-20 letters");
    }else{
        correct_input("#class_lastname" , "#span_lastname");
    }
    
    if(type==="login"){
        var str = pass.toString();
        var cond1=/[0-9]+/.test(str);
        var cond2=/[a-zA-Z]+/.test(str);
        var cond3=/[@!@#$%^&*()]+/.test(str);


        if(cond1 && cond2 && cond3) {
           correct_input("#class_rewrite_password","#span_rewrite_password");
           correct_input("#class_password","#span_password");   
        }else{
           wrong_input("#class_rewrite_password","#span_rewrite_password"); 
           wrong_input("#class_password","#span_password"); 
           error_messages+=(++error_num)+".passwords must contain at least one one latin char , one number and one special character(@,#,$...) <br>"; 
        }

        if(pass!==rpass){
            wrong_input("#class_rewrite_password","#span_rewrite_password"); 
            wrong_input("#class_password","#span_password"); 
            error_messages+=(++error_num)+".passwords are different<br>";
            // alert("two passwords arent equal");
        }else{
            correct_input("#class_rewrite_password","#span_rewrite_password");
            correct_input("#class_password","#span_password");
        }
    
    }
    
    if(city.length <2 || city.length>50){
        wrong_input("#class_city","#span_city");
        error_messages+=(++error_num)+".city must be between 2-50 letters<br>";
        //alert("firstname must be 3-20 letters");
    }else{
        correct_input("#class_city" , "#span_city");
    }
    var temp , temp2;

        temp =date_of_birth.split('-');
        temp2=temp[0];
    
     if( yyyy - temp2<15){
        wrong_input("#class_date","#span_date");
        error_messages+=(++error_num)+".You must be order that 15 years old to enroll on this site/Invalid Date<br>";
        //alert("firstname must be 3-20 letters"); 
     }else if(temp2<1900){
        wrong_input("#class_date","#span_date");
        error_messages+=(++error_num)+".Invalid Date of birth<br>";
         
     }
    else{
        correct_input("#class_date" , "#span_date");
    }
     
    document.getElementById('error_par').innerHTML=error_messages;
    if(type==="login"){
        if(error_num===0){
            sendAjaxGET("login");
        }
    }
        return error_num;

}


function wrong_input(div,span){
    $(div).addClass("has-error has-feedback");
        $(span).addClass("glyphicon glyphicon-remove form-control-feedback ");
         $(div).removeClass("has-success");
    
}

function correct_input(div , span){
    $(div).removeClass("has-error has-feedback");
        $(span).removeClass("glyphicon glyphicon-remove form-control-feedback "); 
      $(div).addClass("has-success");
    
}


function change_password(type){
   
    var xhr;
        xhr = new XMLHttpRequest();
        xhr.open('GET', 'EchoData?type='+type);
        xhr.onload = function () {
        if (xhr.status === 200) {
            document.getElementById('cont_page')
            .innerHTML = xhr.responseText;
        } else if (xhr.status !== 200) {
            alert('Request failed. Returned status of ' + xhr.status);
        }
        };
        xhr.send();
    
}

function change_passord_confirm(type){
    var pass =$("#oldpassword").val();
    var rpass = $("#newpassword").val();
        var rpass2 = $("#conf_new_password").val();

    var str = rpass.toString();
    var cond1=/[0-9]+/.test(str);
    var cond2=/[a-zA-Z]+/.test(str);
    var cond3=/[@!@#$%^&*()]+/.test(str);

    var error_flag=1;
        if(cond1 && cond2 && cond3) {
            
            //correct input
            error_flag=0;
    }

    if(rpass===rpass2 && error_flag===0){
        console.log(pass,rpass , rpass2);

        var xhr;
            xhr = new XMLHttpRequest();
            xhr.open('GET', 'EchoData?type='+type+'&oldpassword='+pass+'&newpassword='+rpass);
            xhr.onload = function () {
            if (xhr.status === 200) {
                document.getElementById('cont_page')
                .innerHTML = xhr.responseText;
            } else if(xhr.status === 412){
               document.getElementById('error_par')
                .innerHTML = xhr.responseText; 
            }
            
                else if (xhr.status !== 200) {
                alert('Request failed. Returned status of ' + xhr.status);
            }
            };
            xhr.send();
    }else{
        if(error_flag===1){
            alert("passwords must contain at least one one latin char , one number and one special character(@,#,$...)");
        }else{ 
            alert("the two passwords are different");
        }
    }
    
}

function users_info(type){
    var xhr;
            xhr = new XMLHttpRequest();
            xhr.open('GET', 'EchoData?type='+type);
            xhr.onload = function () {
            if (xhr.status === 200) {
                document.getElementById('cont_page')
                .innerHTML = xhr.responseText;
            } else if (xhr.status !== 200) {
                alert('Request failed. Returned status of ' + xhr.status);
            }
            };
            xhr.send();
    
}

function back_to_my_profile(type){
    var xhr;
            xhr = new XMLHttpRequest();
            xhr.open('GET', 'EchoData?type='+type);
            xhr.onload = function () {
            if (xhr.status === 200) {
                document.getElementById('cont_page')
                .innerHTML = xhr.responseText;
            } else if (xhr.status !== 200) {
                alert('Request failed. Returned status of ' + xhr.status);
            }
            };
            xhr.send();
    
    
}

function login_existing_account(type){
         var username = $("#username").val();
            var pass =$("#password").val();
     var xhr;
            xhr = new XMLHttpRequest();
            xhr.open('GET', 'EchoData?type='+type+'&username='+username+'&password='+pass);
            xhr.onload = function () {
            if (xhr.status === 200) {
                document.getElementById('cont_page')
                .innerHTML = xhr.responseText;
            }else if(xhr.status === 412){
                document.getElementById('error_par').innerHTML = xhr.responseText;
                
            } 
            else if (xhr.status !== 200) {
                alert('Request failed. Returned status of ' + xhr.status);
            }
            };
            xhr.send();
    
}

function login_page(type){
    
     var xhr;
            xhr = new XMLHttpRequest();
            xhr.open('GET', 'EchoData?type='+type);
            xhr.onload = function () {
            if (xhr.status === 200) {
                document.getElementById('cont_page')
                .innerHTML = xhr.responseText;
            } else if (xhr.status !== 200) {
                alert('Request failed. Returned status of ' + xhr.status);
            }
            };
            xhr.send();
    
    
    
}


function change_scripted_fields(string_field){
    string_field=string_field.split("&").join("&amp;");
    string_field=string_field.split("<").join("&lt;");
    string_field=string_field.split(">").join("&gt;");
    string_field=string_field.split("'").join("&apos;");
    string_field=string_field.split("\"").join("&quot;");
    return string_field;
}


