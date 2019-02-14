package BookStorage;

public class BookUpdateParameter {
    private int id;
    private String title;
    private double price;

    public BookUpdateParameter(int id, String title, double price){
        this.id=id;
        this.title=title;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}


