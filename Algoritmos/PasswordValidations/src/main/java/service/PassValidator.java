package service;


public class PassValidator {

    public void stringValidator(String password){
        if (password == null || password.length() < 8){
            System.out.println("ERRO: A senha deve possuir no minímo 8 caracteres");
            return;
        }

        if (!(password.matches(".*\\d.*"))){
            System.out.println("ERRO: A senha deve possuir no minímo 1 dígito");
            return;
        }

        System.out.println("A senha é considerada forte e válida!");


    }

    public void characterValidator(String character){

        Boolean temNumero = false;
        for (int i = 0; i < character.length(); i++) {

            // A variável do tipo caractere, chamada caractere, recebe o caractere que está na posição i da string senha
            char caracter = character.charAt(i);

            if (Character.isDigit(caracter)){
                temNumero = true;
                break;
            }
        }

        if (!temNumero){
            System.out.println("A senha deve conter pelo menos um número (0-9).");
        }

        System.out.println("Senha válida");
    }


}
