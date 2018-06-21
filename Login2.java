import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login2() {
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
		btnNewButton_2.setBackground(new Color(255, 255, 255));
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
		btnAralar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Araçlar arac=new Araçlar();
				arac.setVisible(true);
				
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
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\adam.PNG"));
		label.setBounds(185, 148, 125, 106);
		contentPane.add(label);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\kod.PNG"));
		label_7.setBounds(209, 265, 95, 36);
		contentPane.add(label_7);
		
		textField = new JTextField();
		textField.setText("Kullan\u0131c\u0131 Ad\u0131");
		textField.setColumns(10);
		textField.setBounds(328, 177, 102, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("\u015Eifre");
		textField_1.setColumns(10);
		textField_1.setBounds(328, 208, 102, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Do\u011Frulama Kodu");
		textField_2.setColumns(10);
		textField_2.setBounds(328, 273, 102, 20);
		contentPane.add(textField_2);
		
		JButton button_1 = new JButton("Giri\u015F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ANASAYFA a=new ANASAYFA();
				a.setVisible(true);
				
				dispose();
				
				
			}
		});
		button_1.setBounds(445, 272, 70, 23);
		contentPane.add(button_1);
		
		JButton btnAdmn = new JButton("ADMIN");
		btnAdmn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminPanel1 a=new AdminPanel1();
				a.setVisible(true);
				
				dispose();
				
			}
		});
		btnAdmn.setBackground(Color.ORANGE);
		btnAdmn.setBounds(718, 334, 89, 23);
		contentPane.add(btnAdmn);
	}
}
