package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MySweetProgram {
    Collection<String> stuff;

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

        System.out.println('\n');

        MySweetProgram p = new MySweetProgram();
        p.stuff = new ArrayList<String>();



        LinkedList<String> bncWorkers = new LinkedList<String>();

        //queue
        bncWorkers.add("Albie");
        bncWorkers.add("Sammie");
        bncWorkers.add("Abel");

        System.out.println(bncWorkers.remove());
        System.out.println(bncWorkers.remove());
        System.out.println(bncWorkers.remove());

        //stack
        bncWorkers.push("Ato");
        bncWorkers.push("Missy");
        bncWorkers.push("Gang");

        System.out.println('\n');

        System.out.println(bncWorkers.removeFirst());
        System.out.println(bncWorkers.remove());
        System.out.println(bncWorkers.pop());
    }
}
