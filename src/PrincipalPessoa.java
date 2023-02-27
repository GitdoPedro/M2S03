import java.util.Scanner;

public class PrincipalPessoa {

    Pessoa pessoa;
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        PrincipalPessoa teste = new PrincipalPessoa();
        int opc = 0;

        while (true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("1- Cadastrar");
            System.out.println("2- Imprimir");
            System.out.println("Entre com uma opção: ");

            opc = entrada.nextInt();
            switch (opc){
                case 1:
                    teste.cadastrar();
                    break;
                case 2:
                    teste.imprimir();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }

    private void cadastrar(){
        System.out.println("Nome:");
        String nome = entrada.next();
        System.out.println("Data de Nascimento: ");
        String dataNasc = entrada.next();
        System.out.println("CPF: ");
        String cpf = entrada.next();

        this.pessoa = new Pessoa(cpf,nome,dataNasc);

    }

    void imprimir(){
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Data de Nascimento: "+pessoa.getDataNasc());
        System.out.println("CPF: "+ pessoa.getCpf());
    }
}
