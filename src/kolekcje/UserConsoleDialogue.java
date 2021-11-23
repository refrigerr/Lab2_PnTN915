package kolekcje;

import java.util.Scanner;

public class UserConsoleDialogue {
    private final Scanner scanner = new Scanner(System.in);
    private final String ERROR_MASSAGE =
            "Coś poszlo nie tak \n"+
            "Sprobuj ponownie   \n";
    public void printMassage(String massage){
        System.out.println(massage);
    }
    public String enterSting(){
        return scanner.nextLine();
    }

    public Integer enterInt (){
        boolean error;
        Integer i=0;
        do {
            error=false;
            try {
                i = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                printMassage(ERROR_MASSAGE);
                error=true;
            }


        }while(error);
        return i;
    }

    public char enterChar() {
        boolean error;
        char c = ' ';
        do {
            error = false;
            try {
                c = enterSting().charAt(0);
            } catch (IndexOutOfBoundsException e) {
                printMassage(ERROR_MASSAGE);
                error= true;
            }

        } while (error);
        return c;
    }
    public boolean isIntSixDigits (int indeks){
        return indeks<1000000 && indeks>=100000;
    }


}
