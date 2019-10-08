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
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnLibros = new JMenu("Libros");
		menuBar.add(mnLibros);
		
		
		
		JMenu mnAltaLibros = new JMenu("Alta libros");
		mnLibros.add(mnAltaLibros);
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenu mnEstudiante = new JMenu("Estudiante");
		mnUsuario.add(mnEstudiante);
		
		JMenu mnProfesor = new JMenu("Profesor");
		mnUsuario.add(mnProfesor);
		
		JMenu mnPréstamos = new JMenu("Pr\u00E9stamos");
		menuBar.add(mnPréstamos);
		
		
		JPanel pantallaRegistro = new JPanel();
		pantallaRegistro.setBounds(0, 0, 434, 261);
		contentPane.add(pantallaRegistro);
		pantallaRegistro.setLayout(null);
		
		JLabel lblUsuario_1 = new JLabel("Usuario");
		lblUsuario_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblUsuario_1.setBounds(47, 71, 53, 14);
		pantallaRegistro.add(lblUsuario_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 71, 72, 17);
		pantallaRegistro.add(comboBox);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblNombre.setBounds(47, 96, 53, 14);
		pantallaRegistro.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblApellido.setBounds(47, 121, 53, 14);
		pantallaRegistro.add(lblApellido);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblMail.setBounds(47, 146, 53, 14);
		pantallaRegistro.add(lblMail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblPassword.setBounds(47, 170, 72, 14);
		pantallaRegistro.add(lblPassword);
		
		JLabel lblOrientacion = new JLabel("TIC");
		lblOrientacion.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblOrientacion.setBounds(266, 98, 30, 13);
		pantallaRegistro.add(lblOrientacion);
		
		JLabel label_1 = new JLabel("Orientacion:");
		label_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_1.setBounds(237, 71, 81, 14);
		pantallaRegistro.add(label_1);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(299, 94, 30, 23);
		pantallaRegistro.add(radioButton);
		
		JLabel lblAdm = new JLabel("ADM");
		lblAdm.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdm.setBounds(263, 123, 30, 13);
		pantallaRegistro.add(lblAdm);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(299, 118, 30, 23);
		pantallaRegistro.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(299, 147, 30, 23);
		pantallaRegistro.add(radioButton_2);
		
		JLabel lblAdmYTic = new JLabel("ADM Y TIC");
		lblAdmYTic.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdmYTic.setBounds(235, 143, 61, 23);
		pantallaRegistro.add(lblAdmYTic);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 95, 72, 20);
		pantallaRegistro.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 120, 72, 20);
		pantallaRegistro.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 145, 72, 20);
		pantallaRegistro.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118, 169, 72, 20);
		pantallaRegistro.add(textField_4);
		
	
		JPanel pantallaIngreso = new JPanel();
		pantallaIngreso.setBounds(0, 20, 434, 234);
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
		
		JMenu mnConsultarPrestamos = new JMenu("Consultar pr\u00E9stamos");
		
		JPanel Bajarpréstamos = new JPanel();
		Bajarpréstamos.setBounds(0, 20, 434, 239);
		contentPane.add(Bajarpréstamos);
		Bajarpréstamos.setLayout(null);
		
		JLabel lblDarDeBaja = new JLabel("Dar de baja Pr\u00E9stamos");
		lblDarDeBaja.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblDarDeBaja.setBounds(111, 32, 192, 24);
		Bajarpréstamos.add(lblDarDeBaja);
		
		JLabel lblUsuario_2 = new JLabel("Usuario");
		lblUsuario_2.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblUsuario_2.setBounds(60, 97, 55, 14);
		Bajarpréstamos.add(lblUsuario_2);
		
		JLabel lblLibros = new JLabel("Libros");
		lblLibros.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblLibros.setBounds(60, 122, 55, 14);
		Bajarpréstamos.add(lblLibros);
		
		JLabel lblPréstamos = new JLabel("Pr\u00E9stamos");
		lblPréstamos.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblPréstamos.setBounds(60, 147, 66, 14);
		Bajarpréstamos.add(lblPréstamos);
		
		JPanel Listarlibros = new JPanel();
		Listarlibros.setBounds(0, 20, 434, 234);
		contentPane.add(Listarlibros);
		Listarlibros.setLayout(null);
		
		JLabel lblListarLibros = new JLabel("Listar libros");
		lblListarLibros.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblListarLibros.setBounds(152, 23, 119, 14);
		Listarlibros.add(lblListarLibros);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblNombre_1.setBounds(49, 67, 63, 14);
		Listarlibros.add(lblNombre_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(108, 66, 86, 20);
		Listarlibros.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblAutor.setBounds(49, 95, 63, 14);
		Listarlibros.add(lblAutor);
		
		JLabel lblEdicin = new JLabel("Edici\u00F3n");
		lblEdicin.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblEdicin.setBounds(49, 125, 63, 14);
		Listarlibros.add(lblEdicin);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblCantidad.setBounds(49, 160, 63, 14);
		Listarlibros.add(lblCantidad);
		
		JLabel lbldisponible = new JLabel("(disponible)");
		lbldisponible.setBounds(49, 175, 63, 14);
		Listarlibros.add(lbldisponible);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblCodigo.setBounds(49, 190, 63, 20);
		Listarlibros.add(lblCodigo);
		
		JButton btnAceptar_2 = new JButton("Aceptar");
		btnAceptar_2.setBounds(165, 217, 89, 23);
		Listarlibros.add(btnAceptar_2);
		
		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		btnAceptar_1.setBounds(172, 217, 89, 23);
		pantallaRegistro.add(btnAceptar_1);
		
		JLabel lblAlta = new JLabel("Dar de alta Usuario");
		lblAlta.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblAlta.setBounds(118, 33, 178, 27);
		pantallaRegistro.add(lblAlta);
		
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(108, 94, 86, 20);
		Listarlibros.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(108, 124, 86, 20);
		Listarlibros.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(108, 161, 86, 20);
		Listarlibros.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(108, 192, 86, 20);
		Listarlibros.add(textField_9);
		
		JMenu mnListarLibros = new JMenu("Listar libros");
		mnListarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Listarlibros.setVisible(true);
			Listarlibros.setVisible(false);
			}
		});
		mnLibros.add(mnListarLibros);
		
	
	}
}
