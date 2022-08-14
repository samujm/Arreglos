
package test;


public class TestArreglos {

    public static void main(String[] args) {
        //Definir un arreglo de tipo entero
        //NOTA: Los arreglos no pueden crecer, no se pueden agregar elementos de manera dinamica, para colecciones dinamicas son listas, set o map
        int edades[] = new int[3]; //tipo nombre[] = new(YA QUE ES UN TIPO OBJECT) tipo_dato[Cantidad de elementos];
        System.out.println("edades = " + edades);//Imprime la dirección de memoria
        
        //ACCEDER A CADA UNO DE LOS ELEMENTOS PARA MODIFICARLO
        edades[0] = 10;
        edades[1] = 5;
        edades[2] = 75;
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);

        
    }
}
