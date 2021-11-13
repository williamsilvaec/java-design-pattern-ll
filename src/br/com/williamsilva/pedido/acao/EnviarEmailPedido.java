package br.com.williamsilva.pedido.acao;

import br.com.williamsilva.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executaAcao(Pedido pedido) {
        System.out.println("Enviando e-mail do pedido!");
    }
}
