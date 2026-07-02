import java.util.*;

public class pattern24{
    public static void main(String[] args) {
        int ip = 7;
        for(int i=1;i<=ip;i++){
            for(int j=1;j<=ip;j++){
                if(i==j || i == ip-j+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
