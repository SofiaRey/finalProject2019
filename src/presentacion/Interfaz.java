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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;

import org.w3c.dom.Text;

import logica.Libro;
import logica.Manejador;
import logica.Orientacion;
import logica.TipoUsuario;
import logica.Usuario;

import javax.swing.event.AncestorEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField nombreTextField;
	private JTextField apellidoTextField;
	private JTextField mailTextField;
	private JTextField textField_titulo;
	private JTextField textField_codAnima;
	private JTextField textField_CodISBN;
	private JTextField textField_nroEdicion;
	private JTextField textField_Genero;
	private JTextField textField_10;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private TipoUsuario ocupacion;
	private Manejador man = Manejador.devolverInstancia();
	private JTextField ciTextField;
	private JTextField textField_Autor;
	private JTextField textField_AnoPub;
	private JTextField textField_Descripcion;
	private JTextField textField_Editorial;
	private JTextField textField_Caratula;
	private JTextField textField_Cant;
	private JTextField textField_FechaSol;
	private JTextField textField_FechaVen;
	private JTextField textField_LibroPrestamo;
	private JTextField textField_CIUsuarioPrestamo;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDateTime now = LocalDateTime.now();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	private JTextField textField_CiIngreso;
	private JPasswordField passwordField_ContrasenaIngreso;
	private JPasswordField passwordField;
	private JTextField filtroporCI;

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

		// Navbar

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		menuBar.setVisible(false);
		
		// Screen Listar libros
		
		JPanel ListarLibros = new JPanel();
		ListarLibros.setBounds(0, 20, 434, 241);
		contentPane.add(ListarLibros);
		ListarLibros.setLayout(null);
		ListarLibros.setVisible(false);
		
		JLabel lblListarLibros_1 = new JLabel("Listar Libros");
		lblListarLibros_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblListarLibros_1.setBounds(159, 11, 107, 27);
		ListarLibros.add(lblListarLibros_1);
		
		JLabel lblTodosLosLibros = new JLabel("Todos los Libros");
		lblTodosLosLibros.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblTodosLosLibros.setBounds(22, 52, 133, 22);
		ListarLibros.add(lblTodosLosLibros);
		
		JLabel lblDatosDelLibroseleccionado = new JLabel("Datos del Libro Seleccionado");
		lblDatosDelLibroseleccionado.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		lblDatosDelLibroseleccionado.setBounds(22, 78, 255, 27);
		ListarLibros.add(lblDatosDelLibroseleccionado);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblTtulo.setBounds(22, 108, 62, 22);
		ListarLibros.add(lblTtulo);
		
		JLabel mostrarTitulo = new JLabel("...");
		mostrarTitulo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarTitulo.setBounds(64, 108, 156, 22);
		ListarLibros.add(mostrarTitulo);
		
		JLabel lblAutor_1 = new JLabel("C\u00F3digo \u00C1NIMA:");
		lblAutor_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAutor_1.setBounds(22, 127, 97, 22);
		ListarLibros.add(lblAutor_1);
		
		JLabel mostrarCodLibro = new JLabel("...");
		mostrarCodLibro.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarCodLibro.setBounds(113, 126, 97, 22);
		ListarLibros.add(mostrarCodLibro);
		
		JLabel lblCdigoIsbn = new JLabel("C\u00F3digo ISBN:");
		lblCdigoIsbn.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblCdigoIsbn.setBounds(22, 147, 97, 22);
		ListarLibros.add(lblCdigoIsbn);
		
		JLabel mostrarCodISBN = new JLabel("...");
		mostrarCodISBN.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarCodISBN.setBounds(99, 146, 115, 22);
		ListarLibros.add(mostrarCodISBN);
		
		JLabel lblNroDeEdicin = new JLabel("Nro de edici\u00F3n:");
		lblNroDeEdicin.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblNroDeEdicin.setBounds(22, 167, 97, 22);
		ListarLibros.add(lblNroDeEdicin);
		
		JLabel mostrarNroEdicion = new JLabel("...");
		mostrarNroEdicion.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarNroEdicion.setBounds(113, 167, 56, 22);
		ListarLibros.add(mostrarNroEdicion);
		
		JLabel lblAoDePublicacion = new JLabel("A\u00F1o de publicaci\u00F3n:");
		lblAoDePublicacion.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAoDePublicacion.setBounds(22, 208, 115, 22);
		ListarLibros.add(lblAoDePublicacion);
		
		JLabel mostrarAnoPub = new JLabel("...");
		mostrarAnoPub.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarAnoPub.setBounds(141, 207, 62, 22);
		ListarLibros.add(mostrarAnoPub);
		
		JLabel lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblGnero.setBounds(22, 188, 97, 22);
		ListarLibros.add(lblGnero);
		
		JLabel mostrarGenero = new JLabel("...");
		mostrarGenero.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarGenero.setBounds(74, 187, 115, 22);
		ListarLibros.add(mostrarGenero);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblDescripcin.setBounds(224, 108, 115, 22);
		ListarLibros.add(lblDescripcin);
		
		JLabel mostrarDescripcion = new JLabel("...");
		mostrarDescripcion.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarDescripcion.setBounds(295, 107, 133, 22);
		ListarLibros.add(mostrarDescripcion);
		
		JLabel mostrarEditorial = new JLabel("...");
		mostrarEditorial.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarEditorial.setBounds(273, 126, 151, 22);
		ListarLibros.add(mostrarEditorial);
		
		JLabel lblEditorial_1 = new JLabel("Editorial:");
		lblEditorial_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblEditorial_1.setBounds(224, 127, 115, 22);
		ListarLibros.add(lblEditorial_1);
		
		JLabel mostrarURLCover = new JLabel("...");
		mostrarURLCover.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarURLCover.setBounds(301, 146, 123, 22);
		ListarLibros.add(mostrarURLCover);
		
		JLabel lblUrlCartula_1 = new JLabel("URL Car\u00E1tula:");
		lblUrlCartula_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblUrlCartula_1.setBounds(224, 147, 115, 22);
		ListarLibros.add(lblUrlCartula_1);
		
		JLabel mostrarCant = new JLabel("...");
		mostrarCant.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarCant.setBounds(283, 166, 133, 22);
		ListarLibros.add(mostrarCant);
		
		JLabel mostrarAutor = new JLabel("...");
		mostrarAutor.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarAutor.setBounds(268, 207, 156, 22);
		ListarLibros.add(mostrarAutor);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad:");
		lblCantidad_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblCantidad_1.setBounds(224, 169, 115, 22);
		ListarLibros.add(lblCantidad_1);
		
		JLabel lblCantidadDisponible = new JLabel("Cantidad disponible:");
		lblCantidadDisponible.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblCantidadDisponible.setBounds(224, 188, 115, 22);
		ListarLibros.add(lblCantidadDisponible);
		
		JLabel mostrarCantDisp = new JLabel("...");
		mostrarCantDisp.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarCantDisp.setBounds(338, 187, 75, 22);
		ListarLibros.add(mostrarCantDisp);
		
		JComboBox librosPorTitulo = new JComboBox();
		librosPorTitulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(librosPorTitulo.getItemCount() != 0) {
					Libro libro = man.traerLibroPorCodigo(librosPorTitulo.getSelectedItem().toString());
					mostrarTitulo.setText(libro.getTitulo());
					mostrarCodLibro.setText(libro.getAniCode());
					mostrarCodISBN.setText(libro.getCodigoISBN());
					mostrarNroEdicion.setText(Integer.toString(libro.getNroEdicion()));
					mostrarGenero.setText(libro.getGenero());
					mostrarAutor.setText(libro.getAutor());
					mostrarAnoPub.setText(Integer.toString(libro.getAnoPub()));
					mostrarDescripcion.setText(libro.getDescripcion());
					mostrarEditorial.setText(libro.getEditorial());
					mostrarURLCover.setText(libro.getImagUrl());
					mostrarCant.setText(Integer.toString(libro.getCantEjemplares()));
					mostrarCantDisp.setText(Integer.toString(libro.getCantEjemplaresDisp()));
				}
				
			}
		});
		librosPorTitulo.setBounds(141, 52, 107, 22);
		ListarLibros.add(librosPorTitulo);
		for (int i = 0; i < man.listarLibros().size(); i++) {
			librosPorTitulo.addItem(man.listarLibros().get(i).getAniCode());
		}
		
		JLabel lblAutor_2 = new JLabel("Autor:");
		lblAutor_2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAutor_2.setBounds(224, 208, 62, 22);
		ListarLibros.add(lblAutor_2);
		
		// End Screen Listar libros

		// Screen AltaUsuario

		JPanel AltaUsuario = new JPanel();
		AltaUsuario.setBounds(0, 0, 434, 261);
		contentPane.add(AltaUsuario);
		AltaUsuario.setLayout(null);
		AltaUsuario.setVisible(false);

		JLabel lblAlta = new JLabel("Dar de alta Usuario");
		lblAlta.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblAlta.setBounds(136, 33, 178, 27);
		AltaUsuario.add(lblAlta);

		JLabel lblUsuario_1 = new JLabel("Ocupaci\u00F3n");
		lblUsuario_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblUsuario_1.setBounds(224, 71, 71, 18);
		AltaUsuario.add(lblUsuario_1);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblNombre.setBounds(27, 96, 53, 14);
		AltaUsuario.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblApellido.setBounds(27, 121, 53, 14);
		AltaUsuario.add(lblApellido);

		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblMail.setBounds(27, 146, 53, 14);
		AltaUsuario.add(lblMail);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblPassword.setBounds(27, 170, 72, 14);
		AltaUsuario.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(109, 169, 98, 20);
		AltaUsuario.add(passwordField);
		passwordField.setEnabled(true);
		passwordField.setText("");

		JLabel label_1 = new JLabel("Orientacion:");
		label_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		label_1.setBounds(224, 96, 81, 14);
		AltaUsuario.add(label_1);

		JLabel lblTic = new JLabel("TIC");
		lblTic.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblTic.setBounds(253, 118, 30, 13);
		AltaUsuario.add(lblTic);

		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(224, 114, 30, 23);
		AltaUsuario.add(radioButton);

		JLabel lblAdm = new JLabel("ADM");
		lblAdm.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdm.setBounds(253, 142, 30, 13);
		AltaUsuario.add(lblAdm);

		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(224, 139, 30, 23);
		AltaUsuario.add(radioButton_1);

		JLabel lblAdmYTic = new JLabel("ADM Y TIC");
		lblAdmYTic.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 12));
		lblAdmYTic.setBounds(253, 161, 61, 23);
		AltaUsuario.add(lblAdmYTic);

		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(224, 161, 21, 23);
		AltaUsuario.add(radioButton_2);

		radioButton.setEnabled(false);
		radioButton_1.setEnabled(false);
		radioButton_2.setEnabled(false);

		JComboBox ocupacionComboBox = new JComboBox();

		ocupacionComboBox.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 10));
		ocupacionComboBox.setBounds(305, 72, 99, 17);
		ocupacionComboBox.addItem(ocupacion.BIBLIOTECARIO);
		ocupacionComboBox.addItem(ocupacion.ESTUDIANTE);
		ocupacionComboBox.addItem(ocupacion.PROFESOR);
		AltaUsuario.add(ocupacionComboBox);

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
		nombreTextField.setBounds(108, 95, 99, 20);
		AltaUsuario.add(nombreTextField);
		nombreTextField.setColumns(10);

		apellidoTextField = new JTextField();
		apellidoTextField.setColumns(10);
		apellidoTextField.setBounds(108, 120, 99, 20);
		AltaUsuario.add(apellidoTextField);

		mailTextField = new JTextField();
		mailTextField.setColumns(10);
		mailTextField.setBounds(108, 145, 99, 20);
		AltaUsuario.add(mailTextField);

		JLabel alerta = new JLabel("Complete todos los campos para continuar");
		alerta.setForeground(Color.RED);
		alerta.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		alerta.setBounds(27, 188, 221, 18);
		AltaUsuario.add(alerta);
		alerta.setVisible(false);

		JLabel alert2 = new JLabel("Seleccione uno");
		alert2.setForeground(Color.RED);
		alert2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		alert2.setBounds(305, 95, 90, 18);
		AltaUsuario.add(alert2);
		alert2.setVisible(false);

		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int CI = 0;
				if (!ciTextField.getText().equals("")) {
					CI = Integer.parseInt(ciTextField.getText());
				}
				String ocupacionTxt = ocupacionComboBox.getSelectedItem().toString();
				String nombre = nombreTextField.getText();
				String apellido = apellidoTextField.getText();
				String mail = mailTextField.getText();
				char contra[] = passwordField.getPassword();
				String password = new String(contra);
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
				if (nombre.equals("") || apellido.equals("") || mail.equals("") || password.equals("")
						|| ciTextField.getText().equals("")) {
					alerta.setVisible(true);
				} else {
					if (!alert2.isVisible()) {
						alerta.setVisible(false);
						try {
							man.altaUsuario(CI, nombre, apellido, mail, password, ocupacion, orientacion);
							JOptionPane.showMessageDialog(null, "El usuario ha sido creado :D");
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos D:", "",
									JOptionPane.ERROR_MESSAGE);
						}

					}
				}
			}
		});

		btnAceptar_1.setBounds(172, 217, 89, 23);
		AltaUsuario.add(btnAceptar_1);

		JLabel lblModificarUsuario = new JLabel("Modificar Usuario");
		lblModificarUsuario.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblModificarUsuario.setBounds(136, 33, 178, 27);
		AltaUsuario.add(lblModificarUsuario);
		lblModificarUsuario.setVisible(false);

		JButton AceptarModificarUsuario = new JButton("Aceptar");
		AceptarModificarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int CI = Integer.parseInt(ciTextField.getText());
				String ocupacionTxt = ocupacionComboBox.getSelectedItem().toString();
				String nombre = nombreTextField.getText();
				String apellido = apellidoTextField.getText();
				String mail = mailTextField.getText();
				char contra[] = passwordField.getPassword();
				String password = new String(contra);
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
				if (nombre.equals("") || apellido.equals("") || mail.equals("")) {
					alerta.setVisible(true);
				} else {
					if (!alert2.isVisible()) {
						alerta.setVisible(false);
						try {
							man.modificarUsuario(CI, nombre, apellido, mail, password, ocupacion, orientacion);
							JOptionPane.showMessageDialog(null, "El usuario ha sido modificado :D");
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos D:", "",
									JOptionPane.ERROR_MESSAGE);
						}

					}
				}
			}
		});
		AceptarModificarUsuario.setBounds(172, 217, 89, 23);
		AltaUsuario.add(AceptarModificarUsuario);
		AceptarModificarUsuario.setVisible(false);

		// End Screen AltaUsuario

		// Screen Listar

		JPanel Listar = new JPanel();
		Listar.setBounds(0, 20, 434, 241);
		contentPane.add(Listar);
		Listar.setLayout(null);
		Listar.setVisible(false);

		JLabel lblListarUsuarios = new JLabel("Listar Usuarios");
		lblListarUsuarios.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblListarUsuarios.setBounds(155, 11, 178, 27);
		Listar.add(lblListarUsuarios);

		JLabel lblUsuariosPorCi = new JLabel("Todos los Usuarios");
		lblUsuariosPorCi.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblUsuariosPorCi.setBounds(25, 79, 133, 22);
		Listar.add(lblUsuariosPorCi);

		JLabel lblDatosDelUsuario = new JLabel("Datos del Usuario Seleccionado");
		lblDatosDelUsuario.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		lblDatosDelUsuario.setBounds(25, 111, 255, 27);
		Listar.add(lblDatosDelUsuario);

		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblNombre_1.setBounds(25, 136, 62, 27);
		Listar.add(lblNombre_1);

		JLabel lblApellido_1 = new JLabel("Apellido:");
		lblApellido_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblApellido_1.setBounds(25, 161, 62, 27);
		Listar.add(lblApellido_1);

		JLabel lblMail_1 = new JLabel("Mail:");
		lblMail_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblMail_1.setBounds(25, 186, 39, 22);
		Listar.add(lblMail_1);

		JLabel mostrarNombre = new JLabel("...");
		mostrarNombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarNombre.setBounds(90, 136, 169, 27);
		Listar.add(mostrarNombre);

		JLabel mostrarApellido = new JLabel("...");
		mostrarApellido.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarApellido.setBounds(90, 163, 169, 25);
		Listar.add(mostrarApellido);

		JLabel mostrarMail = new JLabel("...");
		mostrarMail.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarMail.setBounds(60, 186, 152, 21);
		Listar.add(mostrarMail);

		JLabel lblPrestamosActivos = new JLabel("Prestamos activos:");
		lblPrestamosActivos.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblPrestamosActivos.setBounds(25, 208, 133, 22);
		Listar.add(lblPrestamosActivos);

		JLabel mostrarPrestamosAct = new JLabel("...");
		mostrarPrestamosAct.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		mostrarPrestamosAct.setBounds(146, 209, 152, 21);
		Listar.add(mostrarPrestamosAct);

		JComboBox usuariosCIs = new JComboBox();
		usuariosCIs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!(usuariosCIs.getItemCount() == 0)) {
					Usuario usuario = man.traerUsuarioPorCI(Integer.parseInt(usuariosCIs.getSelectedItem().toString()));
					mostrarNombre.setText(usuario.getNombre());
					mostrarApellido.setText(usuario.getApellido());
					mostrarMail.setText(usuario.getMail());
					int prestamosAct = 0;
					man.actualizarArrays("prestamos");
					for (int i = 0; i < usuario.getPrestamos().size(); i++) {
						if (!usuario.getPrestamos().get(i).isDevuelto()) {
							prestamosAct += 1;
						}
					}
					mostrarPrestamosAct.setText(Integer.toString(prestamosAct));
				}
			}
		});
		usuariosCIs.setBounds(156, 78, 124, 22);
		Listar.add(usuariosCIs);
		for (int i = 0; i < man.listarUsuarios().size(); i++) {
			usuariosCIs.addItem(man.getUsuarios().get(i).getCI());

		}

		filtroporCI = new JTextField();
		filtroporCI.setBounds(156, 49, 124, 20);
		Listar.add(filtroporCI);
		filtroporCI.setColumns(10);

		JLabel lblFiltarUsuarios = new JLabel("Buscar por C.I");
		lblFiltarUsuarios.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		lblFiltarUsuarios.setBounds(25, 49, 111, 20);
		Listar.add(lblFiltarUsuarios);

		JButton btnModificarUsu = new JButton("Modificar");
		btnModificarUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar.setVisible(false);
				AltaUsuario.setVisible(true);
				btnAceptar_1.setVisible(false);
				lblAlta.setVisible(false);
				lblUsuario_1.setVisible(false);
				ocupacionComboBox.setVisible(false);
				label_1.setVisible(false);
				radioButton.setVisible(false);
				radioButton_1.setVisible(false);
				radioButton_2.setVisible(false);
				lblTic.setVisible(false);
				lblAdm.setVisible(false);
				lblAdmYTic.setVisible(false);
				lblModificarUsuario.setVisible(true);
				AceptarModificarUsuario.setVisible(true);
				Usuario usuario = man.traerUsuarioPorCI(Integer.parseInt(usuariosCIs.getSelectedItem().toString()));
				ciTextField.setText(usuariosCIs.getSelectedItem().toString());
				ciTextField.setEnabled(false);
				nombreTextField.setText(usuario.getNombre());
				apellidoTextField.setText(usuario.getApellido());
				mailTextField.setText(usuario.getMail());
				passwordField.setText(usuario.getPassword());
				passwordField.setEnabled(false);

			}
		});
		btnModificarUsu.setBounds(290, 210, 89, 23);
		Listar.add(btnModificarUsu);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (filtroporCI.getText().equals("")) {
					for (int i = 0; i < man.listarUsuarios().size(); i++) {
						usuariosCIs.addItem(man.getUsuarios().get(i).getCI());

					}
				} else {
					usuariosCIs.removeAllItems();
					int ciFilter = Integer.parseInt(filtroporCI.getText());
					for (int i = 0; i < man.listarUsuarios().size(); i++) {
						if (man.getUsuarios().get(i).getCI() == ciFilter) {
							usuariosCIs.addItem(man.getUsuarios().get(i).getCI());
						}
					}
				}
			}
		});
		btnBuscar.setBounds(290, 47, 89, 23);
		Listar.add(btnBuscar);

		// End Screen Listar

		// Ingreso

		JPanel LogIn = new JPanel();
		LogIn.setBounds(0, 20, 434, 241);
		contentPane.add(LogIn);
		LogIn.setLayout(null);

		JLabel lblIngresar_1 = new JLabel("Ingresar");
		lblIngresar_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblIngresar_1.setBounds(186, 23, 79, 24);
		LogIn.add(lblIngresar_1);

		JLabel lblCi_1 = new JLabel("C.I");
		lblCi_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblCi_1.setBounds(22, 77, 29, 14);
		LogIn.add(lblCi_1);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblContrasea.setBounds(22, 109, 91, 14);
		LogIn.add(lblContrasea);

		textField_CiIngreso = new JTextField();
		textField_CiIngreso.setBounds(115, 75, 213, 20);
		LogIn.add(textField_CiIngreso);
		textField_CiIngreso.setColumns(10);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ci = 0;
				if (!textField_CiIngreso.getText().contentEquals("")) {
					ci = Integer.parseInt(textField_CiIngreso.getText());
				}
				char contrasena[] = passwordField_ContrasenaIngreso.getPassword();
				String password = new String(contrasena);
				try {
					if (man.ingreso(ci, password)) {

						JOptionPane.showMessageDialog(null, "Bienvenido :D", "Message",
								JOptionPane.INFORMATION_MESSAGE);

						menuBar.setVisible(true);
						LogIn.setVisible(false);
						AltaUsuario.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(null, "Datos incorrectos D:", "Message",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null, "Datos incorrectos D:", "Message", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNewButton.setBounds(182, 196, 89, 23);
		LogIn.add(btnNewButton);

		passwordField_ContrasenaIngreso = new JPasswordField();
		passwordField_ContrasenaIngreso.setBounds(115, 107, 213, 20);
		LogIn.add(passwordField_ContrasenaIngreso);

		// End Ingreso

		// Screen ALtaPrestamo

		JPanel AltaPrestamo = new JPanel();
		AltaPrestamo.setBounds(0, 20, 434, 241);
		contentPane.add(AltaPrestamo);
		AltaPrestamo.setLayout(null);
		AltaPrestamo.setVisible(false);

		JLabel lblDarDeAlta = new JLabel("Dar de alta Prestamo");
		lblDarDeAlta.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblDarDeAlta.setBounds(133, 23, 180, 14);
		AltaPrestamo.add(lblDarDeAlta);

		JLabel lblFechaDeSolicitado = new JLabel("Fecha de solicitado");
		lblFechaDeSolicitado.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblFechaDeSolicitado.setBounds(20, 115, 135, 14);
		AltaPrestamo.add(lblFechaDeSolicitado);

		JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento");
		lblFechaDeVencimiento.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblFechaDeVencimiento.setBounds(20, 140, 150, 14);
		AltaPrestamo.add(lblFechaDeVencimiento);

		textField_FechaSol = new JTextField();
		textField_FechaSol.setBounds(180, 114, 133, 20);
		AltaPrestamo.add(textField_FechaSol);
		textField_FechaSol.setColumns(10);
		textField_FechaSol.setText(dtf.format(now));

		textField_FechaVen = new JTextField();
		textField_FechaVen.setColumns(10);
		textField_FechaVen.setBounds(180, 140, 133, 20);
		AltaPrestamo.add(textField_FechaVen);

		JLabel lblAlertaAltaPrestamo = new JLabel("Complete todos los campos para continuar");
		lblAlertaAltaPrestamo.setForeground(Color.RED);
		lblAlertaAltaPrestamo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		lblAlertaAltaPrestamo.setBounds(20, 171, 240, 14);
		AltaPrestamo.add(lblAlertaAltaPrestamo);
		lblAlertaAltaPrestamo.setVisible(false);

		JLabel lblUsuarioSolicitante = new JLabel("C.I del usuario solicitante");
		lblUsuarioSolicitante.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblUsuarioSolicitante.setBounds(20, 65, 150, 14);
		AltaPrestamo.add(lblUsuarioSolicitante);

		JLabel lblLibroSolicitado = new JLabel("Codigo \u00C1NIMA del ibro");
		lblLibroSolicitado.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblLibroSolicitado.setBounds(20, 90, 150, 14);
		AltaPrestamo.add(lblLibroSolicitado);

		textField_LibroPrestamo = new JTextField();
		textField_LibroPrestamo.setColumns(10);
		textField_LibroPrestamo.setBounds(180, 89, 133, 20);
		AltaPrestamo.add(textField_LibroPrestamo);

		textField_CIUsuarioPrestamo = new JTextField();
		textField_CIUsuarioPrestamo.setColumns(10);
		textField_CIUsuarioPrestamo.setBounds(180, 63, 133, 20);
		AltaPrestamo.add(textField_CIUsuarioPrestamo);

		JButton btnAceptarAltaPrestamo = new JButton("Aceptar");
		btnAceptarAltaPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ci = 0;
				if (!textField_CIUsuarioPrestamo.getText().contentEquals("")) {
					ci = Integer.parseInt(textField_CIUsuarioPrestamo.getText());
				}
				String codLibro = textField_LibroPrestamo.getText();
				Date fechSol = null;
				if (!textField_FechaSol.getText().equals("")) {
					try {
						fechSol = formatter.parse(textField_FechaSol.getText());
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				}
				Date fechVen = null;
				if (!textField_FechaVen.getText().equals("")) {
					try {
						fechVen = formatter.parse(textField_FechaVen.getText());
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				}
				Usuario usuario = man.traerUsuarioPorCI(ci);
				Libro libro = man.traerLibroPorCodigo(codLibro);
				if (textField_CIUsuarioPrestamo.getText().contentEquals("")
						|| textField_LibroPrestamo.getText().contentEquals("")
						|| textField_FechaSol.getText().equals("") || textField_FechaVen.getText().equals("")) {
					lblAlertaAltaPrestamo.setVisible(true);
				} else {
					lblAlertaAltaPrestamo.setVisible(false);
					try {
						man.altaPrestamo(fechSol, fechVen, usuario, libro);
						JOptionPane.showMessageDialog(null, "El prestamo ha sido creado :D");

					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos D:", "Message",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnAceptarAltaPrestamo.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		btnAceptarAltaPrestamo.setBounds(181, 196, 89, 23);
		AltaPrestamo.add(btnAceptarAltaPrestamo);

		// End Screen AltaPrestamo

		// Screen AltaLibros

		JPanel AltaLibros = new JPanel();
		AltaLibros.setBounds(0, 20, 434, 241);
		contentPane.add(AltaLibros);
		AltaLibros.setLayout(null);
		AltaLibros.setVisible(false);

		JLabel lblListarLibros = new JLabel("Dar de alta Libro");
		lblListarLibros.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblListarLibros.setBounds(152, 23, 149, 14);
		AltaLibros.add(lblListarLibros);

		JLabel lblTitulo = new JLabel("T\u00EDtulo");
		lblTitulo.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblTitulo.setBounds(21, 50, 63, 14);
		AltaLibros.add(lblTitulo);

		textField_titulo = new JTextField();
		textField_titulo.setBounds(117, 48, 101, 20);
		AltaLibros.add(textField_titulo);
		textField_titulo.setColumns(10);

		JLabel lblCodigoAnima = new JLabel("C\u00F3digo \u00C1NIMA");
		lblCodigoAnima.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblCodigoAnima.setBounds(21, 78, 117, 14);
		AltaLibros.add(lblCodigoAnima);

		JLabel lblISBN = new JLabel("C\u00F3digo ISBN");
		lblISBN.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblISBN.setBounds(21, 109, 86, 14);
		AltaLibros.add(lblISBN);

		JLabel lblNroEdicion = new JLabel("N\u00FAmero edici\u00F3n");
		lblNroEdicion.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		lblNroEdicion.setBounds(21, 138, 92, 14);
		AltaLibros.add(lblNroEdicion);

		JLabel lblGenero = new JLabel("G\u00E9nero");
		lblGenero.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblGenero.setBounds(21, 166, 63, 20);
		AltaLibros.add(lblGenero);

		textField_codAnima = new JTextField();
		textField_codAnima.setColumns(10);
		textField_codAnima.setBounds(117, 77, 101, 20);
		AltaLibros.add(textField_codAnima);

		textField_CodISBN = new JTextField();
		textField_CodISBN.setColumns(10);
		textField_CodISBN.setBounds(117, 106, 101, 20);
		AltaLibros.add(textField_CodISBN);

		textField_nroEdicion = new JTextField();
		textField_nroEdicion.setColumns(10);
		textField_nroEdicion.setBounds(117, 135, 101, 20);
		AltaLibros.add(textField_nroEdicion);

		textField_Genero = new JTextField();
		textField_Genero.setColumns(10);
		textField_Genero.setBounds(117, 165, 101, 20);
		AltaLibros.add(textField_Genero);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblAutor.setBounds(238, 50, 63, 14);
		AltaLibros.add(lblAutor);

		textField_Autor = new JTextField();
		textField_Autor.setColumns(10);
		textField_Autor.setBounds(323, 48, 101, 20);
		AltaLibros.add(textField_Autor);

		JLabel lblAnoPub = new JLabel("A\u00F1o Publicaci\u00F3n");
		lblAnoPub.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 11));
		lblAnoPub.setBounds(238, 79, 86, 14);
		AltaLibros.add(lblAnoPub);

		textField_AnoPub = new JTextField();
		textField_AnoPub.setColumns(10);
		textField_AnoPub.setBounds(323, 77, 101, 20);
		AltaLibros.add(textField_AnoPub);

		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblDescripcion.setBounds(238, 108, 75, 14);
		AltaLibros.add(lblDescripcion);

		textField_Descripcion = new JTextField();
		textField_Descripcion.setColumns(10);
		textField_Descripcion.setBounds(323, 106, 101, 20);
		AltaLibros.add(textField_Descripcion);

		JLabel lblEditorial = new JLabel("Editorial");
		lblEditorial.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblEditorial.setBounds(238, 137, 75, 14);
		AltaLibros.add(lblEditorial);

		textField_Editorial = new JTextField();
		textField_Editorial.setColumns(10);
		textField_Editorial.setBounds(323, 135, 101, 20);
		AltaLibros.add(textField_Editorial);

		JLabel lblUrlCartula = new JLabel("URL Car\u00E1tula");
		lblUrlCartula.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		lblUrlCartula.setBounds(238, 168, 75, 14);
		AltaLibros.add(lblUrlCartula);

		textField_Caratula = new JTextField();
		textField_Caratula.setColumns(10);
		textField_Caratula.setBounds(323, 166, 101, 20);
		AltaLibros.add(textField_Caratula);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		lblCantidad.setBounds(21, 199, 75, 14);
		AltaLibros.add(lblCantidad);

		textField_Cant = new JTextField();
		textField_Cant.setColumns(10);
		textField_Cant.setBounds(117, 197, 101, 20);
		AltaLibros.add(textField_Cant);

		JLabel lblAlertaLibros = new JLabel("Complete todos los campos para continuar");
		lblAlertaLibros.setForeground(Color.RED);
		lblAlertaLibros.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		lblAlertaLibros.setBounds(21, 220, 237, 14);
		AltaLibros.add(lblAlertaLibros);
		lblAlertaLibros.setVisible(false);

		JButton btnAceptar_2 = new JButton("Aceptar");
		btnAceptar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titulo = textField_titulo.getText();
				String codAnima = textField_codAnima.getText();
				String codISBN = textField_CodISBN.getText();
				int nroEdicion = 0;
				if (!textField_nroEdicion.getText().equals("")) {
					nroEdicion = Integer.parseInt(textField_nroEdicion.getText());
				}
				String genero = textField_Genero.getText();
				String autor = textField_Autor.getText();
				int anoPub = 0;
				if (!textField_AnoPub.getText().equals("")) {
					anoPub = Integer.parseInt(textField_AnoPub.getText());
				}
				String descripcion = textField_Descripcion.getText();
				String editorial = textField_Editorial.getText();
				String urlCover = textField_Caratula.getText();
				int cant = 0;
				if (!textField_Cant.getText().equals("")) {
					cant = Integer.parseInt(textField_Cant.getText());
				}
				if (titulo.equals("") || codAnima.equals("") || codISBN.equals("")
						|| textField_nroEdicion.getText().equals("") || genero.equals("") || autor.equals("")
						|| textField_AnoPub.getText().equals("") || descripcion.equals("") || editorial.equals("")
						|| urlCover.equals("") || textField_Cant.getText().equals("")) {
					lblAlertaLibros.setVisible(true);
				} else {
					lblAlertaLibros.setVisible(false);
					try {
						man.altaLibro(codAnima, titulo, autor, anoPub, nroEdicion, editorial, descripcion, cant, true,
								codISBN, genero, urlCover);
						JOptionPane.showMessageDialog(null, "El libro ha sido creado :D");
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos D:", "Message",
								JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		btnAceptar_2.setBounds(287, 200, 89, 23);
		AltaLibros.add(btnAceptar_2);
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);
		buttonGroup.add(radioButton_2);

		JLabel ciLbl = new JLabel("CI");
		ciLbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
		ciLbl.setBounds(27, 72, 53, 14);
		AltaUsuario.add(ciLbl);

		ciTextField = new JTextField();
		ciTextField.setColumns(10);
		ciTextField.setBounds(108, 71, 99, 20);
		AltaUsuario.add(ciTextField);

		final ButtonGroup buttonGroup = new ButtonGroup();

		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);

		JMenuItem mntmAltaUsuario = new JMenuItem("Dar de alta");
		mntmAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaLibros.setVisible(false);
				AltaUsuario.setVisible(true);
				AltaPrestamo.setVisible(false);
				Listar.setVisible(false);
				ListarLibros.setVisible(false);
				nombreTextField.setText("");
				apellidoTextField.setText("");
				mailTextField.setText("");
				lblUsuario_1.setVisible(true);
				ocupacionComboBox.setVisible(true);
				radioButton.setVisible(true);
				radioButton_1.setVisible(true);
				radioButton_2.setVisible(true);
				Listar.setVisible(false);
				btnAceptar_1.setVisible(true);
				lblAlta.setVisible(true);
				label_1.setVisible(true);
				lblTic.setVisible(true);
				lblAdm.setVisible(true);
				lblAdmYTic.setVisible(true);
				lblModificarUsuario.setVisible(false);
				AceptarModificarUsuario.setVisible(false);
				ciTextField.setEnabled(true);
				ciTextField.setText("");
				passwordField.setText("");
				passwordField.setEnabled(true);
			}
		});
		mnUsuario.add(mntmAltaUsuario);

		JMenuItem mntmListarUsuariosExistentes = new JMenuItem("Listar/Buscar/Modificar");
		mntmListarUsuariosExistentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaLibros.setVisible(false);
				ListarLibros.setVisible(false);
				AltaUsuario.setVisible(false);
				AltaPrestamo.setVisible(false);
				Listar.setVisible(true);
				man.actualizarArrays("usuarios");
			}
		});
		mnUsuario.add(mntmListarUsuariosExistentes);

		JMenu mnLibros = new JMenu("Libros");
		menuBar.add(mnLibros);

		JMenu mnPréstamos = new JMenu("Pr\u00E9stamos");
		menuBar.add(mnPréstamos);

		JMenuItem mntmAltaPrestamo = new JMenuItem("Dar de alta");
		mntmAltaPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaLibros.setVisible(false);
				ListarLibros.setVisible(false);
				AltaUsuario.setVisible(false);
				AltaPrestamo.setVisible(true);
				Listar.setVisible(false);
			}
		});
		mnPréstamos.add(mntmAltaPrestamo);

		JMenuItem mntmConsultarPrstamos = new JMenuItem("Consultar");
		mnPréstamos.add(mntmConsultarPrstamos);

		JMenuItem mntmAltaLibros = new JMenuItem("Dar de alta");
		mntmAltaLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaUsuario.setVisible(false);
				AltaLibros.setVisible(true);
				ListarLibros.setVisible(false);
				AltaPrestamo.setVisible(false);
				Listar.setVisible(false);
			}
		});
		mnLibros.add(mntmAltaLibros);

		JMenuItem mntmListarLibros = new JMenuItem("Listar");
		mntmListarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaUsuario.setVisible(false);
				AltaLibros.setVisible(false);
				AltaPrestamo.setVisible(false);
				Listar.setVisible(false);
				ListarLibros.setVisible(true);
			}
		});

		mnLibros.add(mntmListarLibros);

		JMenuItem mntmDarDeBaja = new JMenuItem("Dar de baja");
		mntmDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AltaLibros.setVisible(false);
				AltaUsuario.setVisible(false);
				ListarLibros.setVisible(false);
			}
		});
		mnPréstamos.add(mntmDarDeBaja);

		JMenu mnConsultarPrestamos = new JMenu("Consultar pr\u00E9stamos");
	}
}
