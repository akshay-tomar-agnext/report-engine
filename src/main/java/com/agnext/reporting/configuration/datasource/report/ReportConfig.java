//package com.agnext.reporting.configuration.datasource.report;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(entityManagerFactoryRef = "reportEntityManagerFactory",
//        transactionManagerRef = "reportTransactionManager",
//        basePackages = {"com.agnext.reporting.repository.report"})
//public class ReportConfig {
//
//    @Bean(name = "reportDataSource")
//    @ConfigurationProperties(prefix = "spring.second-datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "reportEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean reportEntityManagerFactory(EntityManagerFactoryBuilder builder,
//                                                                             @Qualifier("reportDataSource") DataSource dataSource) {
//        return builder
//                .dataSource(dataSource)
//                .packages("com.agnext.reporting.entity.report")
//                .persistenceUnit("ScanReportEntity")
//                .build();
//    }
//
//    @Bean(name = "reportTransactionManager")
//    public PlatformTransactionManager reportTransactionManager(
//            @Qualifier("reportEntityManagerFactory") EntityManagerFactory reportEntityManagerFactory) {
//        return new JpaTransactionManager(reportEntityManagerFactory);
//    }
//}
