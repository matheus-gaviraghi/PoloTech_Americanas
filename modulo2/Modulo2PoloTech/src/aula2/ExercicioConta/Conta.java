package aula2.ExercicioConta;

public class Conta {
    private double saldo;
    private String cpf;
    private String numeroConta;
    private String agenciaConta;

    public Conta(String cpf, String numeroConta, String agenciaConta) {
        this.saldo = 0;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
            System.out.println("Operação de depósito de " + valor + " feita com sucesso!");
        }
        else System.out.println("Valor inválido, tente novamente");
    }

    public boolean sacar(double valor){
        if(valor>0 && saldo>=valor){
            this.saldo-=valor;
            System.out.println("Operação de saque de " + valor + " feita com sucesso!");
            return true;
        }
        else {
            System.out.println("Valor inválido ou saldo insuficiente, tente novamente");
            return false;
        }
    }

    public void transferir(double valor, Conta destinatario){
        if(!this.cpf.equals(destinatario.getCpf()))
        {
            if (valor > 0 && saldo >= valor) {
                this.saldo -= valor;
                destinatario.depositar(valor);
                System.out.println("Operação de transferência feita com sucesso!");
            } else System.out.println("Valor inválido ou saldo insuficiente, tente novamente");
        }
        else System.out.println("Você não pode transferir dinheiro pra própria conta!");
    }

//    public void transferir2(double valor, Conta destinatario){
//        if(!this.cpf.equals(destinatario.getCpf()))
//        {
//            if (this.sacar(valor))
//                destinatario.depositar(valor);
//        }
//        else System.out.println("Você não pode transferir dinheiro pra própria conta!");
//    }

    public double getSaldo() {
        return saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }
}

/*
Sistema Bancário
- Deposito
- Sacar
- Transferir

- Transferir apenas se tiver saldo
- Sacar apenas se tiver saldo

- Todos os atributos tem que ser privados
 */