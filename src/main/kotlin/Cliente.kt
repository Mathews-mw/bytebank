class Cliente(val nome: String, val cpf: String, val password: String): Authenticable {

    override fun authenticate(senha: String): Boolean {
        if (this.password ==  password) {
            return true;
        }
        return false;
    }
}