package com.googlecode.t7mp.extlib.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.googlecode.t7mp.extlib", excludeFilters = { @Filter(Configuration.class) })
public class AppConfig {

    @Configuration
    @Profile("standard")
    static class Standard {

        /**
         * Resolves the configured DataSource from the container.
         * 
         * @return
         * @throws IllegalArgumentException
         * @throws NamingException
         */
        @Bean
        public DataSource dataSource() throws IllegalArgumentException, NamingException {
            JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
            jndiObjectFactoryBean.setResourceRef(true);
            jndiObjectFactoryBean.setLookupOnStartup(true);
            jndiObjectFactoryBean.setJndiName("jdbc/TestDB");
            jndiObjectFactoryBean.afterPropertiesSet();
            return (DataSource) jndiObjectFactoryBean.getObject();
        }
    }

}
