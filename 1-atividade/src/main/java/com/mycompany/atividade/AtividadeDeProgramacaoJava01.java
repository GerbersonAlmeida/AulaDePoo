/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;
import java.util.Scanner;

/**
 *
 * @author gerberson.almeida
 */
public class AtividadeDeProgramacaoJava01 {

    public static void main(String[] args) {
    
        
    Scanner scan = new Scanner(System.in);
   
        int idade;
       
        System.out.println("Informe sua idade:");
        idade = scan.nextInt();
        if (idade < 16){
            System.out.println("Voce tem " +idade + " anos, voce ainda nao pode votar!");
        }else if (idade == 16 || idade == 17 || idade > 65){
            System.out.println("Voce tem " + idade + " anos, seu voto e facultativo!");
        }else{
            System.out.println("Voce tem " + idade + " anos, voce e obrigado a votar!");
        }
        scan.close();
        
    }
}
