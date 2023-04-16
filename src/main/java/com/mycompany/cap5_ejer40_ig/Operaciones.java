
package com.mycompany.cap5_ejer40_ig;


public class Operaciones {
    public Operaciones(){
    }
    public double setRaiz(int num){
        return Math.sqrt(num);
    }
    public double setCuadrado(int num){
        return Math.pow(num, 2);
    }
    public double setCubo(int num){
        return Math.pow(num, 3);
    }
    public String setImprimir(String texto, int num, double raiz, double cuadrado, double cubo){
        return texto + "\n" + "datos del numero: "+num+", su raiz: "
                +raiz+", su cuadrado: "+cuadrado+", su cubo: "+cubo;
    }
    
}
