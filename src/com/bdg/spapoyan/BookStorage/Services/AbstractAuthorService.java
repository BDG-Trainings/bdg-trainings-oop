package com.bdg.spapoyan.BookStorage.Services;

import com.bdg.spapoyan.BookStorage.Author;
import com.bdg.spapoyan.BookStorage.AuthorCreateParameter;
import com.bdg.spapoyan.BookStorage.BookUpdateParameter;

public abstract class AbstractAuthorService {

    public abstract Author get(int id);
    public abstract Author create(AuthorCreateParameter params);
    public abstract Author update(BookUpdateParameter params);
    public abstract boolean delete(int id);

}
