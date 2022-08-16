package Main;

import Book.Book;

public class BoolImpl {
    public static void main(String[] args) {
    Book bk=new Book();
    //Setter methods
    bk.setTitle("Wings Of Fire");
    bk.setYearOfPublication("20/2/2003");
    bk.setAuthorName("Abdul Kalam");
    bk.setISBN(2403989L);
    bk.setNoOfPages(243);
    //Getter methods
        System.out.println(bk.getTitle());
        System.out.println(bk.getYearOfPublication());
        System.out.println(bk.getISBN());
        System.out.println(bk.getAuthorName());
        System.out.println(bk.getNoOfPages());
    }
}
