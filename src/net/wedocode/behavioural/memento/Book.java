package net.wedocode.behavioural.memento;

import java.time.LocalDateTime;

public class Book {
    private String _isbn;
    private String _title;
    private String _author;
    private LocalDateTime _lastEdited;

    public String get_isbn() {
        return _isbn;
    }

    public void set_isbn(String _isbn) {
        this._isbn = _isbn;
        set_lastEdited();
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
        set_lastEdited();
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
        set_lastEdited();
    }

    public LocalDateTime get_lastEdited() {
        return _lastEdited;
    }

    public void set_lastEdited() {
        this._lastEdited = LocalDateTime.now();
    }

    public Book(){
        set_lastEdited();
    }

    public Memento createUndo()
    {
        return new Memento(_isbn, _title, _author, _lastEdited);
    }


    public void restoreFromUndo(Memento memento)
    {
        _title = memento.Title;
        _author = memento.Author;
        _isbn = memento.ISBN;
        _lastEdited = memento.LastEdited;
    }

    @Override
    public String toString() {
        return "Book{" +
                "_isbn='" + _isbn + '\'' +
                ", _title='" + _title + '\'' +
                ", _author='" + _author + '\'' +
                ", _lastEdited=" + _lastEdited +
                '}';
    }
}
