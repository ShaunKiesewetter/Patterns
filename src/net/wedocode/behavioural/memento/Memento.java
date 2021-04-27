package net.wedocode.behavioural.memento;

import java.time.LocalDateTime;

public class Memento
{
    public String ISBN;
    public String Title;
    public String Author;
    public LocalDateTime LastEdited;

    public Memento(String isbn, String title, String author, LocalDateTime lastEdited)
    {
        ISBN = isbn;
        Title = title;
        Author = author;
        LastEdited = lastEdited;
    }
}
