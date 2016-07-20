package com.mcf7.couchbase.repository;

import com.mcf7.couchbase.model.Catalog;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

/**
 * Created by Matthew on 7/10/2016.
 */
public interface CatalogRepository extends CouchbasePagingAndSortingRepository<Catalog, String> {
}
