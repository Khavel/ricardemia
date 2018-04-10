/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package Clase3;


public class Calculadora {



    private double op1,op2;


    public Calculadora(double op1,double op2){
        this.op1 = op1;
        this.op2 = op2;
    }

    public double calcular(int operacion){
        if (operacion == 0) {
            return op1 + op2;
        } else if (operacion == 1) {
            return op1 - op2;
        }else if(operacion == 2){
            return op1 * op2;
        }else if(operacion == 3){
            if(op2 == 0){
                System.out.println("Error: Division por 0");
            }else{
                return op1 / op2;
            }
        }else if(operacion == 4){
            if(op2 == 0){
                System.out.println("Error: Division por 0");
            }else{
                return op1 % op2;
            }
        }else {
            System.out.println("Error: Codigo de operacion incorrecto, retornando 0");

        }

    //Version con switch
/*
    switch(operacion){
        case 0:
            return op1 + op2;

        case 1:
            return op1 - op2;

        case 2:
            return op1 * op2;

        case 3:
            if(op2 == 0){
                System.out.println("Error: Division por 0");
                return 0;
            }else{
                return op1 / op2;
            }

        case 4:
            if(op2 == 0){
                System.out.println("Error: Division por 0");
                return 0;
            }else{
                return op1 % op2;
            }


    }
*/
        return 0;
    }



    public double getOp1() {
        return op1;
    }

    public double getOp2() {
        return op2;
    }


    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

}
