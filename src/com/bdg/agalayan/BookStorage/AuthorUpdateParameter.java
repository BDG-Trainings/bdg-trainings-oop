package BookStorage;

public class AuthorUpdateParameter {

        private int id;
        private String surname;
        private String name;

        public AuthorUpdateParameter(int id, String surname, String name){
            this.id=id;
            this.name=name;
            this.surname=surname;

        }

        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
         public int getId() {
        return id;
    }
}


