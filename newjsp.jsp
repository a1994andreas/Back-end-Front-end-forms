<%-- 
    Document   : newjsp
    Created on : Nov 5, 2016, 3:40:26 PM
    Author     : Andreas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <title>A Sample Ajax Using GET</title>
 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 <!-- Latest compiled and minified CSS --> 
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
 <!-- Optional theme -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
 <!-- Latest compiled and minified JavaScript -->
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 <script>
     function editableTable(editable){
    sendAjaxGET("edit");
}
     
 </script>
 </head>
 <body> <script src='newjavascript.js'></script>
    <br>  
  <div class="container-fluid" id="cont_page" >
      <div class="col-md-3 "></div>
       <div class="col-md-6 outset" style="border: solid 1px blue; border-radius: 10px;">
           <h1 style=" text-align: center;">Sign in page</h1><br>    <br> <br> 
           
           <div class="container-fluid"  > 
               <div class="col-md-10 "></div>
               <div class="col-md-2 ">
                   <button type="button" class="btn btn-primary" onclick="login_page('login_page');">Log in</button>
               </div>
           </div>
           
    <div id="class_username" class="form-group ">
        <label for='username'>*username:</label>
        <input id='username' type='text' class="form-control" name='username'  value="a1994andreas" /><br>
        <span id="span_username"></span>
    </div>
    
    <div id="class_email" class="form-group ">
        <label for='email'>*email:</label>
        <input id='email' type='text' name='email' class="form-control" value="example@gmail.com"/><br>
        <span id="span_email" ></span>
    </div>
    
    <div id="class_password" class="form-group ">    
        <label for='password'>*password:</label>
        <input id='password' type='password' name='password' class="form-control" value="hy359!2016" /><br>
        <span id="span_password" ></span>
    </div>

    <div id="class_rewrite_password" class="form-group ">    
        <label for='rewrite_password'>*confirm password:</label>
        <input id='rewrite_password' type='password' name='rewrite_password' class="form-control" value="hy359!2016"  /><br>
        <span id="span_rewrite_password" ></span>
    </div>

    <div id="class_firstname" class="form-group ">    
        <label for='firstname'>*first name:</label>
        <input id='firstname' type='text' name='firstname' class="form-control" value="andreas"/><br>
        <span id="span_firstname" ></span>
    </div>
    
     <div id="class_lastname" class="form-group ">    
        <label for='lastname'>*last name:</label>
        <input id='lastname' type='text' name='lastname' class="form-control" value="paravoliashs" /><br>
        <span id="span_lastname" ></span>
     </div>
           
    <div id="class_date" class="form-group ">
         <label for='date'>*Date of Birth:</label> <br>
        <input id='date' type='date' name='date' class="date" value="1994-12-07" />
    
          <span id="span_date" ></span>
    </div>
        <br>
   
           
    <div>
        <label >Gender:</label> <br>
        <label class="radio-inline">
            <input type="radio" id="male" name="optradio">Male
        </label>
        
        <label class="radio-inline">
            <input type="radio" id="female" name="optradio">Female
        </label>

    </div>
    
    <br>
    
    <div>
        <label for='country'>*country:</label>
        <select name="country" id="country" class="form-control"  >
            <option value="">Country...</option>
            <option value="AF">Afghanistan</option>
            <option value="AL">Albania</option>
            <option value="DZ">Algeria</option>
            <option value="AS">American Samoa</option>
            <option value="AD">Andorra</option>
            <option value="AG">Angola</option>
            <option value="AI">Anguilla</option>
            <option value="AG">Antigua &amp; Barbuda</option>
            <option value="AR">Argentina</option>
            <option value="AA">Armenia</option>
            <option value="AW">Aruba</option>
            <option value="AU">Australia</option>
            <option value="AT">Austria</option>
            <option value="AZ">Azerbaijan</option>
            <option value="BS">Bahamas</option>
            <option value="BH">Bahrain</option>
            <option value="BD">Bangladesh</option>
            <option value="BB">Barbados</option>
            <option value="BY">Belarus</option>
            <option value="BE">Belgium</option>
            <option value="BZ">Belize</option>
            <option value="BJ">Benin</option>
            <option value="BM">Bermuda</option>
            <option value="BT">Bhutan</option>
            <option value="BO">Bolivia</option>
            <option value="BL">Bonaire</option>
            <option value="BA">Bosnia &amp; Herzegovina</option>
            <option value="BW">Botswana</option>
            <option value="BR">Brazil</option>
            <option value="BC">British Indian Ocean Ter</option>
            <option value="BN">Brunei</option>
            <option value="BG">Bulgaria</option>
            <option value="BF">Burkina Faso</option>
            <option value="BI">Burundi</option>
            <option value="KH">Cambodia</option>
            <option value="CM">Cameroon</option>
            <option value="CA">Canada</option>
            <option value="IC">Canary Islands</option>
            <option value="CV">Cape Verde</option>
            <option value="KY">Cayman Islands</option>
            <option value="CF">Central African Republic</option>
            <option value="TD">Chad</option>
            <option value="CD">Channel Islands</option>
            <option value="CL">Chile</option>
            <option value="CN">China</option>
            <option value="CI">Christmas Island</option>
            <option value="CS">Cocos Island</option>
            <option value="CO">Colombia</option>
            <option value="CC">Comoros</option>
            <option value="CG">Congo</option>
            <option value="CK">Cook Islands</option>
            <option value="CR">Costa Rica</option>
            <option value="CT">Cote D'Ivoire</option>
            <option value="HR">Croatia</option>
            <option value="CU">Cuba</option>
            <option value="CB">Curacao</option>
            <option value="CY">Cyprus</option>
            <option value="CZ">Czech Republic</option>
            <option value="DK">Denmark</option>
            <option value="DJ">Djibouti</option>
            <option value="DM">Dominica</option>
            <option value="DO">Dominican Republic</option>
            <option value="TM">East Timor</option>
            <option value="EC">Ecuador</option>
            <option value="EG">Egypt</option>
            <option value="SV">El Salvador</option>
            <option value="GQ">Equatorial Guinea</option>
            <option value="ER">Eritrea</option>
            <option value="EE">Estonia</option>
            <option value="ET">Ethiopia</option>
            <option value="FA">Falkland Islands</option>
            <option value="FO">Faroe Islands</option>
            <option value="FJ">Fiji</option>
            <option value="FI">Finland</option>
            <option value="FR">France</option>
            <option value="GF">French Guiana</option>
            <option value="PF">French Polynesia</option>
            <option value="FS">French Southern Ter</option>
            <option value="GA">Gabon</option>
            <option value="GM">Gambia</option>
            <option value="GE">Georgia</option>
            <option value="DE">Germany</option>
            <option value="GH">Ghana</option>
            <option value="GI">Gibraltar</option>
            <option value="GB">Great Britain</option>
            <option value="GR" selected>Greece</option>
            <option value="GL">Greenland</option>
            <option value="GD">Grenada</option>
            <option value="GP">Guadeloupe</option>
            <option value="GU">Guam</option>
            <option value="GT">Guatemala</option>
            <option value="GN">Guinea</option>
            <option value="GY">Guyana</option>
            <option value="HT">Haiti</option>
            <option value="HW">Hawaii</option>
            <option value="HN">Honduras</option>
            <option value="HK">Hong Kong</option>
            <option value="HU">Hungary</option>
            <option value="IS">Iceland</option>
            <option value="IN">India</option>
            <option value="ID">Indonesia</option>
            <option value="IA">Iran</option>
            <option value="IQ">Iraq</option>
            <option value="IR">Ireland</option>
            <option value="IM">Isle of Man</option>
            <option value="IL">Israel</option>
            <option value="IT">Italy</option>
            <option value="JM">Jamaica</option>
            <option value="JP">Japan</option>
            <option value="JO">Jordan</option>
            <option value="KZ">Kazakhstan</option>
            <option value="KE">Kenya</option>
            <option value="KI">Kiribati</option>
            <option value="NK">Korea North</option>
            <option value="KS">Korea South</option>
            <option value="KW">Kuwait</option>
            <option value="KG">Kyrgyzstan</option>
            <option value="LA">Laos</option>
            <option value="LV">Latvia</option>
            <option value="LB">Lebanon</option>
            <option value="LS">Lesotho</option>
            <option value="LR">Liberia</option>
            <option value="LY">Libya</option>
            <option value="LI">Liechtenstein</option>
            <option value="LT">Lithuania</option>
            <option value="LU">Luxembourg</option>
            <option value="MO">Macau</option>
            <option value="MK">Macedonia</option>
            <option value="MG">Madagascar</option>
            <option value="MY">Malaysia</option>
            <option value="MW">Malawi</option>
            <option value="MV">Maldives</option>
            <option value="ML">Mali</option>
            <option value="MT">Malta</option>
            <option value="MH">Marshall Islands</option>
            <option value="MQ">Martinique</option>
            <option value="MR">Mauritania</option>
            <option value="MU">Mauritius</option>
            <option value="ME">Mayotte</option>
            <option value="MX">Mexico</option>
            <option value="MI">Midway Islands</option>
            <option value="MD">Moldova</option>
            <option value="MC">Monaco</option>
            <option value="MN">Mongolia</option>
            <option value="MS">Montserrat</option>
            <option value="MA">Morocco</option>
            <option value="MZ">Mozambique</option>
            <option value="MM">Myanmar</option>
            <option value="NA">Nambia</option>
            <option value="NU">Nauru</option>
            <option value="NP">Nepal</option>
            <option value="AN">Netherland Antilles</option>
            <option value="NL">Netherlands (Holland, Europe)</option>
            <option value="NV">Nevis</option>
            <option value="NC">New Caledonia</option>
            <option value="NZ">New Zealand</option>
            <option value="NI">Nicaragua</option>
            <option value="NE">Niger</option>
            <option value="NG">Nigeria</option>
            <option value="NW">Niue</option>
            <option value="NF">Norfolk Island</option>
            <option value="NO">Norway</option>
            <option value="OM">Oman</option>
            <option value="PK">Pakistan</option>
            <option value="PW">Palau Island</option>
            <option value="PS">Palestine</option>
            <option value="PA">Panama</option>
            <option value="PG">Papua New Guinea</option>
            <option value="PY">Paraguay</option>
            <option value="PE">Peru</option>
            <option value="PH">Philippines</option>
            <option value="PO">Pitcairn Island</option>
            <option value="PL">Poland</option>
            <option value="PT">Portugal</option>
            <option value="PR">Puerto Rico</option>
            <option value="QA">Qatar</option>
            <option value="ME">Republic of Montenegro</option>
            <option value="RS">Republic of Serbia</option>
            <option value="RE">Reunion</option>
            <option value="RO">Romania</option>
            <option value="RU">Russia</option>
            <option value="RW">Rwanda</option>
            <option value="NT">St Barthelemy</option>
            <option value="EU">St Eustatius</option>
            <option value="HE">St Helena</option>
            <option value="KN">St Kitts-Nevis</option>
            <option value="LC">St Lucia</option>
            <option value="MB">St Maarten</option>
            <option value="PM">St Pierre &amp; Miquelon</option>
            <option value="VC">St Vincent &amp; Grenadines</option>
            <option value="SP">Saipan</option>
            <option value="SO">Samoa</option>
            <option value="AS">Samoa American</option>
            <option value="SM">San Marino</option>
            <option value="ST">Sao Tome &amp; Principe</option>
            <option value="SA">Saudi Arabia</option>
            <option value="SN">Senegal</option>
            <option value="RS">Serbia</option>
            <option value="SC">Seychelles</option>
            <option value="SL">Sierra Leone</option>
            <option value="SG">Singapore</option>
            <option value="SK">Slovakia</option>
            <option value="SI">Slovenia</option>
            <option value="SB">Solomon Islands</option>
            <option value="OI">Somalia</option>
            <option value="ZA">South Africa</option>
            <option value="ES">Spain</option>
            <option value="LK">Sri Lanka</option>
            <option value="SD">Sudan</option>
            <option value="SR">Suriname</option>
            <option value="SZ">Swaziland</option>
            <option value="SE">Sweden</option>
            <option value="CH">Switzerland</option>
            <option value="SY">Syria</option>
            <option value="TA">Tahiti</option>
            <option value="TW">Taiwan</option>
            <option value="TJ">Tajikistan</option>
            <option value="TZ">Tanzania</option>
            <option value="TH">Thailand</option>
            <option value="TG">Togo</option>
            <option value="TK">Tokelau</option>
            <option value="TO">Tonga</option>
            <option value="TT">Trinidad &amp; Tobago</option>
            <option value="TN">Tunisia</option>
            <option value="TR">Turkey</option>
            <option value="TU">Turkmenistan</option>
            <option value="TC">Turks &amp; Caicos Is</option>
            <option value="TV">Tuvalu</option>
            <option value="UG">Uganda</option>
            <option value="UA">Ukraine</option>
            <option value="AE">United Arab Emirates</option>
            <option value="GB">United Kingdom</option>
            <option value="US">United States of America</option>
            <option value="UY">Uruguay</option>
            <option value="UZ">Uzbekistan</option>
            <option value="VU">Vanuatu</option>
            <option value="VS">Vatican City State</option>
            <option value="VE">Venezuela</option>
            <option value="VN">Vietnam</option>
            <option value="VB">Virgin Islands (Brit)</option>
            <option value="VA">Virgin Islands (USA)</option>
            <option value="WK">Wake Island</option>
            <option value="WF">Wallis &amp; Futana Is</option>
            <option value="YE">Yemen</option>
            <option value="ZR">Zaire</option>
            <option value="ZM">Zambia</option>
            <option value="ZW">Zimbabwe</option>
</select>
    </div>
    <br>

    <div id="class_city" class="form-group ">
        <label for='city'>*city:</label>
        <input id='city' type='text' name='city' class="form-control" value="heraklion"/><br>
        <span id="span_city" ></span>
    </div>
    
    <div class="form-group">
      <label for="extrainfo">Extra info:</label>
      <textarea class="form-control" rows="5" id="extrainfo" placeholder="Describe yourself here...(max 500 characters)"></textarea>
    </div>
    
    fields with * are required <br>
 <input type='button' value='Sing up'  class="btn btn-primary" onclick="validate_data('login');"><br>
  <br> <br>
  <p id="error_par" style="background-color: lightgrey;"></p>
       </div>
  </div>
  <br> <br>
  <div id='ajaxContent'></div>
 </body>
</html>