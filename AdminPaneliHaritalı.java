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
import java.awt.SystemColor;

public class AdminPaneliHaritalý extends JFrame {

	private JPanel contentPane;
	private JTextField txtAraPlaka;
	private JTextField txtAraKodu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPaneliHaritalý frame = new AdminPaneliHaritalý();
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
	public AdminPaneliHaritalý() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel harita = new JLabel("New label");
		harita.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\haritta.jpg"));
		harita.setBounds(326, 154, 418, 192);
		contentPane.add(harita);
		harita.setVisible(false);
		
		
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
		lblTr.setBounds(775, 80, 34, 14);
		getContentPane().add(lblTr);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\kucuk adam.PNG"));
		label_2.setBounds(710, 50, 34, 28);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\kajme\\Desktop\\aaaa\\giris.PNG"));
		label_3.setBounds(747, 47, 46, 28);
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
		
		JLabel lblAraSorgulama = new JLabel("Ara\u00E7 Sorgulama : ");
		lblAraSorgulama.setBounds(200, 154, 116, 14);
		contentPane.add(lblAraSorgulama);
		
		txtAraPlaka = new JTextField();
		txtAraPlaka.setBounds(216, 192, 86, 20);
		contentPane.add(txtAraPlaka);
		txtAraPlaka.setColumns(10);
		
		txtAraKodu = new JTextField();
		txtAraKodu.setColumns(10);
		txtAraKodu.setBounds(216, 230, 86, 20);
		contentPane.add(txtAraKodu);
		
		
		
		JLabel label1_a = new JLabel("M\u00FC\u015Fteri Ad\u0131 : ");
		label1_a.setForeground(SystemColor.desktop);
		label1_a.setBounds(211, 279, 100, 14);
		contentPane.add(label1_a);
		label1_a.setVisible(false);
		
		JLabel label2_a = new JLabel("Ara\u00E7 Marka : ");
		label2_a.setForeground(SystemColor.desktop);
		label2_a.setBounds(211, 327, 100, 14);
		contentPane.add(label2_a);
		label2_a.setVisible(false);
		
		JLabel label3_a = new JLabel("Kullan\u0131lan S\u00FCre : ");
		label3_a.setForeground(SystemColor.desktop);
		label3_a.setBounds(211, 374, 100, 14);
		contentPane.add(label3_a);
		label3_a.setVisible(false);
		
		JLabel label4_a = new JLabel("Gidilen Mesafe : ");
		label4_a.setForeground(SystemColor.desktop);
		label4_a.setBounds(422, 374, 100, 14);
		contentPane.add(label4_a);
		label4_a.setVisible(false);
		
		JButton btnNewButton_4 = new JButton("Motoru Durdur");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBackground(new Color(255, 0, 0));
		btnNewButton_4.setBounds(628, 370, 116, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setVisible(false);
		
		
		
		JLabel label1 = new JLabel("Kadir Y\u0131lmaz");
		label1.setBounds(211, 301, 100, 14);
		contentPane.add(label1);
		label1.setVisible(false);
		
		JLabel label2 = new JLabel("Audi");
		label2.setBounds(211, 349, 100, 14);
		contentPane.add(label2);
		label2.setVisible(false);
		
		JLabel label3 = new JLabel("2 SAAT");
		label3.setBounds(312, 374, 100, 14);
		contentPane.add(label3);
		label3.setVisible(false);
		
		JLabel label4 = new JLabel("110 KM");
		label4.setBounds(518, 374, 100, 14);
		contentPane.add(label4);
		label4.setVisible(false);
		
		
		
		
		
		
		JButton btnNewButton_5 = new JButton("Bul");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label1_a.setVisible(true);
				label2_a.setVisible(true);
				label3_a.setVisible(true);
				label4_a.setVisible(true);
				btnNewButton_4.setVisible(true);
				harita.setVisible(true);
				
				
				
				
			}
		});
		btnNewButton_5.setBackground(Color.CYAN);
		btnNewButton_5.setBounds(249, 252, 54, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblPlakaKodu = new JLabel("Plaka Kodu");
		lblPlakaKodu.setBounds(214, 179, 88, 14);
		contentPane.add(lblPlakaKodu);
		
		JLabel lblAraKodu = new JLabel("Ara\u00E7 Kodu");
		lblAraKodu.setBounds(214, 215, 88, 14);
		contentPane.add(lblAraKodu);
		
		
		
		
	}

}
