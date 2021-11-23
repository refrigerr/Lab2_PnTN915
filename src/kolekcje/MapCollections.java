package kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollections extends CollectionsClass {
    private final Map<Integer,Student> hashMap = new HashMap<>();
    private final Map<Integer,Student> treeMap = new TreeMap<>();
    private final String Menu =
            "Wpisz numer opcji ktora chcesz wybrac: \n"+
                    "1. Dodaj Studenta do Map            \n"+
                    "2. Usun Studenta z Map               \n"+
                    "3. Wyswietl elementy Map             \n";
    MapCollections(){
        addToMaps(new Student("jan","kowalski",100000));
        addToMaps(new Student("sebastian","przymus",100001));
        addToMaps(new Student("krzysiek","mackowiak",100002));
        addToMaps(new Student("anna","przybyla",100003));
    }
    public void mapMenu(){
        u.printMassage(Menu);
        char choice = u.enterChar();
        switch (choice){
            case '1':
                addToMaps(createStudent());
                break;
            case '2':
                if(hashMap.isEmpty()&&treeMap.isEmpty()){
                    u.printMassage("Obie mapy sa puste!");
                }
                Integer indeks;
                u.printMassage("Podaj numer indeksu studenta ktorego chcesz usunac: ");
                indeks = u.enterInt();
                if(hashMap.containsKey(indeks)){
                    Student student = hashMap.get(indeks);
                    if (student.getIndeksNumber().equals(indeks)){
                        hashMap.remove(indeks,student);
                        u.printMassage("Z hashMapy usunieto: \n" + student.toString());
                    }
                }
                if(treeMap.containsKey(indeks)){
                    Student student = treeMap.get(indeks);
                    if (student.getIndeksNumber().equals(indeks)){
                        treeMap.remove(indeks,student);
                        u.printMassage("Z hashMapy usunieto: \n" + student.toString());
                    }
                }
                break;
            case '3':
                displayElements();
                break;
        }
    }
    private void addToMaps(Student student){
        hashMap.put(student.getIndeksNumber(), student);
        treeMap.put(student.getIndeksNumber(), student);
    }

    @Override
    void displayElements() {
        int i;
        if(!hashMap.isEmpty()){
            i=1;
            u.printMassage("hashMap elements: \n");
            for (Student student: hashMap.values()) {
                u.printMassage(i+". "+student.toString());
                i++;
            }
        }
        else{
            u.printMassage("hashMap jest pusta!\n");
        }
        if(!treeMap.isEmpty()){
            i=1;
            u.printMassage("treeMap elements: \n");
            for (Student student: treeMap.values()) {
                u.printMassage(i+". "+student.toString());
                i++;
            }
        }
        else{
            u.printMassage("treeMap jest pusta!\n");
        }
    }
}
