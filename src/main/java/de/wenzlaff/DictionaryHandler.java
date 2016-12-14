/**
 * 
 * ----------------------------------------
 * 
 * @author Copyright 2007 by Thomas Wenzlaff (<a
 *         href="mailto://gesundheitskarte@wenzlaff.de">gesundheitskarte@wenzlaff.de</a>)
 * @see <a href="http://www.wenzlaff.de">www.wenzlaff.de</a>
 * @since 02.12.2007
 * @version 1.0 ----------------------------------------
 * 
 * Not Warranty to use it.
 */
package de.wenzlaff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Thomas Wenzlaff
 *
 */
public class DictionaryHandler {

	/**
	 * http://de.openoffice.org/spellcheck/about-spellcheck-detail.html
	 */
	private static final String RESOURCES_WOERTERBUCH = "/de_DE.dic";

	private List<String> ivWoerterbuchListe;

	public DictionaryHandler() {
		initDictionary();
	}

	/**
	 * Laden der Wörterbuch Datei.
	 */
	private void initDictionary() {
		ivWoerterbuchListe = new ArrayList<String>();
		BufferedReader lvIn = null;
		try {
			lvIn = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(RESOURCES_WOERTERBUCH)));

			for (String lvWort = null; (lvWort = lvIn.readLine()) != null && lvWort.length() > 0; ivWoerterbuchListe.add(lvWort)) {

				if (lvWort.indexOf("/") != -1) {
					lvWort = lvWort.substring(0, lvWort.indexOf("/"));
				}
			}
		} catch (IOException pvException) {
			System.out.println("Fehler: " + pvException.getLocalizedMessage());
		}
	}

	/**
	 * Gibt die Liste aller Wörter aus dem Wörterbuch.
	 * 
	 * @return
	 */
	public List<String> getWoerterbuchListe() {
		return ivWoerterbuchListe;
	}

	/**
	 * Checkt ob das Wort im Wörterbuch vorhanden ist.
	 * 
	 * @param pvWort
	 *            das Wort welches überprüft wird.
	 * @return boolean true, wenn das Wort im Wörterbuch vorhanden ist, sonst false.
	 */
	public boolean isWortInWoerterbuchListe(String pvWort) {
		return ivWoerterbuchListe.contains(pvWort);
	}

}
