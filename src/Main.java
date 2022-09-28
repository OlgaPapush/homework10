public class Main {


    public static void main(String[] args) {

        Book firstBook = new Book ("Garri Potter and The Philosopher's stone", 2000);
        Author firstAuthor = new Author("Joanne", "Rowling");
        Book secondBook = new Book ("Pippi longscking", 1993);
        Author secondAuthor = new Author("Astrid", "Lindgren");

        System.out.println("First Book:" + " " + firstAuthor.getFullName() +  " " +  ", " + firstBook.getBookName() + "; " + firstBook.getYearOfRelease());
        System.out.println("Second Book:" + " " + secondAuthor.getFullName() + " " +  ", " + secondBook.getBookName() + "; " + secondBook.getYearOfRelease());

        firstBook.setYearOfRelease(2022);
        System.out.println("firstBook.getYearOfRelease() =" + firstBook.getYearOfRelease());
        secondBook.setYearOfRelease(2022);
        System.out.println("secondBook.getYearOfRelease() =" + secondBook.getYearOfRelease());

        System.out.println(firstBook);
        System.out.println(secondBook);

    }
}