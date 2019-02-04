/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodSupplierRole;

import Business.Inventories.FoodSupplies;
import Business.Organizations.FoodSupplierOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccountFoodSupplier.UserAccountFoodSupplier;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author halder.r
 */
public class ManageFoodSuppliesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFoodSuppliesJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccountFoodSupplier account;
    private FoodSupplierOrganization organization;
            
    public ManageFoodSuppliesJPanel(JPanel userProcessContainer, UserAccountFoodSupplier account, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = (FoodSupplierOrganization)organization;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("food.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        };
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        addNewFoodItemButton = new javax.swing.JButton();
        updateFoodItemButton = new javax.swing.JButton();
        deleteFoodItemButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodSupplyjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(51, 153, 255));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 110, -1));

        addNewFoodItemButton.setBackground(new java.awt.Color(51, 153, 255));
        addNewFoodItemButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewFoodItemButton.setText("Add New Food Item");
        addNewFoodItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewFoodItemButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addNewFoodItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        updateFoodItemButton.setBackground(new java.awt.Color(51, 153, 255));
        updateFoodItemButton.setForeground(new java.awt.Color(255, 255, 255));
        updateFoodItemButton.setText("Update Food Item");
        updateFoodItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFoodItemButtonActionPerformed(evt);
            }
        });
        jPanel2.add(updateFoodItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 148, -1));

        deleteFoodItemButton.setBackground(new java.awt.Color(51, 153, 255));
        deleteFoodItemButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteFoodItemButton.setText("Delete Food Item");
        deleteFoodItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFoodItemButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deleteFoodItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 141, -1));

        foodSupplyjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(foodSupplyjTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 157));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage Food Supply");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 222, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 586, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 630, 330));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewFoodItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewFoodItemButtonActionPerformed
        AddNewFoodItemPanel addNewFoodItemPanel=new AddNewFoodItemPanel(userProcessContainer, account, organization);
        userProcessContainer.add("addNewFoodItemPanel",addNewFoodItemPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addNewFoodItemButtonActionPerformed

    private void updateFoodItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFoodItemButtonActionPerformed
        if(foodSupplyjTable.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Select a row to update!");
        }
        else{
            UpdateFooditemPanel updateFooditemPanel=new UpdateFooditemPanel(userProcessContainer, account, organization, foodSupplyjTable.getValueAt(foodSupplyjTable.getSelectedRow(), 0).toString(), Integer.parseInt(foodSupplyjTable.getValueAt(foodSupplyjTable.getSelectedRow(), 1).toString()));
            userProcessContainer.add("updateFooditemPanel",updateFooditemPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_updateFoodItemButtonActionPerformed

    private void deleteFoodItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFoodItemButtonActionPerformed
        if(foodSupplyjTable.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Select a row to update!");
        }
        else{
            organization.getFoodSuppliesInventory().getFoodInventory().remove(foodSupplyjTable.getValueAt(foodSupplyjTable.getSelectedRow(), 0));
            JOptionPane.showMessageDialog(null, "The item is deleted!");
            populateTable();
        }
    }//GEN-LAST:event_deleteFoodItemButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FoodSupplierWorkAreaJPanel dwjp = (FoodSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)foodSupplyjTable.getModel();
        
        model.setRowCount(0);
        Iterator it = organization.getFoodSuppliesInventory().getFoodInventory().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Object[] row = new Object[4];
            row[0] = pair.getKey();
            row[1] = pair.getValue();            
            model.addRow(row);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewFoodItemButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteFoodItemButton;
    private javax.swing.JTable foodSupplyjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton updateFoodItemButton;
    // End of variables declaration//GEN-END:variables
}