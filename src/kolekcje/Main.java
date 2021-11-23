package kolekcje;

import java.util.Scanner;

public class Main {
    private static String welcomeMassage =
            "Witaj w aplikacji konsolowej \n"+
            "Autor: Kajetan Kolodziejczyk \n";
    private static String menu =
            "Wpisz numer opcji ktora chcesz wybrac: \n"+
            "1. Set                                 \n"+
            "2. List                                \n"+
            "3. Map                                 \n"+
            "0. Wyjscie z programu                  \n";
    private static UserConsoleDialogue u = new UserConsoleDialogue();
    public static void main(String[] args) {
	    appLoop();
    }
    private static void appLoop(){
        SetCollections sc = new SetCollections();
        ListCollections lc = new ListCollections();
        MapCollections mp = new MapCollections();
        u.printMassage(welcomeMassage);
        while(true){
            Scanner scanner = new Scanner(System.in);
            u.printMassage(menu);
            char choice;
            choice = u.enterChar();
            switch (choice){
                case '1':
                    sc.setMenu();
                    break;
                case '2':
                    lc.listMenu();
                    break;
                case '3':
                    mp.mapMenu();
                    break;
                case '0':
                    System.exit(0);
            }

        }
    }
}
