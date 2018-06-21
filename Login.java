import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;

public class Login {

	private JFrame frame;
	private JTextField txtKullancAd;
	private JTextField txtifre;
	private JTextField txtDorulamaKodu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		initialize();
	}

	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(100, 100, 850, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton = new JButton(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\ileri.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(52, 14, 28, 26);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		JButton button = new JButton(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\geri.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 14, 32, 26);
		frame.getContentPane().add(button);
		
		JTextPane txtpnWwwrentacarcom = new JTextPane();
		txtpnWwwrentacarcom.setText("www.rentacar.com");
		txtpnWwwrentacarcom.setBounds(185, 14, 518, 20);
		frame.getContentPane().add(txtpnWwwrentacarcom);
		
		JButton btnNewButton_1 = new JButton("Anket");
		btnNewButton_1.setBounds(10, 377, 70, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\carp\u0131.PNG"));
		lblNewLabel.setBounds(98, 14, 24, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Ana Sayfa");
		btnNewButton_2.setBounds(84, 50, 95, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00DCye Ol");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(735, 50, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("EN");
		lblNewLabel_1.setBounds(745, 80, 34, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTr = new JLabel("TR");
		lblTr.setBounds(790, 80, 34, 14);
		frame.getContentPane().add(lblTr);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\adam.png"));
		lblNewLabel_2.setBounds(132, 161, 125, 106);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtKullancAd = new JTextField();
		txtKullancAd.setText("Kullan\u0131c\u0131 Ad\u0131");
		txtKullancAd.setBounds(266, 174, 102, 20);
		frame.getContentPane().add(txtKullancAd);
		txtKullancAd.setColumns(10);
		
		txtifre = new JTextField();
		txtifre.setText("\u015Eifre");
		txtifre.setColumns(10);
		txtifre.setBounds(266, 204, 102, 20);
		frame.getContentPane().add(txtifre);
		
		txtDorulamaKodu = new JTextField();
		txtDorulamaKodu.setText("Do\u011Frulama Kodu");
		txtDorulamaKodu.setColumns(10);
		txtDorulamaKodu.setBounds(266, 286, 102, 20);
		frame.getContentPane().add(txtDorulamaKodu);
		
		JButton btnNewButton_4 = new JButton("Giri\u015F");
		btnNewButton_4.setBounds(378, 285, 70, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\kod.PNG"));
		label.setBounds(144, 278, 95, 36);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\sagalt.PNG"));
		label_1.setBounds(553, 368, 254, 36);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\kucuk adam.PNG"));
		label_2.setBounds(666, 45, 34, 28);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\giris.PNG"));
		label_3.setBounds(698, 50, 46, 23);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\aramabutonu.PNG"));
		label_4.setBounds(713, 11, 77, 26);
		frame.getContentPane().add(label_4);
		
		JButton btnAralar = new JButton("Ara\u00E7lar");
		btnAralar.setBounds(178, 50, 95, 23);
		frame.getContentPane().add(btnAralar);
		
		JButton btnKampanyalar = new JButton("Kampanyalar");
		btnKampanyalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKampanyalar.setBounds(274, 50, 95, 23);
		frame.getContentPane().add(btnKampanyalar);
		
		JButton btnOfisler = new JButton("Ofisler");
		btnOfisler.setBounds(369, 50, 95, 23);
		frame.getContentPane().add(btnOfisler);
		
		JButton btnYorumlar = new JButton("Yorumlar");
		btnYorumlar.setBounds(466, 50, 95, 23);
		frame.getContentPane().add(btnYorumlar);
		
		JButton btnHakkmzda = new JButton("Hakk\u0131m\u0131zda");
		btnHakkmzda.setBounds(561, 50, 95, 23);
		frame.getContentPane().add(btnHakkmzda);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\el.png"));
		label_5.setBounds(20, 58, 39, 36);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\ev.png"));
		label_6.setBounds(132, 11, 43, 26);
		frame.getContentPane().add(label_6);
	}
}
