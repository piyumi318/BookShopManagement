/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopmanagementsystem1;

import javax.swing.JOptionPane;

/**
 *
 * @author piyum
 */
public abstract class Message {
    public  void addedSuccessful(){JOptionPane.showMessageDialog(null,
            "Book is added succussfully!!!!! ");}

public abstract void errorOccured(); // created abstract method
}

