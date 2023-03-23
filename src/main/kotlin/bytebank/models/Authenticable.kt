package bytebank.models

interface Authenticable {
    fun authenticate(senha: String): Boolean;
}