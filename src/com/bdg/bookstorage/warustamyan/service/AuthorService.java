package com.bdg.bookstorage.warustamyan.service;

import com.bdg.bookstorage.warustamyan.entity.Author;

public interface AuthorService {

    Author create();

    Author get();

    boolean delete();

    Author update();
}
