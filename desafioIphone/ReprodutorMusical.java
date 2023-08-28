package desafioIphone;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {

    private boolean isPlaying;
    private String currentMedia;
    private List<String> playlist;

    //Construtor
    public ReprodutorMusical(){
        playlist = new ArrayList<>();
        adicionarMusica("One|U2"); // Adicione o nome real da primeira música
        adicionarMusica("Hey Jude|The Beatles"); 
    }
    // Metodo tocar
    public void tocar(){
        if (!isPlaying && currentMedia != null) {
            isPlaying = true;
            System.out.println("Tocando: " + currentMedia);
        } else {
            System.out.println("Nenhuma musica selecionada ou ja esta tocando");
        }
    }
    // Metodo pausar
    public void pausar(){
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Pausado: " + currentMedia);
        } else {
            System.out.println("O reprodutor nao esta tocando.");
        }
    }
    //
    public void selecionarMusica(String musica){
        if (playlist.contains(musica)) {
            currentMedia = musica;
            System.out.println("Musica selecionada; " + musica);
        } else {
            System.out.println("Musica nao encontrada na playlist.");
        }
    }
    //
    public void adicionarMusica(String musica) {
        playlist.add(musica);
        System.out.println("Música adicionada à playlist: " + musica);
    }

}
