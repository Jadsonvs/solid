package org.example.ocp

import java.math.BigDecimal

data class Dinheiro(
    val tipo: PagamentoEnum,
    val valor: BigDecimal = BigDecimal.ZERO.setScale(2)
)
