package B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    List<String> books = new ArrayList<>();
    String name,address;
    int bookCount, phone,pay;

    Scanner sc = new Scanner(System.in);

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay -= pay;
    }

    public User(String name, String address, int bookCount, int phone, int pay) {
        this.name = name;
        this.address = address;
        this.bookCount = bookCount;
        this.phone = phone;
        this.pay = pay;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(String book) {
        this.books.add(book);
    }
}
