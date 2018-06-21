import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JSpinField;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class AracTakip extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AracTakip frame = new AracTakip();
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
	public AracTakip() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\ileri.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(52, 14, 22, 20);
		getContentPane().add(btnNewButton);
		
		
		
		
		JButton button = new JButton(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\geri.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(20, 14, 22, 23);
		getContentPane().add(button);
		
		JTextPane txtpnWwwrentacarcom = new JTextPane();
		txtpnWwwrentacarcom.setText("www.rentacar.com");
		txtpnWwwrentacarcom.setBounds(185, 14, 518, 20);
		getContentPane().add(txtpnWwwrentacarcom);
		
		JButton btnNewButton_1 = new JButton("Anket");
		btnNewButton_1.setBounds(10, 377, 70, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\carp\u0131.PNG"));
		lblNewLabel.setBounds(98, 14, 24, 26);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Ana Sayfa");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(84, 50, 95, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00DCye Ol");
		btnNewButton_3.setBounds(735, 50, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("EN");
		lblNewLabel_1.setBounds(745, 80, 34, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblTr = new JLabel("TR");
		lblTr.setBounds(790, 80, 34, 14);
		getContentPane().add(lblTr);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\sagalt.PNG"));
		label_1.setBounds(553, 368, 254, 36);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\kucuk adam.PNG"));
		label_2.setBounds(669, 45, 34, 28);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\giris.PNG"));
		label_3.setBounds(698, 45, 46, 28);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\aramabutonu.PNG"));
		label_4.setBounds(713, 11, 80, 26);
		getContentPane().add(label_4);
		
		JButton btnAralar = new JButton("Ara\u00E7lar");
		btnAralar.setBounds(178, 50, 95, 23);
		getContentPane().add(btnAralar);
		
		JButton btnKampanyalar = new JButton("Kampanyalar");
		btnKampanyalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKampanyalar.setBounds(274, 50, 95, 23);
		getContentPane().add(btnKampanyalar);
		
		JButton btnOfisler = new JButton("Ofisler");
		btnOfisler.setBounds(369, 50, 95, 23);
		getContentPane().add(btnOfisler);
		
		JButton btnYorumlar = new JButton("Yorumlar");
		btnYorumlar.setBounds(466, 50, 95, 23);
		getContentPane().add(btnYorumlar);
		
		JButton btnHakkmzda = new JButton("Hakk\u0131m\u0131zda");
		btnHakkmzda.setBounds(561, 50, 95, 23);
		getContentPane().add(btnHakkmzda);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\el.png"));
		label_5.setBounds(20, 51, 54, 43);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\ev.png"));
		label_6.setBounds(132, 11, 43, 26);
		getContentPane().add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BMW", "MERCEDES", "OPEL", "AUDI"}));
		comboBox.setBounds(20, 121, 80, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Sedan", "Hatchback"}));
		comboBox_1.setBounds(20, 160, 80, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"LPG", "GAZ", "BENZIN"}));
		comboBox_2.setBounds(20, 201, 80, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Manuel", "Otomatik"}));
		comboBox_3.setBounds(20, 240, 80, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblExtrazellikler = new JLabel("Extra \u00D6zellikler :");
		lblExtrazellikler.setBounds(20, 271, 102, 14);
		contentPane.add(lblExtrazellikler);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Klima");
		chckbxNewCheckBox.setBackground(new Color(211, 211, 211));
		chckbxNewCheckBox.setBounds(25, 292, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxSunRuf = new JCheckBox("Sun RUF");
		chckbxSunRuf.setBackground(new Color(211, 211, 211));
		chckbxSunRuf.setBounds(25, 318, 97, 23);
		contentPane.add(chckbxSunRuf);
		
		JCheckBox chckbxGps = new JCheckBox("GPS");
		chckbxGps.setBackground(new Color(211, 211, 211));
		chckbxGps.setBounds(25, 344, 97, 23);
		contentPane.add(chckbxGps);
		
		JLabel lblAraMarkas = new JLabel("Ara\u00E7 Markas\u0131 : ");
		lblAraMarkas.setBounds(20, 105, 102, 14);
		contentPane.add(lblAraMarkas);
		
		JLabel lblAraTipi = new JLabel("Ara\u00E7 Tipi : ");
		lblAraTipi.setBounds(20, 145, 102, 14);
		contentPane.add(lblAraTipi);
		
		JLabel lblYaktTr = new JLabel("Yak\u0131t T\u00FCr\u00FC : ");
		lblYaktTr.setBounds(20, 187, 102, 14);
		contentPane.add(lblYaktTr);
		
		JLabel lblVitesTr = new JLabel("Vites T\u00FCr\u00FC : ");
		lblVitesTr.setBounds(20, 227, 102, 14);
		contentPane.add(lblVitesTr);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\aaa.PNG"));
		lblNewLabel_2.setBounds(185, 132, 417, 77);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\bbbb.PNG"));
		lblNewLabel_3.setBounds(185, 317, 417, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Haritada Ofisin Yeri :");
		lblNewLabel_4.setBounds(195, 187, 224, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel label = new JLabel("Haritada Ofisin Yeri :");
		label.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\haritta.jpg"));
		label.setBounds(195, 211, 407, 95);
		contentPane.add(label);
		
		JButton btnNewButton_4 = new JButton("Ara\u00E7lar\u0131 G\u00F6ster");
		btnNewButton_4.setBackground(new Color(188, 143, 143));
		btnNewButton_4.setBounds(612, 334, 132, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel label_7 = new JLabel("Haritada Ofisin Yeri :");
		label_7.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\DDDD.PNG"));
		label_7.setBounds(110, 80, 518, 57);
		contentPane.add(label_7);
		
		

	}
}
