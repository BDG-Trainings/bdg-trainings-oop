package BookStorage;

public class BookService extends AbstracktBookService{
    private BookStorage bookStorage;
    private AuthorService []authorService;
    public BookService(BookStorage storage, AuthorService[] service){
        this.bookStorage=storage;
        this.authorService =service;    }
    @Override
    public Book get(int id) {
     Book a = bookStorage.get(id);
      return a;    }
    @Override
    public Book create(BookCreateParameter parameter) {
        Author[] author = new Author[parameter.getAuthers().length];
        for(int i =0; i < parameter.getAuthers().length; i++){
            Author a = new Author(20, parameter.getAuthers()[i].getName(),
                    parameter.getAuthers()[i].getSurname(),parameter.getAuthers()[i].getGender());
            author[i]=a;        }
     Book b = new Book(20, parameter.getTitle(), parameter.getPrice(),author);
        bookStorage.store(b);
        return b;    }
    @Override
    public Book update(BookUpdateParameter parameter) {

       Book b = bookStorage.get(parameter.getId());

       Book a = new Book(b.getId(), parameter.getTitle(),
               parameter.getPrice(), b.getAuthors());
       bookStorage.remove(b) ;
       bookStorage.store(a);
          return a;
    }

    @Override
    public boolean delete(int id) {
        Book book =bookStorage.get(id);
        return bookStorage.remove(book);
    }
}
