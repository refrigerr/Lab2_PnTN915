package kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollections extends CollectionsClass {
    private final List<Student> arrayList = new ArrayList<>();
    private final List<Student> linkedList = new LinkedList<>();
    private final String Menu =
            "Wpisz numer opcji ktora chcesz wybrac: \n"+
                    "1. Dodaj Studenta do List            \n"+
                    "2. Usun Studenta z List               \n"+
                    "3. Wyswietl elementy List             \n";
    ListCollections(){
        addToLists(new Student("jan","kowalski",100000));
        addToLists(new Student("sebastian","przymus",100001));
        addToLists(new Student("krzysiek","mackowiak",100002));
        addToLists(new Student("anna","przybyla",100003));
    }
    public void listMenu(){
        u.printMassage(Menu);
        char choice = u.enterChar();
        switch (choice){
            case '1':
                addToLists(createStudent());
                break;
            case '2':
                if(arrayList.isEmpty()&&linkedList.isEmpty()){
                    u.printMassage("Obie Listy sa puste!");
                }
                Integer indeks;
                u.printMassage("Podaj numer indeksu studenta ktorego chcesz usunac: ");
                indeks = u.enterInt();

                for (Student student : linkedList) {
                    if (student.getIndeksNumber().equals(indeks)) {
                        linkedList.remove(student);
                        u.printMassage("Z linkedListy usunieto: \n" + student.toString());
                        break;

                    }
                }
                for (Student student : arrayList) {
                    if (student.getIndeksNumber().equals(indeks)) {
                        arrayList.remove(student);
                        u.printMassage("Z arrayListy usunieto: \n" + student.toString());
                        break;
                    }
                }
                break;
            case '3':
                displayElements();
                break;
        }

    }

    private void addToLists(Student student){
        arrayList.add(student);
        linkedList.add(student);
    }
    @Override
    void displayElements(){
        int i;
        if(!linkedList.isEmpty()){
            i=1;
            u.printMassage("LinkedList elements: \n");
            for (Student student:linkedList) {
                u.printMassage(i+". "+student.toString());
                i++;
            }
        }
        else{
            u.printMassage("LinkedList jest pusta!\n");
        }
        if(!arrayList.isEmpty()){
            i=1;
            u.printMassage("ArrayList elements: \n");
            for (Student student:arrayList) {
                u.printMassage(i+". "+student.toString());
                i++;
            }
        }
        else{
            u.printMassage("ArrayLista jest pusta!\n");
        }
    }



}
