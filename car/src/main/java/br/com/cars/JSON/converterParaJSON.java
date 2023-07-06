package br.com.cars.JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class converterParaJSON{

    public static void main(String[] args) {
        String arquivoTexto = "car/src/main/resources/Marcas de Carros.txt";
        String arquivoJSON = "Marcas.json";

        String conteudo = lerArquivoTexto(arquivoTexto);
        List<Map<String, String>> dados = converterParaEstruturaDeDados(conteudo);
        String jsonConteudo = converterParaJSON(dados);
        salvarArquivoJSON(arquivoJSON, jsonConteudo);

    }

    private static String lerArquivoTexto(String arquivoTexto) {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoTexto))){
            String linha;
            while ((linha = br.readLine()) != null){
                conteudo.append(linha);
            }
            }catch (IOException e) {
                e.printStackTrace();
        }
        return conteudo.toString();
    }

    private static List<Map<String, String>> converterParaEstruturaDeDados(String conteudo){
        List<Map<String, String>> dados = new ArrayList<>();

        String[] linhas = conteudo.split("\n");
        for (String linha : linhas){
            String[] valores = linha.split(",");

            Map<String, String> registro = new HashMap<>();
            for (int i = 0; i <= 46; i++) {
            if (i < valores.length) {
                registro.put(""+i, valores[i].trim());
            } else {
                registro.put(null, "");
            }
        }
            dados.add(registro);
        }
        return dados;
    }

    private static String converterParaJSON(List<Map<String, String>> dados) {
        JSONArray jsonArray = new JSONArray();

        for (Map<String, String> registro : dados) {
            JSONObject jsonObject = new JSONObject(registro);
            jsonArray.put(jsonObject);
        }

        return jsonArray.toString();
    }

    private static void salvarArquivoJSON(String arquivoJSON, String jsonConteudo) {
        try (FileWriter fileWriter = new FileWriter(arquivoJSON)) {
            fileWriter.write(jsonConteudo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}