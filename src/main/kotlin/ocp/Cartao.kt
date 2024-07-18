package org.example.ocp

import java.math.BigDecimal
import java.time.LocalDate

data class Cartao(
    val tipo: PagamentoEnum,
    val validade: LocalDate,
    val numero: Int,
    val valor: BigDecimal = BigDecimal.ZERO.setScale(2)
)
