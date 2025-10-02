package service;

public class EmailValidation {

    public boolean validEmail(String email){
        if (email.startsWith("@") || email.startsWith(".")){
            System.out.println("E-mail inválido");
            return false;
        }
        if (email.matches( "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            System.out.println("E-mail válido");
            return true;
        }else{
            System.out.println("inválido");
            return false;

        }
    }
}
