// char array reader class //
import java.io.*;
public class filehandle11 {
    public static void main(String[] args) throws IOException{
        // creating an char array //
        char[] names = {'a','b','c','d','e'};
       CharArrayReader ch= new CharArrayReader(names);
       int i=0;
       while((i=ch.read())!=-1){
        System.out.println((char) i);
       }
    }
}
