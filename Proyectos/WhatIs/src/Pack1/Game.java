package Pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Game extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {
		setResizable(false);
		setTitle("Juego");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JButton btnPausar = new JButton("Pausar");
		btnPausar.setBounds(745, 11, 89, 30);
		btnPausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pausa pa=new Pausa();
				pa.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnPausar);
		
		JPanel panelTV = new JPanel();
		panelTV.setBounds(63, 52, 712, 454);
		contentPane.add(panelTV);
		panelTV.setLayout(null);
		
		JLabel lblTv = new JLabel("");
		lblTv.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv_silueta.png")));
		lblTv.setHorizontalAlignment(SwingConstants.CENTER);
		lblTv.setBounds(0, 11, 712, 300);
		panelTV.add(lblTv);
		lblTv.setVisible(true);
		
		JButton btnLapizBad = new JButton("Lapiz");
		btnLapizBad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Incorrecto\nIntenta otra vez", "Respuesta Incorrecta",JOptionPane.WARNING_MESSAGE);
			}
		});
		btnLapizBad.setBounds(41, 355, 140, 45);
		panelTV.add(btnLapizBad);
		
		JButton btnRadioBad = new JButton("Radio");
		btnRadioBad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Incorrecto\nIntenta otra vez", "Respuesta Incorrecta",JOptionPane.WARNING_MESSAGE);
			}
		});
		btnRadioBad.setBounds(200, 355, 140, 45);
		panelTV.add(btnRadioBad);
		
		JButton btnMouseBad = new JButton("Mouse");
		btnMouseBad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Incorrecto\nIntenta otra vez", "Respuesta Incorrecta",JOptionPane.WARNING_MESSAGE);
			}
		});
		btnMouseBad.setBounds(512, 355, 140, 45);
		panelTV.add(btnMouseBad);
		
		JButton btnTv = new JButton("TV");
		btnTv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTv.setIcon(new ImageIcon(Game.class.getResource("/Imagenes/tv.png")));
				JOptionPane.showMessageDialog(null, "Correcto!\nEfectivamente la respuesta es TV", "Respuesta Correcta",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnTv.setBounds(358, 355, 140, 45);
		panelTV.add(btnTv);
	}
}
