import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExEscritaArquivo {
    public static void main(String[] args) throws IOException {
        
        String nomeArqSaida = "arqSaida.csv";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));

        String linha = "Produto;Preço;Estoque\n";
        arqGravacao.write(linha);
        arqGravacao.newLine();

        String nomeProduto = "Mouse";
        String preco = "123,34";
        String estoque = "55";
        linha = nomeProduto + ";" + preco + ";" + estoque + "\n";
        arqGravacao.write(linha);
        arqGravacao.newLine();
        
        nomeProduto = "Notebook";
        preco = "3123,34";
        estoque = "5";
        linha = nomeProduto + ";" + preco + ";" + estoque + "\n";
        arqGravacao.write(linha);
        
        arqGravacao.close();
    }
}
