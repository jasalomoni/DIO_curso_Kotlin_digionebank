package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "José"
    var cpf: String = "123.123.123-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome + $cpf"
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.pessoaInfo())
}