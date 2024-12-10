import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuscaMoeda {
        private static final String API_KEY = "63f1a6019494d5d430b77a";
        private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

        public static double obterTaxa(String moedaOrigem, String moedaDestino) {
                try {
                        URL url = new URL(BASE_URL + moedaOrigem);
                        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                        connection.setRequestMethod("GET");

                        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
                        JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

                        if (jsonObject.get("result").getAsString().equals("success")) {
                                JsonObject taxas = jsonObject.getAsJsonObject("conversion_rates");
                                return taxas.get(moedaDestino).getAsDouble();
                        } else {
                                throw new RuntimeException("Erro ao buscar taxas de conversão.");
                        }
                } catch (Exception e) {
                        throw new RuntimeException("Erro na comunicação com a API: " + e.getMessage());
                }
        }
}
