package org.example.srp

/*
Para o meu melhor entendimento, eu usei um exemplo com uma classe chamada CalculadoraCafeteiraVentilador, onde a classe
além de fazer cálculos vai fazer café e ventilar, com isso a classe irá ter várias responsabilidades além de ser a uma
calculadora. Com esse exemplo ficará fácil entender o conceito do Single Responsability Principle(SRP) ou em português
Princípio da Responsabilidade única.

Como vocês podem ver a classe tem várias responsabilidades diferentes além de fazer cálculos e com isso acabamos ferindo
o princípio da responsabilidade única. Para resolver esse problema vamos dividir essa clase em 3 classes diferentes que
serão a classe Calculador, Cafeteira e Ventilador, onde cada uma terá suas respectivas responsabilidades.

De: CalculadoraCafeteiraVentilador

Para: Calculadora, Cafeteira e Ventilador

*/
class CalculadoraCafeteiraVentilador {

    fun somar(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subtrair(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiplicar(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun dividir(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun fazerCafe(): String {
        return "Fazendo café"
    }

    fun ventilar(): String {
        return "Ventilando"
    }

}
