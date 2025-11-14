package com.conversor.main;

import com.conversor.model.ParDeMoedas;
import com.conversor.model.TaxaDeCambioDTO;
import com.conversor.service.ApiResponseParser;
import com.conversor.service.ExchangeRateApiClient;
import com.conversor.service.GerenciadorDeConversoes;
import com.conversor.ui.MenuConsole;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExchangeRateApiClient exchangeRateApiClient = new ExchangeRateApiClient();
        ApiResponseParser apiResponseParser = new ApiResponseParser();
        GerenciadorDeConversoes gerenciadorDeConversoes = new GerenciadorDeConversoes();
        MenuConsole menuConsole = new MenuConsole();

        int opcao = -1;

        do {
            int valor = 0;

            // Mensagem do Menu
            menuConsole.exibir();

            try {
            // Salvando a opção selecionada
            opcao = sc.nextInt();

            // Analisa se a opção é válida
            if (opcao < 1 || opcao > 12) continue;

            System.out.println("Digite o valor que deseja converter:");
            valor = sc.nextInt();

            // Analisar a opção selecionada e retornar a moeda de origem e de destino
            ParDeMoedas parDeMoedas = gerenciadorDeConversoes.obterMoedasPorOpcao(opcao);

            // Chamar API e retorna o json
            String json = exchangeRateApiClient.buscarTaxaDeCambio(parDeMoedas.origem(), parDeMoedas.destino());

            // Converte o json para um objeto do tipo TaxaDeCambioDTO
            TaxaDeCambioDTO taxaDeCambioDTO = apiResponseParser.parse(json);

            // Calcula o valor convertido
            double valorConvertido = taxaDeCambioDTO.taxaDeConversao() * valor;

            // Imprime a mensagem com o valor convertido
            System.out.println(parDeMoedas.origem() + " " + valor +
                    " corresponde a " + parDeMoedas.destino() + " " + valorConvertido + " \n");

            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido");
                sc.nextLine();
            }
        } while (opcao != 0);


        sc.close();
    }
}