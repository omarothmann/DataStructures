package datastructures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter {

    public static void main(String[] args) {
     
         try { 
            Scanner s = new Scanner(new FileInputStream("Omar_WIC180053.txt"));
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
             PrintWriter p = new PrintWriter(new FileOutputStream("Omar_WIC180053.txt"));
             p.println("This is the new line");  
             
             s.close();
             p.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            }
           }
          }
    

