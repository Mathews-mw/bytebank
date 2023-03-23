package bytebank.models
class SistemaInterno {
    fun login(admin: Authenticable, password: String) {
        if (admin.authenticate(password)) {
            println("Seja bem-vindo(a) ao Bytebank.");
        } else {
            println("Falha ao tentar logar no sistema!");
        }
    }
}