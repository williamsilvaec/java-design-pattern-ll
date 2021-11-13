package br.com.williamsilva.imposto;

import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);
}
