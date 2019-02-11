package com.bdg.aiskandaryan.Lesson_12.Services;

import com.bdg.aiskandaryan.Lesson_12.Book;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.BookCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.BookUpdateParameter;

public abstract class AbstractBookService {
    public abstract Book get(final int id);
    public abstract Book create(final BookCreateParameter book);
    public abstract Book update(final BookUpdateParameter book);
    public abstract boolean delete(final int id);

}
