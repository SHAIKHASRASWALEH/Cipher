public class MonoAlphabeticCipher{
 String m="VGASFQPLCRMTEZXYUIWDNOKBHJ";
 String q="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

 public String encode(String s)
 {
 String z="";
      int size=s.length();
      for(int i=0;i<size;i++)
      {
        char c=s.charAt(i);
        if(c>90)
        {
        for(int j=0;j<32;j++)
        c--;
        }
         int t=c-65;
         z=z+m.charAt(t);
      }
      return z;

 }
public String decode(String s)
 {
   String z="";
   int size=s.length();
   for(int i=0;i<size;i++)
   {
   char x=s.charAt(i);
   if(x>90)
        {
        for(int j=0;j<32;j++)
        x--;
        }
   for(int b=0;b<26;b++)
   {
   if(x==m.charAt(b))
   {
      z=z+q.charAt(b);
      //System.out.println(z);
      break;
   }
   
   
   }
 }
 return z;
 }

 }
