import java.util.Scanner;

public class Bodlogo {
    static String[] data = {"нэг","хоёр","гурав","дөрөв","тав","зургаа","долоо","найм","ес"};
    static String[] data_1 = {"нэг","хоёр","гурван","дөрвөн","таван","зургаан","долоон","найман","есөн"};
    static String[] data10 = {"арван","хорин","гучин","дөчин","тавин","жаран","далан","наян","ерэн"};
    static String[] data10_1 = {"арaв","хорь","гуч","дөч","тавь","жар","дал","ная","ер"};
    static String  data100 = " зуу",
                data1000=" мянга",
                data100000=" сая";
    public static int countDig(int n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean val = true;
        int inp,len;
        while(1>0){
            System.out.print("\nInput: ");
        inp = sc.nextInt();
        len = countDig(inp);
            switch (len){
                case 1:
                    build1(inp,val);
                    break;
                case 2:
                    build10(inp);
                    break;
                case 3:
                    build100(inp);
                    break;
                case 4:
                    build1000(inp);
                    break;
            }
        }
    }
    public static void build1(int inp,boolean val){
        inp = inp%10;
        if(val){
            System.out.print(" "+data[inp-1]);
        }
        else{
            System.out.print(data_1[inp-1]);
        }
    }
    public static void build10(int inp){
        inp = inp%100;
        int next = inp%10;
        if(next!=0){
            System.out.print(data10[inp/10-1]);
            build1(inp,true);
        }
        else{
            System.out.print(data10_1[inp/10-1]);
        }
    }
    public static void build100(int inp){
        int next = inp%1000/100;
            build1(next,false);
            if(next%10==0){
                System.out.print(data100);
            }
            if(next!=0){
                System.out.print(data100+"н");
            }
            System.out.print(" ");
            if(inp%100>10) {
                build10(inp % 100);
            }
            else if(inp%10>0){build10(inp%10);};
    }
    public static void build1000(int inp){
        int LenNxt,LenVal = inp/1000;
        LenNxt = countDig(LenVal);
        if(LenNxt==1){
                build1(inp/1000,false);
                System.out.print(data1000+" ");
                if(inp%1000!=0){
                    build100(inp%1000);
                }else if(inp%10!=0){
                    build10(inp%100);
                }
        }
    }

}
