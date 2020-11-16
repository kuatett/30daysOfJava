package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) throws FileNotFoundException {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Enter an array size to store numbers then press enter");
        int size = in.nextInt();
        int[] grades = new int[size];

        System.out.println("Enter " + size + " numbers. Press Enter after each");
        for(int i= 0; i<size; i++){
            grades[i]= in.nextInt();
        }
        in.close();

        for(int i=0; i<size; i++){
            System.out.println(grades[i]);
        }
*/
        Scanner file = new Scanner (new File("text.txt"));
        List<String> text = new ArrayList<String>();

        while(file.hasNextLine()){
            text.add(file.nextLine());
        }

        for(int i= 0; i<text.size(); i++){
           System.out.println("name: " + text.get(i) );
        }
        file.close();

    }
}
