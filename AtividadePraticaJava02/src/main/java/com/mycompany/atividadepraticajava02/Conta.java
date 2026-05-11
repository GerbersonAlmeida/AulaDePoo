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
    }
    