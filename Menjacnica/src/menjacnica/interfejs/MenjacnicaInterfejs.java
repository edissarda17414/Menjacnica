package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.valuta.Kurs;
import menjacnica.valuta.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajKursValute(Valuta valuta, double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum);
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum);

}
