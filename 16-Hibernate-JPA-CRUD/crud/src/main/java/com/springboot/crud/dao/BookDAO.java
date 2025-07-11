package com.springboot.crud.dao;

import com.springboot.crud.entity.Book;

import java.util.List;

public interface BookDAO {
   public void save(Book theBook);

   public Book findById(Integer id);

   public List<Book> findAll();

   public List<Book> findByAuthorSorted();

   public List<Book> findByAuthor(String theAuthor);

   public void updateAuthorName(Book book);

   void delete(Integer id);

   int deleteAll();
}
