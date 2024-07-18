package org.example.ocp

import java.math.BigDecimal

/*
Para o melhor entendimento da Open-Closed Principle(OCP) ou em português Princípio do Aberto-Fechado, que nos diz o seguinte:
Toda entidade de software(Classe e métodos) deve está aberta para extensão, mas fechada para modificação. Em outras palavras,
se uma classe tiver um comportamento e for preciso incluir mais um comportamento, a gente não irá modificar o modo do comportamento
existente para que o novo comportamento seja incluído. De acordo com o OCP, a gente irá extender esse novo comportamento.

O exemplo usado foi uma classe Pagamento que faz o processamento de pagamentos com cartão de crédito e débito, mas nosso
PO nos disse que iriamos começar a fazer pagamentos com boleto e dinheiro. Para issso modificamos o método de pagamento
existente(apenas cartão de crédito e débito) para que ele possa fazer pagamentos com boleto e dinheiro. Ao fazermos isso
estaremos modificando o método existente para realizar novas tarefas, assim ferimos o Princípio do Aberto-Fechado, já que
não extendemos e sim modificamos a classe/método.

*/
class PagamentoSemOCP {

    //Método que processa pagamento de cartão de crédito
    fun processaPagamentoCartao(cartao: Cartao): BigDecimal {

        if (cartao.tipo == PagamentoEnum.DEBITO) {
            //Valida os 4 atributo da classe cartão de débito
            return cartao.valor
        } else if (cartao.tipo == PagamentoEnum.CREDITO) {
            //Valida os 4 atributo da classe cartão de crédito
            return cartao.valor
        }

        return BigDecimal.ZERO.setScale(2)
    }

    //Método que processa pagamentos de cartão de crédito, débito, boleto e dinheiro
    fun processaPagamentoCartaoBoletoDinheiro(cartao: Cartao?, boleto: Boleto?, dinheiro: Dinheiro?): BigDecimal {

        if (cartao?.tipo == PagamentoEnum.DEBITO) {
            //Valida os 4 atributo da classe cartão de débito
            return cartao.valor
        } else if (cartao?.tipo == PagamentoEnum.CREDITO) {
            //Valida os 4 atributo da classe cartão de crédito
            return cartao.valor
        } else if (boleto?.tipo == PagamentoEnum.BOLETO) {
            //Valida os 4 atributo da classe boleto que são diferentes das de cartões
            return boleto.valor
        } else if (dinheiro?.tipo == PagamentoEnum.DINHEIRO) {
            //Valida os 3 atributos da classe dinheiro
            return dinheiro.valor
        }
        return BigDecimal.ZERO.setScale(2)
    }

}


