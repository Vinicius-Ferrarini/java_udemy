package org.example;

    public class ContaCorrente extends ContaBancaria{
        private double limiteConta;

        public ContaCorrente(String numeroConta, double saldo, String titular,double limiteConta) {
            super(numeroConta, saldo, titular);
            this.limiteConta = limiteConta;
        }

        public double getLimiteConta() {
            return limiteConta;
        }

        @Override
        public void sacar(double saque) {
            double valor = getSaldo() + limiteConta;
            if (valor >= saque){
                valor -= saque;
                System.out.println("Sucesso!" + valor);
            }else{
                System.out.println("Pobre!!");
            }
        }

        @Override
        public void exibirTipoConta() {
            System.out.println("Conta Corrente");
        }
    }
