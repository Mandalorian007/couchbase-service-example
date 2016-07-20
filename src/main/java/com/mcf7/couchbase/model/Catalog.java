package com.mcf7.couchbase.model;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Matthew on 7/10/2016.
 */
@Data
@Document
public class Catalog {
    public Catalog() {
        id = "catalog:" + Math.random();
    }

    public Catalog(String journal, String publisher, String edition, String title, String author) {
        id = "catalog:" + title.toLowerCase().replace(" ", "-");
        this.journal = journal;
        this.publisher = publisher;
        this.edition = edition;
        this.title = title;
        this.author = author;
    }

    @Id
    @NotNull
    @Size(min = 1)
    private String id;

    @Field
    @NotNull
    @Size(min = 1)
    private String journal;

    @Field
    @NotNull
    @Size(min = 1)
    private String publisher;

    @Field
    @NotNull
    @Size(min = 1)
    private String edition;

    @Field
    @NotNull
    @Size(min = 1)
    private String title;

    @Field
    @NotNull
    @Size(min = 1)
    private String author;
}
