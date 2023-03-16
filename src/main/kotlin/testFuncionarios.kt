fun testFuncionario() {
    val funcionarioPedro = Analista(nome = "Pedro", cpf = "999.999.999-99");
    funcionarioPedro.salaryDeposit(1250.0);

    println("funcionario Pedro: ${funcionarioPedro.bonification}");

    val gerenteJoao = Gerente(nome = "João", cpf = "333.333.333-33", password = "1234");
    gerenteJoao.salaryDeposit(2500.0);

    println("Gerente Joao: ${gerenteJoao.bonification}");
    println("Gerente Joao: ${gerenteJoao.authenticate("1234")}");

    val diretoraAna = Diretor(nome = "Ana", cpf = "777.777.777-77", password = "4321", prl = 500.0);
    diretoraAna.salaryDeposit(4000.0);

    println("Diretora Ana: ${diretoraAna.bonification}");
    println("Diretora Ana: ${diretoraAna.authenticate("4321")}");

    val calcBonificacao = CalcBonificacao();
    val bonificacapPedro = calcBonificacao.registra(funcionarioPedro)
    val bonificacapJoao = calcBonificacao.registra(gerenteJoao)
    val bonificacaoAna = calcBonificacao.registra(diretoraAna)

    println("Bonificação total: ${calcBonificacao.total}");

    val sistemaInterno = SistemaInterno();
    sistemaInterno.login(diretoraAna, "4321");
}