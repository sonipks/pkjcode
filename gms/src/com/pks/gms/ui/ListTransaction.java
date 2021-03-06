/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ListTransaction.java
 *
 * Created on Sep 23, 2013, 12:04:39 AM
 */
package com.pks.gms.ui;

import com.pks.gms.domain.Transaction;
import com.pks.gms.domain.User;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.application.Action;
import org.jdesktop.application.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author Pankaj Soni
 */
public class ListTransaction extends javax.swing.JFrame {

    String[] paths = {"classpath:com/pks/gms/resources/spring/applicationContext.xml"};
    ApplicationContext context = new ClassPathXmlApplicationContext(paths);
    HibernateTemplate hibernateTemplate = context.getBean(HibernateTemplate.class);
    private static final Logger LOGGER = LoggerFactory.getLogger(ListTransaction.class);

    /** Creates new form ListTransaction */
    public ListTransaction() {
        UIUtils.setCustomUI();
        initComponents();
        LOGGER.info("Hello-2");
        hibernateTemplate = (HibernateTemplate) context.getBean(HibernateTemplate.class);
//LOGGER.info(hibernateTemplate.toString());
        List<User> users = hibernateTemplate.findByNamedQuery("User.findAll");
        Vector<User> userVector = new Vector<User>(users);
        userField.setModel(new DefaultComboBoxModel(userVector));
        LOGGER.info("Hello");
//        list.addAll((List<Transaction>) hibernateTemplate.findByNamedQuery("Transaction.findAll"));
        pack();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transaction1 = new com.pks.gms.domain.Transaction();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        userField = new javax.swing.JComboBox();
        userLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.pks.gms.GmsApp.class).getContext().getResourceMap(ListTransaction.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionTable.setName("transactionTable"); // NOI18N
        jScrollPane1.setViewportView(transactionTable);

        userField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pankaj" }));
        userField.setName("userField"); // NOI18N

        userLabel.setText(resourceMap.getString("userLabel.text")); // NOI18N
        userLabel.setName("userLabel"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(com.pks.gms.GmsApp.class).getContext().getActionMap(ListTransaction.class, this);
        jButton1.setAction(actionMap.get("refresh")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, 0, 144, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ListTransaction().setVisible(true);
            }
        });

    }

    @Action
    public Task refresh() {
        return new RefreshTask(org.jdesktop.application.Application.getInstance(com.pks.gms.GmsApp.class));
    }

    private class RefreshTask extends org.jdesktop.application.Task<Object, Void> {

        RefreshTask(org.jdesktop.application.Application app) {
            // Runs on the EDT.  Copy GUI state that
            // doInBackground() depends on from parameters
            // to RefreshTask fields, here.
            super(app);
        }

        @Override
        protected Object doInBackground() {
            // Your Task's code here.  This method runs
            // on a background thread, so don't reference
            // the Swing GUI from here.
            selectedUser = (User) userField.getSelectedItem();
            transactions = selectedUser.getTransactions();
            transactionVector = new Vector<Transaction>(transactions);
            Vector<String> columnNames = new Vector<String>();
            columnNames.add("id");
            columnNames.add("comments");
            columnNames.add("creditDebit");
            columnNames.add("EntryDate");
            columnNames.add("tranDate");
            columnNames.add("Uid");
            columnNames.add("id");
            columnNames.add("cid");
            columnNames.add("amount");


            tableModel = new DefaultTableModel(transactionVector, new Vector());
            return null;  // return your result
        }

        @Override
        protected void succeeded(Object result) {
            // Runs on the EDT.  Update the GUI based on
            // the result computed by doInBackground().
            transactionTable.setModel(tableModel);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.pks.gms.domain.Transaction transaction1;
    private javax.swing.JTable transactionTable;
    private javax.swing.JComboBox userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
    private java.util.List<Transaction> transactions;
    private Vector<Transaction> transactionVector;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    private User selectedUser;
    private DefaultTableModel tableModel;
}
