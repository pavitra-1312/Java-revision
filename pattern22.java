import java.util.*;

public class pattern22{
    public static void main(String[] args) {
        int ip = 7;
        for(int i=1;i<=ip;i++){
            for(int j=1;j<=i;j++){
                if (j%2==0)
                    System.out.print("$");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}