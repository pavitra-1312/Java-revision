import java.util.*;

public class sumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a num:- ");
        int num = sc.nextInt(); // 123
        int res = 0;
        while(num > 0){ // 0
            // System.out.println(num % 10);
            res += num%10;
            num = num / 10;
        }
        System.out.println(res);
    }
}