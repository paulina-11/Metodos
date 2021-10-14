package com.generation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Declaro mi variable
        /*
        String mensaje = saludar( "Paulina");
        System.out.println(mensaje);

        //Ejecución
        int resultado = suma (5,3);
        System.out.println(resultado);

        //void
        alerta("mensaje de prueba");

*/
        //Nos da el PI
      //  System.out.println(Math.PI);
       // double num1 = 13.75;
        //double num2 = 9;
        //redondea hacia arriba ceil
        //sqrt da la raiz cuadrada
     //   System.out.println(Math.sqrt(num2));

        String mensaje1 = "Hola";
        String mensaje2 = "Adios!!!!!!";
        System.out.println(mensaje2.length());
        //equals comparación en verdadero o falso
        System.out.println(mensaje1.equals(mensaje2));

    }
    //los metodos debemos poner el metodo obligatorio
    //modificador de acceso public
    //decimos el dato que queremos que nos regrese string
    //saludar nombre del metodo

    //argumento()
    //Logica del metodo
    public static String saludar(String nombre){
        return "Hola, ¿cómo estas? " + nombre;
    }
    //Definición del metodo
    public static int suma( int numero1, int numero2){
        return numero1+numero2;
    }

    //void no devuelve ningun valor
    public static void alerta(String mensaje){
        System.out.println(mensaje);


    }
}
