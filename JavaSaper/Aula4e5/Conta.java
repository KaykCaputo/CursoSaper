package Aula4e5;

public class Conta {
    private String name;
    private double saldo;

    public Conta(String nomeInicial, double saldoInicial){
        if(nomeInicial!=null && saldoInicial>=0){
            name = nomeInicial;
            saldo = saldoInicial;
        }else{saldo=0;name="AccountName";}
    }

    public String getName() {
        return name;
    }

    public void setName(String nomeCliente) {
        this.name = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    //-------------------------------------------------
    // Não utilizar setSaldo (existe aqui só pra não quebrar os exercicios)
    public void setSaldo(Double nsaldo) {
        this.saldo = nsaldo;
    }
    //----------------------------------------------------

    //--||Aula 5||--\\
    public void depositar(double valorDeposito){
        if(valorDeposito>0){
            saldo += valorDeposito;
            System.out.printf("Seu deposito de %.2f foi realizado com sucesso", valorDeposito);
        }else{
            System.out.println("Seu deposito foi negado por possuir um valor impossivel");
        }
    }
    public void sacar(double valorSaque){
        if(valorSaque>0 && valorSaque<=saldo){
            saldo -= valorSaque;
            System.out.printf("Seu saque de %.2f foi realizado com sucesso", valorSaque);
        }else{
            System.out.println("Seu saque foi negado por possuir um valor impossivel, se continuar gastando mais do que você tem, vai acabar parando no SERASA");
        }
    }
}
