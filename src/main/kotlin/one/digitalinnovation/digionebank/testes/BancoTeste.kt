package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    var digiOneBank = Banco(nome = "Digi One", numero = 123)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    var banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.nome)
    println(banco2.numero)
    println(banco2.infoBanco())
}