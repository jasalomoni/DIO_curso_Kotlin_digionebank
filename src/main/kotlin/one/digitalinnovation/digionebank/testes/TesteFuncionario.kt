package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    //val pessoa = Pessoa(nome = "José", cpf = "123.123.123-00")

    //println(pessoa.nome)
    //println(pessoa.cpf)

    val func = Funcionario(nome = "Augusto", cpf = "234.234.234-11", BigDecimal.valueOf(2000.00))

    println(func.nome)
    println(func.cpf)
    println(func.salario)
}