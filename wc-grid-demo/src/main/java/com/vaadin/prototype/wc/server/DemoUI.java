package com.vaadin.prototype.wc.server;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Widgetset("Demo")
@Theme("reindeer")
public class DemoUI extends UI{

    // http://localhost:8888/vaadin/ should load the app through
    // vaadin servlet and execute this UI code.
    // @WebServlet(urlPatterns = {"/vaadin/*", "/VAADIN/themes/*"})
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class WCServlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        access(new Runnable() {
            public void run() {
               Notification.show("adfasf");
            }
        });
    }
}
