package com.youmeek.demo.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListener1 implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        System.out.println("init servlet context");
    }

    @Override
    public void contextDestroyed(final ServletContextEvent sce) {
        System.out.println("destroy servlet container");
    }
}
