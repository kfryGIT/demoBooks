package com.example.demoBooks;


import javax.persistence.*;

@Entity(name ="Book")
@Table(name = "book"
     //  , uniqueConstraint = {@UniqueConstraint(name ="author_email_unique", columnNames = "author_email")}
        )
public class Book {

    @Id
    @SequenceGenerator(name="book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator ="book_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name="title",
            nullable = false,
            columnDefinition = "TEXT")
    private String title;

    @Column(name="author_name",
            nullable = false,
            columnDefinition = "TEXT")
    private String authorName;

    @Column(name="author_email",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true )
    private String authorEmail;

    @Column(name="age_of_book",
            nullable = false)
    private int ageOfBook;

    public Book() {
    }

    public Book(String title, String authorName, String authorEmail, int ageOfBook) {
        this.title = title;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.ageOfBook = ageOfBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String geteMailAuthorEmail() {
        return authorEmail;
    }

    public void seteMailAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public int getAgeOfBook() {
        return ageOfBook;
    }

    public void setAgeOfBook(int ageOfBook) {
        this.ageOfBook = ageOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorEmail='" + authorEmail + '\'' +
                ", ageOfBook=" + ageOfBook +
                '}';
    }
}
