package aula1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExibirNome extends JFrame{

	public static void main(String [] args) {
		ExibirNome e = new ExibirNome();
		
	}
	public ExibirNome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(500, 250, 500, 400);
		setTitle("Nome e Sobrenome e sua idade e sexo");
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Qual o seu nome?");
		lblNome.setBounds(10, 25, 104, 16);
		contentPane.add(lblNome);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(10, 50, 116, 22);
		contentPane.add(txtNome);

		JLabel lblSobreNome = new JLabel("Qual o seu Sobrenome?");
		lblSobreNome.setBounds(10, 75, 104, 16);
		contentPane.add(lblSobreNome);
		
		JTextField txtSobreNome = new JTextField();
		txtSobreNome.setBounds(10, 100, 116, 22);
		contentPane.add(txtSobreNome);
					
		JLabel lblIdade = new JLabel("Qual o sua Idade?");
		lblIdade.setBounds(10, 125, 150, 16);
		contentPane.add(lblIdade);
		
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(10, 150, 150, 22);
		contentPane.add(txtIdade);
		
		JLabel lblSexo = new JLabel("Qual o seu Sexo?");
		lblSexo.setBounds(10, 175, 150, 16);
		contentPane.add(lblSexo);
		
		JTextField txtSexo = new JTextField();
		txtSexo.setBounds(10, 200, 150, 22);
		contentPane.add(txtSexo);
	
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(10, 250, 200, 25);
		contentPane.add(btnExibir);
		
		btnExibir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"meu Nome completo é " + txtNome.getText() + " " + txtSobreNome.getText());
				JOptionPane.showMessageDialog(null,"Minha idade é " + txtIdade.getText());
				JOptionPane.showMessageDialog(null,"Meu sexo é " + txtSexo.getText());
			}
		});
}
}	
	 


