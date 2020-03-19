package main.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_3 {

   public static ArrayList<String> interceccionListas(String[] Lista1, String[] Lista2){

       ArrayList<String> Interceccion = new ArrayList<String>();

       for(String i:Lista1) {
           for (String z : Lista2) {

               if(i.equals(z)){
                   Interceccion.add(i);
               }
           }
       }

       for(String i :Interceccion){

           System.out.println(i);

       }
       return Interceccion;
   }

    public static ArrayList<String> unionListas(String[] Lista1, String[] Lista2){

        ArrayList<String> Union = new ArrayList<String>();

        for(String i:Lista1) {

            Union.add(i);

        }
        for(String i:Lista2){

            if(!(Union.contains(i))){

                Union.add(i);

            }

        }

        for(String i :Union){

            System.out.println(i);

        }
        return Union;
    }


    public static Boolean esPrioritario(String codigo){

        Boolean Check = false;

        if (codigo.charAt(0) == 'P' || codigo.charAt(0) == 'W'){
            Check =  true;
        }
        System.out.println(Check);
        return Check;

    }

    public static String[] ordenar(String[] Lista){

        Arrays.sort(Lista);

        for(String i:Lista){

            System.out.println(i);
        }

        return Lista;


    }

    public static boolean verificar(String codigo){

       String cadena = codigo.substring(4,9);
       char codigoFinal = codigo.charAt(10);
       int numfinal = 0;
       boolean Check = false;

        for(int i = 0 ;i<5;i++){

            numfinal = numfinal + Integer.parseInt("" + cadena.charAt(i));

        }
        if(numfinal > 9){
            numfinal = Integer.parseInt("" + Integer.toString(numfinal).charAt(0)) + Integer.parseInt("" + Integer.toString(numfinal).charAt(1));
        }
        if (numfinal == Integer.parseInt("" + codigoFinal)){

            Check = true;

        }
        System.out.println(Check);
        return Check;
    }
}
