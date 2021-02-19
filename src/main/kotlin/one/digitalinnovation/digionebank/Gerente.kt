package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoBonus(): Double = salario * 0.40
    override fun login(): Boolean = "12345" == senha
}