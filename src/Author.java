import java.util.Objects;

public class Author {


    private String authorName;


    private String authorSurname;

    private String bookName;
    int yearOfRelease;


    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return yearOfRelease == author.yearOfRelease && Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname) && Objects.equals(bookName, author.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname, bookName, yearOfRelease);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", bookName='" + bookName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}

