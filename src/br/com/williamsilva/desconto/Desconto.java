package br.com.williamsilva.desconto;

import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    private BigDecimal calcular(Orcamento orcamento) {
        if (deveCalcular(orcamento)) {
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveCalcular(Orcamento orcamento);
}
