import java.util.*;
public class intToBinaryMain {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
String n = s.nextInt();
int res = 0, inc =0;
while(n >0){
if(n%10 != 0)  res += Math.pow(2, inc);
inc++;
n/=10;}
System.out.println(res);
}
}
       