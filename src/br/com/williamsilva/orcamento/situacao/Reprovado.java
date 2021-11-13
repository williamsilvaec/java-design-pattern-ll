package br.com.williamsilva.orcamento.situacao;

import br.com.williamsilva.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

    @Override
    public String toString() {
        return "Reprovado";
    }
}
