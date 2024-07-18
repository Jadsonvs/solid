package org.example.ocp

import java.math.BigDecimal

/*
Classe com o novos métodos de pagamento extendidas, seguindo o Princípio do Aberto-Fechado
 */
class PagamentoComOCP {

    fun processaPagamentoComCartao(cartao: Cartao): BigDecimal {

        if (cartao.tipo == PagamentoEnum.DEBITO) {
            //Valida os 4 atributo da classe cartão de débito
            return cartao.valor
        } else if (cartao.tipo == PagamentoEnum.CREDITO) {
            //Valida os 4 atributo da classe cartão de crédito
            return cartao.valor
        }

        return BigDecimal.ZERO.setScale(2)
    }

    fun processaPagamentoComBoleto(boleto: Boleto): BigDecimal {
        //Valida os 4 atributo da classe boleto que são diferentes das de cartões
        return boleto.valor
    }

    fun processaPagamentoComDinheiro(dinheiro: Dinheiro): BigDecimal {
        //Valida os 3 atributos da classe dinheiro
        return dinheiro.valor
    }

}


