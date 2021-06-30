package com.example.ilenguageapi.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private int rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tutor_id", nullable = true)
    private User tutor;

    public Long getId() {
        return id;
    }

    public Comment setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Comment setContent(String content) {
        this.content = content;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public Comment setRating(int rating) {
        this.rating = rating;
        return this;
    }

    public User getUser() {
        return tutor;
    }

    public Comment setUser(User tutor) {
        this.tutor = tutor;
        return this;
    }
}
