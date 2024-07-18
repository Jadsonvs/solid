package org.example.dip

class ControleRemotoImpl : ControleRemoto {
    override fun ligar() {
        println("Ligando")
    }

    override fun desligar() {
        println("Desligando")
    }

    override fun aumentarVolume() {
        println("Aumentando volume")
    }

    override fun diminuirVolume() {
        println("Diminuindo volume")
    }
}