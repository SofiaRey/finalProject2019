package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pantallaRegistro = new JPanel();
		pantallaRegistro.setBounds(5, 5, 424, 251);
		contentPane.add(pantallaRegistro);
		pantallaRegistro.setLayout(null);
		
		JLabel lblDarDeAlta = new JLabel("Dar de alta Usuario");
		lblDarDeAlta.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblDarDeAlta.setBounds(118, 24, 178, 14);
		pantallaRegistro.add(lblDarDeAlta);
		
		JLabel lblUsuario_1 = new JLabel("Usuario");
		lblUsuario_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblUsuario_1.setBounds(47, 71, 53, 14);
		pantallaRegistro.add(lblUsuario_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 71, 72, 17);
		pantallaRegistro.add(comboBox);
		
		JLabel label_1 = new JLabel("Usuario");
		label_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_1.setBounds(47, 96, 53, 14);
		pantallaRegistro.add(label_1);
		
		JLabel label_2 = new JLabel("Usuario");
		label_2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_2.setBounds(47, 121, 53, 14);
		pantallaRegistro.add(label_2);
		
		JLabel label_3 = new JLabel("Usuario");
		label_3.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_3.setBounds(47, 146, 53, 14);
		pantallaRegistro.add(label_3);
		
		JLabel label_4 = new JLabel("Usuario");
		label_4.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_4.setBounds(47, 170, 53, 14);
		pantallaRegistro.add(label_4);
		
		JPanel pantallaIngreso = new JPanel();
		pantallaIngreso.setBounds(5, 5, 424, 251);
		contentPane.add(pantallaIngreso);
		pantallaIngreso.setLayout(null);
		
		JLabel lblIngresar = new JLabel("Ingresar");
		lblIngresar.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 30));
		lblIngresar.setBounds(147, 11, 119, 46);
		pantallaIngreso.add(lblIngresar);
		
		txtUsuario = new JTextField();
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsuario.setToolTipText("Usuario");
		txtUsuario.setBounds(25, 83, 262, 20);
		pantallaIngreso.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNoTenesUsuario = new JLabel("No tenes usuario?");
		lblNoTenesUsuario.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblNoTenesUsuario.setBounds(25, 161, 119, 14);
		pantallaIngreso.add(lblNoTenesUsuario);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		btnCrear.setBounds(146, 159, 72, 20);
		pantallaIngreso.add(btnCrear);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(UIManager.getColor("List.selectionBackground"));
		btnAceptar.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		btnAceptar.setBounds(156, 217, 95, 23);
		pantallaIngreso.add(btnAceptar);
		
		JLabel lblUsuario = new JLabel("Contrase\u00F1a");
		lblUsuario.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblUsuario.setBounds(25, 110, 108, 14);
		pantallaIngreso.add(lblUsuario);
		
		textField = new JTextField();
		textField.setToolTipText("Usuario");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(25, 126, 262, 20);
		pantallaIngreso.add(textField);
		
		JLabel label = new JLabel("Usuario");
		label.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		label.setBounds(25, 65, 65, 14);
		pantallaIngreso.add(label);
	}
}
