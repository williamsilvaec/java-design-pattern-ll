package br.com.williamsilva;

import br.com.williamsilva.pedido.GeraPedido;
import br.com.williamsilva.pedido.GeraPedidoHandler;
import br.com.williamsilva.pedido.acao.EnviarEmailPedido;
import br.com.williamsilva.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "João da Silva";
        BigDecimal valorOrcamento = new BigDecimal("2000");
        int quantidadeItens = Integer.parseInt("4");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
        EnviarEmailPedido enviarEmail = new EnviarEmailPedido();
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(salvar, enviarEmail));
        handler.executa(gerador);
    }
}
