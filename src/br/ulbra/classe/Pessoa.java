package br.ulbra.classe;

public class Pessoa {

    private double altura;
    private int sexo; //1=man 2=woman
    private double pesoAtual;

    public Pessoa() {
        //Construtor sem atributos
    }

    //Construtor para testes
    public Pessoa(double altura, int sexo, double pesoAtual) {
        this.altura = altura;
        this.sexo = sexo;
        this.pesoAtual = pesoAtual;
    }

    //SETTERS E GETTERS
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public int getSexo() {
        return sexo;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    public double getPesoAtual() {
        return pesoAtual;
    }

    //Métodos gerais
    public double calcularPesoIdeal() {
        double s = 0;
        switch (this.sexo) {
            case 1:
                s = (72.7 * this.altura) - 58;
                break;
            case 2:
                s = (62.1 * this.altura) - 44.7;
                break;
        }
        return s;
    }

    public String avaliarPeso() {
        if (this.pesoAtual < (calcularPesoIdeal() - 2)){
            return "Under weight";
        } else if (this.pesoAtual> (calcularPesoIdeal() + 2)) {
            return "Overweight";
        } else {
            return "Ideal weight";
        }
    }

    public String toString() {
        String resposta = "";
        resposta = "Altura: " + this.altura
                + "\nActual weight: " + this.pesoAtual + "\n" +
                avaliarPeso();
        return resposta;
    }
}
