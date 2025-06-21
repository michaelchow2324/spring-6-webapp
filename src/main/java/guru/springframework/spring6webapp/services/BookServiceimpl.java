package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;

@Service
public class BookServiceimpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceimpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

}
