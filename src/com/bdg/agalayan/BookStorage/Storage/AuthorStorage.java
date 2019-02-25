package com.bdg.agalayan.BookStorage.Storage;

import com.bdg.agalayan.BookStorage.entity.Author;

public final class AuthorStorage extends AbstractAuthorStorage {
   public Author[ ] authors;

    public AuthorStorage(int StorageMaxSize, Author [] authors) {
        super(StorageMaxSize, authors);


    }
    @Override
    public Author store(Author author) {
        Author []author1= new Author[authorStore.length+1];
        for (int i=0; i<authorStore.length; i++) {
            author1[i] = authorStore[i];
        }author1[authorStore.length+1]=author;

        return author;
    }

    @Override
    public void remove(Author author) {
    }

    @Override
    public Author get(int id) {
        for(int i=0; i< authorStore.length; i++){
            if(authorStore[i].getId()==id){
                return authorStore[i];
            }
        }
        return null;
    }


}
