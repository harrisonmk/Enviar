package enviar;

import java.text.DecimalFormat;

/**
 *
 * @author Harrison
 */
public class Conta extends Pessoa {

    private double saldo;
    private String senha;
    private int numero;
    private int agencia;
    static int quantContas = 0;
    
    public Conta() {
        super.nome = nome;
        this.agencia = 15;
        quantContas++;
        this.numero=quantContas;
        this.saldo = 0.0;

    }
    

    DecimalFormat deci = new DecimalFormat("0.00");

   


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public static int getQuantContas() {
        return quantContas;
    }

    public static void setQuantContas(int quantContas) {
        Conta.quantContas = quantContas;
    }

    public DecimalFormat getDeci() {
        return deci;
    }

    public void setDeci(DecimalFormat deci) {
        this.deci = deci;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public void dadosBancarios() {

        System.out.println("\nNumero: " + numero);
        System.out.println("Nome: " + super.nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);

    }

    @Override
    public String toString() {
        return "\nNumero: "+numero+
                "\nNome: " + super.getNome() + 
                "\nAgencia:" + agencia + 
                "\nSaldo: " + saldo +"\n"; 
                
                
    }
    
    

    public void depositar(double valor) {

        this.saldo += valor;

    }

    public void sacar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insulficinente");
        }

    }

    public void visualizarSaldo() {

        System.out.println("\nSaldo: " + deci.format(this.saldo));
    }

    public void transferir(Conta trans, double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            trans.saldo+=valor;
        } else {
            System.out.println("Saldo insulficinente");
        }

    }

}
