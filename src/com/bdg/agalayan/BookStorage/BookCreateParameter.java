package BookStorage;

public class BookCreateParameter {
        private String title;
        private double price;
        private AuthorCreateParameter[] authers;

        public BookCreateParameter(String title, double price, AuthorCreateParameter[] authers) {
            this.title = title;
            this.price = price;
            this.authers=authers;

        }


        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public AuthorCreateParameter[] getAuthers() {
              return authers;
        }
    }

