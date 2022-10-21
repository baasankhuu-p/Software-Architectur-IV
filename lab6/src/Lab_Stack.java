import java.util.Scanner;
import java.util.Stack;

public class Lab_Stack {
    public static void main(String[] args) {
    Stack<Integer> stk = new Stack<Integer>();
    Scanner sc = new Scanner(System.in);
    int value = 0,type = 0,number;
        while (value==0){
            System.out.println("1. Тоо нэмэх 2. Тоо хасах 3. Унших 4. Гарах");
            type = sc.nextInt();
            switch (type){
                case 1: {
                    stk_push(stk);
                } break;
                case 2: {
                    stk_pop(stk);
                }break;
                case 3: {
                    stk_Read(stk);
                }break;
                case 4: {
                    System.out.println("Гарлаа !!!");
                    System.exit(0);
                }break;
            }
        }
    }
    private static Stack stk_push(Stack<Integer> stack){
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Өгөгдөл: ");
        val = sc.nextInt();
        stack.push(val);
        return stack;
    }
    private static Stack stk_pop(Stack<Integer> stack){
          if(!stack.empty()) {
              stack.pop();
              System.out.println("Хасагдлаа");
          }
          else System.out.println("Хоосон байна?");
          return stack;
    }
    private static void stk_Read(Stack<Integer> stack){
        System.out.println(stack);
    }
}
