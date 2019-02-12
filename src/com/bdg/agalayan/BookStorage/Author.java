package BookStorage;

public class Author {
        private String name;
        private String surname;
        private String gender;
        private int id;

        public Author(int id, String name, String surname, String gender) {
            this.id=id;
            this.name = name;
            this.surname = surname;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

