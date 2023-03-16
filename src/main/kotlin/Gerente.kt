class Gerente(nome: String, cpf: String, password: String): FuncionarioAdmin(nome = nome, cpf = cpf, password = password) {

    override val bonification: Double
        get() {
            return this.salario * 0.15;
        }
}