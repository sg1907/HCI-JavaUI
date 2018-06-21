import java.awt.BorderLayout;
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
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class ANASAYFA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ANASAYFA frame = new ANASAYFA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ANASAYFA() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 450);
		contentPane = new JPanel();
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Anket aaa=new Anket();
				aaa.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(10, 377, 70, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\carp\u0131.PNG"));
		lblNewLabel.setBounds(98, 14, 24, 26);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Ana Sayfa");
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(84, 50, 95, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00DCye Ol");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ÜyeOl uye=new ÜyeOl();
				uye.setVisible(true);

				dispose();
			}
		});
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
		label_4.setBounds(713, 11, 78, 26);
		getContentPane().add(label_4);
		
		JButton btnAraclar = new JButton("Ara\u00E7lar");
		btnAraclar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Araçlar araclar=new Araçlar();
				araclar.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnAraclar.setBounds(178, 50, 95, 23);
		getContentPane().add(btnAraclar);
		
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ANKARA", "ISTANBUL", "IZMIR"}));
		comboBox.setBounds(50, 166, 89, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ANKARA", "ISTANBUL", "IZMIR"}));
		comboBox_1.setBounds(50, 219, 89, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblAlYeri = new JLabel("Al\u0131\u015F Yeri");
		lblAlYeri.setBounds(52, 149, 46, 14);
		getContentPane().add(lblAlYeri);
		
		JLabel lblTeslimYeri = new JLabel("Teslim Yeri");
		lblTeslimYeri.setBounds(52, 197, 61, 20);
		getContentPane().add(lblTeslimYeri);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\carr.jpg"));
		label_7.setBounds(561, 120, 246, 175);
		getContentPane().add(label_7);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(188, 219, 85, 20);
		contentPane.add(monthChooser);
		
		JMonthChooser monthChooser_1 = new JMonthChooser();
		monthChooser_1.setBounds(188, 166, 85, 20);
		contentPane.add(monthChooser_1);
		
		JLabel lblAlTarihi = new JLabel("Al\u0131\u015F Tarihi");
		lblAlTarihi.setBounds(185, 149, 46, 14);
		contentPane.add(lblAlTarihi);
		
		JLabel lblVeriTarihi = new JLabel("Veri\u015F Tarihi");
		lblVeriTarihi.setBounds(185, 200, 59, 14);
		contentPane.add(lblVeriTarihi);
		
		JSpinField spinField = new JSpinField();
		spinField.setBounds(348, 197, 29, 20);
		contentPane.add(spinField);
		
		JLabel lblSaat = new JLabel("Saat");
		lblSaat.setBounds(350, 169, 46, 14);
		contentPane.add(lblSaat);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\car.png"));
		label.setBounds(35, 270, 508, 105);
		contentPane.add(label);
		
		JButton button_1 = new JButton("Favori Ara\u00E7lar\u0131m");
		button_1.setBackground(new Color(127, 255, 212));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(528, 80, 128, 23);
		contentPane.add(button_1);
		
		JButton btnYardmEkran = new JButton("Yard\u0131m Ekran\u0131");
		btnYardmEkran.setBackground(new Color(255, 0, 0));
		btnYardmEkran.setBounds(651, 334, 157, 23);
		contentPane.add(btnYardmEkran);
		
		JButton btnAra = new JButton("Ara");
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Araçlar arac=new Araçlar();
				arac.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnAra.setBackground(new Color(50, 205, 50));
		btnAra.setBounds(450, 240, 89, 23);
		contentPane.add(btnAra);
	}
}
