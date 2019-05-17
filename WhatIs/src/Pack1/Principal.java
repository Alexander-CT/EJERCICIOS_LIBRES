package Pack1;

import java.awt.BorderLayout;
import Tipografias.Fuentes;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;

	/** 
	 * @author
	 * CASTRO TOCAFFONDI Alexander Piero
	 * PARRILLO Piero
	 * ARUATA Juan
	 * VILLACORTA
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	Fuentes tipoFuente;
	public Principal() {
		setResizable(false);
		setTitle("What Is");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		tipoFuente = new Fuentes();
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnJugar.setBounds(221, 213, 400, 65);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Game g=new Game();
				g.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnJugar);
		
		JLabel lblNombre = new JLabel("What Is");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(tipoFuente.Fuentes(tipoFuente.CS,0,100));
		lblNombre.setBounds(221, 38, 400, 143);
		contentPane.add(lblNombre);
		
		JButton btnInstrucciones = new JButton("Como jugar");
		btnInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Instrucciones i=new Instrucciones();
				i.setVisible(true);
			}
		});
		btnInstrucciones.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnInstrucciones.setBounds(221, 306, 400, 65);
		contentPane.add(btnInstrucciones);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Salir.setBounds(221, 402, 400, 65);
		contentPane.add(Salir);
	}
}
