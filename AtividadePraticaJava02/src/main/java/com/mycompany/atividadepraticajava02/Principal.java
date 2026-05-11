/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadepraticajava02;
import java.util.Scanner;

/**
 *
 * @author gerberson.almeida
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Conta c = new Conta();
        
        int opcao = 0;
        double valor = 0;
        boolean  resposta;
        
        System.out.println("*****Sistema Bancario Online*****\n");
        
        System.out.println("informe o numero da conta: ");
        c.numero = scan.nextInt();
        
        System.out.println("\nInforme o nome do(a) titular da conta: ");
        c.nome_titular = scan.next();
        
        System.out.println("\nInforme o saldo atual da conta: ");
        c.saldo = scan.nextDouble();
        
        System.out.println("""
            ***** Menu de Selecao ***** \n
                Informe a opcao desejada abaixo: 
                           \n1 depositar
                           \n2 sacar
                    \n3 Sair         
                    """);
        opcao = scan.nextInt();
            
        while(opcao == 1 || opcao == 2){
            
            switch(opcao){
                case 1:
                    System.out.println("Informe o valor que se deseja depoistar na conta: ");
                    valor = scan.nextDouble();
                    c.depositar(valor);
                    System.out.println("\nO saldo atual da conta é: " + c.saldo);
                    break;


                case 2:
                    System.out.println("Informe o valor que se deseja sacar da conta: ");
                    valor = scan.nextDouble();
                    resposta = c.sacar(valor);
                    if(resposta){
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("\nO saldo atual da conta é: " + c.saldo);
                    }// fim if 1
                    else{
                        System.out.println("Nao foi possivel realizar o saque!");
                        System.out.println("\nO saldo atual da conta permanece: \n" + c.saldo);
                    }// fim else 1
                    break;
                default:
                    break;
            }//fim switch case 1 
            System.out.println("""
            ***** Menu de Selecao ***** \n
                Informe a opcao desejada abaixo: 
                           \n1 depositar
                           \n2 sacar
                    \n3 Sair         
                    """);
            opcao = scan.nextInt();
        }// fim while 1 
        
        
    
    
    
    
    
    
    
    
    }//fim main
}//fim codigo
