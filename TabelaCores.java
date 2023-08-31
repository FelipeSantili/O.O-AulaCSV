import java.io.BufferedWriter;
import java.io.FileWriter;

public class TabelaCores {
    public static void main(String[] args) throws Exception {
        /*Tabela de cores no CSS */
        String nomeArqSaida = "tabelacores.html";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));   

        /*Inserção da base HTML */
        String inicioHtml = "<!DOCTYPE html>\n"+
        "<head>\n" +
        "<title>Tabela de Cores</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "<p>&nbsp;</p>\n" + 
       "<h2 align='center'>Tabela de Cores HTML</h2>\n" +
       "<table width='400' align='center' border='1'>\n" +
       "<tr>\n" +
       "<th width='200' align='center'>Cor</th>\n" +
       "<th width='200' align='center'>Código Hexadecimal</th>\n" +
       "</tr>\n";
        arqGravacao.write(inicioHtml);
        
        for (int i =0; i < 16; i++) {
            String body = "<tr>"+
            "<td bgcolor='#0000"+Integer.toHexString(i)+"0'></td>"+
            "<td align='center'>#0000"+Integer.toHexString(i)+"0</td>"+
         "</tr>";
         arqGravacao.write(body);
         arqGravacao.newLine();
                for (int i2 =0; i2 < 16; i2++) {
                    body = "<tr>"+
                    "<td bgcolor='#00"+Integer.toHexString(i)+"000'></td>"+
                    "<td align='center'>#00"+ Integer.toHexString(i) +"000</td>"+
                "</tr>";
                arqGravacao.write(body);
                arqGravacao.newLine();
                        for (int i3 =0; i3 < 16; i3++) {
                            body = "<tr>"+
                            "<td bgcolor='#"+ Integer.toHexString(i) +"0000'></td>"+
                            "<td align='center'>#"+ Integer.toHexString(i) +"0000"+Integer.toHexString(i)+"0</td>"+
                        "</tr>";
                        arqGravacao.write(body);
                        arqGravacao.newLine();
        }
        }}
        

        /*Inserção do final HTML */
        String finalHtml = "</table>\n" +
        "</body>\n" +
        "</html>";
        arqGravacao.write(finalHtml);
        arqGravacao.close();
    }    
}
