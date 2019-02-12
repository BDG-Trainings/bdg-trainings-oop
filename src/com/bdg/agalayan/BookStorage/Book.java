package BookStorage;

public class Book {
    private int id;
    private String name;
    private String title;
    private double price;
    private Author[] authors;

    public Book(int id, String name, String title, double price, Author[] authors) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public void setAuthors(Author author) {
        Author[] author1 =new Author[authors.length + 1];
        for (int i = 0; i < authors.length; i++) {
            author1[i]=authors[i];

        }author1[authors.length + 1] = author;
        this.authors=author1;
    }
}







