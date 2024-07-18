package org.example.lsp

import java.math.BigDecimal

open class Funcionario(
    val nome: String,
    val idade: Int
) {

    open fun trabalhar() {
        println("Trabalhar")
    }

    open fun almocar() {
        println("Almocar")
    }
}
