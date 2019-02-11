package com.bdg.aiskandaryan.Lesson_12.Services;

import com.bdg.aiskandaryan.Lesson_12.Author;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorCreateParameter;
import com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects.AuthorUpdateParameter;

public abstract class AbstractAuthorService {
    public abstract Author get(final int id);
    public abstract Author create(final AuthorCreateParameter author);
    public abstract Author update(final AuthorUpdateParameter author);
    public abstract boolean delete(final int id);
}
