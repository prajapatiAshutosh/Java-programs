import java.io.*; 
import java.lang.*;
import java.util.Scanner;

public class filereading 
{ 

  public static void main(String[] args)throws Exception 
  { 
       
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter the name of the file: ");
      String str =kb.nextLine();

      File file = new File(str); 
  
      try(BufferedReader br = new BufferedReader(new FileReader(file)))
      {
        String st; 
        while ((st = br.readLine()) != null)
        {
          String check = st.substring(0,2);
          if(check.equals("//"))
               System.out.println(st);
        }   
      }        
  } 
} 