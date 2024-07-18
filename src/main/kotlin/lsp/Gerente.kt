package org.example.lsp

class Gerente(nome: String, idade: Int): Funcionario(nome, idade){

    override fun trabalhar() {
        println("traba até tarde sempre")
    }

    override fun almocar() {
        println("Almoça sempre tarde")
    }
}
