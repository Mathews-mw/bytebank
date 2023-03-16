class CalcBonificacao {
    var total: Double = 0.0
        private set;

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonification;
    }
}
