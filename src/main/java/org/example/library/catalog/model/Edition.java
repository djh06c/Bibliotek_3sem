package org.example.library.catalog.model;

import jakarta.persistence.*;

@Entity
public class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String editionNumber;
    int publicationYear;
    String format;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_id", nullable = false)
    private Work work;

    //Getters
    public Long getId() { return id;}
    public String getEditionNumber() { return editionNumber;}
    public int getPublicationYearYear() { return publicationYear;}
    public String getFormat() { return format;}

    //Setters
    public void setId(Long id) { this.id = id;}
    public void setEditionNumber(String editionNumber) { this.editionNumber = editionNumber;}
    public void setYear(int publicationYear) { this.publicationYear = publicationYear;}
    public void setFormat(String format) { this.format = format;}

}
