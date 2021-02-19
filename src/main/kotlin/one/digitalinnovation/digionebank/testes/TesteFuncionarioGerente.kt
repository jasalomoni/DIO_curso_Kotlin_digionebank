package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Logavel
import java.math.BigDecimal

fun main() {
    val silva = Gerente(nome = "Silva", cpf = "234.234.234-11", salario = 5000.00, senha = "1234X")

    imprimeRelatorio(silva)

    TesteAutenticacao().autentica(silva)
}