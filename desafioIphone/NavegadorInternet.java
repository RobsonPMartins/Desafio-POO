package desafioIphone;

public class NavegadorInternet {
    private String currentURL;
    private int numberOfTabs;

    // Get
    public String getCurrentURL() {
        return currentURL;
    }
    // Get
    public int getNumberOfTabs() {
        return numberOfTabs;
    }

    public NavegadorInternet() {
        currentURL =  "https://www.dio.me";
        numberOfTabs = 1;
    }
    // Metodo exibirPagina
    public void exibirPagina() {
        System.out.println("Exibindo página: " + currentURL);
    }
    // Metodo adicionarNovaAba
    public void adicionarNovaAba() {
        numberOfTabs++;
        System.out.println("Nova aba aberta. Total de abas: " + numberOfTabs);
    }
    
    public void atualizarPagina() {
        System.out.println("Página atualizada: " + currentURL);
    }
}
