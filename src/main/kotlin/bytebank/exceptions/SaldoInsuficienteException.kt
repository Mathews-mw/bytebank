package bytebank.exceptions

class SaldoInsuficienteException(var mensage: String = "Saldo insuficiente"): Exception(mensage);