import java.util.*;
public class array8{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int[] arr1 = new int[4];
for(int i = 0; i<4; i++){
arr1[i] = s.nextInt();
}
int sum = 0;
for(int nu : arr1){
sum += nu;
}
System.out.println(sum);
}
}