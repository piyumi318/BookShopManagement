/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopmanagementsystem1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Book extends Message{
     private String code ;
     private    String name;
     private   String category;
     private  String author;
     private   String year ;
     private  int price ;
     private String cpassword;
     private   int quantity;
     private   String search;


     public void setBcode(String code){  // encapsulation get set method for take and use data
     this.code=code;}
      public String getBcode(){ 
      return code;}
     
      
      public void setBName(String name){ // encapsulation get set method for take and use data
     this.name=name;}
      public String getBName(){ 
      return name;}
      
      
      public void setCategory(String category){// encapsulation get set method for take and use data
     this.category=category;}
      public String getCategory(){
      return category;}
      
      public void setAuthor(String author){// encapsulation get set method for take and use data
     this.author=author;}
      public String getAuthor(){
      return author;}
      
      public void setYear(String year){
     this.year=year;}                   // encapsulation get set method for take and use data
      public String getYear(){
      return year;}
     
      public void setBprice(int price){// encapsulation get set method for take and use data
     this.price=price;}
      public int getBprice(){
      return price;}
      
      public void setBquantity(int quantity){// encapsulation get set method for take and use data
     this.quantity=quantity;}
      public int getBquantity(){
      return quantity;}
      
      
       public void setSearch(String search ){// encapsulation get set method for take and use data
     this.search=search;}
      public String getSearch(){
      return search;}
      
       public void setcpassword( String cpassword){// encapsulation get set method for take and use data
     this.cpassword=cpassword;}
      public String getcpassword(){
      return cpassword;}
      public static void main(String[] args) {
      
 }
     
     public File BookFile(){

        File Book=null;
        boolean filesatus =false;
        try{
          Book = new File("D:\\login details\\Book.txt");// create object of file class
          filesatus=Book.createNewFile();
        }
        catch(IOException e){
        
        System.out.println("error");
        }
          return Book;
         }
     
     public boolean AddBook(){
       boolean mark1 =false;
            String line =null;
            line   = getBcode() +" "+ getBName() +" "+getCategory()
                    +" "+ getAuthor() +" "+getYear() +" "+ 
                    Integer.toString(getBprice()) +" "+Integer.toString(getBquantity()) ;
            try{

            FileWriter writer2 =new FileWriter( BookFile(),true);// create object of file writer
            BufferedWriter brWriter2= new  BufferedWriter(writer2);// create object of buffered writer
            brWriter2.write(line);
            brWriter2.newLine();
            brWriter2.close();
            writer2.close();

            mark1=true;
            }
             catch(Exception e){ 
                 System.out.println("An error occurred.");
             mark1=false;
    }        return mark1; 
     }
     @Override
     public  void errorOccured(){JOptionPane.showMessageDialog
        (null,"Book isnot added!!!!! " );}
     
     public void search(){
     FileReader reader2;
String FindLine, Line=" ";

try {
        reader2 = new FileReader( BookFile()); // create object of file reader
       BufferedReader brReader2  =new BufferedReader(reader2); //create object of file writer
        
        while((FindLine =brReader2.readLine())!=null){
               String []words =FindLine.split(" ");
                        for(String word:words){
                           if (word.equals(getSearch())){
                            System.out.println(FindLine);
                           Line=Line+FindLine +"\n" ;
                           }
                        else {System.out.println("not equal");} }}
                             JOptionPane.showMessageDialog(null, Line);
    }catch(IOException E){
             System.out. println("error");}
   }    

}

   