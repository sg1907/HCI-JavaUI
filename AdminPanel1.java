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

public class AdminPanel1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel1 frame = new AdminPanel1();
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
	public AdminPanel1() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\carp\u0131.PNG"));
		lblNewLabel.setBounds(98, 14, 24, 26);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Ana Sayfa");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(84, 50, 95, 23);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("EN");
		lblNewLabel_1.setBounds(745, 80, 34, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblTr = new JLabel("TR");
		lblTr.setBounds(790, 80, 34, 14);
		getContentPane().add(lblTr);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\kucuk adam.PNG"));
		label_2.setBounds(717, 50, 34, 28);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\giris.PNG"));
		label_3.setBounds(761, 47, 46, 28);
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
		
		JButton btnAraEkle = new JButton("Ara\u00E7 Ekle");
		btnAraEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAraEkle.setBounds(20, 105, 122, 23);
		contentPane.add(btnAraEkle);
		
		JButton button_2 = new JButton("Ara\u00E7lar");
		button_2.setBounds(20, 129, 122, 23);
		contentPane.add(button_2);
		
		JButton btnKiralananAralar = new JButton("Kiralanan Ara\u00E7lar");
		btnKiralananAralar.setBounds(20, 154, 122, 23);
		contentPane.add(btnKiralananAralar);
		
		JButton btnRezervasyonlar = new JButton("Rezervasyonlar");
		btnRezervasyonlar.setBounds(20, 181, 122, 23);
		contentPane.add(btnRezervasyonlar);
		
		JButton btnKampanyalar_1 = new JButton("Kampanyalar");
		btnKampanyalar_1.setBounds(20, 206, 122, 23);
		contentPane.add(btnKampanyalar_1);
		
		JButton btnKullanclar = new JButton("Kullan\u0131c\u0131lar");
		btnKullanclar.setBounds(20, 229, 122, 23);
		contentPane.add(btnKullanclar);
		
		JButton btnKaraListe = new JButton("Kara Liste");
		btnKaraListe.setBounds(20, 252, 122, 23);
		contentPane.add(btnKaraListe);
		
		JButton btnKabs = new JButton("KABIS");
		btnKabs.setBounds(20, 275, 122, 23);
		contentPane.add(btnKabs);
		
		JButton btnOfisGelirGider = new JButton("Ofis Gelir Gider");
		btnOfisGelirGider.setBounds(20, 301, 122, 23);
		contentPane.add(btnOfisGelirGider);
		
		JButton btnAraMuayene = new JButton("Ara\u00E7 Muayene");
		btnAraMuayene.setBounds(20, 323, 122, 23);
		contentPane.add(btnAraMuayene);
		
		JButton btnNewButton_1 = new JButton("ARA\u00C7 TAK\u0130P");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminPaneliHaritalý a=new AdminPaneliHaritalý();
				a.setVisible(true);
				
				dispose();
				
			}
		});
		btnNewButton_1.setBackground(new Color(72, 209, 204));
		btnNewButton_1.setBounds(10, 358, 132, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnHesap = new JButton("Hesap");
		btnHesap.setBackground(Color.WHITE);
		btnHesap.setBounds(231, 80, 80, 23);
		contentPane.add(btnHesap);
		
		JButton btnIilik = new JButton("\u0130\u015F\u00E7ilik");
		btnIilik.setBackground(Color.WHITE);
		btnIilik.setBounds(310, 80, 80, 23);
		contentPane.add(btnIilik);
		
		JButton btnEvraklar = new JButton("Evraklar");
		btnEvraklar.setBackground(Color.WHITE);
		btnEvraklar.setBounds(384, 80, 80, 23);
		contentPane.add(btnEvraklar);
		
		JButton btnPolie = new JButton("Poli\u00E7e");
		btnPolie.setBackground(Color.WHITE);
		btnPolie.setBounds(464, 80, 80, 23);
		contentPane.add(btnPolie);
		
		JButton btnTablolar = new JButton("Tablolar");
		btnTablolar.setBackground(Color.WHITE);
		btnTablolar.setBounds(546, 80, 80, 23);
		contentPane.add(btnTablolar);
		
		JButton button_7 = new JButton("Ana Sayfa");
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(216, 104, 95, 23);
		contentPane.add(button_7);
		
		JButton btnSiteAyar = new JButton("Site Ayar\u0131");
		btnSiteAyar.setBackground(Color.WHITE);
		btnSiteAyar.setBounds(310, 104, 80, 23);
		contentPane.add(btnSiteAyar);
		
		JButton btnYnetim = new JButton("Y\u00F6netim");
		btnYnetim.setBackground(Color.WHITE);
		btnYnetim.setBounds(384, 104, 80, 23);
		contentPane.add(btnYnetim);
		
		JButton btnAraYne = new JButton("Ara\u00E7 Y\u00F6ne");
		btnAraYne.setBackground(Color.WHITE);
		btnAraYne.setBounds(466, 104, 80, 23);
		contentPane.add(btnAraYne);
		
		JButton btnyeYnetim = new JButton("\u00DCye Y\u00F6netim");
		btnyeYnetim.setBackground(Color.WHITE);
		btnyeYnetim.setBounds(546, 104, 110, 23);
		contentPane.add(btnyeYnetim);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\cccc.PNG"));
		lblNewLabel_2.setBounds(216, 140, 110, 104);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\ad.PNG"));
		label.setBounds(216, 270, 418, 128);
		contentPane.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("Ad\u0131  : ");
		lblNewLabel_3.setBounds(356, 158, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblSoyad = new JLabel("Soyad\u0131 : ");
		lblSoyad.setBounds(356, 185, 46, 14);
		contentPane.add(lblSoyad);
		
		JLabel lblOfisYeri = new JLabel("Ofis Yeri : ");
		lblOfisYeri.setBounds(356, 210, 65, 14);
		contentPane.add(lblOfisYeri);
		
		JLabel lblKullancYorumGrafii = new JLabel("Kullan\u0131c\u0131 Yorum Grafi\u011Fi");
		lblKullancYorumGrafii.setBounds(216, 256, 153, 14);
		contentPane.add(lblKullancYorumGrafii);
		
		JLabel lblKiralananAratoplamAra = new JLabel("Kiralanan Ara\u00E7/Toplam Ara\u00E7");
		lblKiralananAratoplamAra.setBounds(356, 256, 188, 14);
		contentPane.add(lblKiralananAratoplamAra);
		
		JLabel lblDursun = new JLabel("Dursun");
		lblDursun.setBounds(441, 158, 46, 14);
		contentPane.add(lblDursun);
		
		JLabel lblKaraByk = new JLabel("KaraB\u0131y\u0131k");
		lblKaraByk.setBounds(441, 185, 46, 14);
		contentPane.add(lblKaraByk);
		
		JLabel lblSincanankara = new JLabel("Sincan/Ankara");
		lblSincanankara.setBounds(441, 210, 120, 14);
		contentPane.add(lblSincanankara);
	}

}
