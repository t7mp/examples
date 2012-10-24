package com.googlecode.t7mp.extlib.web.controller;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DbVersionController {

    private static final Logger LOG = LoggerFactory.getLogger(DbVersionController.class);

    @Inject
    private DataSource dataSource;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return getVersionInfoFromDb();
    }

    private String getVersionInfoFromDb() {
        Connection connection = null;

        String productName = "NAME NOT FOUND";
        String productVersion = "VERSION NOT FOUND";
        try {
            connection = dataSource.getConnection();
            DatabaseMetaData metaData = connection.getMetaData();
            productName = metaData.getDatabaseProductName();
            productVersion = metaData.getDatabaseProductVersion();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        }

        return productName + " : " + productVersion;
    }

}
