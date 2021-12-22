package com.company;

public class Main {

    public static void main(String[] args) {
        int skaiciai[] = {-5, -8, -3, 54, -2, -1, 1, 2, 3, 4, 5, 6};
        System.out.println("Lyginiu elementu masyve suma");
        System.out.println(rastiLyginiuElementuSuma(skaiciai, skaiciai.length));
        System.out.println("Lyginiu elementu kiekis masyve");
        System.out.println(rastiLyginiuElementuKieki(skaiciai, skaiciai.length));
        System.out.println("Lyginiu elementu vidurkis");
        System.out.println(skaiciuotiLyginiuElementuVidurki(skaiciai,skaiciai.length));
        System.out.println("Masyvo didziausios reiksmes indeksas");
        System.out.println(rastiMax(skaiciai, skaiciai.length));
        System.out.println("Masyvo maziausios reiksmes indeksas");
        System.out.println(rastiMin(skaiciai,skaiciai.length));
        System.out.println("Elementai masyve pradinis");
        spausdintiElementus(skaiciai, skaiciai.length);
        int tarpinis;
        int max = rastiMax(skaiciai, skaiciai.length);
        int min = rastiMin(skaiciai, skaiciai.length);
        tarpinis = skaiciai[max];
        skaiciai[max] = skaiciai[min];
        skaiciai[min] = tarpinis;
        System.out.println("");
        System.out.println("Elementai po pakeitimo");
        spausdintiElementus(skaiciai, skaiciai.length);
        System.out.println("");
        System.out.println("Lyginis maziausias neigiamas elementas masyve");
        System.out.println(rastiMaziausiaNeigiamaLyginiEl(skaiciai, skaiciai.length));
    }

    /**
     * Masyvo lyginiu elementu sumos skaiciavimas
     * @param A masyvas su skaiciais
     * @param n masyve esanciu elementu skaicius
     * @return lyginiu elementu suma
     */
    static int rastiLyginiuElementuSuma(int A[], int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                suma = suma + A[i];
            }
        }
        return suma;
    }

    /**
     * Masyvo lyginiu elementu kiekio skaiciavimas
     * @param A masyvas su skaiciais
     * @param n masyve esanciu elementu skaicius
     * @return lyginiu elementu kiekis
     */
    static int rastiLyginiuElementuKieki(int A[], int n) {
        int kiekis = 0;
        for (int i = 0; i < n; i++){
            if (A [i]%2==0){
                kiekis++;
            }
        }
        return kiekis;
    }

    /**
     * Masyvo lyginiu elementu vidurkio skaiciavimas
     * @param A masyvas su skaiciais
     * @param n masyve esanciu elementu skaicius
     * @return paskaiciuotas lyginiu elementu vidurkis
     */
    static double skaiciuotiLyginiuElementuVidurki(int A[], int n){
        int kiekis = rastiLyginiuElementuKieki(A,n);
        int suma = rastiLyginiuElementuSuma(A,n);
        double vidurkis =0 ;
        if (kiekis>0){
            vidurkis = (double) suma/kiekis;
        }
        return vidurkis;
    }

    /**
     * Elementu esanciu masyve didziausia reiksme pagal indeksa
     * @param A masyvas su skaiciais
     * @param n masyve esanciu elementu skaiciu
     * @return didziausia reiksme
     */
    static  int rastiMax(int A[],int n){
        int max =A[0];
        int imax = 0;
        for (int i =0; i< n; i++){
            if (A[i]> max){
                max =A[i];
                imax = i;
            }
        }
        return imax;
    }

    /**
     * Elementu esanciu masyve maziausia reiksme pagal indeksa
     * @param A masyvas su skaiciais
     * @param n masyve esanciu elementu skaiciu
     * @return maziauia reiksme masyve
     */
    static  int rastiMin(int A[],int n){
        int min = A[0];
        int imin = 0;
        for (int i =0; i< n; i++){
            if (A[i]< min){
                min = A[i];
                imin = i;
            }
        }
        return imin;
    }
    /**
     * Elementu esanciu masyve spausdinimas
     * @param A masyvas su skaiciais
     * @param n masyve esanciu elementu skaiciu
     */
    static void spausdintiElementus(int A[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + "  ");
    }
    // gynimo uzduotis
    //Sukurti funkciją, surandančią mažiausią skaičių
    // tarp lyginių neigiamų masyvo elementų.

    /**
     * funkcija randanti maziausia skaiciu tarp lyginiu neigiamu masyvo elementu
     * @param A masyvas su skaiciais
     * @param n masyve esanciu elementu skaicius
     * @return grazina prasoma skaiciu
     */

    static int rastiMaziausiaNeigiamaLyginiEl(int[] A, int n) {
        int ats = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] < 0) {
                if (ats == 0 || A[i] < ats) {
                    if (A[i] % 2 == 0) {
                        ats = A[i];
                    }
                }
            }
        }
        return ats;
    }

}