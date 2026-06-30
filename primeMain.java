import java.util.*;
class primeMain{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num = s.nextInt();
Boolean isprime = true;
if(num<=0){
isprime = false;
}
else{
for(int i = 1; i<=num/2; i++){
if(num%i == 0)  isprime = false;
else isprime = true;
}
}
System.out.println(isprime);
}
}
