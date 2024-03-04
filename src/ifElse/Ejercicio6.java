package ifElse;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematica");
        int mat = sc.nextInt();
        System.out.println("Ingrese la nota de fisica");
        int fis = sc.nextInt();
        System.out.println("Ingrese la nota de quimica");
        int qui = sc.nextInt();

        if( (mat >= 65 && fis >= 55 && qui >=50) || (mat + fis >=140) )
        {
            System.out.println("Ingreso");
        }
        else {
            System.out.println("No ingreso");
        }
    }
}
