package zadanie4;

import java.util.Scanner;

public class Osoba {

    public String imie;
    public String nazwisko;
    public int wiek;
    public int wzrost;
    public int waga;
    Scanner input = new Scanner(System.in);

    public Osoba(String imie, String nazwisko, int wiek, int wzrost, int waga) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;

    }

    public Osoba(String imie, String nazwisko, int wiek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

    }

    public void poka() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Wiek: " + this.wiek);
        System.out.println("Wzrost: " + this.wzrost);
        System.out.println("Waga: " + this.waga);

    }

    public void wprowadz() {

        System.out.println("Wprowadz imie ");
        int a = input.nextInt();
        System.out.println("Wprowadz Nazwisko ");
        String b = input.next();
        System.out.println("Wprowadz wiek ");
        String c = input.next();
        System.out.println("Wprowadz wzrost ");
        String d = input.next();
        System.out.println("Wprowadz wage ");
        String e = input.next();
    }

}
