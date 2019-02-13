package BookStorage.CRUD;

public class BookCreateParameter {

    private int id;
    private String name;
    private String title;
    private double price;
    private AuthorCreateParameter[] authors;

    public BookCreateParameter(String name, String title, double price, AuthorCreateParameter[] authors){
        this.name = name;
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return this.name;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(){
        return this.price;
    }

    public AuthorCreateParameter[] getAuthors() {
        return authors;
    }
}
