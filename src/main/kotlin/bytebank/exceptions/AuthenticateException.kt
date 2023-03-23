package bytebank.exceptions

class AuthenticateException(var mensage: String = "Falha na autenticação"): Exception(mensage)