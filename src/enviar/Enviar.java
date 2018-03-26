package enviar;

import static java.lang.System.exit;
import java.util.Scanner;

public class Enviar {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Banco lista = new Banco();
        Pessoa p;
        Conta c = null;
        
        
        int opcao;
        
        while (true) {
            Pessoa.menu();
            opcao = scan.nextInt();
            scan.nextLine();
            
            switch (opcao) {
                
                case 1: //
                    
                    System.out.print("\nDigite seu nome: ");
                    String nome = scan.nextLine();
                    p = new Pessoa();
                    p.setNome(nome);
                    System.out.print("Digite uma senha: ");
                    String senha = scan.next();
                    c = new Conta();
                   
                    c.setPessoa(p);
                    c.setSenha(senha);
                    
                    lista.adiciona(c);
                    
                    break;
                
                case 2:
                    
                    System.out.println("\nDigite o numero da conta:");
                    int nume = scan.nextInt();
                    
                    
                    Conta k = lista.pega(nume - 1); //pega o tamanho da lista començando a partir do 1
                    
                    System.out.println(k); // imprime as informações da pessoa que for selecionada

                    break;
                case 3:
                    System.out.println("\nDigite o numero da conta:");
                    int numeto = scan.nextInt();
                    
                    Conta x = lista.pega(numeto - 1);
                    System.out.println(x.getSaldo());
                    break;
                case 4:
                    System.out.println("\nDigite o numero da conta:");
                    int numero = scan.nextInt();
                    
                    Conta t = lista.pega(numero - 1);
                    System.out.print("Digite o valor do deposito: ");
                    double dinheiro = scan.nextDouble();
                    t.depositar(dinheiro);
                    
                    break;
                case 5:
                    System.out.println("\nDigite o numero da conta:");
                    int numero1 = scan.nextInt();
                    
                    Conta ta = lista.pega(numero1 - 1);
                    System.out.print("Digite o valor do deposito: ");
                    double dinheiro1 = scan.nextDouble();
                    
                    ta.sacar(dinheiro1);
                    break;
                case 6:
                    System.out.println("\nDigite o numero da conta de origem: ");
                    int numero2 = scan.nextInt();
                    
                    Conta din = lista.pega(numero2 - 1);
                    
                    System.out.println("\nDigite o numero da conta de Destino: ");
                    int numero3 = scan.nextInt();
                    
                    Conta money = lista.pega(numero3 - 1);
                    
                    System.out.println("Digite o valor da Transferencia:");
                    double valorMoney = scan.nextDouble();
                    
                    din.transferir(money, valorMoney);
                    break;
                
                                        
                case 0:
                    exit(0);
                    break;
                
                default:
                    System.out.println("opcao Invalida:");
                
            }
            
        }
        
    }
    
}
