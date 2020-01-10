package chatTask;

import javax.swing.*;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.XMLFormatter;



public class Main {

    public static void main(String[] args) {
        //input chat members quantity
        Scanner membersQuantity = new Scanner(System.in);
        System.out.print("Enter members quantity: ");
        int inputMembersQuantity = membersQuantity.nextInt();
        
        //members list array
        String[] membersList = new String[inputMembersQuantity];
        for (int i = 0; i < inputMembersQuantity; i++) {
            membersList[i] = "member " + (i + 1);

        }
        for (int i = 0; i < membersList.length; i++) {
            System.out.println(membersList[i]);
        }

        //exited members array
        int[] exitedMembers = new int[inputMembersQuantity];

        
        //adding members' names
        for (int i = 0; i < membersList.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter member name " + membersList[i]);
            String inputMemberName = scanner.nextLine();
            membersList[i] += inputMemberName;
        }
        
        
        int membersCount = membersList.length;
        


        while (membersCount > 0) {




            //choosing member's number to do an action
            Scanner memberNumber = new Scanner(System.in);
            System.out.print("Enter member number to do an action: ");
            int memberNumberForAction = memberNumber.nextInt();


                    //choosing action for current member
                    Scanner actionNumber = new Scanner(System.in);
                    System.out.print(membersList[memberNumberForAction - 1] +
                            "- Enter action for chosen member 1 for sending a message or 2 for exiting chat: ");
                    int actionNumberForCurrentMember = actionNumber.nextInt();


                    if (actionNumberForCurrentMember == 1) {
                        Scanner enterMessage = new Scanner(System.in);
                        System.out.print("Enter message " + membersList[memberNumberForAction - 1] + ":");
                        String message = enterMessage.nextLine();
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Date date = new Date();
                        System.out.println(formatter.format(date));
                        System.out.println(membersList[memberNumberForAction - 1] + " message: " + message);

                    }

                    if (actionNumberForCurrentMember == 2) {

                        System.out.println(membersList[memberNumberForAction - 1] + " left chat");

                        membersCount--;



                    }
                }




            }

        }



