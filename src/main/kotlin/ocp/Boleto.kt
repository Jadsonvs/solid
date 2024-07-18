package org.example.ocp

import java.math.BigDecimal
import java.time.LocalDate

data class Boleto(
    val tipo: PagamentoEnum,
    val validade: LocalDate,
    val codigoBarra: Int,
    val valor: BigDecimal = BigDecimal.ZERO.setScale(2)
)
