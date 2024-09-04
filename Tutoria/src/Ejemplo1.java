import javax.swing.*;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        Double parcial;
        Double trabajo;
        Double certificacion;
        Double autoCoe;
        Double notaDefinitiva;
        String mensaje = "Error, ingresar dato entre 0.0 y 5.0.";
        String nombre;

        System.out.print("Digite su nombre: ");
        nombre = scanner.next();

        System.out.print("Digite la nota del parcial: ");
        parcial = scanner.nextDouble();
        if (parcial>=0 && parcial<=5){
            System.out.print("Digite la nota del trabajo: ");
            trabajo = scanner.nextDouble();

            if (trabajo>=0 && trabajo<=5){
                System.out.print("Digite la nota de la certificación: ");
                certificacion = scanner.nextDouble();

                if (certificacion>=0 && certificacion<=5){
                    System.out.print("Digite la nota de la Autoevaluación y Coevaluación: ");
                    autoCoe = scanner.nextDouble();

                    if (autoCoe>=0 && autoCoe<=5){
                        //Si todo se ingreso correctamente, llega hasta aquí.
                        notaDefinitiva = (parcial*0.7)+(trabajo*0.15)+(certificacion*0.1)+(autoCoe*0.05);
                        System.out.println(nombre+" su nota definitiva es. "+notaDefinitiva);
                    }else{
                        System.out.println(mensaje);
                    }
                }else{
                    System.out.println(mensaje);
                }
            }else{
                System.out.println(mensaje);
            }
        }else{
            System.out.println(mensaje);
        }
    }
}
