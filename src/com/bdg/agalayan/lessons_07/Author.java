package Lessons_07;

public class Author {
    private String name;
    private String email;
    private char gender= 'm';

    public Author (String name, String email, char gender)

    {
        this.name = name;
        this.email = email;
        if (gender =='m' || gender == 'f') {
            this.gender = gender;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        if (gender == 'm'|| gender == 'f') {
            this.gender = gender;

        }
    }

 @Override
 public String toString(){
     return "Author [Name=" +name+","+ "email="+ email+ ","+ "gender="+ gender+"]";
 }
    public static void main(String[] args) {
    Author author = new Author("Anna", "anna@mail.ru", 'f');
    System.out.println(author.toString());

    }

}
