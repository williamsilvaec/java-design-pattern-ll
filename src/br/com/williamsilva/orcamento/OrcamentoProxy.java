package br.com.williamsilva.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {

    private final Orcamento orcamento;
    private BigDecimal valor;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            this.valor = this.orcamento.getValor();
        }

        return this.valor;
    }
}
