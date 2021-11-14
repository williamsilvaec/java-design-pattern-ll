package br.com.williamsilva;

import br.com.williamsilva.imposto.CalculadoraDeImposto;
import br.com.williamsilva.imposto.ICMS;
import br.com.williamsilva.imposto.ISS;
import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        BigDecimal valorImposto = calculadoraDeImposto.calcular(orcamento, new ICMS(new ISS(null)));

        System.out.println(valorImposto);
    }
}
