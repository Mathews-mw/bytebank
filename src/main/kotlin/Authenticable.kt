interface Authenticable {
    fun authenticate(senha: String): Boolean;
}