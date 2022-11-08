package B;

import java.util.Scanner;

public class User {
    String name, address;
    int phone,BooksCount;

    public int getBooksCount() {
        return BooksCount;
    }

    public void setBooksCount(int BookCount) {
        this.BooksCount += BookCount;
    }

    Scanner scanner = new Scanner(System.in);
    public User(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.BooksCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public void Asuulga(){
        int bool = 1;
        while (bool==1){
            System.out.println("Та ном захиалах уу?\t1.Тийм Бусад 2. Үгүй");
            bool = scanner.nextInt();
        }
    }
}
