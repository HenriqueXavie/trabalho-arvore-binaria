import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciadorArvore {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        String arquivoEntrada = "C:\\Projetos\\trabalho-arvore-binaria\\src\\arquivosTeste\\arquivo_de_entrada_dois.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoEntrada))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.equals("FIM")) {
                    break;
                }
                processarComando(arvore, linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processarComando(ArvoreBinaria arvore, String comando) {
        String[] partes = comando.split(" ");
        String acao = partes[0];
        switch (acao) {
            case "INCLUIR":
                int valorIncluir = Integer.parseInt(partes[1]);
                arvore.incluir(valorIncluir);
                break;
            case "EXCLUIR":
                int valorExcluir = Integer.parseInt(partes[1]);
                arvore.excluir(valorExcluir);
                break;
            case "IMPRIME":
                String tipoImpressao = partes[1];
                if (tipoImpressao.equals("PREORDEM")) {
                    arvore.listarPreOrdem();
                } else if (tipoImpressao.equals("EMORDEM")) {
                    arvore.listarInOrdem();
                } else if (tipoImpressao.equals("POSORDEM")) {
                    arvore.listarPosOrdem();
                }
                break;
            case "BUSCA":
                int valorBuscar = Integer.parseInt(partes[1]);
                boolean encontrado = arvore.buscar(valorBuscar);
                if (encontrado) {
                    System.out.println("\nElemento " + valorBuscar + " encontrado");
                } else {
                    System.out.println("\nElemento " + valorBuscar + " não encontrado");
                }
                break;
            default:
                System.out.println("\nComando inválido: " + comando);
                break;
        }
    }
}
