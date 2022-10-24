/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopmanagementsystem1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

 
public class BookshopManagementSystem1 {
private String username;
private String password;
private String cpassword;
private String  usertype;
   
  public void setusername(String username){
     this.username=username;}
      public String getusername(){
      return username;}
      
      public void setpassword(String password){
     this.password=password;}
      public String getpassword(){
      return password;}
      
     public void setusertype(String usertype){
     this.usertype = usertype;}
      public String getusertype(){
      return  usertype;} 
      
      public void Exit(){
JOptionPane.showMessageDialog(null," You are Exit" );
{System.exit(0);}
  }
       
        public File createfile(){

        File login=null;
        boolean filesatus =false;
        try{
          login = new File("D:\\login details\\login.txt");
          filesatus=login.createNewFile();
        }
        catch(IOException e){
        
        System.out.println("error");
        }
          return login;
         }
        
       public boolean verify(){
     boolean b1=false;
    String row;
           try{ 
    FileReader reader1 = new FileReader (createfile());
 
     BufferedReader brReader1  =new BufferedReader(reader1);
     outerloop:
     while ((row=brReader1.readLine())!=null){
           StringTokenizer rows = new StringTokenizer(row);
           String username1 = rows.nextToken();   
           String password1 = rows.nextToken(); 
            String usertype1 = rows.nextToken(); 
     if ((getusername()).equals(username1)&&(getpassword()).equals(password1)
             &&(getusertype()).equals(usertype1)){
            System.out.println("equal");b1=true;break outerloop;}
                    else{b1=false;}       }   }
        catch(IOException e) 
                {    System.out.println("An error occurred.");}
       return b1;
    }
   
     public void loginMessage(){
         JOptionPane.showMessageDialog(null,"login sucessfully!!" );
            JOptionPane.showMessageDialog(null,"welcome to city Bookshop!!","welcome message",JOptionPane.INFORMATION_MESSAGE);}
     
     public void ErrorMessage(){JOptionPane.showMessageDialog
        (null,"Incorrect username or password!!" );}
       
       
       
     public static void main(String[] args) {
      
    }
}
