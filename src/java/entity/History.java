package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author user
 */
public class History {
    private Long id;
    private Book book;
    private Reader reader;
    private Date beginDate;
    private Date endDate;

    public History() {
    }

    public History(Long id, Book book, Reader reader, Date beginDate, Date endDate) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.book);
        hash = 23 * hash + Objects.hashCode(this.reader);
        hash = 23 * hash + Objects.hashCode(this.beginDate);
        hash = 23 * hash + Objects.hashCode(this.endDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        if (!Objects.equals(this.beginDate, other.beginDate)) {
            return false;
        }
        if (!Objects.equals(this.endDate, other.endDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "History{" + "id=" + id 
                + ", book=" + book.getName()
                + ", reader=" + reader.getName()
                + " " + reader.getSurname()
                + ", beginDate=" + beginDate 
                + ", endDate=" + endDate 
                + '}';
    }
    
}
