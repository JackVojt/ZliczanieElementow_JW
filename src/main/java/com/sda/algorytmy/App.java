package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {
        int N = 5;
        int wynik = 0;
        int[] tab = {2, 3, 4, 2, 5, 6, 2, 5, 2, 2, 2, 2, 4};
        for (int i = 0; i<tab.length; i++){
            if (tab[i] == N){
                wynik += 1;
            }else;
        }
        System.out.println("Wartość " + N + " wystąpiła w tablicy " + wynik + " razy.");
    }
}
