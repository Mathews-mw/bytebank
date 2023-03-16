class Analista(nome: String, cpf: String) : Funcionario(nome = nome, cpf = cpf) {
    override val bonification: Double
        get() {
            return this.salario * 0.1;
        }
}