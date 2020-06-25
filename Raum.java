/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 * 
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
package zuul4;

import java.util.HashMap;

public class Raum 
{
	private String beschreibung;
	private HashMap<String, Raum> ausgaenge;

	/**
	 * 	private Raum nordausgang;
	private Raum suedausgang;
	private Raum ostausgang;
	private Raum westausgang;
	private Raum treppeNachOben;
	private Raum treppeNachUnten;
	 * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
	 * hat anfangs keine Ausgänge.
	 * @param beschreibung enthält eine Beschreibung in der Form
	 *        "in einer Küche" oder "auf einem Sportplatz".
	 */
	public Raum(String beschreibung) 
	{
		this.beschreibung = beschreibung;
		ausgaenge = new HashMap<>();
	}


	/**
	 * Definiere die Ausgänge dieses Raums. Jede Richtung
	 * führt entweder in einen anderen Raum oder ist 'null'
	 * (kein Ausgang).
	 * @param norden Der Nordeingang.
	 * @param osten Der Osteingang.
	 * @param sueden Der Südeingang.
	 * @param westen Der Westeingang.
	 */

	public void setAusgang(String richtung, Raum raumnachbar) {
		ausgaenge.put(richtung, raumnachbar);
	}


	/**
	 * @return Die Beschreibung dieses Raums.
	 */
	public String gibBeschreibung()
	{
		return beschreibung;
	}

	public Raum getAusgang(String richtung) {
		return ausgaenge.get(richtung);
	}

	public String ausgaengetoString() {
		String listeDerAusgaenge = "";
		for(String s: ausgaenge.keySet()) {
			listeDerAusgaenge += s + " ";
		}
		return listeDerAusgaenge;
	}

}
