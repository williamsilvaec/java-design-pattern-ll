package br.com.williamsilva;

import br.com.williamsilva.http.JavaHttpClient;
import br.com.williamsilva.orcamento.ItemOrcamento;
import br.com.williamsilva.orcamento.Orcamento;
import br.com.williamsilva.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapters {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);

    }
}
