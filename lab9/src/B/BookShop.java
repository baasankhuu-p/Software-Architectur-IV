package B;

import java.util.HashMap;
import java.util.Map;

public class BookShop implements IShop {
    /*Номнуудаа бүртгэх*/
    Map<Integer, BookInfo> bookMap = new HashMap<>();
    Map<Integer, User> usersMap = new HashMap<>();
    public void BookCreate(BookInfo book, int bookId) {
        bookMap.put(book.bookId,book);
    }
    public Map<Integer, BookInfo> getBooks(){
        return bookMap;
    }
    public void BookInfo() {
        for (Map.Entry<Integer, BookInfo> set :
                bookMap.entrySet()) {
            System.out.println("№("+set.getKey() + ") => " + "\t|\tНэр: "
                    + set.getValue().bookName + "\t|\tЗохиолч: " +
                    set.getValue().bookAuthor + "\t|\t Үнэ: " +
                    set.getValue().payBook + "\t|\t Тоо: " +
                    set.getValue().createBookCount);
        }
    }
    /*Хэрэглэгч бүртгэх*/
    public void UserCreate(User user, int phone) {
        usersMap.put(user.phone, user);
    }
    public Map<Integer, User> getUsers(){
        return usersMap;
    }
    public void UsersInfo() {
        for (Map.Entry<Integer, User> set :
                usersMap.entrySet()) {
            System.out.println("№("+set.getKey() + ") => " + "\t|\t Хаяг: " +
                    set.getValue().address + "\t|\t Нэр: " +
                    set.getValue().name + "\t|\t Утас: " +
                    set.getValue().phone + "\t|\t Байгаа номны тоо: " +
                    set.getValue().bookCount +"\t|\t Дансанд байгаа үлдэгдэл: " +
                    set.getValue().pay +"\t|\t Танд байгаа номнуудын тоо: " +
                    set.getValue().getBooks().size()
            );
        }
    }
}
