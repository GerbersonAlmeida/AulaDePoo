/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author gerberson.almeida
 */
public class AtividadeDeProgramacaoJava02 {

    public static void main(String[] args) {
        double soma = 0, media = 0;
        int  nAcima = 0, nAbaixo = 0;
        double[] notasAluno = new double[10];

        Scanner scan = new Scanner(System.in);
        
        //laço criado para colocar a nota dentro dos indices do vetor notasAluno
        for (int i = 0; i < notasAluno.length; i++) {
            
            notasAluno[i] = scan.nextDouble();
            System.out.println("Nota do aluno " + (i + 1) + " = " + notasAluno[i]);
            soma += notasAluno[i];
            media = soma / notasAluno.length;
        }
        
        for (int i = 0; i < notasAluno.length; i++){
            
            if (notasAluno[i] > media) {
               nAcima++;
            }
            if (notasAluno[i] < media) {
               nAbaixo++;
        }
        }
        System.out.println("A media das notas é " + media);
        System.out.println("A quantidade de notas abaixo da media são: " + nAbaixo);
        System.out.println("A quantidade de notas acima da media são: " + nAcima);
        System.out.println("A soma de todas as notas é " + soma);
        scan.close();
}
}