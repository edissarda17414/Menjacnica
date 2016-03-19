package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.valuta.Kurs;
import menjacnica.valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKursValute(Valuta valuta, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
