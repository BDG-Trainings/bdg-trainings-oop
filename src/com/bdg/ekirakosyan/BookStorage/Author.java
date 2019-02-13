package BookStorage;

public class Author {

    private String name;
    private String surname;
    private String gender;

    public Author(String name, String surname, String gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
