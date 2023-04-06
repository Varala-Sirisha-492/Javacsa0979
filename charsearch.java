import java.util.*; 
import java.io.*; 
public class charsearch 
{ 
 public static void main(String[] args) 
{ 
 Scanner sc=new Scanner(System.in); 
 char c; 
 String s; 
 System.out.println("Enter the string:"); 
 s=sc.next(); 
 System.out.println("Enter the character to be searched:"); 
 c=sc.next().charAt(0); 
 for(int i=0;i<s.length();i++) 
 if(s.charAt(i)==c) 
 System.out.println("position:"+i); 
 } 
} 
