/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import userinterface.CampCommandantRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Notifications.Send;
import Business.Organizations.FoodSupplierOrganization;
import Business.Organizations.MilitaryCampOrganization;
import Business.Organizations.Organization;
import Business.RequestQueue.NewRequestToFoodSupplier;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import javax.swing.JPanel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author halder.r
 */
public class RequestAMedicalSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestAFoodSupplierJPanel
     */
    private JPanel userProcessContainer;
    private UserAccountSoldier account;
    private MilitaryCampOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private String foodItemName;
    private static int pdfCount = 0;
    private Send send = new Send();

    public RequestAMedicalSupplierJPanel(JPanel userProcessContainer, UserAccountSoldier account, Enterprise enterprise, EcoSystem business, MilitaryCampOrganization organization, String foodItemName) {
        try {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.account = account;
            this.organization = organization;
            this.business = business;
            this.enterprise = enterprise;
            this.foodItemName = foodItemName;
            foodItemNameTextField.setText(foodItemName);
            populateFoodSupplierOrganizationComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("nurse.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        };
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        foodItemNameTextField = new javax.swing.JTextField();
        foodSupplierOrganizationComboBox = new javax.swing.JComboBox();
        quantityRequiredTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        requestTestJButton = new javax.swing.JButton();
        saveAsPDFButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Description");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 90, -1));

        jLabel5.setText("Quantity Required");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setText("Food Supplier Organization");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel2.setText("Food Item Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 102, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Request A Food Supplier Panel");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        foodItemNameTextField.setEnabled(false);
        jPanel2.add(foodItemNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 290, -1));

        foodSupplierOrganizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(foodSupplierOrganizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 288, -1));

        quantityRequiredTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityRequiredTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(quantityRequiredTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 290, -1));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 170, 76));

        requestTestJButton.setText("Send Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        saveAsPDFButton.setText("Save As PDF");
        saveAsPDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsPDFButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveAsPDFButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 510, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 550, 590));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void populateFoodSupplierOrganizationComboBox() {
        foodSupplierOrganizationComboBox.removeAllItems();
        for (Network network : business.getNetworkList()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof FoodSupplierOrganization) {
                        FoodSupplierOrganization fsOrg = (FoodSupplierOrganization) org;
                        Iterator it = fsOrg.getFoodSuppliesInventory().getFoodInventory().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry pair = (Map.Entry) it.next();
                            if (pair.getKey().equals(foodItemNameTextField.getText())) {
                                foodSupplierOrganizationComboBox.addItem(fsOrg);
                                break;
                            }
                        }
                    }
                }
            }
        }

    }

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        try {
            String message = descriptionTextArea.getText();
            NewRequestToFoodSupplier request = new NewRequestToFoodSupplier();
            request.setMessage(message);
            request.setQuantity(Integer.parseInt(quantityRequiredTextField.getText()));
            request.setFoodSupplies(foodItemNameTextField.getText(), Integer.parseInt(quantityRequiredTextField.getText()));
            request.setSender(account);
            request.setStatus("Sent");

            ArrayList<Organization> orgList = new ArrayList<Organization>();
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FoodSupplierOrganization) {
                    orgList.add(organization);
                }
            }
            for (Organization org : orgList) {
            if (org != null) {
                org.getRequestQueueCampCommandantFoodSupplier().getWorkRequestCampCommandantFoodSupplier().add(request);
            }
            }
            
                account.getRequestQueueCampCommandantFoodSupplier().getWorkRequestCampCommandantFoodSupplier().add(request);
            String recepient = "";
            for (UserAccount ua : enterprise.getSoldierUADirectory().getUserAccountList()) {
                if (ua.getEmail() != null) {
                    recepient = recepient + ua.getEmail() + ",";
                }
            }
            if (!recepient.isEmpty()) {
                send.mail(recepient, "Require "+foodItemNameTextField.getText()+" - Quantity - "+ quantityRequiredTextField.getText(), message);
            }
            for (Network network : business.getNetworkList()) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org1 : ent.getOrganizationDirectory().getOrganizationList()) {
                        if (org1 == foodSupplierOrganizationComboBox.getSelectedItem()) {
                            FoodSupplierOrganization fsOrg = (FoodSupplierOrganization) org1;
                            Iterator it = fsOrg.getFoodSuppliesInventory().getFoodInventory().entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry pair = (Map.Entry) it.next();
                                if (pair.getKey().equals(foodItemNameTextField.getText())) {
                                    pair.setValue(Integer.parseInt(pair.getValue().toString()) - Integer.parseInt(quantityRequiredTextField.getText()));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Request succesfully sent to Food suppliers");
            quantityRequiredTextField.setText("");
            descriptionTextArea.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void saveAsPDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsPDFButtonActionPerformed
        Document newDocument = new Document();
        String myFilepath = account.getUsername() + "_RequestToFoodSupplier_" + pdfCount + ".pdf";
        try {
            PdfWriter.getInstance(newDocument, new FileOutputStream(myFilepath));
        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(RequestToDoctorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            newDocument.open();
            newDocument.add(new Paragraph("Hi,"));
            newDocument.add(new Paragraph(account.getUsername().toUpperCase()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Your Request has been send to Food Supplier - " + foodSupplierOrganizationComboBox.getSelectedItem().toString()));
            newDocument.add(new Paragraph(" "));
//            newDocument.add(new Paragraph("Request Category - "+ foodItemComboBox.getSelectedItem()));
            newDocument.add(new Paragraph("You have ordered " + foodItemNameTextField.getText() + " of quantity " + quantityRequiredTextField.getText()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Description of your request - " + descriptionTextArea.getText()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Thanks."));
            newDocument.close();
            JOptionPane.showMessageDialog(null, " Report Generated where the project is placed!");
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(myFilepath);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {

                }
            }

        } catch (DocumentException ex) {
            Logger.getLogger(RequestToDoctorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Out of Papers!");
        }
        pdfCount += 1;
    }//GEN-LAST:event_saveAsPDFButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 2];
            CampCommandantWorkAreaJPanel ccqjp = (CampCommandantWorkAreaJPanel) component;
            ccqjp.populateDoctorRequestTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void quantityRequiredTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityRequiredTextFieldKeyTyped
        onlyNumbers(evt);
    }//GEN-LAST:event_quantityRequiredTextFieldKeyTyped

    private void onlyNumbers(java.awt.event.KeyEvent evt) {
        try {
            char keyTyped = evt.getKeyChar();
            if (!(Character.isDigit(keyTyped)) || (keyTyped == KeyEvent.VK_BACK_SPACE) || (keyTyped == KeyEvent.VK_DELETE)) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "<html>Error: Exception Occurred: <br></html>" + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField foodItemNameTextField;
    private javax.swing.JComboBox foodSupplierOrganizationComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField quantityRequiredTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton saveAsPDFButton;
    // End of variables declaration//GEN-END:variables
}
