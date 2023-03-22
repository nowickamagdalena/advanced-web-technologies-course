package ztw.springboot.service.interfaces;

import ztw.springboot.api.dto.BookFormDTO;
import ztw.springboot.model.Book;

import java.util.Collection;

public interface IBooksService {
    Collection<Book> getBooks();

    Book getBook(long id);

    Book addBook(BookFormDTO bookDTO);

    void updateBook(long bookId, BookFormDTO bookDTO);

    void deleteBook(long id);
}
