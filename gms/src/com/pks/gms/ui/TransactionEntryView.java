/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TransactionEntryView.java
 *
 * Created on Sep 17, 2013, 9:47:37 PM
 * @author Pankaj Soni
 *
 */
package com.pks.gms.ui;

import com.pks.gms.domain.Category;
import com.pks.gms.domain.Transaction;
import com.pks.gms.domain.User;
import datechooser.beans.DateChooserCombo;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;
import org.jdesktop.application.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Transaction Entry View
 *
 * @author Pankaj Soni
 */
public class TransactionEntryView extends javax.swing.JFrame {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionEntryView.class);

    /** Creates new form TransactionEntryView */
    public TransactionEntryView() {
        UIUtils.setCustomUI();
        initComponents();
        hibernateTemplate = (HibernateTemplate) UIUtils.getSpringApplicationContext().getBean(HibernateTemplate.class);
        List<Category> categorys = hibernateTemplate.findByNamedQuery("Category.findAll");
        Vector<Category> categoryVector = new Vector<Category>(categorys);
        categoryField.setModel(new DefaultComboBoxModel(categoryVector));
        List<User> users = hibernateTemplate.findByNamedQuery("User.findAll");
        Vector<User> userVector = new Vector<User>(users);
        userField.setModel(new DefaultComboBoxModel(userVector));
//        entryDateField.setText(dateFormat.format(new Date()));
//        tranDateField.setText(entryDateField.getText());
//        For dateChooser combo
        entryDateChooserCombo.setDateFormat(dateFormat);
        tranDateChooserCombo.setDateFormat(dateFormat);

//        InputStream dateChooserCfgStream = TransactionEntryView.class.getClassLoader().getResourceAsStream("com/pks/gms/ui/resources/DateChooserComboCfg.dchc");
//        if(dateChooserCfgStream==null){
//            LOGGER.error("dateChooser cfg not loaded");
//        }
//        dateChooserCombo.
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tranRecord = new com.pks.gms.domain.Transaction();
        user = new com.pks.gms.domain.User();
        category = new com.pks.gms.domain.Category();
        amountLabel = new javax.swing.JLabel();
        commentsLabel = new javax.swing.JLabel();
        creditDebitLabel = new javax.swing.JLabel();
        entryDateLabel = new javax.swing.JLabel();
        tranDateLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        commentsField = new javax.swing.JTextField();
        creditRadio = new javax.swing.JRadioButton();
        debitRadio = new javax.swing.JRadioButton();
        userField = new javax.swing.JComboBox();
        categoryField = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        creditDebitCheckBox = new javax.swing.JCheckBox();
        statusLabel = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        entryDateChooserCombo = new datechooser.beans.DateChooserCombo();
        tranDateChooserCombo = new datechooser.beans.DateChooserCombo();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.pks.gms.GmsApp.class).getContext().getResourceMap(TransactionEntryView.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("Form"); // NOI18N
        setResizable(false);

        amountLabel.setLabelFor(amountField);
        amountLabel.setText(resourceMap.getString("amountLabel.text")); // NOI18N
        amountLabel.setName("amountLabel"); // NOI18N

        commentsLabel.setLabelFor(commentsField);
        commentsLabel.setText(resourceMap.getString("commentsLabel.text")); // NOI18N
        commentsLabel.setName("commentsLabel"); // NOI18N

        creditDebitLabel.setText(resourceMap.getString("creditDebitLabel.text")); // NOI18N
        creditDebitLabel.setName("creditDebitLabel"); // NOI18N

        entryDateLabel.setText(resourceMap.getString("entryDateLabel.text")); // NOI18N
        entryDateLabel.setName("entryDateLabel"); // NOI18N

        tranDateLabel.setText(resourceMap.getString("tranDateLabel.text")); // NOI18N
        tranDateLabel.setName("tranDateLabel"); // NOI18N

        categoryLabel.setLabelFor(categoryField);
        categoryLabel.setText(resourceMap.getString("categoryLabel.text")); // NOI18N
        categoryLabel.setName("categoryLabel"); // NOI18N

        userLabel.setLabelFor(userField);
        userLabel.setText(resourceMap.getString("userLabel.text")); // NOI18N
        userLabel.setName("userLabel"); // NOI18N

        amountField.setText(resourceMap.getString("amountField.text")); // NOI18N
        amountField.setName("amountField"); // NOI18N

        commentsField.setText(resourceMap.getString("commentsField.text")); // NOI18N
        commentsField.setName("commentsField"); // NOI18N

        buttonGroup1.add(creditRadio);
        creditRadio.setText(resourceMap.getString("creditRadio.text")); // NOI18N
        creditRadio.setName("creditRadio"); // NOI18N

        buttonGroup1.add(debitRadio);
        debitRadio.setSelected(true);
        debitRadio.setText(resourceMap.getString("debitRadio.text")); // NOI18N
        debitRadio.setName("debitRadio"); // NOI18N

        userField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pankaj" }));
        userField.setName("userField"); // NOI18N

        categoryField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Others" }));
        categoryField.setName("categoryField"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(com.pks.gms.GmsApp.class).getContext().getActionMap(TransactionEntryView.class, this);
        saveButton.setAction(actionMap.get("saveAction")); // NOI18N
        saveButton.setMnemonic('S');
        saveButton.setText(resourceMap.getString("saveButton.text")); // NOI18N
        saveButton.setToolTipText(resourceMap.getString("saveButton.toolTipText")); // NOI18N
        saveButton.setName("saveButton"); // NOI18N

        newButton.setAction(actionMap.get("newAction")); // NOI18N
        newButton.setMnemonic('N');
        newButton.setText(resourceMap.getString("newButton.text")); // NOI18N
        newButton.setToolTipText(resourceMap.getString("newButton.toolTipText")); // NOI18N
        newButton.setName("newButton"); // NOI18N

        creditDebitCheckBox.setSelected(true);
        creditDebitCheckBox.setText(resourceMap.getString("creditDebitCheckBox.text")); // NOI18N
        creditDebitCheckBox.setToolTipText(resourceMap.getString("creditDebitCheckBox.toolTipText")); // NOI18N
        creditDebitCheckBox.setName("creditDebitCheckBox"); // NOI18N

        statusLabel.setFont(resourceMap.getFont("statusLabel.font")); // NOI18N
        statusLabel.setForeground(resourceMap.getColor("statusLabel.foreground")); // NOI18N
        statusLabel.setText(resourceMap.getString("statusLabel.text")); // NOI18N
        statusLabel.setName("statusLabel"); // NOI18N

        quitButton.setAction(actionMap.get("quit")); // NOI18N
        quitButton.setText(resourceMap.getString("quitButton.text")); // NOI18N
        quitButton.setName("quitButton"); // NOI18N

        entryDateChooserCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    entryDateChooserCombo.setCalendarPreferredSize(new java.awt.Dimension(335, 255));
    entryDateChooserCombo.setLocked(true);
    entryDateChooserCombo.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

    tranDateChooserCombo.setCalendarPreferredSize(new java.awt.Dimension(335, 255));
    tranDateChooserCombo.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

    statusPanel.setName("statusPanel"); // NOI18N

    statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

    statusMessageLabel.setName("statusMessageLabel"); // NOI18N

    statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

    progressBar.setName("progressBar"); // NOI18N

    javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
    statusPanel.setLayout(statusPanelLayout);
    statusPanelLayout.setHorizontalGroup(
        statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        .addGroup(statusPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(statusMessageLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(statusAnimationLabel)
            .addContainerGap())
    );
    statusPanelLayout.setVerticalGroup(
        statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(statusPanelLayout.createSequentialGroup()
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(statusMessageLabel)
                .addComponent(statusAnimationLabel)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(3, 3, 3))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(commentsLabel)
                        .addComponent(amountLabel)
                        .addComponent(creditDebitLabel)
                        .addComponent(categoryLabel)
                        .addComponent(userLabel)
                        .addComponent(tranDateLabel)
                        .addComponent(entryDateLabel)
                        .addComponent(newButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(saveButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(quitButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(categoryField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(entryDateChooserCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(creditRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(debitRadio))
                                    .addComponent(tranDateChooserCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creditDebitCheckBox))
                            .addComponent(amountField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commentsField, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addContainerGap(130, Short.MAX_VALUE))
                .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(21, Short.MAX_VALUE)
            .addComponent(statusLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commentsLabel)
                    .addComponent(commentsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(amountLabel)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(creditDebitLabel)
                .addComponent(creditRadio)
                .addComponent(debitRadio)
                .addComponent(creditDebitCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(entryDateLabel)
                .addComponent(entryDateChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(tranDateLabel)
                .addComponent(tranDateChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(categoryLabel)
                .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(userLabel)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(newButton)
                .addComponent(saveButton)
                .addComponent(quitButton))
            .addGap(18, 18, 18)
            .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    getAccessibleContext().setAccessibleDescription(resourceMap.getString("Form.AccessibleContext.accessibleDescription")); // NOI18N

    pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TransactionEntryView().setVisible(true);
            }
        });
    }

    @Action
    public void newAction() {
        statusLabel.setText("New Record Entry");
        tranRecord = new Transaction();
        String inputText = JOptionPane.showInputDialog(this, "New Record Entry - Enter Amount");
        amountField.setText(inputText);
    }

    @Action
    public Task saveAction() {
        return new SaveActionTask(org.jdesktop.application.Application.getInstance(com.pks.gms.GmsApp.class));
    }

    private class SaveActionTask extends org.jdesktop.application.Task<Object, Void> {

        boolean creditDebitFlag = false;

        SaveActionTask(org.jdesktop.application.Application app) {
            // Runs on the EDT.  Copy GUI state that
            // doInBackground() depends on from parameters
            // to SaveActionTask fields, here.
            super(app);
            tranRecord.setAmount(new BigInteger(amountField.getText()));
            tranRecord.setComments(commentsField.getText());
            if (debitRadio.isSelected()) {
                tranRecord.setCreditDebit("D");
            } else {
                tranRecord.setCreditDebit("C");
            }
                tranRecord.setEntryDate(entryDateChooserCombo.getCurrent().getTime());
                tranRecord.setTranDate(tranDateChooserCombo.getCurrent().getTime());
//                tranRecord.setTranDate(dateFormat.parse(tranDateField.getText()));


            tranRecord.setUid((User) userField.getSelectedItem());
            tranRecord.setCid((Category) categoryField.getSelectedItem());

            LOGGER.debug("tranRec: " + tranRecord);
            creditDebitFlag = creditDebitCheckBox.isSelected();
            statusLabel.setText("Saving Data...");


        }

        @Override
        protected Object doInBackground() {
            // Your Task's code here.  This method runs
            // on a background thread, so don't reference
            // the Swing GUI from here.
            if (creditDebitFlag) {
                try {
                    Transaction dupTranRecord = (Transaction) tranRecord.clone();
                    LOGGER.debug("dup tranRec: " + dupTranRecord);
                    hibernateTemplate.saveOrUpdate(dupTranRecord);
                } catch (CloneNotSupportedException ex) {
                }
            }
            hibernateTemplate.saveOrUpdate(tranRecord);
            return null;  // return your result
        }

        @Override
        protected void succeeded(Object result) {
            // Runs on the EDT.  Update the GUI based on
            // the result computed by doInBackground().
            statusLabel.setText("Data Saved successfully!");
        }
    }
    @Autowired
    HibernateTemplate hibernateTemplate;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
    public DateChooserCombo dateChooserCombo = new DateChooserCombo();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.pks.gms.domain.Category category;
    private javax.swing.JComboBox categoryField;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField commentsField;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JCheckBox creditDebitCheckBox;
    private javax.swing.JLabel creditDebitLabel;
    private javax.swing.JRadioButton creditRadio;
    private javax.swing.JRadioButton debitRadio;
    private datechooser.beans.DateChooserCombo entryDateChooserCombo;
    private javax.swing.JLabel entryDateLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private datechooser.beans.DateChooserCombo tranDateChooserCombo;
    private javax.swing.JLabel tranDateLabel;
    private com.pks.gms.domain.Transaction tranRecord;
    private com.pks.gms.domain.User user;
    private javax.swing.JComboBox userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
