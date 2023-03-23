package bytebank.tests

import bytebank.exceptions.AuthenticateException
import bytebank.exceptions.SaldoInsuficienteException
import bytebank.models.*

fun testConta() {
    val contaPoupMatt =
        ContaPoupanca(titular = Cliente(nome = "Mathews", cpf = "999.999.999-99", password = "1234"), numero = 1000);
    val contaCorrentMaria = ContaCorrente(
        numero = 1001,
        titular = Cliente(
            nome = "Maria",
            cpf = "888.888.888-88",
            password = "4321",
            Endereco(
                logradouro = "Rua Laranjeiras",
                numero = "42",
                bairro = "Flores",
                cidade = "Manaus",
                estado = "AM",
                cep = "69000-000"
            )
        )
    );

    println("Endereço: ${contaCorrentMaria.titular.endereco.logradouro}")

    contaPoupMatt.deposit(1250.0);
    contaCorrentMaria.deposit(2000.0);

    try {
        contaPoupMatt.transfer(1250.0, contaCorrentMaria, "12123123asd345");
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace();
    } catch (e: AuthenticateException) {
        e.printStackTrace();
    } catch (e: Exception) {
        e.printStackTrace();
    }


    println("saldo: ${contaPoupMatt.saldo}");
    println("saldo: ${contaCorrentMaria.saldo}");

    val saqueMaria = contaCorrentMaria.withdraw(1000.0)
    println("Saldo maria: ${contaCorrentMaria.saldo}");

    val clienteFulano = Cliente(nome = "Fulano", cpf = "123.123.123-33", password = "7415");

    val sistemaInterno = SistemaInterno();
    sistemaInterno.login(clienteFulano, "7415");
}