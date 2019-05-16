package Pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Instrucciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrucciones frame = new Instrucciones();
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
	public Instrucciones() {
		setResizable(false);
		setTitle("Instrucciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblIntrucciones = new JLabel("Instrucciones");
		lblIntrucciones.setBounds(62, 11, 312, 62);
		lblIntrucciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntrucciones.setFont(new Font("Tahoma", Font.PLAIN, 40));
		contentPane.add(lblIntrucciones);
		
		JLabel lblIntruccionesDescripcion = new JLabel("Juega");
		lblIntruccionesDescripcion.setBounds(112, 95, 202, 91);
		contentPane.add(lblIntruccionesDescripcion);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Principal p=new Principal();
				p.setVisible(true);
			}
		});
		btnVolver.setBounds(10, 227, 89, 23);
		contentPane.add(btnVolver);
	}
}
