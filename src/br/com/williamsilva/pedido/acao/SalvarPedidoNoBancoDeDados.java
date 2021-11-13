package br.com.williamsilva.pedido.acao;

import br.com.williamsilva.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executaAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
