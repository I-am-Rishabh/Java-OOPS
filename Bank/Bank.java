package bank;



public class  Bank{
   public static void main(String[] args) {
       Account account1=new Account();
       account1.name="bill gates";

       account1.email="billgates@gmail.com";
         //password cannot be access directly 
   //    account1.password="124421";

   }
}

  class Account{
    //access modifier
    //public can be accessed any where , where the object is created
    public String name;
// it is a default access modifier and it can be accessed inside home 
//package everything can access it but not by other packages
    int age;
    //accessed by sub class of other packages and in home package
    protected String email;
    //can not be acccessed directly need getter and setter
    private String password;

    //getters and setters
    //getter
     public String getPassword(){
         return this.password;
     }
    //setter
     public void setPassword( String Password){
         this.password=Password;
     }
    
}