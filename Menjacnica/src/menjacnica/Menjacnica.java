package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.valuta.Kurs;
import menjacnica.valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	
	private LinkedList<Valuta> valute = new LinkedList<>();
	
	@Override
	public void dodajKursValute(Valuta valuta, double prodajni, double kupovni, double srednji, GregorianCalendar datum) {
		
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
		
		for (int i = 0; i < valute.size(); i++) {
			Valuta val = valute.get(i);
			
			if (val.equals(valuta)) {
				val.getKursevi().add(k);
				break;
			}
		}
	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			Valuta val = valute.get(i);
			
			if (val.equals(valuta)) {
				
				for (int j = 0; j < val.getKursevi().size(); j++) {
					Kurs kurs = val.getKursevi().get(j);
					
					if (kurs.getDatum().equals(datum)) {
						val.getKursevi().remove(j);
					}
				}
			}
		}
	}

	@Override
	public Kurs vratiKursValute(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			Valuta val = valute.get(i);
			
			if (val.equals(valuta)) {
				
				for (int j = 0; j < val.getKursevi().size(); j++) {
					Kurs kurs = val.getKursevi().get(j);
					
					if (kurs.getDatum().equals(datum)) {
						return kurs;
					}
				}
			}
		}
		
		return null;
	}

}
