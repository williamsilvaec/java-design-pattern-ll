package br.com.williamsilva.desconto;

import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto())
        );

        return cadeiaDeDescontos.efetuarCalculo(orcamento);
    }
}
