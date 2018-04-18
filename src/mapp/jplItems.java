/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapp;
import java.sql.ResultSet;
import javax.swing.*;
/**
 *
 * @author Unknown
 */
public class jplItems extends JPanel {
    final int pWidth = 800;
    final int pHeight = 450;
    /**
     * Creates new form jplItems
     */
    public jplItems(JPanel jplMain) {
        initComponents();
        this.setSize(pWidth, pHeight);
        int x = (jplMain.getWidth()-pWidth)/2;
        int y = (jplMain.getHeight()-pHeight)/2;
        this.setLocation(x, y);
        this.setVisible(true);
        //bnSearch.setText("Search");
        initialization();
    }
    public void initialization(){
        tfItemId.setText("");
        tfItemName.setText("");
        tfUnitPrice.setText("");
        tfQuantity.setText("");
        taSuppliers.setText("");
        taLocation.setText("");
        taNotes.setText("");
        bnDelete.setEnabled(false);
        bnSearch.setText("Search");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bnSearch = new javax.swing.JButton();
        bnDelete = new javax.swing.JButton();
        bnClose = new javax.swing.JButton();
        tfItemId = new javax.swing.JTextField();
        tfItemName = new javax.swing.JTextField();
        tfUnitPrice = new javax.swing.JTextField();
        tfQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taSuppliers = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        taNotes = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        taLocation = new javax.swing.JTextArea();
        bnSave = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Items");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Item ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Item Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Unit Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Suppliers");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Location");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Notes");

        bnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnSearch.setText("Search");
        bnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSearchActionPerformed(evt);
            }
        });

        bnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnDelete.setText("Delete");
        bnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeleteActionPerformed(evt);
            }
        });

        bnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnClose.setText("Close");
        bnClose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCloseActionPerformed(evt);
            }
        });

        taSuppliers.setColumns(20);
        taSuppliers.setRows(5);
        jScrollPane2.setViewportView(taSuppliers);

        taNotes.setColumns(20);
        taNotes.setRows(5);
        jScrollPane3.setViewportView(taNotes);

        taLocation.setColumns(20);
        taLocation.setRows(5);
        jScrollPane4.setViewportView(taLocation);

        bnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnSave.setText("Save");
        bnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(65, Short.MAX_VALUE)
                        .addComponent(bnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(bnSearch)
                        .addGap(40, 40, 40)
                        .addComponent(bnDelete)
                        .addGap(37, 37, 37)
                        .addComponent(bnClose)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfQuantity)
                                    .addComponent(tfUnitPrice)
                                    .addComponent(tfItemName)
                                    .addComponent(tfItemId)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnSearch)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bnDelete)
                        .addComponent(bnClose)
                        .addComponent(bnSave)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSearchActionPerformed
       if (bnSearch.getText().equals("Search")){
            if (tfItemId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Item ID");
                return;  
            }
            String ItemId = tfItemId.getText().trim();
            String query = "Select * from item where Item_id='"+ItemId+"'";
            
            try{
                ResultSet rs = utility.DBconnection.getStatement().executeQuery(query);
                while(rs.next()){
                    tfItemId.setText(ItemId);
                    tfItemName.setText(rs.getString("Item_name"));
                    tfUnitPrice.setText(rs.getString("Unit_price"));
                    tfQuantity.setText(rs.getString("Quantity"));
                    taSuppliers.setText(rs.getString("Suppliers"));
                    taLocation.setText(rs.getString("Location"));
                    taNotes.setText(rs.getString("Notes"));
                }
                tfItemId.setEditable(false);
                tfItemName.setEditable(false);
                tfUnitPrice.setEditable(false);
                tfQuantity.setEditable(false);
                taSuppliers.setEditable(false);
                taLocation.setEditable(false);
                taNotes.setEditable(false);
                
                bnSave.setEnabled(false);
                bnDelete.setEnabled(true);
                bnSearch.setText("Edit");
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
                tfItemId.setText("");
            }
        } else if (bnSearch.getText().equals("Edit")){
            tfItemId.setEditable(false);
            tfItemName.setEditable(true);
            tfUnitPrice.setEditable(true);
            tfQuantity.setEditable(true);
            taSuppliers.setEditable(true);
            taLocation.setEditable(true);
            taNotes.setEditable(true);
            bnSearch.setText("Update");
        } else if (bnSearch.getText().equals("Update")){
            String query = "update item set Item_name='"+tfItemName.getText()+"', Unit_price='"+tfUnitPrice.getText()+"', Quantity='"+tfQuantity.getText()+"', Suppliers='"+taSuppliers.getText()+"', Location='"+taLocation.getText()+"', Notes='"+taNotes.getText()+"' where Item_id='"+tfItemId.getText()+"'";
            try {
                if (utility.DBconnection.getStatement().executeUpdate(query)>0){
                    JOptionPane.showMessageDialog(null, "Update is Successful");
                    tfItemId.setText("");
                    tfItemName.setText("");
                    tfUnitPrice.setText("");
                    tfQuantity.setText("");
                    taSuppliers.setText("");
                    taLocation.setText("");
                    taNotes.setText("");
                    //bnSearch.setText("Search");
                    initialization();
                } else {
                    JOptionPane.showMessageDialog(null, "Could not update data");
                    tfItemId.setText("");
                    tfItemName.setText("");
                    tfUnitPrice.setText("");
                    tfQuantity.setText("");
                    taSuppliers.setText("");
                    taLocation.setText("");
                    taNotes.setText("");
                    //bnSearch.setText("Search");
                    
                    tfItemId.setEditable(true);
                    tfItemName.setEditable(true);
                    tfUnitPrice.setEditable(true);
                    tfQuantity.setEditable(true);
                    taSuppliers.setEditable(true);
                    taLocation.setEditable(true);
                    taNotes.setEditable(true);
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_bnSearchActionPerformed

    private void bnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSaveActionPerformed
        String query="insert into item values ('"+tfItemId.getText()+"','"+tfItemName.getText()+"','"+tfUnitPrice.getText()+"','"+tfQuantity.getText()+"','"+taSuppliers.getText()+"','"+taLocation.getText()+"','"+taNotes.getText()+"')";
        try{
           if(utility.DBconnection.getStatement().executeUpdate(query)>0){
               JOptionPane.showMessageDialog(null, "Successfully saved Item");
                tfItemId.setText("");
                tfItemName.setText("");
                tfUnitPrice.setText("");
                tfQuantity.setText("");
                taSuppliers.setText("");
                taLocation.setText("");
                taNotes.setText("");
               initialization();
           }else{
               JOptionPane.showMessageDialog(null, "Could not save data");
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_bnSaveActionPerformed

    private void bnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteActionPerformed
         String query= "delete from item where Item_id='"+tfItemId.getText().trim()+"'";
            try{
                if(utility.DBconnection.getStatement().executeUpdate(query)>0){
                    JOptionPane.showMessageDialog(null, "Delete is Successful");
                    tfItemId.setText("");
                    tfItemName.setText("");
                    tfUnitPrice.setText("");
                    tfQuantity.setText("");
                    taSuppliers.setText("");
                    taLocation.setText("");
                    taNotes.setText("");
                    initialization();
                    
                    tfItemId.setEditable(true);
                    tfItemName.setEditable(true);
                    tfUnitPrice.setEditable(true);
                    tfQuantity.setEditable(true);
                    taSuppliers.setEditable(true);
                    taLocation.setEditable(true);
                    taNotes.setEditable(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Delete not Successful");
                }
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
             }
    }//GEN-LAST:event_bnDeleteActionPerformed

    private void bnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCloseActionPerformed
        if (utility.Utility.universalCode == 1){
            int res=JOptionPane.showConfirmDialog(null, "Do you want to save changes?","Warning",JOptionPane.YES_NO_OPTION);
            if (res==JOptionPane.YES_OPTION){
                if (bnSearch.getText().equals("Update")){
                    bnSearch.doClick();
                }else{
                    bnSave.doClick();
                }
            }else{
                this.setVisible(false);
            }
        }else{
            this.setVisible(false);
        }
    }//GEN-LAST:event_bnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnClose;
    private javax.swing.JButton bnDelete;
    private javax.swing.JButton bnSave;
    private javax.swing.JButton bnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea taLocation;
    private javax.swing.JTextArea taNotes;
    private javax.swing.JTextArea taSuppliers;
    private javax.swing.JTextField tfItemId;
    private javax.swing.JTextField tfItemName;
    private javax.swing.JTextField tfQuantity;
    private javax.swing.JTextField tfUnitPrice;
    // End of variables declaration//GEN-END:variables
}
