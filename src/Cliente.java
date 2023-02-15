public class Cliente {
    private float peso;
    private float altura;
    private int idade;

    private String nome;

    public String getNome() {
        return nome;
    }

    public Cliente(float peso, float altura, int idade) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public Cliente(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void tratamentoPeso(float quilo) {
        this.peso -= quilo;
    }

    public float getPeso() {
        return peso;
    }
}
