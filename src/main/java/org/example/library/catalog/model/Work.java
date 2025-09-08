package org.example.library.catalog.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Work  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private WorkType workType;
    private String details;
    private String authors;
    private String subjects;


    @OneToMany(mappedBy = "work", fetch = FetchType.LAZY, cascade =CascadeType.ALL, orphanRemoval = true)
    private List<Edition> editions = new ArrayList<>();


    //Getters
    public Long getId(){return id;}
    public String getTitle(){return title;}
    public WorkType getWorkType(){return workType;}
    public String getDetails(){return details;}
    public String getAuthors(){return authors;}
    public String getSubjects(){return subjects;}


    //Setters
    public void setId(Long id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setWorkType(WorkType workType){this.workType = workType;}
    public void setDetails(String details){this.details = details;}
    public void setAuthors(String authors){this.authors = authors;}
    public void setSubjects(String subjects){this.subjects = subjects;}



}
