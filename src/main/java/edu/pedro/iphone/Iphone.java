package edu.pedro.iphone;

import edu.pedro.apps.AparelhoTelefonico;
import edu.pedro.apps.NavegadorInternet;
import edu.pedro.apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {

        // Ligado o aparelho
        ligar();

        System.out.println("Bem vindo. \n");

        System.out.println("Abriu o aparelho telefonico");
        // Utilizando o app aparelho telefonico:
        AparelhoTelefonico aparelhoTelefonico = new Iphone();
        aparelhoTelefonico.ligarPara("Pedro");
        aparelhoTelefonico.iniciarCorreioVoz("André");
        aparelhoTelefonico.atender();

        System.out.println();

        System.out.println("Abriu o navegador");
        // Utilizando o navegador:
        NavegadorInternet navegadorInternet = new Iphone();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

        System.out.println();

        System.out.println("Abriu o reprodutor musical");
        // Utilizando o reprodutor musical:
        ReprodutorMusical reprodutorMusical = new Iphone();
        reprodutorMusical.selecionarMusica("Neon");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        System.out.println();

        desligar();
    }


    /**
     * Métodos do iphone:
     */
    private static void ligar(){
        System.out.println("Ligando.");
    }

    private static void desligar(){
        System.out.println("Desligando.");
    }

    private static void reiniciar(){
        System.out.println("reiniciando.");
    }

    /**
     * Métodos override do aparelho telefonico:
     */
    @Override
    public void ligarPara(String nome) {
        System.out.println("Ligando para " + nome);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz(String nome) {
        System.out.println("Iniciando correio de voz com " + nome);
    }

    /**
     * Métodos override do navegador de internet:
     */
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    /**
     * Métodos override do reprosutor musical:
     */
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada.");
    }
}
