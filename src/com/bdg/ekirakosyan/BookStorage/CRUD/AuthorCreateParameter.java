package BookStorage.CRUD;

public class AuthorCreateParameter {

    private String name;
    private String surname;
    private String gender;

    public AuthorCreateParameter(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getGender() {
        return this.gender;
    }
}
