package org.example.isp

/*
Para melhor entendimento da Interface Segregation Principle(ISP) ou em português Princípio da Segregação de Interface, que
nos diz o seguinte: uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados.

No exemplo utilizado abaixo temos uma interface bem genérica chamada ComportamentoTransporte, ela tem os métodos de correr(),
voar() e navegar(). Criamos a classe Carro que iremos implementar a interface ComportamentoTransporte para utilizar o método
correr(), porém, além desse método temos os métodos voar() para avião e navegar() para návio. Esses métodos não serão implementado
na classe Carro e ficarão inúteis, ferido assim o Princípio da Segregação de Interface.

Para resovler esse problema iremos transformar essa interface genérica ComportamentoTransporte em 3 interfaces específicas.
A interface ComportamentoCarro, ComportamentoAviao e ComportamentoNavio com seus métodos específicos que serão implementados.
 */

class CarroSemISP: ComportamentoTransporte {
    override fun correr() {
        println("Correr")
    }

    override fun voar() {
        TODO("Not yet implemented")
    }

    override fun navegar() {
        TODO("Not yet implemented")
    }
}