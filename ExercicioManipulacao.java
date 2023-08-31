import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ExercicioManipulacao {

    public static void main(String[] args) throws Exception{
        String leituraArquivo = "preco_custo.csv";
        BufferedReader arqLeitura = new BufferedReader(
             new FileReader(leituraArquivo));
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String linha; 


        BufferedWriter arqComprar = new BufferedWriter(new FileWriter("comprar.csv"));
        
        System.out.println("Digite o nome do arquivo de entrada:");
        String nomeArqE = reader.readLine();
        System.out.println("Digite o nome do arquivo de saida:");
        String nomeArqS = reader.readLine();
        System.out.println("Qual a margem de lucro: ");
        Float margem = (Float.parseFloat(reader.readLine()));
        margem = margem/100;
    
        if(nomeArqE.equals("")){
            nomeArqE = "custo";
        }
        if(nomeArqS.equals("")){
            nomeArqS = "venda";
        }
        
        BufferedWriter prodGravacao = new BufferedWriter(new FileWriter(nomeArqS+".csv"));

        boolean primeiraLinha = true;
        boolean cab = true;
        while((linha = arqLeitura.readLine()) != null){
            String[] arrayValores=linha.split(";");
        
            if (primeiraLinha){
            primeiraLinha = false;
            prodGravacao.write("codigo"+";"+"nome"+";"+"preco_venda");
            prodGravacao.newLine();
            continue;
        } 
            int quantProd = Integer.parseInt(arrayValores[1]);
            String catProd = arrayValores[4];
            String codigoProd = arrayValores[0];
            String nomeProd = arrayValores[2];
            float preco = Float.parseFloat(arrayValores[3].replace(',', '.'));
            float precoFinal = preco + (margem * preco); 
               
            prodGravacao.write(codigoProd+";"+nomeProd+";"+precoFinal);
            prodGravacao.newLine();



            if(quantProd < 10){
                if(cab ==true){
                    cab = false;
                    arqComprar.write("codigo"+";"+"estoque"+";"+"nome"+";"+"preco_custo"+";"+"categoria");
                    arqComprar.newLine();
                }
            arqComprar.write(codigoProd+";"+quantProd+";"+nomeProd+";"+preco+";"+catProd);
            arqComprar.newLine();
            }

    }       
x
        
        arqLeitura.close();
        prodGravacao.close();
        arqComprar.close();
        }
    }



    