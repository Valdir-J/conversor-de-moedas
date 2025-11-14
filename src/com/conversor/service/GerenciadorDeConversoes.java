package com.conversor.service;

import com.conversor.model.ParDeMoedas;

public class GerenciadorDeConversoes {
    public ParDeMoedas obterMoedasPorOpcao(int opcao) {

        return switch (opcao) {
            case 1 -> new ParDeMoedas("USD", "BRL");
            case 2 -> new ParDeMoedas("BRL", "USD");
            case 3 -> new ParDeMoedas("EUR", "BRL");
            case 4 -> new ParDeMoedas("BRL", "EUR");
            case 5 -> new ParDeMoedas("CNY", "USD");
            case 6 -> new ParDeMoedas("USD", "CNY");
            case 7 -> new ParDeMoedas("JPY", "BRL");
            case 8 -> new ParDeMoedas("BRL", "JPY");
            case 9 -> new ParDeMoedas("EUR", "CNY");
            case 10 -> new ParDeMoedas("CNY", "EUR");
            case 11 -> new ParDeMoedas("VND", "KRW");
            case 12 -> new ParDeMoedas("KRW", "VND");
            default -> null;
        };
    }
}
