package org.example.dip

/*
Para melhor entendimento da Dependency Inversion Principle(DPI0 ou em português Princípio da Inversão de Dependência, nos
diz o seguinte: classes/módulos de alto nível não devem depender diretamento de detalhes de implementações de classes concretas,
mas sim de abstrações/interfaces.

No exemplo abaixo a classe TelevisaoSemDIP depende diretamente da classe de implementação ControleRemotoImpl, fazendo com
que a classe TelevisaoSemDPI fique acoplada a classe de implementação, ferindo assim o Princípio da Inversão de Dependência.

Para resolver esse problema criamos uma Interface ControleRemoto com os métodos de uma controle remoto. Essa interface
implementamos ela na classe ControleRemotoImpl e implementamos os métodos nela. Na classe TelevisaoComDIP ao invés de
injetar a classe de implementação ControleRemotoImpl injetamos a interface ControleRemoto, evitando desse jeito o acoplamento
da mesma.
 */

class TelevisaoSemDIP (
    private val controleRemoto: ControleRemotoImpl
){

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