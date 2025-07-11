package com.springboot.crud.dao;

import com.springboot.crud.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DAOImpl implements BookDAO {
    // Field
    private EntityManager entityManager;

    // Constructor
    @Autowired
    public DAOImpl(EntityManager entityManager) { this.entityManager = entityManager; }

    @Override
    @Transactional
    public void save(Book theBook) { entityManager.persist(theBook); }

    public Book findById(Integer id) { return entityManager.find(Book.class, id); }

    public List<Book> findAll() {
        // Query
        TypedQuery<Book> theQuery = entityManager.createQuery("FROM Book", Book.class);

        // Return
        return theQuery.getResultList();
    }

    public List<Book> findByAuthorSorted() {
        // Query
        TypedQuery<Book> theQuery = entityManager.createQuery("FROM Book ORDER BY author", Book.class);

        // Return
        return theQuery.getResultList();
    }

    public List<Book> findByAuthor(String theAuthor) {
        // Query
        TypedQuery<Book> theQuery = entityManager.createQuery("FROM Book WHERE author=:theData ", Book.class);

        // Set Parameter
        theQuery.setParameter("theData", theAuthor);

        // Return
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateAuthorName(Book book) {
        entityManager.merge(book);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // Retrieve Book By ID
        Book theBook = entityManager.find(Book.class, id);

        // Delete Book
        entityManager.remove(theBook);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int rowsDeleted = entityManager.createQuery("DELETE FROM Book").executeUpdate();

        return rowsDeleted;
    }
}
