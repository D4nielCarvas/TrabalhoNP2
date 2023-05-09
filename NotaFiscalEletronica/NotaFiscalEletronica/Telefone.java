package NotaFiscalEletronica;

import java.util.InputMismatchException;

public class Telefone {

    private int ddd;
    private int numero;

    public Telefone() {

    }

    public Telefone(int ddd, int numero) {

        this.ddd = ddd;
        this.numero = numero;

    }

    public int getDdd() {

        return this.ddd;

    }

    public void setDdd(int ddd) {

        this.ddd = ddd;

    }

    public int getNumero() {

        return this.numero;

    }

    public void setNumero(int numero) {

        this.numero = numero;

    }

    @Override
    public void entrar() {

        while(true) {
            System.out.print("Numero :> ");

            try {
                setNumero(leia.nextLong());
                break;

            } catch (InputMismatchException e) {

                System.out.println("Erro ao cadastrar o telefone.");
                System.out.println("O valor deve ser apenas numeros.");
                System.out.println("Tente novamente.");
                leia.nextLine();
            }
        }

        while(true) {
            System.out.print("DDD :> ");

             try {
                setDdd(leia.nextInt());
                break;

             } catch (InputMismatchException e) {

                System.out.println("Erro ao cadastrar o DDD.");
                System.out.println("O valor deve ser apenas numeros.");
                System.out.println("Tente novamente.");
                leia.nextLine();
             }
        }

    }

    @Override
    public void imprimir() {

        System.out.printf("Telefone ->", getDdd(), getNumero());
        
    }

    @Override
    public void alterar() {
        
        
    }

    @Override
    public void consultar() {
        
        
    }
    
    @Override
    public void excluir() {
        
        
    }


    

}