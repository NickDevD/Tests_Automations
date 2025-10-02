package service;

import java.util.Scanner;

public class UserBlock {
    private static final String minhaSenha = "senha123";
    private static int TENTATIVAS = 0;
    private static final int MAX_TENTATIVAS = 3;

    public boolean validUser(String password){

        if (TENTATIVAS >= MAX_TENTATIVAS){
            System.out.println("Limite de tantativas alcançado");
            return false;
        }

        if (password.equals(minhaSenha)){
            System.out.println("Sucesso");
            TENTATIVAS = 0;
            return true;
        }else {
            TENTATIVAS++;
            System.out.println("Senha incorreta");

            if (TENTATIVAS >= MAX_TENTATIVAS){
                System.out.println("Utima tentativa");
            }
            return false;
        }
    }


}

