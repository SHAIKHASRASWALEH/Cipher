import java.util.*;
public class TestCipher
{
  public static void main(String []args)
  {
 
     Scanner sc=new Scanner(System.in);
     System.out.println("Type 'C' for cipher Or 'M' for MonoAlphabeticCipher");
     String a=sc.next();
     if(a.charAt(0)=='C')
     {
       
       System.out.println("Type 'D' for Decode Or 'E' for Encode");
       String c=sc.next();
       if(c.charAt(0)=='D')
       {
       String Message;
       System.out.println("Enter the string");
       Message=sc.next();
        //System.out.println("hello");
       System.out.println("Enter the key");
       int key=sc.nextInt();
       //System.out.println("helo");
       CaesarCipher cipher=new CaesarCipher();
       String ans=cipher.decode(Message,key);
       System.out.println("Decoded string is:");
       System.out.println(ans);
       }
       else if(c.charAt(0)=='E')
       {
       String Message;
       System.out.println("Enter the string");
       Message=sc.next();
       int key=sc.nextInt();
       CaesarCipher cipher=new CaesarCipher();
       String ans=cipher.encode(Message,key);
       System.out.println("Encoded string is:");
       System.out.println(ans);
       
       }
       else 
       {
       System.out.println("Invalid choice");
       }   
     }
     else if(a.charAt(0)=='M')
     {
       String s;
       System.out.println("Type 'D' for Decode Or 'E' for Encode");
       String c=sc.next();
       MonoAlphabeticCipher mono=new MonoAlphabeticCipher();
       if(c.charAt(0)=='D')
       {
        System.out.println("Enter the string");
        s=sc.next();
        //System.out.println("jk");
        String ans=mono.decode(s);
        System.out.println("Decoded satring is");
        System.out.println(ans);
        
       }
       else if(c.charAt(0)=='E')
       {
        System.out.println("Enter the string");
        s=sc.next();
        String ans=mono.encode(s);
        System.out.println("Encoded string is");
        System.out.println(ans);
       }
       else 
       {
        System.out.println("Invalid choice");
       }
     }
     else
      {
       System.out.println("Invalid Choice");
      }
  }
}

       
     
     
     
