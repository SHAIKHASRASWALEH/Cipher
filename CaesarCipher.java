public class CaesarCipher{
public String decode(String s,int k)
{
   String y="";
   int size=s.length();
   for(int i=0;i<size;i++)
   {
    char c=s.charAt(i);
   if(c>90)
   {
     for(int u=0;u<32;u++)
     c--;
   }
    for(int j=0;j<k;j++)
   {
      c--;
      if(c<'A')
      c='Z';
   }
      y=y+c;
   }
   return y;
}
public String encode(String s,int k)
{
   String z="";
   int size=s.length();
   for(int j=0;j<size;j++)
   {
   char c=s.charAt(j);
   if(c>90)
   {
   for(int u=0;u<32;u++)
   c--;
   }
    for(int i=0;i<k;i++)
   {
        c++;
        if(c>'Z')
        c='A';   
   }
        z=z+c;
   }
   return z;
}

}
