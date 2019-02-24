package com.bdg.bookstorage.aghazaryan.service;

        import com.bdg.bookstorage.aghazaryan.common.AuthorCreateParameter;
        import com.bdg.bookstorage.aghazaryan.entity.Author;

public interface AuthorService {

    Author create(AuthorCreateParameterr createParameter);

    Author delete();

    Author get();

}
