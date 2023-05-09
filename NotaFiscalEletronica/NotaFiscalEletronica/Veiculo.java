package NotaFiscalEletronica;

import java.util.InputMismatchException;

public class Veiculo implements Interface() {

    private String placa;
    private int id;

    public Veiculo() {

    }

    public Veiculo(String placa, int id) {

        this.placa = placa;
        this.id = id;

    }

    public String getPlaca() {

        return this.placa;

    }

    public void setPlaca(String placa) {

        this.placa = placa;

    }

    public int getId() {

        return this.id;

    }

    public void setId(int id) {

        this.id = id;

    }

    @Override
    public void entrar() {

        System.out.print("Placa do veiculo ->");
        setPlaca(leia.nextLine());

        while(true) {
            System.out.print("ID ->");
            try {
                setId(leia.nextInt());
                break;
            
            } catch (InputMismatchException e) {
                
                System.out.println("Erro ao cadastrar o ID.");
                System.out.println("O ID deve ser de tipo inteiro.");
                System.out.println("Tente novamente.");
                leia.nextLine();
            }
        }
    }

    @Override 
    public void imprimir() {

        System.out.print("Placa do Veiculo: " + getPlaca());
        System.out.print("ID do veiculo: " + getId());

    }

    @Override
    public void excluir() {

    }

    @Override 
    public void alterar() {
        System.out.print("Alteração de Placa: ");

        while(true) {
            System.out.print("Digite a Placa:");
        }
    }

    @Override
    public void consultar(){
        
    }

}
