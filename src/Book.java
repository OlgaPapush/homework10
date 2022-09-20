public class Book {
    private String bookName;
     int yearOfRelease;

     private String Author;



    public   Book ( String bookName, int yearOfRelease) {
        this.bookName = bookName;
        this.yearOfRelease =yearOfRelease;


    }
    public String getBookName () {
        return this. bookName;
    }
    public int getYearOfRelease (){
        return this.yearOfRelease;
    }

    public String getAuthor () { return this.Author; }

    public void setYearOfRelease (int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    }



