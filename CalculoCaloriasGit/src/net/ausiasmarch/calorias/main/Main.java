package net.ausiasmarch.calorias.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import net.ausiasmarch.common.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField resul;
	private MetabolismoBasal metaB;
	private TipoActividad t1, t2, t3, t4, t5,t6;
	double tfactor;
	private JTextField resul2;
	private JTextField resul3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		metaB = new MetabolismoBasal();
		
		t1 = new TipoActividad("SEDENTARIA", 1.2);
		t2 = new TipoActividad("LIGERA", 1.375);
		t3 = new TipoActividad("MODERADA", 1.55);
		t4 = new TipoActividad("INTENSA", 1.725);
		t5 = new TipoActividad("MUY INTENSA", 1.9);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 58, 260, 172, 172, 88, -96, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0,
				0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		
				JLabel lblNewLabel = new JLabel("Peso (kgs)");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 2;
				gbc_lblNewLabel.gridy = 6;
				contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
				textField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 3;
				gbc_textField.gridy = 6;
				contentPane.add(textField, gbc_textField);
				textField.setColumns(10);
				
						JLabel lblAltura = new JLabel("Altura (cms)");
						GridBagConstraints gbc_lblAltura = new GridBagConstraints();
						gbc_lblAltura.insets = new Insets(0, 0, 5, 5);
						gbc_lblAltura.gridx = 2;
						gbc_lblAltura.gridy = 7;
						contentPane.add(lblAltura, gbc_lblAltura);
		
				textField_1 = new JTextField();
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.insets = new Insets(0, 0, 5, 5);
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 3;
				gbc_textField_1.gridy = 7;
				contentPane.add(textField_1, gbc_textField_1);
				textField_1.setColumns(10);
		
				JLabel lblEdad = new JLabel("Edad");
				GridBagConstraints gbc_lblEdad = new GridBagConstraints();
				gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
				gbc_lblEdad.gridx = 2;
				gbc_lblEdad.gridy = 8;
				contentPane.add(lblEdad, gbc_lblEdad);
				
						textField_2 = new JTextField();
						GridBagConstraints gbc_textField_2 = new GridBagConstraints();
						gbc_textField_2.insets = new Insets(0, 0, 5, 5);
						gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
						gbc_textField_2.gridx = 3;
						gbc_textField_2.gridy = 8;
						contentPane.add(textField_2, gbc_textField_2);
						textField_2.setColumns(10);
		
				JLabel lblSexo = new JLabel("Sexo");
				GridBagConstraints gbc_lblSexo = new GridBagConstraints();
				gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
				gbc_lblSexo.gridx = 2;
				gbc_lblSexo.gridy = 9;
				contentPane.add(lblSexo, gbc_lblSexo);
		
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"----SELECCIONE----", "HOMBRE", "MUJER", "CUANDO TÚ QUIERAS BB"}));
				GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
				gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_1.gridx = 3;
				gbc_comboBox_1.gridy = 9;
				contentPane.add(comboBox_1, gbc_comboBox_1);
				
						JLabel lblFactorDeActividad = new JLabel("Factor de actividad");
						GridBagConstraints gbc_lblFactorDeActividad = new GridBagConstraints();
						gbc_lblFactorDeActividad.insets = new Insets(0, 0, 5, 5);
						gbc_lblFactorDeActividad.gridx = 2;
						gbc_lblFactorDeActividad.gridy = 10;
						contentPane.add(lblFactorDeActividad, gbc_lblFactorDeActividad);
		
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"----SELECCIONE----", "SEDENTARIA", "LIGERA", "MODERADA", "INTENSA", "MUY INTENSA"}));
				comboBox.setToolTipText("SEDENTARIA\nLIGERA\nMODERADA\nINTENSA\nMUY INTENSA\n");
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.gridx = 3;
				gbc_comboBox.gridy = 10;
				contentPane.add(comboBox, gbc_comboBox);

		JLabel lblMetabolismoBasal = new JLabel("METABOLISMO BASAL (kcal)");
		GridBagConstraints gbc_lblMetabolismoBasal = new GridBagConstraints();
		gbc_lblMetabolismoBasal.insets = new Insets(0, 0, 5, 5);
		gbc_lblMetabolismoBasal.gridx = 2;
		gbc_lblMetabolismoBasal.gridy = 12;
		contentPane.add(lblMetabolismoBasal, gbc_lblMetabolismoBasal);

		resul = new JTextField();
		resul.setEditable(false);
		GridBagConstraints gbc_resul = new GridBagConstraints();
		gbc_resul.insets = new Insets(0, 0, 5, 5);
		gbc_resul.fill = GridBagConstraints.HORIZONTAL;
		gbc_resul.gridx = 3;
		gbc_resul.gridy = 12;
		contentPane.add(resul, gbc_resul);
		resul.setColumns(10);

		JLabel lblCalorasParaMantenerse = new JLabel("CALORÍAS PARA MANTENERSE");
		GridBagConstraints gbc_lblCalorasParaMantenerse = new GridBagConstraints();
		gbc_lblCalorasParaMantenerse.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalorasParaMantenerse.gridx = 2;
		gbc_lblCalorasParaMantenerse.gridy = 13;
		contentPane.add(lblCalorasParaMantenerse, gbc_lblCalorasParaMantenerse);

		resul2 = new JTextField();
		resul2.setEditable(false);
		resul2.setColumns(10);
		GridBagConstraints gbc_resul2 = new GridBagConstraints();
		gbc_resul2.insets = new Insets(0, 0, 5, 5);
		gbc_resul2.fill = GridBagConstraints.HORIZONTAL;
		gbc_resul2.gridx = 3;
		gbc_resul2.gridy = 13;
		contentPane.add(resul2, gbc_resul2);

		JLabel lblCalorasParaAdelgazar = new JLabel("CALORÍAS PARA \nADELGAZAR");
		GridBagConstraints gbc_lblCalorasParaAdelgazar = new GridBagConstraints();
		gbc_lblCalorasParaAdelgazar.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalorasParaAdelgazar.gridx = 2;
		gbc_lblCalorasParaAdelgazar.gridy = 14;
		contentPane.add(lblCalorasParaAdelgazar, gbc_lblCalorasParaAdelgazar);

		resul3 = new JTextField();
		resul3.setEditable(false);
		resul3.setColumns(10);
		GridBagConstraints gbc_resul3 = new GridBagConstraints();
		gbc_resul3.insets = new Insets(0, 0, 5, 5);
		gbc_resul3.fill = GridBagConstraints.HORIZONTAL;
		gbc_resul3.gridx = 3;
		gbc_resul3.gridy = 14;
		contentPane.add(resul3, gbc_resul3);

		JButton btnCalcular_1 = new JButton("Calcular");
		btnCalcular_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/**
				 *  DECLARAMOS LAS VARIABLES
				 */
				double peso, altura, mBasal, kcal;
				double factor = 0;
				int edad;

				String factAct, sexo;

				/**
				 * AQUÍ LAS CONVERTIMOS DE TEXTO A NRO
				 */
				peso = Convert.parseDouble(textField.getText());
				altura = Convert.parseDouble(textField_1.getText());
				edad = Convert.parseInt(textField_2.getText());

				sexo = comboBox_1.getSelectedItem().toString();
				factAct = comboBox.getSelectedItem().toString();

				/**
				 *  PASAMOS LOS DATOS A LA CLASE METABOLISMOBASAL
				 */
				metaB.setPeso(peso);
				metaB.setAltura(altura);
				metaB.setEdad(edad);
				metaB.setSexo(sexo);

				
				/**
				 * AQUI LE DECIMOS QUE COJA EL FACTOR DE CADA OBJETO DEL TIPO DE ACTIVIDAD
				 */
				if (factAct.equalsIgnoreCase("SEDENTARIA"))
					metaB.setTipoActividad(t1);
				else if (factAct.equalsIgnoreCase("LIGERA"))
					metaB.setTipoActividad(t2);
				else if (factAct.equalsIgnoreCase("MODERADA"))
					metaB.setTipoActividad(t3);
				else if (factAct.equalsIgnoreCase("INTENSA"))
					metaB.setTipoActividad(t4);
				else if (factAct.equalsIgnoreCase("MUY INTENSA"))
					metaB.setTipoActividad(t5);
				

				/**
				 * AHORA DECLARAMOS LOS METODOS COMO VARIABLES PARA QUE SEA MAS SENCILLO REFERIRSE A ELLOS
				 */
				
				double tot1 = metaB.getMBasal();
				double tot2 = metaB.getCalorias();
				double tot3 = metaB.getAdelgazar();
				
				/**
				 * POR ULTIMO LE DECLARO EL RESULTADO DE CADA METODO COMO EL TEXTO QUE SACARA CADA RESULTADO
				 */

				resul.setText(Convert.format(tot1, 2));
				resul2.setText(Convert.format(tot2, 2));
				resul3.setText(Convert.format(tot3, 2));
			}
		});
		GridBagConstraints gbc_btnCalcular_1 = new GridBagConstraints();
		gbc_btnCalcular_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalcular_1.gridx = 3;
		gbc_btnCalcular_1.gridy = 15;
		contentPane.add(btnCalcular_1, gbc_btnCalcular_1);

	}

}
