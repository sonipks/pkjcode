/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pks.gms.ui;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author VAIO
 */
public class UIUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(UIUtils.class);
    private static ApplicationContext CONTEXT;
    private static final String[] PATHS = {"classpath:com/pks/gms/resources/spring/applicationContext.xml"};

    public static void setCustomUI() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                LOGGER.error(ex.getMessage());
            }
        }
    }
    

    static {

        CONTEXT = new ClassPathXmlApplicationContext(PATHS);
    }

    public static ApplicationContext getSpringApplicationContext() {
        if (CONTEXT != null) {
        } else {
            CONTEXT = new ClassPathXmlApplicationContext(PATHS);
        }
        return CONTEXT;
    }
}
