public class Main {


    public static void main(String[] args) {

        Book firstBook = new Book ("Joanne", "Rowling","Garri Potter and The Philosopher's stone", 2000);
        Author firstAuthor = new Author("Joanne", "Rowling");
        Book secondBook = new Book ("Astrid", "Lindgren","Pippi longscking", 1993);
        Author secondAuthor = new Author("Astrid", "Lindgren");

        System.out.println("First Book:" + " " + firstAuthor.getAuthorSurname() + " " + firstAuthor.getAuthorName() + ", " + firstBook.getBookName() + "; " + firstBook.getYearOfRelease());
        System.out.println("Second Book:" + " " + secondAuthor.getAuthorName() + " " + secondAuthor.getAuthorSurname() + ", " + secondBook.getBookName() + "; " + secondBook.getYearOfRelease());

        firstBook.setYearOfRelease(2022);
        System.out.println("firstBook.getYearOfRelease() =" + firstBook.getYearOfRelease());
        secondBook.setYearOfRelease(2022);
        System.out.println("secondBook.getYearOfRelease() =" + secondBook.getYearOfRelease());

        System.out.println(firstBook);
        System.out.println(secondBook);




    }
}