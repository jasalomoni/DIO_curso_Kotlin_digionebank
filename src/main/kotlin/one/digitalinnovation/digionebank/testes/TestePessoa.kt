package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val pessoa = Pessoa(nome = "José", cpf = "123.123.123-00")

    println(pessoa.nome)
    println(pessoa.cpf)
}

