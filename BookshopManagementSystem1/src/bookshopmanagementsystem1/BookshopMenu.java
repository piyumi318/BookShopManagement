//
package bookshopmanagementsystem1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class BookshopMenu extends javax.swing.JFrame {

DefaultTableModel table;// create object of default table
Book book =new Book(); // create object of book class

   public BookshopMenu() {

        

        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bttncategory = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tfAddCategory = new javax.swing.JTextField();
        Lblcode = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lblcategory = new javax.swing.JLabel();
        LblAuthor = new javax.swing.JLabel();
        LblPublishedYear = new javax.swing.JLabel();
        Lblprice = new javax.swing.JLabel();
        LblQuantity = new javax.swing.JLabel();
        tfCode = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfAuthor = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        cboxCategory = new javax.swing.JComboBox<>();
        tfPrice = new javax.swing.JTextField();
        tfQuantity = new javax.swing.JTextField();
        cbsearch = new javax.swing.JComboBox<>();
        tfsearch = new javax.swing.JTextField();
        buttonLogout = new javax.swing.JButton();
        buttonRest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("City Bookshop...........");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        bttncategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttncategory.setText("Add Category");
        bttncategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttncategoryActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAdd.setText("Add Books");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("View Book LIst");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Search Books");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Lblcode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lblcode.setText("Book code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Book Name");

        Lblcategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lblcategory.setText("Category");
        Lblcategory.setToolTipText("");

        LblAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblAuthor.setText("Author");

        LblPublishedYear.setText("Published Year");

        Lblprice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lblprice.setText("Price");

        LblQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblQuantity.setText("Quantity");

        tfCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tfName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tfAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAuthorActionPerformed(evt);
            }
        });

        tfYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfYearActionPerformed(evt);
            }
        });

        cboxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mathematics ", "Science", "Economics" }));
        cboxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCategoryActionPerformed(evt);
            }
        });

        tfPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tfQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Price", "Name", "Category" }));

        buttonLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonRest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRest.setText("Reset");
        buttonRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lblcode)
                            .addComponent(jLabel4)
                            .addComponent(Lblcategory)
                            .addComponent(LblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPublishedYear)
                            .addComponent(Lblprice)
                            .addComponent(LblQuantity))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfQuantity)
                            .addComponent(tfPrice)
                            .addComponent(tfYear)
                            .addComponent(tfAuthor)
                            .addComponent(tfName)
                            .addComponent(cboxCategory, 0, 138, Short.MAX_VALUE)
                            .addComponent(tfCode)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bttncategory, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonRest, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttncategory)
                    .addComponent(tfAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(buttonAdd)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblcode)
                    .addComponent(tfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblcategory)
                    .addComponent(cboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAuthor)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPublishedYear)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblprice)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblQuantity)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(cbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bookTable.setAutoCreateRowSorter(true);
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book code", "Name", "Category", "Auther", "Published Year", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
      book.setBcode(tfCode.getText());
        book.setBName(tfName.getText());
        book.setCategory(cboxCategory.getSelectedItem().toString());
        book.setAuthor(tfAuthor.getText());
        book.setYear(tfYear.getText());
         book.setBprice(Integer.parseInt(tfPrice.getText())); 
         book.setBquantity(Integer.parseInt(tfQuantity.getText()));
      
         boolean mark=book.AddBook();
        if (mark){
            book.addedSuccessful();}
        else{book.errorOccured();} 
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
 
            setVisible(false);
            JOptionPane.showMessageDialog(null,"you are successfully log out!!!!! " );
            new Login().setVisible(true);
            
   
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void bttncategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttncategoryActionPerformed
      String category= tfAddCategory.getText();
      cboxCategory.addItem(category);
      JOptionPane.showMessageDialog(null, "Category is added Successfully");
    }//GEN-LAST:event_bttncategoryActionPerformed

    private void tfYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfYearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        FileReader reader3;
    try {
        reader3= new FileReader(book.BookFile());
   
        BufferedReader brReader3  =new BufferedReader(reader3);
      
         table=  (DefaultTableModel)bookTable.getModel();
        Object[] tablelines=brReader3.lines().toArray();
        
      for(int i=0; i<tablelines.length; i++){
  
       String row =tablelines[i].toString().trim();
           String[]  words=row.split(" ");
           table.addRow(words);
    }
       } catch (FileNotFoundException ex) {
        Logger.getLogger(BookshopMenu.class.getName()).log(Level.SEVERE, null,ex);
           System.out.println("error");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         book.setSearch(tfsearch.getText()); 
         String searchCat=cbsearch.getSelectedItem().toString();
         book.search();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cboxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCategoryActionPerformed

    private void tfAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAuthorActionPerformed

    private void buttonRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestActionPerformed
       tfCode.setText(" ");
       tfName.setText(" ");
       tfAuthor.setText(" ");
       tfYear.setText(" ");
       tfPrice.setText(" ");
       tfQuantity.setText(" ");
    }//GEN-LAST:event_buttonRestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookshopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookshopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookshopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookshopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookshopMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAuthor;
    private javax.swing.JLabel LblPublishedYear;
    private javax.swing.JLabel LblQuantity;
    private javax.swing.JLabel Lblcategory;
    private javax.swing.JLabel Lblcode;
    private javax.swing.JLabel Lblprice;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton bttncategory;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonRest;
    private javax.swing.JComboBox<String> cboxCategory;
    private javax.swing.JComboBox<String> cbsearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfAddCategory;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfQuantity;
    private javax.swing.JTextField tfYear;
    private javax.swing.JTextField tfsearch;
    // End of variables declaration//GEN-END:variables
}
