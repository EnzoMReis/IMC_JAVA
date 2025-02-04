public class Paciente {
    private double peso;
    private double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public String classificarIMC(){
        double imc = calcularIMC();

        if(imc < 18.5){
            return "Magreza";
        } else if ((imc >= 18.5)&&(imc < 25)) {
            return "Normal";
        } else if ((imc >= 25)&&(imc < 30)) {
            return "Sobrepeso";
        } else if ((imc >= 30)&&(imc < 35)) {
            return "Obesidade de Grau I";
        } else if ((imc >= 35)&&(imc < 40)) {
            return "Obesidade de Grau II";
        } else if (imc >= 40) {
            return "Obesidade de Grau III";
        }else {
            return "Dados Inválidos";
        }
    }

    @Override
    public String toString() {
        return String.format(" Peso: %.2f kg \n" +
                " Altura: %.2f m \n" +
                " IMC: %.2f \n" +
                " Interpretação do IMC: %s \n",
                getPeso(),getAltura(),calcularIMC(),classificarIMC());
    }

    private double getPeso() {
        return peso;
    }

    private double getAltura() {
        return altura;
    }
}
