package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val augusto = Analista(nome = "Augusto", cpf = "234.234.234-11", salario = 2000.00)
    imprimeRelatorio(augusto)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())