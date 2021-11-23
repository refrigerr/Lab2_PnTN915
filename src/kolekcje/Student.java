package kolekcje;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private Integer indeksNumber;
    Student(String firstName, String lastName, Integer indeksNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setIndeksNumber(indeksNumber);
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = capitalize(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = capitalize(lastName);
    }

    public Integer getIndeksNumber() {

        return indeksNumber;
    }

    public void setIndeksNumber(int indeksNumber) {

        this.indeksNumber = indeksNumber;
    }
    public String capitalize(String string){
        String firstLetter = string.substring(0, 1);
        String remainingLetters = string.substring(1, string.length());
        firstLetter = firstLetter.toUpperCase();
        remainingLetters = remainingLetters.toLowerCase();
        string = firstLetter + remainingLetters;
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName()) && getIndeksNumber().equals(student.getIndeksNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getIndeksNumber());
    }

    @Override
    public String toString() {
        return  "Imie: " + getFirstName() + "\n" +
                "Nazwisko: " + getLastName() + "\n" +
                "indeks: " + getIndeksNumber()+ "\n";
    }

    @Override
    public int compareTo(Student o) {
        return getIndeksNumber().compareTo(o.getIndeksNumber());
    }
}
