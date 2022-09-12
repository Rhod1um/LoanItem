package loanItems;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int numWantedCopies;
        String itemName;
        String videoOrBook;
        Scanner sc = new Scanner(System.in);
        boolean isMoreInput=true;
        String loanMore;

        ArrayList<LoanItem> loanItems = new ArrayList<>();

        do {
            System.out.print("Video or book? v/b: ");
            videoOrBook = sc.nextLine();

            System.out.println("Title: ");
            itemName = sc.nextLine();

            System.out.println("");

            if (videoOrBook.equalsIgnoreCase("b")){
                Book book1 = new Book(itemName);
                loanItems.add(new Book(itemName));
            } else if (videoOrBook.equalsIgnoreCase("v")){
                loanItems.add(new Video(itemName));
            }
            System.out.println("loan more? y/n: ");
            loanMore = sc.nextLine();
            
            if (loanMore.equalsIgnoreCase("n")){
                isMoreInput=false;
            }
        } while (isMoreInput);


        System.out.println("List of loaned items");

        for (int i=0; i<loanItems.size(); i++){

            if (loanItems.get(i) instanceof Book){
                System.out.println("Type book");
            } else
                System.out.println("Type video");

            System.out.print(loanItems.get(i).getName());


        }

    }
}
