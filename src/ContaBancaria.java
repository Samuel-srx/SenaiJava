public class ContaBancaria {

    public String name;
    public double balance;
    public double interestRate;

    public ContaBancaria(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //Retorno nulo
    public void depositoBancario(double valorBancario) {
        balance += valorBancario;
    }

    public void saqueBancario(double valorSaque) {

        if (valorSaque > balance) {
            System.out.println("Saldo negativo");
        } else {

            balance -= valorSaque;
            System.out.println("Saldo negativo");
        }
    }
}


