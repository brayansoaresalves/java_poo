package curso.java;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import curso.java.thread.ImplementacaoFilaThread;
import curso.java.thread.ObjetoFilaThread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaThreadTime extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());/*Painel de Componentes*/
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jbutton = new JButton("Add Lista");
	private JButton jbutton2 = new JButton("Stop");
	
    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	public TelaThreadTime() {
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluida*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();/*Controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		jbutton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jbutton, gridBagConstraints);
		
		jbutton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jbutton2, gridBagConstraints);
		
		jbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

                if (fila == null){
                    fila = new ImplementacaoFilaThread();
                    fila.start();
                }

                for (int qtd = 0; qtd < 10; qtd++) { /* Simulando 100 envios em massa */

                    ObjetoFilaThread filaThread = new ObjetoFilaThread();
                    filaThread.setNome(mostraTempo.getText());
                    filaThread.setEmail(mostraTempo2.getText() + " - " + qtd);

                    fila.add(filaThread);
            
                }
				
			}
		});
		
		jbutton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fila.stop();
                fila = null;

			}

            
		});
		
        fila.start();
		add(jPanel, BorderLayout.WEST);
		setVisible(true);/*O ultimo a ser executado -> torna a tela visivel para o usuario*/
	}

    
}
