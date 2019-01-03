package wolox.mongobootstrap.models;

import org.springframework.data.annotation.Id;

public class Book {

    @Id
    public String id;

    public String title;

    public String author;

    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
