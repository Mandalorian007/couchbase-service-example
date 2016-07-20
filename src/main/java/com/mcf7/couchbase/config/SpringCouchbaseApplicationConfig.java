package com.mcf7.couchbase.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Matthew on 7/10/2016.
 */
@Configuration
public class SpringCouchbaseApplicationConfig extends AbstractCouchbaseConfiguration {
    @Value("${couchbase.bucket.name:default}")
    private String bucketName;

    //TODO
    @Value("${couchbase.bucket.password:}")
    private String password;

    @Value("${couchbase.bootstrap-hosts:127.0.0.1}")
    private String ip;

    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList(ip);
    }

    @Override
    protected String getBucketName() {
        return bucketName;
    }

    @Override
    protected String getBucketPassword() {
        return "";
    }
}
