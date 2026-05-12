/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadepraticajava02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * @author gerberson.almeida
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        
        Conta c = new Conta();
        int contadorNumeroConta = 0;
        double valor = 0;
        int opcao = 0, numeroConsulta = 0;
        boolean resposta;
        
        System.out.println("*****Sistema Bancario Online*****\n");
        
        
        System.out.println("""
            ***** Menu de Selecao ***** \n
                Informe a opcao desejada abaixo: 
                           \n1 - Criar conta
                           \n2 - Visualizar saldo
                           \n3 - sacar
                           \n4 - Depositar
                           \n5 - sair
                    """);
        opcao = scan.nextInt();
            
        while(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
            Iterator i = lista.iterator();
            switch(opcao){
                case 1:
                    System.out.println("\nInforme o nome do(a) titular da conta: ");
                    c.nome_titular = scan.next();
                    
                    System.out.println("\nInforme o saldo atual da conta: ");
                    c.saldo = scan.nextDouble();
                    
                    c.numero = contadorNumeroConta + 1;
                    
                    System.out.println("\nO numero da sua conta e: " + c.numero );
                    
                    lista.add(c);
                    
                    break;
                    
                case 2:
                    while (i.hasNext()){
                        c=(Conta)i.next();
                        System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();
                        if(c.numero == numeroConsulta){
                            System.out.println("\nO saldo atual da conta e: " + c.saldo);
                        }// fim if 1
                        else{
                            System.out.println("\nNumero da conta esta incorreto!: " + c.saldo);
                        }//fim else 1
                    }// fim while 2
                    
                    break;
                case 3:
                    
                    while (i.hasNext()){
                        c=(Conta)i.next();
                        System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();
                        if(c.numero == numeroConsulta){
                            System.out.println("Informe o valor que se deseja sacar da conta: ");
                            valor = scan.nextDouble();
                            resposta = c.sacar(valor);
                            if(resposta){
                                System.out.println("Saque realizado com sucesso!");
                                System.out.println("\nO saldo atual da conta e: " + c.saldo);
                            }// fim if 3
                            else{
                                System.out.println("Nao foi possivel realizar o saque!");
                                System.out.println("\nO saldo atual da conta permanece: \n" + c.saldo);
                            }// fim else 2
                        }// fim if 2
                        else{
                            System.out.println("\nNumero da conta esta incorreto!: " + c.saldo);
                        }//fim else 1
                    }// fim while 2
                    System.out.println("Informe o valor que se deseja sacar da conta: ");
                    valor = scan.nextDouble();
                    resposta = c.sacar(valor);
                    if(resposta){
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("\nO saldo atual da conta e: " + c.saldo);
                    }// fim if 2
                    else{
                        System.out.println("Nao foi possivel realizar o saque!");
                        System.out.println("\nO saldo atual da conta permanece: \n" + c.saldo);
                    }// fim else 2
                    break;// fim caso 3
                
                case 4:
                    while (i.hasNext()){
                        c=(Conta)i.next();
                        System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();
                        if(c.numero == numeroConsulta){
                            System.out.println("Informe o valor que se deseja depoistar na conta: ");
                            valor = scan.nextDouble();
                            c.depositar(valor);
                            System.out.println("\nO saldo atual da conta e: " + c.saldo);
                        }// fim if 4
                        else{
                            System.out.println("\nNumero da conta esta incorreto!: " + c.saldo);
                        }//fim else 1
                    }// fim while 2
                    System.out.println("Informe o valor que se deseja depoistar na conta: ");
                    valor = scan.nextDouble();
                    c.depositar(valor);
                    System.out.println("\nO saldo atual da conta e: " + c.saldo);
                    
                    break;// fim caso 4
                
                default:
                    break;// fim default
                    
            }//fim switch case 1 
            System.out.println("""
            ***** Menu de Selecao ***** \n
                Informe a opcao desejada abaixo: 
                           \n1 - Criar conta
                           \n2 - Vizualizar saldo
                           \n3 - sacar
                           \n4 - Depositar
                           \n5 - sair
                    """);
            opcao = scan.nextInt();
        }// fim while 1 
        

        
        
        
        
    }//fim main
}//fim codigo
