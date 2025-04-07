package AdvancedStringMethodsAssignment;


import TwoDArrays.Library;
import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;
import java.util.ArrayList;

public class As1_Main {

    static ArrayList <NetworkMessage> allMessages = new ArrayList<>();

    public static Scanner input = new Scanner( System.in );

    public static void run() {
        System.out.println("Assign 1 Network Messages");
        allMessages.add(new NetworkMessage("Client3: repeated login failure"));
        allMessages.add(new NetworkMessage("Client2:filed password reset on file"));
        allMessages.add(new NetworkMessage("Server1: file not found"));
        allMessages.add(new NetworkMessage("Server1:write file error on disk DSK1"));
        allMessages.add(new NetworkMessage("Server2:disk failure on DSK2"));
        allMessages.add(new NetworkMessage("Server2:diskette diskette"));
        allMessages.add(new NetworkMessage("Client3:    diskette disk"));
        allMessages.add(new NetworkMessage("Router1: missing packet"));
        allMessages.add(new NetworkMessage("PC4: power surge detected"));



        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = input.nextInt();
            input.nextLine();
            System.out.println();

            if (option == 1) {
                String answer = "";
                System.out.println("What new message do you want to add?");
                answer = Library.input.nextLine();
                allMessages.add(new NetworkMessage(answer));

            } else if (option == 2) {
                for (int i = 0; i < allMessages.size(); i++) {
                    System.out.println(allMessages.get(i).toString());
                }


            } else if (option == 3) {
                String answer = "";
                System.out.println("What error do you want to find?");
                answer = Library.input.nextLine();
//                for (int i = 0; i < allMessages.size(); i++) {
//
//                }


            } else if (option == 4) {
                break;
            } else {
                System.out.println("That is not an available option");
            }
            System.out.println("Logging out. Good Bye.");        }//while

    }//main



}//class
