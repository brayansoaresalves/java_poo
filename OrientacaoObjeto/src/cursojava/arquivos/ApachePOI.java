package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ApachePOI {

    public static void main(String[] args) throws IOException {
        
        File file = new File("C:\\Users\\guilhermem\\Documents\\arquivo_excel.xls");

        if (!file.exists()){
            file.createNewFile();
        }

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
        
        HSSFWorkbook escrevePlanilha = new HSSFWorkbook();
        HSSFSheet linhaPessoa = escrevePlanilha.createSheet("Planilhas de Pessoas Jdev Treinamentos");
        
        int numeroLinha = 0;
        for (Pessoa p: pessoas) {
        	
        	Row linha = linhaPessoa.createRow(numeroLinha ++); /*Criando linha na planilha*/
        	
        	int celula = 0;
        	
        	Cell celNome = linha.createCell(celula ++);
        	celNome.setCellValue(p.getNome());
        	
        	Cell celEmail = linha.createCell(celula++);
        	celEmail.setCellValue(p.getEmail());
        	
        	Cell celIdade = linha.createCell(celula++);
        	celIdade.setCellValue(p.getIdade());
        	
        	
        }
        
        FileOutputStream saida = new FileOutputStream(file);
        escrevePlanilha.write(saida); /*Escreve a planilha em arquivo*/
        
        saida.flush();
        saida.close();
        
        System.out.println("Planilha foi criada");
        

        
    }
    
}

