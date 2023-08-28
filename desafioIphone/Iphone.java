package desafioIphone;
// Nosso desafio POO - Referente ao iphone e algumas funcionalidades
// Criado por Robson Pereira Martins de acordo com o que aprendi nos 
// conceitos basicos de POO
public class Iphone {

    public static void main(String[] args) {

        // Instanciando as classes
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        // Simulando Interações
        System.out.println("Nosso reprodutor de musica abaixo:");
        System.out.println("");
        reprodutor.selecionarMusica("One|U2");
        reprodutor.selecionarMusica("Hey Jude|The Beatles");
        System.out.println("");
        // Selecionando e tocando uma música
        reprodutor.selecionarMusica("Hey Jude|The Beatles");
        reprodutor.tocar();
        System.out.println("");
        // Pausando a reprodução
        reprodutor.pausar();
        System.out.println("");
        // Selecionando e tocando outra música
        reprodutor.selecionarMusica("One|U2");
        reprodutor.tocar();
        System.out.println("");

        // Funções basicas de um telefone
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("");

        // Exemplo de navegador que direciona para a Dio
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        System.out.println("");

    }
    
}
