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
            Conta c1 = new Conta(1, "", 0);
            switch(opcao){
                case 1:
                    
                    contadorNumeroConta = contadorNumeroConta + 1;
                    c1.numero = contadorNumeroConta;
                    System.out.println("\nInforme o nome do(a) titular da conta: ");
                    scan.nextLine();
                    c1.nome_titular = scan.nextLine();
                    
                    System.out.println("\nInforme o saldo atual da conta: ");
                    c1.saldo = scan.nextDouble();
                                       
                    System.out.println("\nO numero da sua conta e: " + c1.numero );
                    
                    lista.add(c1);
                    
                    break;
                    
                case 2:
                    boolean contaEncontrada = false;
                    System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();
                    
                    while (i.hasNext()){
                        c1=(Conta)i.next();
                        
                        if(c1.numero == numeroConsulta){
                            System.out.println(c1.nome_titular + "\no saldo atual da sua conta e: " + c1.saldo);
                            contaEncontrada = true;
                            break;
                        }// fim if 1
                       
                    }// fim while 2
                    if(contaEncontrada == false){
                        System.out.println("\nNumero da conta esta incorreto!: ");
                    }// fim if 2
                  
                case 3:
                    
                    while (i.hasNext()){
                        c1=(Conta)i.next();
                        System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();
                        if(c1.numero == numeroConsulta){
                            System.out.println("Informe o valor que se deseja sacar da conta: ");
                            valor = scan.nextDouble();
                            resposta = c1.sacar(valor);
                            if(resposta){
                                System.out.println("Saque realizado com sucesso!");
                                System.out.println("\nO saldo atual da conta e: " + c1.saldo);
                            }// fim if 4
                            else{
                                System.out.println("Nao foi possivel realizar o saque!");
                                System.out.println("\nO saldo atual da conta permanece: \n" + c1.saldo);
                            }// fim else 2
                        }// fim if 3
                        else{
                            System.out.println("\nNumero da conta esta incorreto!: " + c1.saldo);
                        }//fim else 1
                    }// fim while 2
                    System.out.println("Informe o valor que se deseja sacar da conta: ");
                    valor = scan.nextDouble();
                    resposta = c1.sacar(valor);
                    if(resposta){
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("\nO saldo atual da conta e: " + c1.saldo);
                    }// fim if 5
                    else{
                        System.out.println("Nao foi possivel realizar o saque!");
                        System.out.println("\nO saldo atual da conta permanece: \n" + c1.saldo);
                    }// fim else 3
                    break;// fim caso 3
                
                case 4:
                    while (i.hasNext()){
                        c1=(Conta)i.next();
                        System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();
                        if(c1.numero == numeroConsulta){
                            System.out.println("Informe o valor que se deseja depoistar na conta: ");
                            valor = scan.nextDouble();
                            c1.depositar(valor);
                            System.out.println("\nO saldo atual da conta e: " + c1.saldo);
                        }// fim if 6
                        else{
                            System.out.println("\nNumero da conta esta incorreto!: " + c1.saldo);
                        }//fim else 4
                    }// fim while 2
                    System.out.println("Informe o valor que se deseja depoistar na conta: ");
                    valor = scan.nextDouble();
                    c1.depositar(valor);
                    System.out.println("\nO saldo atual da conta e: " + c1.saldo);
                    
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
