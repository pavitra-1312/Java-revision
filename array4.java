import java.util.*;
public class array4{
public static void main(String[] args){
int arr1[] = {1,2,3,4,5};
int arr2[] = Arrays.copyOfRange(arr1,1,3);
for(int i : arr2){
System.out.println(i);
}}}