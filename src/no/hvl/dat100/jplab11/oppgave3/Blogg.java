package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg))
				return i;
		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {

		boolean tester = false;
			for (int i = 0; i < nesteledig; i++) {
				if (innleggtabell[i].getId() == innlegg.getId()) {
					tester = true;
				}
			}
			return tester;
		
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggtabell.length) {
			return true;
		} else {
			return false;
		}
	}

	public boolean leggTil(Innlegg innlegg) {

		boolean tester = finnInnlegg(innlegg) == -1;
		
		if(tester && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}else {
			return false;
		}

		/*
		if (finnes(innlegg) || ledigPlass() == false) {
			tester = false;
		} else {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			tester = true;
		}
		return tester;
		*/

	}

	public String toString() {
		
		String str = nesteledig + "\n";
		for(int i = 0; i < nesteledig; i++) {
			str = str + innleggtabell[i].toString();
		}
		
		
		return str;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}