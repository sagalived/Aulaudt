package aula1;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class SomarNumeros extends JFrame {
    
    JPanel contentPane;
    int valor1, valor2,valor3,valor4, mediaNota;
    
    public static void main(String[] args) {
        SomarNumeros s = new SomarNumeros();
        s.setVisible(true);
    }
    
    public SomarNumeros(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,500,400);
        setTitle("Calculando a média das Notas");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblTitulo = new JLabel("Digiti as médias das notas");
        lblTitulo.setBounds(0,0,500,32);
        Font font = new Font("Arial", 26,26);
        lblTitulo.setFont(font);
        contentPane.add(lblTitulo);
        
        JLabel lblValor1 = new JLabel("AV 1: ");
        lblValor1.setBounds(0, 35, 100, 32);
        contentPane.add(lblValor1);
        
        JTextField txtValor1 = new JTextField();
        txtValor1.setBounds(101, 35, 150, 32);
        contentPane.add(txtValor1);
        
        JLabel lblValor2 = new JLabel("AV 2: ");
        lblValor2.setBounds(0, 70, 100, 32);
        contentPane.add(lblValor2);
        
        JTextField txtValor2 = new JTextField();
        txtValor2.setBounds(101, 70, 150, 32);
        contentPane.add(txtValor2);
        
        JLabel lblValor3 = new JLabel("AV 3: ");
        lblValor3.setBounds(0, 110, 100, 32);
        contentPane.add(lblValor3);
        
        JTextField txtValor3 = new JTextField();
        txtValor3.setBounds(100, 110, 150, 32);
        contentPane.add(txtValor3);
        
        JButton btnCalcular = new JButton("    Fazer a Soma da Média   ");
        btnCalcular.setBounds(10, 200, 250, 32);
        contentPane.add(btnCalcular);
        
        JLabel lblResultado = new JLabel();
        lblResultado.setBounds(0, 250 ,450,32);
        lblResultado.setFont(font);
        contentPane.add(lblResultado);
        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Integer.parseInt(txtValor1.getText());
                valor2 = Integer.parseInt(txtValor2.getText());
                valor3 = Integer.parseInt(txtValor3.getText());
               
                
                mediaNota = (valor1 + valor2 + valor3)/ 3;
                
                if(mediaNota > 60)
              
                lblResultado.setText("Aluno Aprovado com : " + mediaNota);
                else if(mediaNota < 59){
                	
                	lblResultado.setText("aluno Reprovado abaixo da Média : " + mediaNota);
                	
                }
            }
        });
    }
    
}
