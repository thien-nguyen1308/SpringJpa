package io.trophyroom.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(basePackages = "io.trophyroom.repository")
@EntityScan(basePackages = "io.trophyroom.entity")
public class JpaConfig {

	@Bean
	@Primary
	public JpaTransactionManager transactionManager(EntityManagerFactory em) {
		return new JpaTransactionManager(em);
	}
}
