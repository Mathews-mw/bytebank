package bytebank.models
abstract class FuncionarioAdmin(nome: String, cpf: String, protected val password: String) :
    Funcionario(nome = nome, cpf = cpf),
    Authenticable {

    override fun authenticate(password: String): Boolean {
        if (this.password == password) {
            return true;
        }
        return false;
    }
}