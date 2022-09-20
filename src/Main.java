public class Main {


    public static void main(String[] args) {

        Book firstBook = new Book ("Garri Potter and The Philosopher's stone", 2000);
        Book secondBook = new Book (" Pippi longscking", 1993);



        Author firstAuthor = new Author("Joanne", "Rowling");
        Author secondAuthor = new Author("Astrid", "Lindgren");

        System.out.println("First Book:" + " " + firstAuthor.getAuthorSurname() + " " + firstAuthor.getAuthorName() + ", " + firstBook.getBookName() + "; " + firstBook.getYearOfRelease());
        System.out.println("Second Book:" + " " + secondAuthor.getAuthorName() + " " + secondAuthor.getAuthorName() + ", " + secondBook.getBookName() + "; " + secondBook.getYearOfRelease());

        firstBook.setYearOfRelease(2022);
        System.out.println("firstBook.getYearOfRelease() =" + firstBook.getYearOfRelease());
        secondBook.setYearOfRelease(2022);
        System.out.println("secondBook.getYearOfRelease() =" + secondBook.getYearOfRelease());




    }
}