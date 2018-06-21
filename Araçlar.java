import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Araçlar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Araçlar frame = new Araçlar();
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
	public Araçlar() {
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
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
		
		JButton btnnasayfa = new JButton("Ana Sayfa");
		btnnasayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANASAYFA aaa=new ANASAYFA();
				aaa.setVisible(true);
				
				dispose();
			}
		});
		btnnasayfa.setBackground(Color.GREEN);
		btnnasayfa.setBounds(84, 50, 95, 23);
		getContentPane().add(btnnasayfa);
		btnnasayfa.setBackground(Color.white);
		
		JButton btnNewButton_3 = new JButton("\u00DCye Ol");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ÜyeOl uyeol=new ÜyeOl();
				uyeol.setVisible(true);
				
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
		label_4.setBounds(713, 11, 80, 26);
		getContentPane().add(label_4);
		
		JButton btnAraclar = new JButton("Ara\u00E7lar");
		btnAraclar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		btnAraclar.setBounds(178, 50, 95, 23);
		getContentPane().add(btnAraclar);
		btnAraclar.setBackground(Color.green);
		
		
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
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\a.PNG"));
		lblNewLabel_2.setBounds(117, 84, 139, 82);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\b.PNG"));
		label.setBounds(117, 177, 139, 82);
		contentPane.add(label);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\c.PNG"));
		label_7.setBounds(117, 270, 139, 82);
		contentPane.add(label_7);
		
		JButton btnDetaylIncele = new JButton("Detayl\u0131 \u0130ncele");
		btnDetaylIncele.setBounds(509, 98, 118, 23);
		contentPane.add(btnDetaylIncele);
		
		JButton btnSe = new JButton("Se\u00E7");
		btnSe.setBounds(509, 125, 118, 23);
		contentPane.add(btnSe);
		
		JButton button_2 = new JButton("Detayl\u0131 \u0130ncele");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				AraclarDetaylý ddd=new AraclarDetaylý();
				ddd.setVisible(true);

				dispose();
				
				
			}
		});
		button_2.setBounds(509, 189, 118, 23);
		contentPane.add(button_2);
		
		JButton btnSe_1 = new JButton("Se\u00E7");
		btnSe_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SürücüBilgileri ekran=new SürücüBilgileri();
				ekran.setVisible(true);
				
				dispose();
				
			}
		});
		btnSe_1.setBounds(509, 216, 118, 23);
		contentPane.add(btnSe_1);
		
		JButton button_4 = new JButton("Detayl\u0131 \u0130ncele");
		button_4.setBounds(509, 284, 118, 23);
		contentPane.add(button_4);
		
		JButton btnSe_2 = new JButton("Se\u00E7");
		btnSe_2.setBounds(509, 311, 118, 23);
		contentPane.add(btnSe_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\aa.PNG"));
		lblNewLabel_3.setBounds(294, 82, 132, 86);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\aa.PNG"));
		label_8.setBounds(294, 173, 132, 86);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\aa.PNG"));
		label_9.setBounds(294, 266, 132, 86);
		contentPane.add(label_9);
		
		
	}
}
