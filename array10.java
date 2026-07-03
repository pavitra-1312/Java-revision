import java.util.*;
public class array10{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int[] arr1 = new int[5];
for(int i = 0; i<5; i++){
arr1[i] = s.nextInt();
}
int sum = 0;
for(int nu : arr1){
if(nu%2 != 0)
sum += nu;
}
System.out.println(sum);
}
}