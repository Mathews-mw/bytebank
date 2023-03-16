abstract class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        protected set;

    fun deposit(amount: Double) {
        if (amount < 0) {
            println("Apenas valores positivo é permitido para atribuir no salo.");
            return;
        }

        this.saldo += amount;
    }

    abstract fun withdraw(amount: Double);

    fun transfer(amount: Double, to: Conta) {
        if (this.saldo < amount) {
            println("Operação inválida, pois seu saldo é insuficiente");
            return;
        }

        to.deposit(amount);
        this.saldo -= amount;
    }
}