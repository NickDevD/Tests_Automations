package services;


public class Iteracao {

    public void Validacao(int[] num){
        int contador = 0;
        for (int numero : num){
            if(numero >= 15){
                contador++;
                System.out.println(contador+"."+numero);
            }
        }
    }

    public void Validacao01(String[] nom){
        int sequecia=0;
        for (String n : nom){
            if (n.matches("^[a-zA-Z]+$")){
                sequecia++;
                System.out.println("--------");
                System.out.print(sequecia+"."+n);
            }
        }
    }
}
