package oop;

public class main {
    public static void main(String[] args) {

        HistoricalBook book = new HistoricalBook();

        book.setName("New History");
        System.out.println(book.getName());

        book.tearOutThePages();
        book.glueThePage();
        book.rewriteBook();
        book.changeAuthor();
    }
}
