package cursojava.arquivos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arquivos {
    
    public static void main(String[] args) throws IOException {

        Pessoa pessoa = new Pessoa();
        pessoa.setEmail("pessoa1@gmail.com");
        pessoa.setNome("brayan alves");
        pessoa.setIdade(27);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setEmail("pessoa2@gmail.com");
        pessoa2.setNome("brenda alves");
        pessoa2.setIdade(26);
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setEmail("mariajesus@gmail.com");
        pessoa3.setNome("maria jesus");
        pessoa3.setIdade(63);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.addAll(Arrays.asList(pessoa, pessoa2, pessoa3));



        File arquivo = new File("C:\\Users\\guilhermem\\Documents\\arquivo.txt");
        
        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        if (!arquivo.exists()){
            arquivo.createNewFile();
        }

        for (Pessoa p : pessoas){
            escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
        }

        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();
    }
}