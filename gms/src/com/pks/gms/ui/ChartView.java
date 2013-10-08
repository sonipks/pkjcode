/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChartView.java
 *
 * Created on Oct 8, 2013, 12:38:39 AM
 */
package com.pks.gms.ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.jdesktop.application.Action;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.jdbc.JDBCPieDataset;

/**
 *
 * @author VAIO
 */
public class ChartView extends javax.swing.JFrame {

    /** Creates new form ChartView */
    public ChartView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPieChart1 = new org.jfree.beans.JPieChart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.pks.gms.GmsApp.class).getContext().getResourceMap(ChartView.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setLocationByPlatform(true);
        setName("Form"); // NOI18N

        jPieChart1.setDataset(createDataset());
        jPieChart1.setCircular(false);
        jPieChart1.setPlotOutlineVisible(false);
        jPieChart1.setName("jPieChart1"); // NOI18N
        jPieChart1.setSource(resourceMap.getString("jPieChart1.source")); // NOI18N
        jPieChart1.setSubtitle(resourceMap.getString("jPieChart1.subtitle")); // NOI18N
        jPieChart1.setTitle(resourceMap.getString("jPieChart1.title")); // NOI18N

        javax.swing.GroupLayout jPieChart1Layout = new javax.swing.GroupLayout(jPieChart1);
        jPieChart1.setLayout(jPieChart1Layout);
        jPieChart1Layout.setHorizontalGroup(
            jPieChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPieChart1Layout.setVerticalGroup(
            jPieChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ChartView().setVisible(true);
            }
        });
    }


    private static PieDataset createDataset() {
        JDBCPieDataset pieDataset = null;
        String query = "select category,sum(amount) amount from tran_data natural join category where creditDebit='D' group by category order by 2 desc";
        try {
//        DefaultPieDataset defaultpiedataset = new DefaultPieDataset();
//        defaultpiedataset.setValue("Java", new Double(43.200000000000003D));
//        defaultpiedataset.setValue("Visual Basic", new Double(10D));
//        defaultpiedataset.setValue("C/C++", new Double(17.5D));
//        defaultpiedataset.setValue("PHP", new Double(32.5D));
//        defaultpiedataset.setValue("Perl", null);
//        return defaultpiedataset;
            pieDataset = new JDBCPieDataset(((DataSource) UIUtils.getSpringApplicationContext().getBean("dataSource")).getConnection(), query);

        } catch (SQLException ex) {
        }
        return pieDataset;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jfree.beans.JPieChart jPieChart1;
    // End of variables declaration//GEN-END:variables
}
