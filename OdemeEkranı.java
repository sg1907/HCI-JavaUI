import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class OdemeEkran� extends JFrame {

	private JPanel contentPane;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OdemeEkran� frame = new OdemeEkran�();
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
	public OdemeEkran�() {
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
				
				ANASAYFA a=new ANASAYFA();
				a.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(84, 50, 95, 23);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("EN");
		lblNewLabel_1.setBounds(729, 80, 34, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblTr = new JLabel("TR");
		lblTr.setBounds(773, 80, 34, 14);
		getContentPane().add(lblTr);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\sagalt.PNG"));
		label_1.setBounds(553, 368, 254, 36);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\kucuk adam.PNG"));
		label_2.setBounds(689, 45, 34, 28);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\giris.PNG"));
		label_3.setBounds(733, 47, 46, 28);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\aramabutonu.PNG"));
		label_4.setBounds(713, 11, 80, 26);
		getContentPane().add(label_4);
		
		JButton btnAralar = new JButton("Ara\u00E7lar");
		btnAralar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ara�lar a=new Ara�lar();
				a.setVisible(true);
				
				dispose();
			}
		});
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
		
		JLabel lblNewLabel_2 = new JLabel("Ad\u0131 Soyad\u0131 :");
		lblNewLabel_2.setBounds(98, 155, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTcNo = new JLabel("TC No :");
		lblTcNo.setBounds(98, 179, 94, 14);
		contentPane.add(lblTcNo);
		
		JLabel lblTelNo = new JLabel("Tel No");
		lblTelNo.setBounds(98, 204, 94, 14);
		contentPane.add(lblTelNo);
		
		JLabel lblEposta = new JLabel("E-Posta");
		lblEposta.setBounds(98, 229, 94, 14);
		contentPane.add(lblEposta);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setBounds(98, 254, 94, 14);
		contentPane.add(lblAdres);
		
		JLabel lblYa = new JLabel("Ya\u015F");
		lblYa.setBounds(98, 279, 94, 14);
		contentPane.add(lblYa);
		
		textField = new JTextField();
		textField.setBounds(202, 152, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 176, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 201, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 226, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 251, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(202, 276, 86, 20);
		contentPane.add(textField_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 152, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 176, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 201, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 226, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 251, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(202, 276, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblKrediKartBilgileri = new JLabel("Kredi Kart\u0131 Bilgileri ");
		lblKrediKartBilgileri.setBackground(new Color(255, 255, 255));
		lblKrediKartBilgileri.setBounds(385, 133, 176, 14);
		contentPane.add(lblKrediKartBilgileri);
		
		JLabel lblKartSahibi = new JLabel("Kart Sahibi :");
		lblKartSahibi.setBounds(385, 179, 94, 14);
		contentPane.add(lblKartSahibi);
		
		JLabel lblKartNo = new JLabel("Kart No :");
		lblKartNo.setBounds(385, 204, 94, 14);
		contentPane.add(lblKartNo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(502, 176, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(502, 201, 86, 20);
		contentPane.add(textField_7);
		
		JLabel lblSonKullanmaTarih = new JLabel("Son Kullanma Tarih :");
		lblSonKullanmaTarih.setBounds(385, 251, 130, 14);
		contentPane.add(lblSonKullanmaTarih);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(385, 276, 46, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(443, 276, 46, 20);
		contentPane.add(textField_9);
		
		JLabel lblGvenlikNo = new JLabel("G\u00FCvenlik No :");
		lblGvenlikNo.setBounds(536, 251, 89, 14);
		contentPane.add(lblGvenlikNo);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(542, 276, 46, 20);
		contentPane.add(textField_10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Kiralama \u015Eartlar\u0131n\u0131 Kabul Ediyorum");
		chckbxNewCheckBox.setBackground(new Color(211, 211, 211));
		chckbxNewCheckBox.setBounds(382, 305, 206, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton_3 = new JButton("Ode");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Odendi o=new Odendi();
				o.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_3.setBounds(536, 334, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
