/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_joaowictor;

import java.util.Scanner;

/**
 *
 * @author jwict
 */
public class Conversor_joaowictor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    //declaração de variáveis
    double temp, cel, fah;
    
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("CONVERSOR DE TEMPERATURA");
    
    //escolha a opção
    System.out.println("Selecione o número correspondente a operação desejada ou tecle 3 para sair.");
    System.out.println ("1 - Celcius para Fahrenheit");
    System.out.println ("2 - Fahrenheit para Celcius");
    System.out.println ("3 - Sair");
    
    int opcao = entrada.nextInt();
    
    System.out.println("/t/t/t Digite a temperatura:");
    temp = entrada.nextDouble();
    
    switch(opcao) {
            
            case 1:
                cel = (temp-32) / 1.8;
                System.out.println("Sua temperatura em Celcius é:" + cel);
                break;
            case 2: 
                fah = temp * 1.8 + 32;
                System.out.println("Sua temperatura em Fahrenheit é:" + fah);
                break;
            default: System.out.println("Forte abraço!");
    

    }
    

    
    
        
    }
    
}
