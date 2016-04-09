package de.wenzlaff;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
/**
 * 
 * @author Thomas Wenzlaff
 * 
 */
public final class Gui extends javax.swing.JFrame {

	private static final long serialVersionUID = 4797167123186009192L;
	private JMenuItem helpMenuItem;
	private JLabel ivLaenge;
	private JMenu jMenu5;
	private JTextField ivPasswortLaenge;
	private JMenuItem ivHomepage;
	private JTextField ivKleinBuchstabeField;
	private JLabel ivKleinBuchstabe;
	private JTextField ivZahlTextField;
	private JLabel ivZahlVorhanden;
	private JTextField ivGrossKleinBuchstaben;
	private JLabel ivGrossbuchstabe;
	private JTextField ivImWorterbuch;
	private JLabel ivWorterbuch;
	private JTextField ivPasswortSonderzeichen;
	private JLabel ivSonderz;
	private JLabel ivPasswortLabel;
	private JLabel ivQualitaet;
	private JTextField ivEingabe;
	private JProgressBar ivFortschritt;
	private JMenuItem exitMenuItem;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;

	private static DictionaryHandler ivDic;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {

		ivDic = new DictionaryHandler();

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Gui inst = new Gui();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public Gui() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			GridBagLayout thisLayout = new GridBagLayout();
			thisLayout.rowWeights = new double[] { 0.1, 0.1, 0.1, 0.1 };
			thisLayout.rowHeights = new int[] { 7, 7, 7, 7 };
			thisLayout.columnWeights = new double[] { 0.1, 0.1, 0.1, 0.1 };
			thisLayout.columnWidths = new int[] { 7, 7, 7, 7 };
			getContentPane().setLayout(thisLayout);
			this.setTitle("Passwort Qualität - TWQualPass");
			{
				ivFortschritt = new JProgressBar(0, 100);
				getContentPane().add(
						ivFortschritt,
						new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				ivFortschritt.setStringPainted(true);
				ivFortschritt.setBackground(new java.awt.Color(192, 192, 192));

			}
			{
				ivEingabe = new JTextField();
				getContentPane().add(
						ivEingabe,
						new GridBagConstraints(0, 1, 4, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 20), 0, 0));
				ivEingabe.addKeyListener(new KeyAdapter() {
					public void keyReleased(KeyEvent evt) {
						getPasswort(evt);
					}
				});

			}
			{
				ivQualitaet = new JLabel();
				getContentPane().add(
						ivQualitaet,
						new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE,
								new Insets(0, 20, 0, 0), 0, 0));
				ivQualitaet.setText("Qualität des Passwortes:");
			}
			{
				ivPasswortLabel = new JLabel();
				getContentPane().add(
						ivPasswortLabel,
						new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE,
								new Insets(10, 20, 0, 0), 0, 0));
				ivPasswortLabel.setText("Eingabe des Passwort");
			}
			{
				ivLaenge = new JLabel();
				getContentPane().add(
						ivLaenge,
						new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE,
								new Insets(10, 20, 10, 0), 0, 0));
				ivLaenge.setText("Länge:");
			}
			{
				ivSonderz = new JLabel();
				getContentPane().add(
						ivSonderz,
						new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE,
								new Insets(10, 20, 10, 0), 0, 0));
				ivSonderz.setText("Sonderzeichen vorhanden:");
			}
			{
				ivPasswortLaenge = new JTextField();
				getContentPane().add(
						ivPasswortLaenge,
						new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				ivPasswortLaenge.setSize(3, 21);
				ivPasswortLaenge.setColumns(3);
				ivPasswortLaenge.setEditable(false);
				ivPasswortLaenge.setText("0");
			}
			{
				ivPasswortSonderzeichen = new JTextField();
				getContentPane().add(
						ivPasswortSonderzeichen,
						new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				ivPasswortSonderzeichen.setEditable(false);
				ivPasswortSonderzeichen.setText("nein");
			}
			{
				ivWorterbuch = new JLabel();
				getContentPane().add(
						ivWorterbuch,
						new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE,
								new Insets(10, 20, 10, 0), 0, 0));
				ivWorterbuch.setText("Im Wörterbuch vorhanden:");
			}
			{
				ivImWorterbuch = new JTextField();
				getContentPane().add(
						ivImWorterbuch,
						new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				ivImWorterbuch.setEditable(false);
				ivImWorterbuch.setText("nein");
			}
			{
				ivGrossbuchstabe = new JLabel();
				getContentPane().add(
						ivGrossbuchstabe,
						new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE,
								new Insets(10, 20, 10, 0), 0, 0));
				ivGrossbuchstabe.setText("Grossbuchstabe vorhanden:");
			}
			{
				ivGrossKleinBuchstaben = new JTextField();
				getContentPane().add(
						ivGrossKleinBuchstaben,
						new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				ivGrossKleinBuchstaben.setText("nein");
				ivGrossKleinBuchstaben.setEditable(false);
			}
			{
				ivZahlVorhanden = new JLabel();
				getContentPane().add(
						ivZahlVorhanden,
						new GridBagConstraints(0, 9, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 0), 0, 0));
				ivZahlVorhanden.setText("Zahl vorhanden:");
			}
			{
				ivZahlTextField = new JTextField();
				getContentPane().add(
						ivZahlTextField,
						new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(10, 0, 10, 0), 0, 0));
				ivZahlTextField.setText("nein");
				ivZahlTextField.setEditable(false);
			}
			{
				ivKleinBuchstabe = new JLabel();
				getContentPane().add(
						ivKleinBuchstabe,
						new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				ivKleinBuchstabe.setText("Kleinbuchstabe vorhanden:");
			}
			{
				ivKleinBuchstabeField = new JTextField();
				getContentPane().add(
						ivKleinBuchstabeField,
						new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
								GridBagConstraints.HORIZONTAL, new Insets(10, 0, 10, 0), 0, 0));
				ivKleinBuchstabeField.setText("nein");
				ivKleinBuchstabeField.setEditable(false);
			}

			this.setSize(406, 442);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("Datei");
					{
						exitMenuItem = new JMenuItem();
						jMenu3.add(exitMenuItem);
						exitMenuItem.setText("Exit");
					}
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Hilfe");
					{
						helpMenuItem = new JMenuItem();
						jMenu5.add(helpMenuItem);
						helpMenuItem.setText("Anleitung ...");
						helpMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								helpMenuItemActionPerformed(evt);
							}
						});
					}
					{
						ivHomepage = new JMenuItem();
						jMenu5.add(ivHomepage);
						ivHomepage.setText("Homepage www.wenzlaff.de ...");
						ivHomepage.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ivHomepageActionPerformed(evt);
							}
						});
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getPasswort(KeyEvent evt) {
		String lvEingegebenesPasswort = ivEingabe.getText();
		berechnePasswortQualitaet(lvEingegebenesPasswort);
	}

	private void berechnePasswortQualitaet(final String pvPasswort) {
		int lvPasswortQualitaet = 0;

		// bewerte die Länge des Passwortes
		int lvPasswortLaenge = pvPasswort.length();
		lvPasswortQualitaet = lvPasswortLaenge * 3;
		if (lvPasswortLaenge < 8) {
			ivPasswortLaenge.setBackground(Color.RED);
		} else {
			ivPasswortLaenge.setBackground(Color.GREEN);
		}
		ivPasswortLaenge.setText("" + lvPasswortLaenge);

		// ist ein Sonderzeichen darin
		boolean lvSonderzeichen = isSonderzeichenVorhanden(pvPasswort);

		if (lvSonderzeichen) {
			ivPasswortSonderzeichen.setText("ja");
			ivPasswortSonderzeichen.setBackground(Color.GREEN);
			lvPasswortQualitaet += 20;
		} else {
			ivPasswortSonderzeichen.setText("nein");
			ivPasswortSonderzeichen.setBackground(Color.RED);
		}
		// ist eine Zahl darin
		if (!ivZahlEnthalten(pvPasswort)) {
			ivZahlTextField.setBackground(Color.RED);
			ivZahlTextField.setText("nein");
		} else {
			ivZahlTextField.setBackground(Color.GREEN);
			ivZahlTextField.setText("ja");
		}
		// ist ein Großer Buchstabe darin
		if (isGrossBuchstabe(pvPasswort)) {
			ivGrossKleinBuchstaben.setBackground(Color.RED);
			ivGrossKleinBuchstaben.setText("nein");
		} else {
			ivGrossKleinBuchstaben.setBackground(Color.GREEN);
			ivGrossKleinBuchstaben.setText("ja");
		}
		// ist ein kleiner Buchstabe darin
		if (isKleinBuchstabe(pvPasswort)) {
			ivKleinBuchstabeField.setBackground(Color.RED);
			ivKleinBuchstabeField.setText("nein");
		} else {
			ivKleinBuchstabeField.setBackground(Color.GREEN);
			ivKleinBuchstabeField.setText("ja");
		}
		// ist das Passwort im Wörterbuch eingetragen
		if (ivDic.isWortInWoerterbuchListe(pvPasswort)) {
			ivImWorterbuch.setText("ja");
			ivImWorterbuch.setBackground(Color.RED);
			lvPasswortQualitaet = lvPasswortQualitaet - 30;
		} else {
			ivImWorterbuch.setText("nein");
			ivImWorterbuch.setBackground(Color.GREEN);
		}
		// es gibt kein 100% iges Passwort
		if (lvPasswortQualitaet > 95) {
			lvPasswortQualitaet = 95;
		}
		ivFortschritt.setValue(lvPasswortQualitaet);

		if (lvPasswortQualitaet < 50) {
			ivFortschritt.setForeground(new java.awt.Color(255, 0, 0));
		} else if (lvPasswortQualitaet >= 50 && lvPasswortQualitaet < 70) {
			ivFortschritt.setForeground(Color.ORANGE);
		} else if (lvPasswortQualitaet >= 70 && lvPasswortQualitaet < 90) {
			ivFortschritt.setForeground(Color.YELLOW);
		} else if (lvPasswortQualitaet >= 90) {
			ivFortschritt.setForeground(Color.GREEN);
		}
	}

	private boolean isKleinBuchstabe(final String pvPasswort) {
		String lvPasswortKopie = pvPasswort.toUpperCase();
		return lvPasswortKopie.equals(pvPasswort);
	}

	/**
	 * Testet ob eine Zahl im Passwort vorhanden ist.
	 * 
	 * @param pvPasswort
	 * @return boolean true, wenn eine Zahl im Passwort ist sonst false.
	 */
	private boolean ivZahlEnthalten(final String pvPasswort) {
		boolean lvRet = false;

		for (int i = 0; i < pvPasswort.length(); i++) {
			lvRet = Character.isDigit(pvPasswort.charAt(i));
			if (lvRet) {
				return true;
			}
		}
		return lvRet;
	}

	private boolean isGrossBuchstabe(final String pvPasswort) {
		String lvPasswortKopie = pvPasswort.toLowerCase();
		return lvPasswortKopie.equals(pvPasswort);
	}

	/**
	 * Checkt ob ein Sonderzeichen vorhanden ist.
	 * 
	 * @param pvEingabe
	 *            das Wort das auf Sonderzeichen überprüft wird.
	 * @return boolean true, wenn ein Sonderzeichen vorhanden ist, sonst false.
	 */
	private boolean isSonderzeichenVorhanden(final String pvEingabe) {
		final char[] lvSonderzeichen = "!\"§$%&/()=?`´}][{^°|><#'*+~_-µ".toCharArray();

		for (int lvI = 0; lvI < pvEingabe.length(); lvI++) {
			for (int lvI2 = 0; lvI2 < lvSonderzeichen.length; lvI2++) {
				if (pvEingabe.charAt(lvI) == lvSonderzeichen[lvI2]) {
					return true;
				}
			}
		}
		return false;
	}

	private void helpMenuItemActionPerformed(ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(new URI("http://www.wenzlaff.de/twqualpass.html"));
		} catch (IOException pvException) {
		} catch (URISyntaxException pvException) {
		}
	}

	private void ivHomepageActionPerformed(ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(new URI("http://www.wenzlaff.de"));
		} catch (IOException pvException) {
		} catch (URISyntaxException pvException) {
		}
	}

}
