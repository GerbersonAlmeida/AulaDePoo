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
    double[]alunos = new double[10];
    
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < alunos.length; i++){
        System.out.println("Digite a nota do aluno " + (i + 1));
        alunos[i] = scan.nextDouble();
        System.out.println("Nota do aluno " + (i + 1) + " = " + alunos[i]);
    }
    scan.close();
    }
}
