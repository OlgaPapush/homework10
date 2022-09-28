import java.util.Objects;

public class Author {
    private final String authorName;
    private  String authorSurname;
    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public  String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }
    public String getFullName () {return authorName + " " + authorSurname; }

    private Author(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

}

