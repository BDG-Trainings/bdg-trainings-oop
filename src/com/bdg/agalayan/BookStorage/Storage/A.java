package com.bdg.agalayan.BookStorage.Storage;

import com.bdg.agalayan.BookStorage.entity.Author;

abstract class AbstractAuthorStorage extends Storage {
         protected Author[] authorStore;

        public  AbstractAuthorStorage(int storageMaxSize, Author [] authorStore){
            super(storageMaxSize);
            this.authorStore = authorStore;
        }

        public abstract Author store(Author author);

        public abstract void remove(Author author);

        public abstract Author get(int id);

        protected int getCurrentStorageSize(){
            return authorStore.length;

        }

    }


