package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner s = new Scanner(System.in);
        String Al = s.nextLine();

      if (Al.equals("Albert")){
          System.out.println("Hey Albert");
      }
      else if (Al.equals("Sally")){
          System.out.println("Hey Sally");
      }
      else{
          System.out.println("You're not welcome here");
      }
        s.close();
    }
}
