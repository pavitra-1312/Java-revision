import java.util.*;

public class lenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a num:- ");
        int num = sc.nextInt(); // 12345
        int res = 0;
        while(num > 0){ // 12345
            res += 1;
            num = num / 10;
        }
        System.out.println(res);
    }
}