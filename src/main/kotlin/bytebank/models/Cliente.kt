package bytebank.models

class Cliente(val nome: String, val cpf: String, val password: String, val endereco: Endereco = Endereco()) :
    Authenticable {
    override fun authenticate(senha: String): Boolean {
        if (this.password == senha) {
            return true;
        }
        return false;
    }
}