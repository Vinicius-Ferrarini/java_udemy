public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void whitdraw(Double amount) throws Exception {
        validateWithdraw(amount);
        balance =- amount;
        System.out.println("Saldo restante: "+ balance);
    }
    private void validateWithdraw(Double amount) throws Exception {
        if (amount > withdrawLimit){
            throw new Exception("Valor maior que seu limite!");
        }
        if (amount > balance){
            throw new Exception("Você não possui saldo suifiente!");
        }
    }

}
