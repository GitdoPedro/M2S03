public class Cliente {
    private float peso;
    private float altura;
    private int idade;

    public Cliente(float peso, float altura, int idade) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public Cliente(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void tratamentoPeso() {
        this.peso -= 5.0f;
    }

    public float getPeso() {
        return peso;
    }
}
