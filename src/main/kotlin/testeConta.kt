fun testConta() {
    val contaPoupMatt = ContaPoupanca(titular = "Mathews", numero = 1000);
    val contaCorrentMaria = ContaCorrente(numero = 1001, titular = "Maria",);

    contaPoupMatt.deposit(1250.0);
    contaCorrentMaria.deposit(2000.0);

    contaPoupMatt.transfer(1250.0, contaCorrentMaria);

    println("saldo: ${contaPoupMatt.saldo}");
    println("saldo: ${contaCorrentMaria.saldo}");

    val saqueMaria = contaCorrentMaria.withdraw(1000.0)
    println("Saldo maria: ${contaCorrentMaria.saldo}");

    val clienteFulano = Cliente(nome = "Fulano", cpf = "123.123.123-33", password = "7415");

    val sistemaInterno = SistemaInterno();
    sistemaInterno.login(clienteFulano, "7415");
}