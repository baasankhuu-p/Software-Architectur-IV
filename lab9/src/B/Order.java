package B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order implements IShop {
    Scanner sc = new Scanner(System.in);
    Map<Integer, BookInfo> bookMap = new HashMap<>();
    Map<Integer, User> usersMap = new HashMap<>();

    Order() {

    }

    public void BookCreate(Map<Integer, BookInfo> bookData) {
        this.bookMap = bookData;
    }

    public void UserCreate(Map<Integer, User> usersData) {
        this.usersMap = usersData;
    }

    /*Zahialah heseg*/
    public void Ordered() {
        System.out.println("Ta холбогдох дугаараа оруулна уу");
        int phoneNumber = sc.nextInt(),
                searchUser = 0;
        for (Map.Entry<Integer, User> item : usersMap.entrySet()) {
            if (item.getValue().phone == phoneNumber) {
                searchUser = 1;
                break;
            }
        }
        if (searchUser == 0) {
            notification(2);
        }
        if (searchUser != 0) {
            System.out.println("Ta Захиалах Номныхаа дугаарыг оруулна уу");
            int bookID = sc.nextInt(), searchBook = 0;
            /*Хэрвээ Хэрэглэгч олдвол номыг шүүх процесс явагдана*/
            for (Map.Entry<Integer, BookInfo> item : bookMap.entrySet()) {
                if (item.getValue().bookId == bookID) {
                    searchBook = 1;
                    break;
                }
            }
            if (searchBook != 0) {
                for (Map.Entry<Integer, BookInfo> item : bookMap.entrySet()) {
                    if (item.getValue().bookId == bookID && item.getValue().createBookCount > 0) {
                        for (Map.Entry<Integer, User> userEntry : usersMap.entrySet()) {
                            if(userEntry.getValue().phone == phoneNumber && userEntry.getValue().pay >= item.getValue().payBook){
                                setBookCount(item.getValue());
                                userEntry.setValue(
                                        setUsersInfo(userEntry.getValue(), item.getValue().payBook, item.getValue().bookName)
                                );
                                notification(1);
                            }
                            if(userEntry.getValue().phone == phoneNumber && userEntry.getValue().pay < item.getValue().payBook){
                                notification(4);
                            }
                        }
                        break;
                    }
                    if (item.getValue().bookId == bookID && item.getValue().createBookCount == 0) {
                        notification(3);
                        break;
                    }
                }
            } else {
                notification(0);
            }
        }


    }

    public void exitPrintData() {
        System.out.println("----------- Дууслаа-----------");
        System.exit(0);
    }

    public BookInfo setBookCount(BookInfo book) {
        book.setCreateBookCount();
        return book;
    }

    public User setUsersInfo(User user, int Book_pay, String bookName) {
        user.setPay(Book_pay);
        user.setBooks(bookName);
        return user;
    }

    public void UsersInfo() {
        for (Map.Entry<Integer, User> set :
                usersMap.entrySet()) {
            System.out.print("№(" + set.getKey() + ") => " + "\t|\t Хаяг: " +
                    set.getValue().address + "\t|\t Нэр: " +
                    set.getValue().name + "\t|\t Утас: " +
                    set.getValue().phone + "\t|\t Дансанд байгаа үлдэгдэл: " +
                    set.getValue().pay + "\t|\t"
            );
            if (set.getValue().getBooks().size() > 0) {
                System.out.print(" Авсан номнууд: [ ");
                for (int i = 0; i < set.getValue().getBooks().size(); i++) {
                    System.out.print(set.getValue().getBooks().get(i)+" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    public void BookInfo() {
        for (Map.Entry<Integer, BookInfo> set :
                bookMap.entrySet()) {
            System.out.println("№(" + set.getKey() + ") => " + "\t|\tНэр: "
                    + set.getValue().bookName + "\t|\tЗохиолч: " +
                    set.getValue().bookAuthor + "\t|\t Үнэ: " +
                    set.getValue().payBook + "\t|\t Тоо: " +
                    set.getValue().createBookCount);
        }
    }

    public void notification(int val) {
        System.out.println("=> Мэдээлэл: ");
        if (val == 0) {
            System.out.println("Ном олдсонгүй!!!");
        } else if (val == 1) {
            System.out.println("Амжилттай захиаллаа");
        } else if (val == 2) {
            System.out.println("Хэрэглэгчийн дугаар буруу байна");
        } else if (val == 3) {
            System.out.println("Амжилтгүй ном дууссан байна");
        } else if (val == 4) {
            System.out.println("Дансан дахь үлдэгдэл хүрэлцэхгүй байна");
        }
        prints();
    }
    public void prints(){
        System.out.println("Дэлгүүрт байгаа номнууд: ");
        BookInfo();
        System.out.println("Хэрэглэгчид: ");
        UsersInfo();
        Ordered();
    }
}
