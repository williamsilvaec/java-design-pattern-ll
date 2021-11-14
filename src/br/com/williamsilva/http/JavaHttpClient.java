package br.com.williamsilva.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApli = new URL(url);
            URLConnection connection = urlDaApli.openConnection();
            connection.connect();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao Http!");
        }
    }
}
