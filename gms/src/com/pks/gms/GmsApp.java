/*
 * GmsApp.java
 */
package com.pks.gms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The main class of the application.
 */
public class GmsApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override
    protected void startup() {
        show(new GmsView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override
    protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of GmsApp
     */
    public static GmsApp getApplication() {
        return Application.getInstance(GmsApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        try {
            String[] paths = {"classpath:com/pks/gms/resources/spring/applicationContext.xml"};
            ApplicationContext context = new ClassPathXmlApplicationContext(paths);
            System.out.println(((DataSource) context.getBean("dataSource")).getConnection());
            launch(GmsApp.class, args);
        } catch (SQLException ex) {
            Logger.getLogger(GmsApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
