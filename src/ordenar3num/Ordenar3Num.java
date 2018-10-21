/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar3num;

import java.util.Scanner;

/**
 *
 * @author PP
 */
public class Ordenar3Num {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    int numero1, numero2, numero3, menor, medio, mayor;
    System.out.println ("Favor ingresar el numero 1: ");
    numero1 = entrada.nextInt();
    System.out.println ("Favor ingresar el numero 2: ");
    numero2 = entrada.nextInt();
    System.out.println ("Favor ingresar el numero 3");
    numero3 = entrada.nextInt();
    
    if(numero1 == numero2 || numero1 == numero3 || numero2 == numero3){
        System.out.println("Hay numeros iguales");
    }else{
        if ((numero1 <= numero2) && (numero1 <= numero3)) {
            menor = numero1;
            
        if (numero2 <= numero3){
            medio = numero2;
            mayor = numero3;
        }else{
            medio = numero3;
            mayor = numero2;
        }

        } else if ((numero2 <= numero1 ) &&(numero2 < numero3)){
            
            menor = numero2;
            
            if (numero1 <= numero3){
                medio = numero1;
                mayor = numero3;
        }else{
                medio = numero3;
                mayor = numero1;
                }
            }else{
            menor = numero3;
            
            if(numero1 <= numero2){
                medio = numero1;
                mayor = numero2;
                }else{
                medio = numero2;
                mayor = numero1;
            }
            }
    System.out.println("menor= " + menor + "\nMedio = " + medio + "\nMayor= " + mayor);
    System.out.println("------------\nmayor= " + mayor + "\nMedio = " + medio + "\nMenor= " + menor);
        
    }
            
    
        }}
                


    
    
