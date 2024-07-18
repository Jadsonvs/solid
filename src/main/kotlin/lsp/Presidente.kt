package org.example.lsp

open class Presidente(nome: String, idade: Int, peso: Int): Funcionario(nome, idade) {

    override fun trabalhar() {
        println("Vive trabalhando")
    }

    override fun almocar() {
        println("Não almoça kkk")
    }

    fun recompensa() {
        println("Ganha dinheiro demaaaaaaaais")
    }
}