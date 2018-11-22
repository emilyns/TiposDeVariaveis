
package tiposdevariaveis;

import java.util.Scanner;

/**
 *
 * @author Emily Nascimento
 */
public class TiposDeVariaveis {

   
    public static void main(String[] args) {
       byte idade = 23;
       int rg = 1098765432;
       float salario = 600.00f;                 //usar f apos um numero no float somente se for atribuido junto com a variavel
       double decimoTerceiro = 450.50;
       String nome = "Emily Nascimento";        // String: conjunto de caracteres
       char inicial = 'E';
               
       //Entrevista
       
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite seu nome: ");
       String nomePessoa = ler.nextLine();               //ler.nextLine() =  pegar o nome de uma pessoa
       System.out.println("Informe a sua idade: ");
       short idadePessoa = ler.nextShort();             // pega idade da pessoa
       System.out.println("Informe o seu salario: ");
       float salarioPessoa = ler.nextFloat();           //pega o salario
        
       System.out.println(nomePessoa+ "tem" +idadePessoa+ "anos e ganha" +salarioPessoa);   
        
        
        
        
        
    }
    
}
