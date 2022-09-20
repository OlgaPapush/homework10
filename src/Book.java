import java.util.Objects;

public class Book {
    private String bookName;
     int yearOfRelease;

     private String authorName;
     private String authorSurname;



    public   Book ( String authorName, String authorSurname, String bookName, int yearOfRelease) {
        this.bookName = bookName;
        this.yearOfRelease =yearOfRelease;
        this.authorName = authorName;
        this.authorSurname = authorSurname;


    }
    public String getBookName () {
        return this. bookName;
    }
    public int getYearOfRelease (){
        return this.yearOfRelease;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public void setYearOfRelease (int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Book(String bookName, int yearOfRelease, String authorName, String authorSurname) {
        this.bookName = bookName;
        this.yearOfRelease = yearOfRelease;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfRelease == book.yearOfRelease && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName) && Objects.equals(authorSurname, book.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearOfRelease, authorName, authorSurname);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }
}



