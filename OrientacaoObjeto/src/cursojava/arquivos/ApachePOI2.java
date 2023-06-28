package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ApachePOI2 {

    public static void main(String[] args) throws IOException {
        
        FileInputStream entrada = new FileInputStream(new File("C:\\Users\\guilhermem\\Documents\\arquivo_excel.xls"));
        
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
        HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /*Pega a primeira planilha do nosso arquivo excel*/
        
        Iterator<Row> linhaInterator = planilha.iterator();
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        while(linhaInterator.hasNext()) {
        	Row linha = linhaInterator.next(); /*dados da pessoa na linha*/
        	Iterator<Cell> celulas = linha.iterator();
        	
        	Pessoa pessoa = new Pessoa();
        	
        	while (celulas.hasNext()) {
        		Cell cell = celulas.next();
        		
        		switch (cell.getColumnIndex()) {
        		case 0 : 
        			pessoa.setNome(cell.getStringCellValue());
        			break;
        		case 1 :
        			pessoa.setEmail(cell.getStringCellValue());
        			break;
        		case 2: 
        			pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
        			break;
        		}
        	}
        	pessoas.add(pessoa);
        }
        
        entrada.close();
        
        for (Pessoa p : pessoas) {
        	System.out.println(p);
        }
        
        

        
    }
    
}

