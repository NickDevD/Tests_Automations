package services;

public class BoundaryTesting {

    public void validadorIdade(int ano) {
        if (ano >= 1900 && ano <= 2023) {
            System.out.println("TESTE COM ANO [" + ano + "]: PASSOU. Ano Aceito.");
        } else {
            System.out.println("TESTE COM ANO [" + ano + "]: FALHOU. Ano Rejeitado.");
        }
    }

}