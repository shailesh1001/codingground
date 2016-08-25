import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        String l=br.readLine();
        System.out.println(l);
        
     }
}
