/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pks.gms.util;

import com.pks.gms.domain.Transaction;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author VAIO
 */
public class TranTableModel extends DefaultTableModel {

    String[] paths = {"classpath:com/pks/gms/resources/spring/applicationContext.xml"};
    ApplicationContext context = new ClassPathXmlApplicationContext(paths);
    HibernateTemplate hibernateTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(TranTableModel.class);

    public TranTableModel() {
        hibernateTemplate = (HibernateTemplate) context.getBean(HibernateTemplate.class);
        List<Transaction> transactions = hibernateTemplate.findByNamedQuery("Transaction.findAll");
        Vector<Transaction> v = new Vector<Transaction>(transactions);
        addRow(v);
        LOGGER.info(v.toString());
    }

    @Override
    public int getColumnCount() {
        return super.getColumnCount();
    }

    @Override
    public int getRowCount() {
        return super.getRowCount();
    }

    @Override
    public Object getValueAt(int row, int column) {
        return super.getValueAt(row, column);
    }
}
