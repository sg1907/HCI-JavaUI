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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Anket extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anket frame = new Anket();
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
	public Anket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JLabel a = new JLabel("New label");
		a.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\1.PNG"));
		a.setBounds(466, 80, 260, 83);
		contentPane.add(a);
		a.setVisible(false);
		
		JLabel b = new JLabel("New label");
		b.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\1.PNG"));
		b.setBounds(466, 160, 260, 76);
		contentPane.add(b);
		b.setVisible(false);
		
		JLabel c = new JLabel("New label");
		c.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\1.PNG"));
		c.setBounds(466, 234, 260, 83);
		contentPane.add(c);
		c.setVisible(false);
		
		JLabel d = new JLabel("New label");
		d.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\1.PNG"));
		d.setBounds(466, 311, 260, 83);
		contentPane.add(d);
		d.setVisible(false);
		
		
		
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
		
		
		JLabel lblSoru = new JLabel("Soru 1");
		lblSoru.setBounds(84, 84, 46, 14);
		contentPane.add(lblSoru);
		
		JLabel lblSoru_1 = new JLabel("Soru 2");
		lblSoru_1.setBounds(84, 154, 46, 14);
		contentPane.add(lblSoru_1);
		
		JLabel lblSoru_2 = new JLabel("Soru 3");
		lblSoru_2.setBounds(84, 221, 46, 14);
		contentPane.add(lblSoru_2);
		
		JLabel lblSoru_3 = new JLabel("Soru 4");
		lblSoru_3.setBounds(84, 284, 46, 14);
		contentPane.add(lblSoru_3);
		
		JLabel lblNewLabel_2 = new JLabel("Siteyi Begendiniz mi ?");
		lblNewLabel_2.setBounds(140, 84, 241, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblRenklerUygunmuyudu = new JLabel("Renkler uygunmuydu?");
		lblRenklerUygunmuyudu.setBounds(140, 154, 241, 14);
		contentPane.add(lblRenklerUygunmuyudu);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(140, 221, 241, 14);
		contentPane.add(label_1);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(140, 284, 241, 14);
		contentPane.add(label_7);
		
		JButton btnNewButton_1 = new JButton("\u00C7ok K\u00F6t\u00FC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setBackground(Color.green);
				a.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(52, 109, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnOrta = new JButton("Orta");
		btnOrta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnOrta.setBackground(Color.green);
				a.setVisible(true);
			}
		});
		btnOrta.setBounds(150, 109, 89, 23);
		contentPane.add(btnOrta);
		
		JButton btnIyi = new JButton("\u0130yi");
		btnIyi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIyi.setBackground(Color.green);
				a.setVisible(true);
			}
		});
		btnIyi.setBounds(244, 109, 89, 23);
		contentPane.add(btnIyi);
		
		JButton btnokIyi = new JButton("\u00C7ok \u0130yi");
		btnokIyi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnokIyi.setBackground(Color.green);
				a.setVisible(true);
			}
		});
		btnokIyi.setBounds(338, 109, 89, 23);
		contentPane.add(btnokIyi);
		
		JButton button_1 = new JButton("\u00C7ok \u0130yi");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setBackground(Color.green);
				b.setVisible(true);
			}
		});
		button_1.setBounds(338, 179, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u0130yi");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_2.setBackground(Color.green);
				b.setVisible(true);
			}
		});
		button_2.setBounds(244, 179, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Orta");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_3.setBackground(Color.green);
				b.setVisible(true);
			}
		});
		button_3.setBounds(150, 179, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u00C7ok K\u00F6t\u00FC");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_4.setBackground(Color.green);
				b.setVisible(true);
			}
		});
		button_4.setBounds(52, 179, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\u00C7ok \u0130yi");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_5.setBackground(Color.green);
				c.setVisible(true);
			}
		});
		button_5.setBounds(338, 250, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\u0130yi");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_6.setBackground(Color.green);
				c.setVisible(true);
			}
		});
		button_6.setBounds(244, 250, 89, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Orta");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_7.setBackground(Color.green);
				c.setVisible(true);
			}
		});
		button_7.setBounds(150, 250, 89, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("\u00C7ok K\u00F6t\u00FC");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_8.setBackground(Color.green);
				c.setVisible(true);
			}
		});
		button_8.setBounds(52, 250, 89, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("\u00C7ok \u0130yi");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_9.setBackground(Color.green);
				d.setVisible(true);
			}
		});
		button_9.setBounds(338, 304, 89, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("\u0130yi");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_10.setBackground(Color.green);
				d.setVisible(true);
			}
		});
		button_10.setBounds(244, 304, 89, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("Orta");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_11.setBackground(Color.green);
				d.setVisible(true);
			}
		});
		button_11.setBounds(150, 304, 89, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("\u00C7ok K\u00F6t\u00FC");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_12.setBackground(Color.green);
				d.setVisible(true);
			}
		});
		button_12.setBounds(52, 304, 89, 23);
		contentPane.add(button_12);
	
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sonuc sonuc=new Sonuc();
				sonuc.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnKaydet.setBounds(338, 341, 89, 23);
		contentPane.add(btnKaydet);
	}
}
