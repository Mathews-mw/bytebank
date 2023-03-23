package bytebank.models
class Diretor(nome: String, cpf: String, password: String, val prl: Double) :
    FuncionarioAdmin(nome = nome, cpf = cpf, password = password) {
    override val bonification: Double
        get() {
            return (this.salario * 0.2) + prl;
        }
}