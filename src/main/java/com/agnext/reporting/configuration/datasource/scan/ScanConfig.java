//package com.agnext.reporting.configuration.datasource.scan;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(entityManagerFactoryRef = "scanEntityManagerFactory",
//        transactionManagerRef = "scanTransactionManager",
//        basePackages = {"com.agnext.reporting.repository.scan"})
//public class ScanConfig {
//
//    @Bean(name = "scanDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "scanEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean scanEntityManagerFactory(EntityManagerFactoryBuilder builder,
//                                                                             @Qualifier("scanDataSource") DataSource dataSource) {
//        return builder.dataSource(dataSource).packages("com.agnext.reporting.entity.scan").persistenceUnit("ScanEntity").build();
//    }
//
//    @Bean(name = "scanTransactionManager")
//    public PlatformTransactionManager scanTransactionManager(
//            @Qualifier("scanEntityManagerFactory") EntityManagerFactory scanEntityManagerFactory) {
//        return new JpaTransactionManager(scanEntityManagerFactory);
//    }
//
//}
