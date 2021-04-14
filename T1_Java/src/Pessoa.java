
// @author Guilherme Vilar Balduino 743546


public class Pessoa {
    String nome;
    double peso, altura,IMC;

    public Pessoa(String nome, double peso, double altura, double IMC) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getIMC(){
        IMC = peso * (Math.pow(altura, 2));  //peso*altura*altura
        return IMC;
    }
    
    void imprimeCategoria(){  //define categoria da pessoa
        if(IMC<18.5){
            System.out.println("Abaixo do Peso");}
        else
            if(IMC<25){
                System.out.println("Peso Normal");}
            else
                if(IMC<30){
                    System.out.println("Sobrepeso");}
                else
                    if(IMC<35){
                        System.out.println("Obesidade grau I");}
                    else
                        if(IMC<40){
                            System.out.println("Obesidade grau II");}
                        else
                            System.out.println("Obesidade grau III");
                    
        }
    }
