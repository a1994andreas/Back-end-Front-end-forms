
/**
 *
 * @author Andreas
 */
public class Account {
 
    private String username;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String date_of_birth;
    private String gender;
    private String country;
    private String city;
    private String extra_info;
    
    public Account(){
        this.username="";
        this.email="";
        this.password="";
        this.firstname="";
        this.lastname="";
        this.date_of_birth="";
        this.gender="";
        this.country="";
        this.city="";
        this.extra_info="";
    
    }
    public Account(Account elem){
        this.username=elem.getUsername();
        this.email=elem.getEmail();
        this.password=elem.getPassword();
        this.firstname=elem.getFirstname();
        this.lastname=elem.getLastname();
        this.date_of_birth=elem.getDate_of_birth();
        this.gender=elem.getGender();
        this.country=elem.getCountry();
        this.city=elem.getCity();
        this.extra_info=elem.getExtra_info();
    
    }
    
    public Account(String username,String email,String password,String firstname,String lastname,String date_of_birth,String gender,
            String country,String city,String extra_info){
    
    this.username=username;
    this.email=email;
    this.password=password;
    this.firstname=firstname;
    this.lastname=lastname;
    this.date_of_birth=date_of_birth;
    this.gender=gender;
    this.country=country;
    this.city=city;
    this.extra_info=extra_info;
    }
            
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getFirstname(){
        return firstname;
    }
    
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    
    public String getLastname(){
        return lastname;
    }
    
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getDate_of_birth(){
        return date_of_birth;
    }
    
    public void setDate_of_birth(String date_of_birth){
        this.date_of_birth=date_of_birth;
    }
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getCountry(){
        return country;
    }
    
    public void setCountry(String country){
        this.country=country;
    }
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    public String getExtra_info(){
        return extra_info;
    }
    
    public void setExtra_info(String extra_info){
        this.extra_info=extra_info;
    }
}
