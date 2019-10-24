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
import javax.swing.event.AncestorEvent;
import javax.swing.JMenuItem;
import java.awt.Panel;


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
	private JTextField textField_10;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
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
		
	
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenu mnPréstamos = new JMenu("Pr\u00E9stamos");
		menuBar.add(mnPréstamos);
		
		JMenuItem mntmAltaPrstamos = new JMenuItem("Alta Pr\u00E9stamos");
		mnPréstamos.add(mntmAltaPrstamos);
		
		JMenuItem mntmListarPrstamos = new JMenuItem("Listar Pr\u00E9stamos");
		mnPréstamos.add(mntmListarPrstamos);
		
		JMenuItem mntmConsultarPrstamos = new JMenuItem("Consultar Pr\u00E9stamos");
		mnPréstamos.add(mntmConsultarPrstamos);
		
		JPanel Altalibro = new JPanel();
		Altalibro.setBounds(0, 20, 434, 241);
		contentPane.add(Altalibro);
		Altalibro.setLayout(null);
		Altalibro.setVisible(false);
		
		JLabel lblAltaLibro = new JLabel("Alta libro");
		lblAltaLibro.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblAltaLibro.setBounds(174, 23, 78, 14);
		Altalibro.add(lblAltaLibro);
		
		JLabel lblCodISBN = new JLabel("CodISBN:");
		lblCodISBN.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblCodISBN.setBounds(37, 75, 64, 14);
		Altalibro.add(lblCodISBN);
		
		
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(97, 74, 54, 20);
		Altalibro.add(comboBox_2);
		
		JPanel libro = new JPanel();
		libro.setBounds(0, 0, 284, 192);
		contentPane.add(libro);
		libro.setLayout(null);
		libro.setVisible(false);
		
		JLabel lblUrlcover = new JLabel("URLcover");
		lblUrlcover.setBounds(10, 108, 46, 14);
		libro.add(lblUrlcover);
		
		JLabel lblEditorial = new JLabel("editorial");
		lblEditorial.setBounds(126, 62, 46, 14);
		libro.add(lblEditorial);
		
		JLabel lblNewLabel_2 = new JLabel("autor");
		lblNewLabel_2.setBounds(10, 133, 46, 14);
		libro.add(lblNewLabel_2);
		
		JLabel lblDescripcion = new JLabel("descripcion");
		lblDescripcion.setBounds(10, 83, 64, 14);
		libro.add(lblDescripcion);
		
		JLabel lblNewLabel_3 = new JLabel("a\u00F1oPub");
		lblNewLabel_3.setBounds(10, 62, 46, 14);
		libro.add(lblNewLabel_3);
		
		JLabel lblHayejemplares = new JLabel("hayEjemplaresDisp");
		lblHayejemplares.setBounds(126, 108, 92, 14);
		libro.add(lblHayejemplares);
		
		JLabel lblCant = new JLabel("cantEjemplaresDisp");
		lblCant.setBounds(126, 133, 105, 14);
		libro.add(lblCant);
		
		JLabel lblCant_1 = new JLabel("cant");
		lblCant_1.setBounds(10, 37, 46, 14);
		libro.add(lblCant_1);
		
		JLabel lblGenero = new JLabel("genero");
		lblGenero.setBounds(126, 37, 46, 14);
		libro.add(lblGenero);
		
		JLabel lblNroedicion = new JLabel("nroEdicion");
		lblNroedicion.setBounds(10, 153, 54, 14);
		libro.add(lblNroedicion);
		
		textField_11 = new JTextField();
		textField_11.setBounds(70, 37, 46, 14);
		libro.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(70, 62, 46, 14);
		libro.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(70, 83, 46, 14);
		libro.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(225, 37, 46, 14);
		libro.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(225, 62, 46, 14);
		libro.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(70, 108, 46, 14);
		libro.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(70, 133, 46, 14);
		libro.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(70, 153, 46, 14);
		libro.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(225, 108, 46, 14);
		libro.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(225, 133, 46, 14);
		libro.add(textField_20);
		
		JLabel lblCodlibro = new JLabel("CodLibro");
		lblCodlibro.setBounds(126, 87, 46, 14);
		libro.add(lblCodlibro);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(225, 83, 46, 14);
		libro.add(textField_21);
		
	
		
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
		lblCi.setBounds(128, 77, 23, 14);
		ConsultarUsuario.add(lblCi);
		
		JButton btnAceptar_4 = new JButton("Aceptar");
		btnAceptar_4.setBounds(170, 207, 89, 23);
		ConsultarUsuario.add(btnAceptar_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(161, 76, 89, 20);
		ConsultarUsuario.add(comboBox_1);
		
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
		
						
		JList list_0 = new JList();
		list_0.setBounds(125, 123, 119, 24);
		Bajarpréstamos.add(list_0);
		
	    JList list_1 = new JList();
	    list_1.setBounds(125, 123, 119, 24);
	    Bajarpréstamos.add(list_1);
	    
		JList list_2 = new JList();
		list_2.setBounds(136, 148, 119, 24);
		Bajarpréstamos.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(125, 98, 119, 24);
		Bajarpréstamos.add(list_3);
		
		
		
		JPanel pantallaRegistro = new JPanel();
		pantallaRegistro.setBounds(0, 0, 434, 261);
		contentPane.add(pantallaRegistro);
		pantallaRegistro.setLayout(null);
		pantallaRegistro.setVisible(true);
		
		JLabel lblUsuario_1 = new JLabel("Ocupaci\u00F3n");
		lblUsuario_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblUsuario_1.setBounds(47, 71, 71, 18);
		pantallaRegistro.add(lblUsuario_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(128, 72, 72, 17);
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
		lblOrientacion.setBounds(276, 100, 30, 13);
		pantallaRegistro.add(lblOrientacion);
		
		JLabel label_1 = new JLabel("Orientacion:");
		label_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_1.setBounds(237, 71, 81, 14);
		pantallaRegistro.add(label_1);
		JRadioButton radioButton = new JRadioButton("");
		
	
		radioButton.setBounds(247, 96, 30, 23);
		pantallaRegistro.add(radioButton);
		
		JLabel lblAdm = new JLabel("ADM");
		lblAdm.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdm.setBounds(276, 124, 30, 13);
		pantallaRegistro.add(lblAdm);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(247, 121, 30, 23);
		pantallaRegistro.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(247, 143, 21, 23);
		pantallaRegistro.add(radioButton_2);
		buttonGroup.add(radioButton_2);
		buttonGroup.add(radioButton_1);
		buttonGroup.add(radioButton);
		
		JLabel lblAdmYTic = new JLabel("ADM Y TIC");
		lblAdmYTic.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdmYTic.setBounds(276, 143, 61, 23);
		pantallaRegistro.add(lblAdmYTic);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 95, 72, 20);
		pantallaRegistro.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 120, 72, 20);
		pantallaRegistro.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 145, 72, 20);
		pantallaRegistro.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(128, 169, 72, 20);
		pantallaRegistro.add(textField_4);
		
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
		
		JList list = new JList();
		
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
		
		JLabel lblEdición = new JLabel("Edici\u00F3n");
		lblEdición.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblEdición.setBounds(49, 125, 63, 14);
		Listarlibros.add(lblEdición);
		
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
		
		JButton btnAceptar_5 = new JButton("Aceptar");
		btnAceptar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Altalibro.setVisible(false);
				libro.setVisible(true);
			}
		});
		btnAceptar_5.setBounds(163, 207, 89, 23);
		Altalibro.add(btnAceptar_5);
		
		JMenu mnConsultarPrestamos = new JMenu("Consultar pr\u00E9stamos");
	
		
		JMenuItem mntmAltaLibros = new JMenuItem("Alta libros");
		mntmAltaLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Altalibro.setVisible(false);
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				pantallaRegistro.setVisible(false);
				Altalibro.setVisible(true);
			}
		});
		mnLibros.add(mntmAltaLibros);
		
		JMenuItem mntmListarLibros = new JMenuItem("Listar libros");
		mntmListarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Altalibro.setVisible(false);
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaRegistro.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				Listarlibros.setVisible(true);
			}
		});
		
		mnLibros.add(mntmListarLibros);
		
		JMenuItem mntmDarDeBaja = new JMenuItem("Dar de baja Pr\u00E9stamos");
		mntmDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Altalibro.setVisible(false);
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaRegistro.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				Bajarpréstamos.setVisible(true);
			}
		});
		mnPréstamos.add(mntmDarDeBaja);
		
		
		JMenuItem mntmListarUsuariosExistentes = new JMenuItem("Listar Usuarios Existentes");
		mntmListarUsuariosExistentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Altalibro.setVisible(false);
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaRegistro.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				ListadeUsuarios.setVisible(true);
			}
		});
		
		JMenuItem mntmAltaUsuario = new JMenuItem("Alta Usuario");
		mntmAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Altalibro.setVisible(false);
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaRegistro.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				pantallaRegistro.setVisible(true);
			}
		});
		
		JMenuItem mntmConsultarUsuario = new JMenuItem("Consultar Usuario");
		mntmConsultarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Altalibro.setVisible(false);
				ConsultarUsuario.setVisible(false);
				ListadeUsuarios.setVisible(false);
				Listarlibros.setVisible(false);
				pantallaRegistro.setVisible(false);
				pantallaIngreso.setVisible(false);
				Bajarpréstamos.setVisible(false);
				ConsultarUsuario.setVisible(true);
			}
		});
		mnUsuario.add(mntmConsultarUsuario);
		
		mnUsuario.add(mntmAltaUsuario);
		mnUsuario.add(mntmListarUsuariosExistentes);
	}
}
