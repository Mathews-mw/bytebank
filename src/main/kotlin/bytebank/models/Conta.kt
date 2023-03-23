package bytebank.models

import bytebank.exceptions.AuthenticateException
import bytebank.exceptions.SaldoInsuficienteException

abstract class Conta(var titular: Cliente, var numero: Int): Authenticable {
    var saldo = 0.0
        protected set;

    companion object Contador {
        var total: Int = 0
            private  set;
    }

    init {
        Contador.total++
    }

    override fun authenticate(senha: String): Boolean {
        return this.titular.authenticate(senha);
    }

    fun deposit(amount: Double) {
        if (amount < 0) {
            println("Apenas valores positivo é permitido para atribuir no saldo.");
            return;
        }

        this.saldo += amount;
    }

    abstract fun withdraw(amount: Double);

    fun transfer(amount: Double, to: Conta, senha: String) {
        if (this.saldo < amount) {
            throw SaldoInsuficienteException()
        }

        if (!this.authenticate(senha)) {
            throw AuthenticateException();
        }

        to.deposit(amount);
        this.saldo -= amount;
    }
}

class ContaCorrente(titular: Cliente, numero: Int) : Conta(titular = titular, numero = numero) {

    override fun withdraw(amount: Double) {
        if (this.saldo < amount) {
            println("O Saldo da conta não permite o saque para o valor de $amount");
            return;
        }

        this.saldo -= amount;
        val amountWithTax = (amount * 0.1) + amount;
        this.saldo - amountWithTax;
    }
}

class ContaPoupanca(titular: Cliente, numero: Int) : Conta(titular = titular, numero = numero) {

    override fun withdraw(amount: Double) {
        if (this.saldo < amount) {
            println("O Saldo da conta não permite o saque para o valor de $amount");
            return;
        }

        this.saldo -= amount;
    }

}