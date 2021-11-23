package kolekcje;

public abstract class CollectionsClass{
    UserConsoleDialogue u = new UserConsoleDialogue();

    Student createStudent (){
        u.printMassage("Podaj Imie studenta: ");
        String firstName = u.enterSting();
        u.printMassage("\nPodaj Nazwisko studenta: ");
        String lastName = u.enterSting();
        u.printMassage("\nPodaj indeks studenta: ");
        int indeks;
        do{
            indeks = u.enterInt();
            if(!u.isIntSixDigits(indeks)){
                u.printMassage("Indeks musi byc szesciocyfrowy");
                continue;
            }
            break;
        }while(true);
        return new Student(firstName,lastName,indeks);
    }
    abstract void displayElements();
}
