package B;

import java.util.*;

public class BookShop {
    Map<String, Integer> data = new HashMap<>();
    String [] authName = {"A1","A2","A3","A4","A5"};
    String [] bookName = {"B1","B2","B3","B4","B5"};
    Integer [] bookCount = {5,5,5,5,5};
    BookShop(){
        DataBuild(data);
    }
    public Map DataBuild(Map<String, Integer> data){
        for (int i = 0; i<bookCount.length;i++){
            data.put("Зохиолч: "+authName[i]+" Ном: "+bookName[i],bookCount[i]);
        }
        return data;
    }
}
