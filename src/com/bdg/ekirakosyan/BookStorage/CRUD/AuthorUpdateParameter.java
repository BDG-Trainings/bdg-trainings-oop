package BookStorage.CRUD;

public class AuthorUpdateParameter {

    private int id;
    private String name;
    private String surname;

    public AuthorUpdateParameter(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
