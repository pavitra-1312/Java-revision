import java.util.*;
public class binaryMain {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
int n = s.nextInt();
String binary = " ";
while(n >0){
binary = (n%2) + binary;
n = n/2;
}
System.out.println("Binary = "+binary);
}
}
       