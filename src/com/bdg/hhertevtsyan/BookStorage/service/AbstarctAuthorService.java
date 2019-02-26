package com.bdg.hhertevtsyan.BookStorage.service;

import com.bdg.hhertevtsyan.BookStorage.entity.Author;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.AuthorCreateParameter;
import com.bdg.hhertevtsyan.BookStorage.createupdateobjects.AuthorUpdateParameter;

public abstract class AbstarctAuthorService {

    public abstract Author get (final int id);
    public abstract Author create (final AuthorCreateParameter params);
    public abstract Author update (final AuthorUpdateParameter params);
    public abstract boolean delete (final int id);
}
