package br.com.williamsilva;

import br.com.williamsilva.imposto.CalculadoraDeImposto;
import br.com.williamsilva.imposto.ICMS;
import br.com.williamsilva.imposto.ISS;
import br.com.williamsilva.imposto.Imposto;
import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        /*Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        BigDecimal valorImposto = calculadora.calcular(orcamento, TipoImposto.ICMS);
        System.out.println(valorImposto);*/

        // Com padrão strategy
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        System.out.println("Situação: " + orcamento.getSituacao().toString());
        orcamento.aplicarDescontoExtra();
        System.out.println("Valor com desconto: " + orcamento.getValor());
        orcamento.aprovar();
        System.out.println("Situação: " + orcamento.getSituacao());
        orcamento.aplicarDescontoExtra();
        System.out.println("Valor com desconto: " + orcamento.getValor());
        orcamento.finalizar();
        System.out.println("Situação: " + orcamento.getSituacao());
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        BigDecimal valorImpostoIcms = calculadora.calcular(orcamento, icms);
        BigDecimal valorImpostoIss = calculadora.calcular(orcamento, iss);
        System.out.println(valorImpostoIcms);
        System.out.println(valorImpostoIss);
    }
}
