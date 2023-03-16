class ContaCorrente(titular: String, numero: Int): Conta(titular = titular, numero = numero) {

    override fun withdraw(amount: Double) {
        if (this.saldo < amount) {
            println("O Saldo da conta não permite o saque para o valor de $amount");
            return;
        }

        this.saldo -= amount;
        val amountWithTax = (amount * 0.1) + amount;
        this.saldo - amountWithTax;
    }
}
