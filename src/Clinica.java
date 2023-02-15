import java.util.ArrayList;
import java.util.List;

public class Clinica {
    String nomeDono;
    String nomeClinica;
    int CNPJ;
    String endereco;
    int codigoClinica;

    List<Cliente> clientes = new ArrayList<>();


    float imc(float peso,float altura){
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

}
