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

public class Pausa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pausa frame = new Pausa();
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
	public Pausa() {
		setResizable(false);
		setTitle("Pausa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblPausa = new JLabel("Pausa");
		lblPausa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPausa.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblPausa.setBounds(65, 11, 312, 62);
		contentPane.add(lblPausa);
		
		JButton btnContinuarElJuego = new JButton("Continuar el juego");
		btnContinuarElJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnContinuarElJuego.setBounds(139, 94, 162, 29);
		contentPane.add(btnContinuarElJuego);
		
		JButton btnRegresarAlMenu = new JButton("Regresar al menu");
		btnRegresarAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Game g=new Game();
				g.dispose();
				Principal p=new Principal();
				p.setVisible(true);
			}
		});
		btnRegresarAlMenu.setBounds(139, 193, 162, 29);
		contentPane.add(btnRegresarAlMenu);
		
		JButton btnReiniciarPartida = new JButton("Reiniciar partida");
		btnReiniciarPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game g=new Game();
				
				dispose();
			}
		});
		btnReiniciarPartida.setBounds(139, 145, 162, 29);
		contentPane.add(btnReiniciarPartida);
	}

}
