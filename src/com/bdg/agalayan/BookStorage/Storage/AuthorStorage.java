package com.bdg.agalayan.BookStorage.Storage;

import com.bdg.agalayan.BookStorage.entity.Author;

public final class AuthorStorage extends AbstractAuthorStorage {
   public Author[ ] authors;
   private int currentStorageSize;

    public AuthorStorage(int storageMaxSize, Author [] authors) {

        super(storageMaxSize, authors);



    }


    @Override
    protected int getCurrentStorageSize() {
        return super.getCurrentStorageSize();
    }

    @Override
    public Author store(Author author) {
        if(currentStorageSize<authorStore.length){
            authorStore[currentStorageSize]=author;
            currentStorageSize++;

        }return author;

    }

    @Override
    public boolean remove(Author author) {
        Author[]authors= new Author[authorStore.length];
        boolean t=false;
        int k=0;
        for(Author a:authorStore) {
            if (a.getId() != author.getId()) {
                authors[k] = author;
                k++;

            } else {
                t = true;
            }

        }
        currentStorageSize++;
        authorStore=authors;
        return t;

        }





    @Override
    public Author get(int id) {
        for (int i = 0; i < currentStorageSize; i++) {
            if (authorStore[i].getId() == id) {
                return authorStore[i];
            }
        }
        return null;

    }
}

