package test;

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args) 
    {


        int N = 1000;

        for ( int i = 1; i < N; i++) 
        {
            String s = "";

            if (i % 2 == 0) 
            {
                s += "Coders ";
            }
            if (i % 3 == 0) 
            {
                s = "Test";
            }
            if (i % 5 == 0) {
                s += "Codility ";
            }
            if(i % 5 != 0 && i % 3 != 0 && i % 2 != 0) {
                 s = "";            
            }
 


            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
            {
                System.out.println(s);
            } else 
            {
                System.out.println(i);            
                }
        }
    }
}
