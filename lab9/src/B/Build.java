package B;

import java.awt.print.Book;
import java.util.Scanner;

public class Build {
    Scanner sc = new Scanner(System.in);
    BookShop shop = new BookShop();
    Order order = new Order();

    Build() {
        System.out.println("-----------Эхлэх-----------");
        /*User variable*/
        String name, address;
        int bookCount = 0, phone, pay, createUser;

        /*Book variable*/
        String bookName, bookAuthor;
        int bookId,payBook;
        int createBook,createBookCount;

        System.out.println("Дэлгүүрт ном нэмэх (Тоог оруулна уу)");
        createBook = sc.nextInt();
        System.out.println("Дэлгүүрт Хэрэглэгч нэмэх (Тоог оруулна уу)");
        createUser = sc.nextInt();

        int i = 0;
        while (createBook>i){
            System.out.println("********* Дэлгүүрт Ном нэмэх *********");
            System.out.print("Номны Нэрийг оруулна уу: ");
            bookName = sc.next();
            System.out.print("Зохиогчийг оруулна уу: ");
            bookAuthor = sc.next();
            System.out.print("Номны дугаар: ");
            bookId = sc.nextInt();
            System.out.print("Номны Үнэ: ");
            payBook = sc.nextInt();
            System.out.print("Хэвлэгдсэн тоо: ");
            createBookCount = sc.nextInt();
            BookInfo book = new BookInfo(bookName,bookAuthor,bookId,payBook,createBookCount);
            shop.BookCreate(book,book.bookId);
            i++;
        }
        System.out.println("Бүртгэсэн номны мэдээллийг энэд харуулна");
        shop.BookInfo();
        System.out.println("\n");

        i = 0;
        while (createUser>i) {
            System.out.println("********* Дэлгүүрт хэрэглэгч нэмэх *********");
            System.out.print("Нэрээ оруулна уу: ");
            name = sc.next();
            System.out.print("Хаягаа оруулна уу: ");
            address = sc.next();
            System.out.print("Дугаараа оруулна уу: ");
            phone = sc.nextInt();
            System.out.print("Та дансандаа хэдийг хийх вэ: ");
            pay = sc.nextInt();
            /*Хэрэглэгч бүртгэгдлээ*/
            User user = new User(name, address, bookCount, phone, pay);
            /*Хэрэглэгч бүртгэгдэхээс гадна ном захиалах эрхтэй*/
            shop.UserCreate(user, phone);
            i++;
        }

        /*Дэлгүүрийн ном болон хэрэглэгчийн мэдээлэл захиалгын классд байх хэрэгтэй*/
        if(shop.bookMap.size()>0 && shop.usersMap.size()>0){

            System.out.println("-----------Бүх өгөгдөл-----------");
            System.out.println("Бүртгэсэн номны мэдээллийг энэд харуулна");
            shop.BookInfo();
            System.out.println("Бүртгэсэн хэрэглэгчийн мэдээллийг энэд харуулна");
            shop.UsersInfo();

            int orderCheck;

            order.BookCreate(shop.getBooks());
            order.UserCreate(shop.getUsers());
            while (1>0){
                System.out.println("Та ном захиалах уу:\n*** (1)Тийм\t (Бусад)Үгүй программыг зогсоох ***");
                orderCheck = sc.nextInt();
                switch (orderCheck){
                    case 1:{
                        order.Ordered();
                    }
                    case 2:{
                        order.exitPrintData();
                    }
                }
            }
        }
        else{
            System.out.println("-----------Өгөгдөл олдсонгүй-----------");
            System.out.println("Хэрэглэгч эсвэл номны мэдээлэл байхгүй байна\nТа дахин мэдээллээ оруулна уу");
            new Build();
        }
    }
}
