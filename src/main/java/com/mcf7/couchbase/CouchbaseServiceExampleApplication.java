package com.mcf7.couchbase;

import com.mcf7.couchbase.config.SpringCouchbaseApplicationConfig;
import com.mcf7.couchbase.model.Catalog;
import com.mcf7.couchbase.repository.CatalogRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {SpringCouchbaseApplicationConfig.class, Catalog.class})
@EnableCouchbaseRepositories(basePackageClasses = CatalogRepository.class)
public class CouchbaseServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseServiceExampleApplication.class, args);
	}
}
