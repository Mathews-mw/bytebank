abstract class Funcionario(val nome: String, val cpf: String) {
    var salario: Double = 0.0
        private set;

    fun salaryDeposit(amount: Double) {
        if (amount <  0) {
            println("Não é permitido o depósito de um saldo negativo!");
            return;
        }

        this.salario += amount;
    }

    abstract val bonification: Double;

}