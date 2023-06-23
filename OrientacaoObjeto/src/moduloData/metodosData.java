package moduloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class metodosData {
    
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimento = simpleDateFormat.parse("30/04/2023");
        Date dataAtualHoje = simpleDateFormat.parse("23/06/2023");

        if (dataVencimento.after(dataAtualHoje)){
            JOptionPane.showMessageDialog(null, "O boleto não está vencido!");
        }else {
            JOptionPane.showMessageDialog(null, "O boleto está vencido.");
        }
        
    }
}
