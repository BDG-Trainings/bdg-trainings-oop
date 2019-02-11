package com.bdg.aiskandaryan.Lesson_12.Storages;

import com.bdg.aiskandaryan.Lesson_12.Author;

public abstract class AbstractAuthorStorage extends Storage {
    protected Author[] authorStore;

    public abstract Author store(final Author author);

    public abstract boolean remove(final Author author);

    public abstract Author get(final int id);
}
