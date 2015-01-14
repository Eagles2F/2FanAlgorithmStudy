package easy_questions;

public class ValidPalindrome {
	public boolean isPalindrome(String s){
		//preprocessing:filtering out all the un-alphanumeric symbols
		StringBuilder post_s=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				post_s.append(s.charAt(i));
			}
		}
		String s1=post_s.toString().toLowerCase();
		if(s1.isEmpty()){
			return true;
		}
		//comparing
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] argvs){
		ValidPalindrome VP = new ValidPalindrome();
		System.out.println(VP.isPalindrome("A man, a plan, a cameo, Zena, Bird, Mocha, Prowel, a rave, Uganda, Wait, a lobola, Argo, Goto, Koser, Ihab, Udall, a revocation, Ebarta, Muscat, eyes, Rehm, a cession, Udella, E-boat, OAS, a mirage, IPBM, a caress, Etam, FCA, a mica, Ojai, Lebowa, Yaeger, a barge, Rab, Alsatian, a mod, Adv, a rps, Ileane, Valeta, Grenada, Hetty, Fayme, REME, HCM, Tsan, Owena, Tamar, Yompur, Isa, Nil, Lorrin, Riksdag, Mona, Ronn, O'Conner, Kirk, an okay, Nafl, Lira, Robi, Rame, FIFA, a need, Rodi, Muharram, Ober, a coma, carri, Hwang, Taos, Salado, Olfe, Camag, Kdar, a hdkf, Jemina, Nadler, Ehud, Rutan, a baster, Ebn, aedegi, a gals, Ira, Tepper, a minim, a gowd, Ulda, Ogawa, TSgt, Callida, Rodl, Ewart, seraphs, Ain, Newgate, Vaden, navettes, Sabah, Swat, Luci, Pam, Arda, pools, a boar, Akira, Gally, CSC, Avalon, a tuba, AAM, Artima, AFB, Selah, wellies, Ronald, BArch, nullos, Uni, an aet, Nadabus, Tyree, Poop, Sennar, CAB, a nanny, Let, Efahan, Dasya, Moon, Ikaria, Nam, Lamar, Egor, Rover, Tanana, Loki, MIP, PharD, endia, rates, Punan, Eba, Alva, Paine, BEF, Fagan, nugae, taws, Una, Woll, a tab, CSE, Kamerad, YCL, a melt, Diehl, Lewellen, Sacci, Reggi, RFA, BSA, naoi, Kuyp, Oceanic, Sipple, Yalu, Kosey, nota, talers, Frida, a wab, Musset, Aoede, Erick, a reign, Attica, Marge, Leta, Mat, Naboth, Saphra, Gila, Arany, Costa, Fasta, Mabel, Udine, Derte, Medill, Erotes, RuPaul, Uzzi, Waler, Omak, a kaif, Freed, a doc, a marga, Nilla, Dole, USPO, Ogata, tubas, somata, Dash, Danika, Salida, Fiji, Emili, Kazak, Oder, CAC, Ilocanos, Nudd, Uda, Susette, Diskin, Numitor, Munn, a tsarina, Valle, Soraya, Masan, Ezaria, Teri, Luks, UNDRO, Naida, Wal, a major, Stelu, OGO, Dilan, Iapetus, an areg, a jacal, Nessi, R. Bayer, Wotan, a tip, Tabb, a stonk, a habu, Salli, Major, Berosus, a tepal, Layla, Gitana, Cold, Ogun, Sadie, Bowen, Rock, Cila, Wey, a halo, Omari, Albniz, Osana, Illimani, Laura, Mitzi, Dacey, a grill, Enyo, Leno, Snashall, a moot, an amt, a tike, Lamaism, Ygerne, Gainer, ilia, Vala, Alia, Keli, Codie, Bikini, Taliesin, Eyde, Baiel, DAgr, Obara, Caracas, Niven, Airlie, Vadim, Seda, a rata, Utas, Olathe, Pohai, Tatum, obli, Nadab, a nook, Corabel, a cercus, Levona, Sida, Sapir, Otilia, MSIE, Mbm, ILS, Opis, Sudra, Lea, Grieg, a robalo, Pack, an amp, Otaru, Savil, Spoor, Tarapoto, Kadner, Everard, Fleur, Nita, Palos, origamis, Lina, Naoma, Lananna, Erdei, trymata, Paza, Mano, Musa,"));
	}
}
