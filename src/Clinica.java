import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nomeDono;
    private String nomeClinica;
    private int CNPJ;
    private String endereco;
    private int codigoClinica;

    private List<Cliente> clientes = new ArrayList<>();

    public void adicionaCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Clinica(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public List<Cliente> getClientes() {
        for (Cliente cliente : this.clientes) {
            System.out.println("Nome: " + cliente.getNome());}
        return clientes;
    }

    public Clinica(String nomeDono, List<Cliente> clientes) {
        this.nomeDono = nomeDono;
        this.clientes = clientes;
    }

    private float imc(float peso, float altura){
        float imcResultado = peso/(altura*altura);
        if (imcResultado <= 18.5){
            System.out.println("Magreza");
        }else if (imcResultado <= 24.9){
            System.out.println("Normal");
        }else if (imcResultado <= 29.9){
            System.out.println("Sobrepeso");
        }else if (imcResultado <= 39.9){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade grave");
        }
        return imcResultado;
    }

    public float tratamento(int id) {
        if (id < this.clientes.size()) {
            Cliente cliente = this.clientes.get(id);
            cliente.tratamentoPeso(5.0f);
            return cliente.getPeso();
        } else {
            System.out.println("Cliente não identificado.");
            return -1.0f;
        }
    }

    public float tratamento(int id,float quilo) {
        if (id < this.clientes.size()) {
            Cliente cliente = this.clientes.get(id);
            cliente.tratamentoPeso(quilo);
            return cliente.getPeso();
        } else {
            System.out.println("Cliente não identificado.");
            return -1.0f;
        }
    }

}
