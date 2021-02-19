package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.Logavel

fun main() {
    val jose = Cliente(
        nome = "Jose Augusto",
        cpf = "123.123.123-99",
        tipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}