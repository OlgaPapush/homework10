import java.util.Objects;

public class Book {
    private final String bookName;
     int yearOfRelease;
     private  Author author;

    public   Book ( String bookName, Author author, int yearOfRelease) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfRelease =yearOfRelease;
    }
    public String getBookName () {
        return  bookName;
    }
    public int getYearOfRelease (){
        return yearOfRelease;
    }

    public Author getAuthor () {
        return author;
    }

    public void setYearOfRelease (int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Book(String bookName, int yearOfRelease)  {
        this.bookName = bookName;
        this.yearOfRelease = yearOfRelease;

    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfRelease == book.yearOfRelease && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearOfRelease, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", author=" + author +
                '}';
    }
}



