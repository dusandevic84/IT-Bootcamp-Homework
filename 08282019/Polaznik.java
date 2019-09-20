package Ucionica;

public class Polaznik {
	// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
		// Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
		// prezime polaznika se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u
		// obliku: IME_PREZIME{ID}.
		private static int UID = 0;

		public String polaznik;
		private int id;

		public Polaznik(String polaznik) {
			this.polaznik = polaznik;
			id = ++UID;
		}

		public String getPolaznik() {
			return polaznik;
		}


		public int getId() {
			return id;
		}

		public String ispisi() {
			return polaznik + "{" + id + "}";
		}

	}
