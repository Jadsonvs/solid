package org.example.dip

class TelevisaoComDIP(
    private val controleRemoto: ControleRemoto
) {

    fun ligar() {
        controleRemoto.ligar()
    }

    fun desligar() {
        controleRemoto.desligar()
    }

    fun aumentarVolume() {
        controleRemoto.aumentarVolume()
    }

    fun diminuirVolume() {
        controleRemoto.diminuirVolume()
    }

}