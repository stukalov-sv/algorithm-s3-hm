package Controller;

import java.util.Scanner;

import Data.ListNode;
import Service.AddFirstNodeService;
import Service.RemoveFirstNodeService;
import Service.ReverseListService;

public class ListNodeController {
    
    public void startButton() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nChoose action:\n" +
            "1 - add first node\n" +
            "2 - remove first node\n"+
            "3 - reverse node list\n");

        int action = iScanner.nextInt();



        switch (action) {
            case 1:
                ListNode addList = new ListNode();
                System.out.println("How many first adds you want?");
                int addTimes = iScanner.nextInt();

                for (int i = 0; i < addTimes; i++) {
                    System.out.println("Enter value:");
                    int value = iScanner.nextInt();
                    addList = AddFirstNodeService.addFirst(value);
                }

                System.out.println(addList.toString());
                break;
            case 2:
                ListNode removeList = new ListNode();
                removeList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
                System.out.println(removeList.toString());
                System.out.println("How many first removes you want?");
                int remTimes = iScanner.nextInt();
                
                for (int i = 0; i < remTimes; i++) {
                    removeList = RemoveFirstNodeService.removeFirst(removeList);
                }

                System.out.println(removeList.toString());
                break;
            case 3:
                ListNode reverseList = new ListNode();
                reverseList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
                System.out.println(reverseList.toString());
                System.out.println(ReverseListService.reverse(reverseList));
                break;
            default:
                System.out.println("Incorrect data");
                break;
        }
        iScanner.close();
    }
}
