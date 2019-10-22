package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
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
import javax.swing.event.AncestorListener;
import javax.xml.bind.SchemaOutputResolver;

import logica.Manejador;
import logica.Orientacion;
import logica.TipoUsuario;

import javax.swing.event.AncestorEvent;
import javax.swing.JMenuItem;
import java.awt.Panel;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField textField;
	private JTextField nombreTextField;
	private JTextField apellidoTextField;
	private JTextField mailTextField;
	private JTextField passwordTextField;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private TipoUsuario ocupacion;
	private Manejador man = Manejador.devolverInstancia();
	private JTextField ciTextField;

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

		JMenuItem mntmAltaLibros = new JMenuItem("Alta libros");
		mnLibros.add(mntmAltaLibros);

		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);

		JMenu mnPréstamos = new JMenu("Pr\u00E9stamos");
		menuBar.add(mnPréstamos);

		JMenuItem mntmListarPrstamos = new JMenuItem("Listar Pr\u00E9stamos");
		mnPréstamos.add(mntmListarPrstamos);

		JMenuItem mntmConsultarPrstamos = new JMenuItem("Consultar Pr\u00E9stamos");
		mnPréstamos.add(mntmConsultarPrstamos);

		JPanel pantallaRegistro = new JPanel();
		pantallaRegistro.setBounds(0, 0, 434, 261);
		contentPane.add(pantallaRegistro);
		pantallaRegistro.setLayout(null);
		pantallaRegistro.setVisible(true);

		JLabel lblUsuario_1 = new JLabel("Ocupaci\u00F3n");
		lblUsuario_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblUsuario_1.setBounds(244, 71, 71, 18);
		pantallaRegistro.add(lblUsuario_1);

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

		JLabel label_1 = new JLabel("Orientacion:");
		label_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_1.setBounds(244, 96, 81, 14);
		pantallaRegistro.add(label_1);

		JLabel lblOrientacion = new JLabel("TIC");
		lblOrientacion.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblOrientacion.setBounds(273, 118, 30, 13);
		pantallaRegistro.add(lblOrientacion);

		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(244, 114, 30, 23);
		pantallaRegistro.add(radioButton);

		JLabel lblAdm = new JLabel("ADM");
		lblAdm.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdm.setBounds(273, 142, 30, 13);
		pantallaRegistro.add(lblAdm);

		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(244, 139, 30, 23);
		pantallaRegistro.add(radioButton_1);

		JLabel lblAdmYTic = new JLabel("ADM Y TIC");
		lblAdmYTic.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdmYTic.setBounds(273, 161, 61, 23);
		pantallaRegistro.add(lblAdmYTic);

		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(244, 161, 21, 23);
		pantallaRegistro.add(radioButton_2);

		radioButton.setEnabled(false);
		radioButton_1.setEnabled(false);
		radioButton_2.setEnabled(false);

		JComboBox ocupacionComboBox = new JComboBox();

		ocupacionComboBox.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 10));
		ocupacionComboBox.setBounds(325, 72, 99, 17);
		ocupacionComboBox.addItem(ocupacion.BIBLIOTECARIO);
		ocupacionComboBox.addItem(ocupacion.ESTUDIANTE);
		ocupacionComboBox.addItem(ocupacion.PROFESOR);
		pantallaRegistro.add(ocupacionComboBox);

		ocupacionComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonGroup.clearSelection();
				switch (ocupacionComboBox.getSelectedItem().toString()) {
				case "BIBLIOTECARIO":
					radioButton.setEnabled(false);
					radioButton_1.setEnabled(false);
					radioButton_2.setEnabled(false);
					break;
				case "ESTUDIANTE":
					radioButton.setEnabled(true);
					radioButton_1.setEnabled(true);
					radioButton_2.setEnabled(false);
					break;
				case "PROFESOR":
					radioButton.setEnabled(true);
					radioButton_1.setEnabled(true);
					radioButton_2.setEnabled(true);
					break;
				}
			}
		});

		nombreTextField = new JTextField();
		nombreTextField.setBounds(128, 95, 99, 20);
		pantallaRegistro.add(nombreTextField);
		nombreTextField.setColumns(10);

		apellidoTextField = new JTextField();
		apellidoTextField.setColumns(10);
		apellidoTextField.setBounds(128, 120, 99, 20);
		pantallaRegistro.add(apellidoTextField);

		mailTextField = new JTextField();
		mailTextField.setColumns(10);
		mailTextField.setBounds(128, 145, 99, 20);
		pantallaRegistro.add(mailTextField);

		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(128, 169, 99, 20);
		pantallaRegistro.add(passwordTextField);

		JLabel alerta = new JLabel("Complete todos los campos para continuar");
		alerta.setForeground(Color.RED);
		alerta.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		alerta.setBounds(47, 188, 221, 18);
		pantallaRegistro.add(alerta);
		alerta.setVisible(false);

		JLabel alert2 = new JLabel("Seleccione uno");
		alert2.setForeground(Color.RED);
		alert2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		alert2.setBounds(325, 95, 90, 18);
		pantallaRegistro.add(alert2);
		alert2.setVisible(false);

		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int CI = Integer.parseInt(ciTextField.getText());
				String ocupacionTxt = ocupacionComboBox.getSelectedItem().toString();
				String nombre = nombreTextField.getText();
				String apellido = apellidoTextField.getText();
				String mail = mailTextField.getText();
				String password = passwordTextField.getText();
				TipoUsuario ocupacion = null;
				Orientacion orientacion = null;
				switch (ocupacionComboBox.getSelectedItem().toString()) {
				case "BIBLIOTECARIO":
					orientacion = null;
					ocupacion = TipoUsuario.BIBLIOTECARIO;
					alert2.setVisible(false);
					break;
				case "ESTUDIANTE":
					ocupacion = TipoUsuario.ESTUDIANTE;
					if (radioButton.isSelected()) {
						orientacion = Orientacion.TIC;
						alert2.setVisible(false);
					} else if (radioButton_1.isSelected()) {
						orientacion = Orientacion.ADM;
						alert2.setVisible(false);
					} else {
						alert2.setVisible(true);
					}
					break;
				case "PROFESOR":
					ocupacion = TipoUsuario.PROFESOR;
					if (radioButton.isSelected()) {
						orientacion = Orientacion.TIC;
						alert2.setVisible(false);
					} else if (radioButton_1.isSelected()) {
						orientacion = Orientacion.ADM;
						alert2.setVisible(false);
					} else if (radioButton_2.isSelected()) {
						orientacion = Orientacion.ADMYTIC;
						alert2.setVisible(false);
					} else {
						alert2.setVisible(true);
					}
					break;

				}
				if (nombre.equals("") || apellido.equals("") || mail.equals("") || password.equals("") || ciTextField.getText().equals("")) {
					alerta.setVisible(true);
				} else {
					if (!alert2.isVisible()) {
						alerta.setVisible(false);
						man.altaUsuario(CI, nombre, apellido, mail, password, ocupacion, orientacion);
					}
				}
			}
		});

		btnAceptar_1.setBounds(172, 217, 89, 23);
		pantallaRegistro.add(btnAceptar_1);

		JLabel lblAlta = new JLabel("Dar de alta Usuario");
		lblAlta.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblAlta.setBounds(118, 33, 178, 27);
		pantallaRegistro.add(lblAlta);

		JPanel ConsultarUsuario = new JPanel();
		ConsultarUsuario.setBounds(0, 20, 434, 241);
		contentPane.add(ConsultarUsuario);
		ConsultarUsuario.setLayout(null);
		ConsultarUsuario.setVisible(false);

		JLabel lblConsultarUsuario = new JLabel("Consultar Usuario");
		lblConsultarUsuario.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		lblConsultarUsuario.setBounds(128, 29, 164, 14);
		ConsultarUsuario.add(lblConsultarUsuario);

		JLabel lblCi = new JLabel("CI:");
		lblCi.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblCi.setBounds(71, 77, 23, 14);
		ConsultarUsuario.add(lblCi);

		textField_11 = new JTextField();
		textField_11.setBounds(104, 76, 86, 20);
		ConsultarUsuario.add(textField_11);
		textField_11.setColumns(10);

		JButton btnAceptar_4 = new JButton("Aceptar");
		btnAceptar_4.setBounds(170, 207, 89, 23);
		ConsultarUsuario.add(btnAceptar_4);
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);
		buttonGroup.add(radioButton_2);
		
		JLabel ciLbl = new JLabel("CI");
		ciLbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		ciLbl.setBounds(47, 72, 53, 14);
		pantallaRegistro.add(ciLbl);
		
		ciTextField = new JTextField();
		ciTextField.setColumns(10);
		ciTextField.setBounds(128, 71, 99, 20);
		pantallaRegistro.add(ciTextField);

		JPanel pantallaIngreso = new JPanel();
		pantallaIngreso.setBounds(0, 20, 434, 241);
		contentPane.add(pantallaIngreso);
		pantallaIngreso.setLayout(null);
		pantallaIngreso.setVisible(false);

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
		btnAceptar.setBounds(157, 211, 95, 23);
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

		final ButtonGroup buttonGroup = new ButtonGroup();

		JPanel ListadeUsuarios = new JPanel();
		ListadeUsuarios.setBounds(0, 20, 434, 241);
		contentPane.add(ListadeUsuarios);
		ListadeUsuarios.setLayout(null);
		ListadeUsuarios.setVisible(false);

		JLabel lblMailDeLos = new JLabel("Mail de los Usuarios");
		lblMailDeLos.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblMailDeLos.setBounds(34, 78, 134, 14);
		ListadeUsuarios.add(lblMailDeLos);

		JPanel Bajarpréstamos = new JPanel();
		Bajarpréstamos.setBounds(0, 20, 434, 241);
		contentPane.add(Bajarpréstamos);
		Bajarpréstamos.setLayout(null);
		Bajarpréstamos.setVisible(false);

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

		JButton btnAceptar_3 = new JButton("Aceptar");
		btnAceptar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar_3.setBounds(176, 205, 89, 23);
		Bajarpréstamos.add(btnAceptar_3);

		JList list = new JList();

		list.setBounds(125, 87, 119, 24);
		Bajarpréstamos.add(list);

		JList list_1 = new JList();
		list_1.setBounds(125, 123, 119, 24);
		Bajarpréstamos.add(list_1);

		JList list_2 = new JList();
		list_2.setBounds(136, 148, 119, 24);
		Bajarpréstamos.add(list_2);

		JPanel Listarlibros = new JPanel();
		Listarlibros.setBounds(0, 20, 434, 241);
		contentPane.add(Listarlibros);
		Listarlibros.setLayout(null);
		Listarlibros.setVisible(false);

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

		JMenu mnConsultarPrestamos = new JMenu("Consultar pr\u00E9stamos");

		JMenuItem mntmListarLibros = new JMenuItem("Listar libros");
		mntmListarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				pantallaRegistro.setVisible(false);
				Listarlibros.setVisible(true);
			}
		});

		mnLibros.add(mntmListarLibros);

		JMenuItem mntmDarDeBaja = new JMenuItem("Dar de baja Pr\u00E9stamos");
		mntmDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				pantallaRegistro.setVisible(false);
				Bajarpréstamos.setVisible(true);
			}
		});
		mnPréstamos.add(mntmDarDeBaja);

		JMenuItem mntmListarUsuariosExistentes = new JMenuItem("Listar Usuarios Existentes");
		mntmListarUsuariosExistentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				pantallaRegistro.setVisible(false);
				ListadeUsuarios.setVisible(true);
			}
		});

		JMenuItem mntmAltaUsuario = new JMenuItem("Alta Usuario");
		mntmAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaIngreso.setVisible(false);
				pantallaRegistro.setVisible(false);
				Bajarpréstamos.setVisible(false);
				pantallaRegistro.setVisible(true);
			}
		});

		JMenuItem mntmConsultarUsuario = new JMenuItem("Consultar Usuario");
		mntmConsultarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				pantallaRegistro.setVisible(false);
				ConsultarUsuario.setVisible(true);
			}
		});
		mnUsuario.add(mntmConsultarUsuario);

		mnUsuario.add(mntmAltaUsuario);
		mnUsuario.add(mntmListarUsuariosExistentes);
	}
}
