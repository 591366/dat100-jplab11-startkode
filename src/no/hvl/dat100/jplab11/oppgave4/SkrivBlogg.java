package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		/*
		samling.toString();
		String utfil = filnavn;
		File f = new File(utfil);
		PrintWriter skriver = new PrintWriter(f);
		skriver.println(samling.toString());
		
		skriver.close();
		*/
		
		 try{
			 
			 File fil = new File (mappe, filnavn);
			 PrintWriter skriver = new PrintWriter(fil);
			 skriver.println(samling.toString());

		        

		        skriver.close();
		        return true;

		    }catch(Exception e){
		        System.out.println("filen kunne ikke skrives");
		        return false;
		    }
	}
}
