import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


public class Bodlogo2 {
    static void CountWords(String filename, Map<String, Integer> words) throws FileNotFoundException {
        Scanner file=new Scanner (filename);
        while(file.hasNext()){
            String word=file.next();
            Integer count=words.get(word);
            if(count!=null)
                count++;
            else
                count=1;
            words.put(word,count);
        }
        file.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> words=new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Үгээ оруулах: ");
        String text = sc.nextLine();
        String[] textArr = text.split(" ");
        CountWords(text,words);
        int max=0,nextmax = 0;
        for(Map.Entry<String,Integer> entry : words.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
            }
        }

        for(Map.Entry<String,Integer> entry : words.entrySet()){
            if(max == entry.getValue()){
                System.out.println(entry.getKey()+"=>"+entry.getValue());
                entry.setValue(0);
            }
        }
        for(Map.Entry<String,Integer> entry : words.entrySet()){
            if(entry.getValue()>nextmax){
                nextmax = entry.getValue();
            }
        }
        for(Map.Entry<String,Integer> entry : words.entrySet()){
            if(nextmax == entry.getValue()){
                System.out.println(entry.getKey()+"=>"+entry.getValue());
            }
        }
    }
}