package com.conversor.ui;

public class MenuConsole {
    public void exibir() {
        System.out.println("\nBem vindo/a ao conversor de Moedas \n");
        System.out.println("""
                1) Dolar ==> Real           7) Iene ==> Real
                2) Real ==> Dolar           8) Real ==> Iene
                3) Euro ==> Real            9) Euro ==> Yuan
                4) Real ==> Euro            10) Yuan ==> Euro
                5) Yuan ==> Dolar           11) Dong ==> Won sul-coreano
                6) Dolar ==> Yuan           12) Won sul-coreano ==> Dong

                0) Sair
                """);
        System.out.println("Escolha uma opção válida:");
    }
}
