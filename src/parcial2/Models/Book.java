package parcial2.Models;

import java.io.Serializable;
public class Book implements Serializable {
     
    private String id;
    private String name;
    private String author;
    private int stock;

    public Book(String id, String name, String author, int stock) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }    
}
