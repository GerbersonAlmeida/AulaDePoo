/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;
import java.util.Scanner;
/**
 *
 * @author gerberson.almeida
 */
public class AtividadeDeProgramacaoJava03 {

    public static void main(String[] args) {
        double valor = 0, media = 0, soma = 0;
        int quantidade = 0;
        
        
        
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Digite um valor maior ou igual a zero para continuar: ");
            valor = scan.nextDouble();
            if(valor < 0 ){
                break;
            }
            soma+=valor;
            quantidade++;
            media = soma/quantidade;
        }while (valor >= 0);
        System.out.println("A quantidade tota lde valores digitados e: " + quantidade);
        System.out.println("a media dos valores e: "+ media);
      
    }
}
