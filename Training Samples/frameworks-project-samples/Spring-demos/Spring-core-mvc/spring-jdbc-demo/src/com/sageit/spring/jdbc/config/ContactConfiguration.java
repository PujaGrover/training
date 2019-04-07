package com.sageit.spring.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sageit.spring.jdbc.dao.ContactDAO;
import com.sageit.spring.jdbc.dao.ContactDAOImpl;

@Configuration
@ComponentScan(basePackages="com.sageit.spring.jdbc")
public class ContactConfiguration {
 
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/j2se2k17");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
         
        return dataSource;
    }
     
    @Bean(name="contactDAO")
    public ContactDAO getContactDAO() {
        return new ContactDAOImpl(getDataSource());
    }
}