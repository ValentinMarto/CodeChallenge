package main.java;

public class Ejercicio_2 {


    //Numeros positivos hacia arriba y a la derecha
    //Numeros negativos hacia Abajo y a la izquierda

    public static void main(int Lista[]){

        int x = 0;
        int y = 0;

        for(int i = 0;i <9; i = i + 2){

            x = x + Lista[i];

        }

        if(x<0){
            x=0;
        }

        if(x>3){
            x=3;
        }

        for(int i = 1;i <10; i = i + 2){

            y = y + Lista[i];

        }
        if(y>0){
            y=0;
        }
        if(y<-3){
            y=-3;
        }

        for(int i = 0; i>-4 ; i--){
            for (int z = 0;z<4;z++){
                if (z == x && y == i ){
                    System.out.print("X");
                }else{
                    System.out.print("O");
                }
            }
            System.out.println("");
        }

    }

}
