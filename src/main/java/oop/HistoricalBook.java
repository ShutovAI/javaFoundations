package oop;

import java.util.Scanner;

public class HistoricalBook {
    private String name = "Java History";
    private String author = "Writer";
    private int page = 999;
    private int age = 10;
    Scanner scanner = new Scanner(System.in);

    public void tearOutThePages() {
        System.out.print("Введите номер страницы, которые следует вырвать: " + "\n");
        int scan1 = scanner.nextInt();
        System.out.print("Страница " + scan1 + " вырвана" + "\n");
    }

    public void glueThePage() {
        System.out.print("Введите номер страницы для склеивания: " + "\n");
        int scan2 = scanner.nextInt();
        System.out.print("Страница " + scan2 + " заклеина" + "\n");
    }

    public void rewriteBook() {
        System.out.print("Введите новое название книги: " + "\n");
        String scan3 = scanner.next();
        System.out.print("Новая книга " + scan3 + "\n");
    }

    public void changeAuthor() {
        System.out.print("Введите новго автора: " + "\n");
        String scan4 = scanner.next();
        System.out.print("Новый автор " + scan4);
    }

    public void setName(String reName){
        name = reName;
    }
    public String getName(){
        return name;
    }
}
