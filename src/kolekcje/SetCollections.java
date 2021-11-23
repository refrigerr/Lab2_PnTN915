package kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections extends CollectionsClass{
    private final Set<Student> hashSet = new HashSet<>();
    private final Set<Student> treeSet = new TreeSet<>();

    private final String Menu =
                    "Wpisz numer opcji ktora chcesz wybrac: \n"+
                    "1. Dodaj Studenta do Setow             \n"+
                    "2. Usun Studenta z Setow               \n"+
                    "3. Wyswietl elementy Setow             \n";
    SetCollections(){
        addToSets(new Student("jan","kowalski",100000));
        addToSets(new Student("sebastian","przymus",100001));
        addToSets(new Student("krzysiek","mackowiak",100002));
        addToSets(new Student("anna","przybyla",100003));
    }

    public void setMenu(){
        u.printMassage(Menu);
        char choice = u.enterChar();
        switch (choice){
            case '1':
                addToSets(createStudent());
                break;
            case '2':
                if(hashSet.isEmpty()&&treeSet.isEmpty()){
                    u.printMassage("Oba Sety sa puste!");
                }
                Integer indeks;
                u.printMassage("Podaj numer indeksu studenta ktorego chcesz usunac: ");
                indeks = u.enterInt();

                for (Student student : hashSet) {
                    if (student.getIndeksNumber().equals(indeks)) {
                        hashSet.remove(student);
                        u.printMassage("Z hashsetu usunieto: \n" + student.toString());
                        break;

                    }
                }
                for (Student student : treeSet) {
                    if (student.getIndeksNumber().equals(indeks)) {
                        treeSet.remove(student);
                        u.printMassage("Z treesetu usunieto: \n" + student.toString());
                        break;
                    }
                }
                break;
            case '3':
                displayElements();
                break;
        }

    }
    private void addToSets(Student student){
        hashSet.add(student);
        treeSet.add(student);
    }
    @Override
    void displayElements(){
        int i;
        if(!treeSet.isEmpty()){
            i=1;
            u.printMassage("TreeSet elements: \n");
            for (Student student:treeSet) {
                u.printMassage(i+". "+student.toString());
                i++;
            }
        }
        else{
            u.printMassage("TreeSet jest pusty!\n");
        }
        if(!hashSet.isEmpty()){
            i=1;
            u.printMassage("HashSet elements: \n");
            for (Student student:hashSet) {
                u.printMassage(i+". "+student.toString());
                i++;
            }
        }
        else{
            u.printMassage("HashSet jest pusty!\n");
        }


    }
}
