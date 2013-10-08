/*
 * Bootstrapping Main class
 * GmsApp.java
 * 
 * @author Pankaj Soni
 */
package com.pks.gms;

import com.pks.gms.ui.MenuView;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
            new MenuView().setVisible(true);
        } catch (Exception ex) {
            LOGGER.error(ex.getLocalizedMessage());
        }
//            launch(GmsApp.class, args);

    }
    private static final Logger LOGGER = LoggerFactory.getLogger(GmsApp.class);
}
