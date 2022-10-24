/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookshopmanagementsystem1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class Manager extends BookshopManagementSystem1{
    

    public boolean createAccount(){
      String Row =null;
      boolean status= false;
      String uname= getusername();// get username by encapsulation get method
      String pword= getpassword();// get password by encapsulation get method
      String utype= getusertype();// get usertype by encapsulation get method
    

          Row   = uname +" "+ pword +" "+ utype; // add data in to one line
            try{

            FileWriter writer1 =new FileWriter(createfile(),true); // crate object of file writer 
            BufferedWriter brWriter1= new  BufferedWriter(writer1); // create object of buffered writer
            brWriter1.write(Row);
            brWriter1.newLine();
            brWriter1.close();
            writer1.close();
            System.out.println("data added in to file"); // print data added
            status=true;}
             catch(Exception e){ 
                 System.out.println("An error occurred.");}// print error
                 status=false;
            return status;
    }   

    @Override
     public void loginMessage(){ // method overriding
          JOptionPane.showMessageDialog(null,"login sucessfully!!" );
          JOptionPane.showMessageDialog(null,"welcome to Manager Option menu!!\n "
                  + "select option","welcome message",JOptionPane.INFORMATION_MESSAGE);}}

