/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        for (int i = 10; i > 0; i--) {
            System.out.println("i: " +i);
        }
        System.out.println("FELIZ ANIO NUEVO");
*/
        /*
        int i=10;
        while (i > 0){
            System.out.println("i: " +i);
            i--;
        }
        System.out.println("FELIZ ANIO NUEVO");
*/
        /*
        for (int i = 0; i < 50; i++){
            if (i == 10 || i==20 || i==30 || i==40 || i==50){
                System.out.println("");
            }    
            System.out.print("@");
        }
        
        /*
        int variable=0;
        do {
            System.out.println("Variable=" + variable++);
        } while (variable<10);
        */
        /*
        int cantidadTotal=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cantidadTotal++;
            }
         
        }
        */
        
        /*
        //Ingreso de datos
        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        //Calculo
        for (int i = 1; i < 11; i++ ) {
            System.out.println(num1+"x"+i+"= "+num1*i);
            
        }
        */
        /*
        int variable=0;
        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        do {
            for (int i = -1; i < variable; i++ ) {
                System.out.print("*");
            }
            System.out.println("");
            variable++;
        }while (variable < num1);
        */
        /*
        for (int num = 20; num < 31; num++) {
            System.out.println(num + "=" + (num * num));
        }
        */
        //Declaracion variables
        int estudiantes;
        double notas;
        double promedio = 0;
        double suma = 0;
        int i = 0;
        double mayor = 0;
        double menor = 100;
        int aprobados = 0;
        //Inputs
        estudiantes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de estudiantes: "));
        do {
            i++;
            notas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite las notas de los estudiantes"));
            suma = (suma + notas);
            if (i == estudiantes) {
                
            }
            if (notas > mayor) {
                mayor = notas;
            }
            if (notas < menor) {
                menor = notas;
            }
            if (notas >= 70) {
                aprobados = aprobados + 1;
            }

        } while (i != estudiantes);
        promedio = suma / estudiantes;  
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Cantidad de estudiantes aprobados: " + aprobados);


        //Calculos
         
    }

}
    
