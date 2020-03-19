package main.java;

public class Ejercicio_1 {

    public static void main(int Lista[]){

        int arrayCants[];
        arrayCants = new int[5];

        int i = 0;

        for (int x:Lista) {


            int num_actual = 0;
            for (int y : Lista) {

                if (x == y) {

                    num_actual++;

                }

            }

            arrayCants[x-1] = num_actual;

        }

        mostar(arrayCants);
    }


    public static void mostar(int Lista[]){

        int vueltas;

        for (int item = 0;  5 > item ;item++){

            vueltas = Lista[item];
            System.out.print(item+1);
            System.out.print(" :");

            for(int i = 0; i<vueltas; i++){

                System.out.print("*");

            }
            System.out.print("\n");
        }

    }
}
