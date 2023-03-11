package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs{
private List<Knjiga> knjige;

public Biblioteka() {
	// TODO Auto-generated constructor stub
	knjige = new ArrayList<>();
}

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub
		knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		// TODO Auto-generated method stub
		if (autor==null && isbn<=0 && naslov==null && izdavac==null)
			return knjige;
		
		List<Knjiga> result = new ArrayList<>();
		for(Knjiga k : knjige) {
			if(k.getIsbn() == isbn)
				result.add(k);
		}
		return result;
	}

}
