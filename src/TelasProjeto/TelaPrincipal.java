package TelasProjeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Principal");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(30, 28, 128, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVendas.setBounds(383, 128, 135, 40);
		contentPane.add(btnVendas);
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setFont(new Font("Arial", Font.PLAIN, 15));
		btnProdutos.setBounds(206, 128, 135, 40);
		contentPane.add(btnProdutos);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Arial", Font.PLAIN, 15));
		btnClientes.setBounds(30, 128, 135, 40);
		contentPane.add(btnClientes);
	}

}
