/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MilitaryCampOrganization;
import Business.RequestQueue.NewEmergencyRequestToDoctor;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import Business.RequestQueue.NewRequestToCampCommandant;
import Business.RequestQueue.WorkRequestNurseCampCommandant;
import Business.RequestQueue.WorkRequestNurseDoctor;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author raunak
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private MilitaryCampOrganization organization;
    private Enterprise enterprise;
    private UserAccountSoldier userAccount;
    private EcoSystem business;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccountSoldier account, MilitaryCampOrganization organization,EcoSystem business, Enterprise enterprise) {
       
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.organization = organization;
            this.enterprise = enterprise;
            this.userAccount = account;
            this.business = business;
            valueLabel.setText(enterprise.getName());
            populateRequestTable();
            populateRequestToDoctorTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequestNurseCampCommandant request : userAccount.getRequestQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((NewRequestToCampCommandant) request).getResult();
            row[3] = result == null ? "Waiting" : result;

            model.addRow(row);
        }
    }

    public void populateRequestToDoctorTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestToDoctorJTable.getModel();

        model.setRowCount(0);

        for (WorkRequestNurseDoctor request : userAccount.getRequestQueueNurseDoctor().getWorkRequestNurseDoctorList()) {
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((NewEmergencyRequestToDoctor) request).getResult();
            row[3] = result == null ? "Waiting" : result;

            model.addRow(row);
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

        jPanel3 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("nurse.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        };
        jPanel2 = new javax.swing.JPanel();
        requestTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        checkOrBookBedsButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        refreshDoctorJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestToDoctorJTable = new javax.swing.JTable();
        requestDoctorJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Camp Commandant");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Camp Commandant", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 75, 574, 97));

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 32, -1, -1));

        checkOrBookBedsButton.setText("Check Or Book Beds");
        checkOrBookBedsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOrBookBedsButtonActionPerformed(evt);
            }
        });
        jPanel2.add(checkOrBookBedsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        valueLabel.setText("<value>");
        jPanel2.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 27, 158, 26));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        jPanel2.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 27, 127, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 620, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 650, 250));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshDoctorJButton.setText("Refresh");
        refreshDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshDoctorJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(refreshDoctorJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        workRequestToDoctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Doctor", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestToDoctorJTable);
        if (workRequestToDoctorJTable.getColumnModel().getColumnCount() > 0) {
            workRequestToDoctorJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestToDoctorJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestToDoctorJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestToDoctorJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 574, 97));

        requestDoctorJButton.setText("Emergency! Request Doctor");
        requestDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDoctorJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestDoctorJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 650, 20));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 710, 260));

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestToCampCommandantJPanel", new RequestToCampCommandantJPanel(userProcessContainer, userAccount, enterprise,business, organization));
            layout.next(userProcessContainer);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void refreshDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshDoctorJButtonActionPerformed
        populateRequestToDoctorTable();
    }//GEN-LAST:event_refreshDoctorJButtonActionPerformed

    private void requestDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDoctorJButtonActionPerformed
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestToDoctorJPanel", new RequestToDoctorJPanel(userProcessContainer, userAccount, enterprise));
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_requestDoctorJButtonActionPerformed

    private void checkOrBookBedsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOrBookBedsButtonActionPerformed
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("CheckOrBookBedsPanel", new CheckOrBookBedsPanel(userProcessContainer, userAccount, organization));
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_checkOrBookBedsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOrBookBedsButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton refreshDoctorJButton;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestDoctorJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestToDoctorJTable;
    // End of variables declaration//GEN-END:variables
}
