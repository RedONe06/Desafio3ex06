
package br.ulbra.classe;

// @author Andriele Joras dos Santos

import java.util.Scanner;

// 11/03/2022 - Noturno - Curso Técnico

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Informe a altura:");
        pessoa.setAltura(input.nextDouble());
        
        System.out.println("Informe o sexo: 1 homem e 2 mulher.");
        pessoa.setSexo(input.nextInt());
        
        System.out.println("Informe o seu peso: ");
        pessoa.setPesoAtual(input.nextDouble());
        
        if(pessoa.calcularPesoIdeal() == 0){
            System.out.println("Nenhuma alternativa válida");
        } else {
            System.out.println(pessoa.toString());
        }
        
        
        
    }
    
}
