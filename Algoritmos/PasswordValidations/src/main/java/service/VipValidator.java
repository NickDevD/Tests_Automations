package service;

public class VipValidator {

    public void vipCheck(Long points, boolean vip){
        Long saldo = points;
        if (vip && points >= 100){
            saldo += 50;
            System.out.println("Bônus adicionado ao : " + saldo);
        }else {
            System.out.println("Não elegível para o bônus. Saldo atual: " + saldo);
        }

    }
}
