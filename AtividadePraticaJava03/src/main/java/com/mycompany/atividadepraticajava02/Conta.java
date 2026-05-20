/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepraticajava02;

/**
 *
 * @author gerberson.almeida
 */
public class Conta {
    int numero;
    String nome_titular;
    double saldo;

    
    void depositar(double valor){
        this.saldo = this.saldo + valor;
        
    }
    
    boolean sacar (double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo -= valor;
            return(true);
        }
        else
            return(false);
        }
 public Conta (int numero, String nome_titular){
     this.numero = numero;
     this.nome_titular = nome_titular;
     saldo = 0;
 }
 
 public Conta (int numero, String nome_titular, double saldo) {
     this.numero = numero;
     this.nome_titular = nome_titular;
     this.saldo = saldo;
 }

}
    