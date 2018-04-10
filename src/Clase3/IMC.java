package Clase3;

public class IMC {

    private float peso;
    private float altura;

    public IMC(float peso, float altura){
        this.peso = peso;
        this.altura = altura;

    }

    public String calculaIMC(){
        float imc = peso /(altura*altura);
        if(imc < 16){
            return "Critico";
        }else if(imc >=16 && imc <17){
            return "Infrapeso";
        }else if(imc >=17 && imc <18){
            return "Peso bajo";
        }else if(imc >=18 && imc <25){
            return "Peso normal";
        }else if(imc >=25 && imc <30){
            return "Sobrepeso";
        }else if(imc >=30 && imc <35){
            return "Sobrepeso cronico";
        }else if(imc >=35 && imc <40){
            return "Obesidad premorbida";
        }else if(imc >40){
            return "Obesidad morbida";
        }

        return "Ha ocurrido un error";
    }
    //Ahora con switch

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
