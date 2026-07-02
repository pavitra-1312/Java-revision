import java.util.*;
public class pattern13{
public static void main(String[] args){
int a = 5;
for(int i = 1; i<=a; i++){
for(int sp = a-1;sp>=i;sp--){
System.out.print(" ");
}
for(int j = 1; j<=i; j++){
System.out.print("*");
}
System.out.println();
}
}
}