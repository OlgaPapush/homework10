public class Book {
    private String bookName;

    int yearOfRelease;



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

    public void setYearOfRelease (int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    }



