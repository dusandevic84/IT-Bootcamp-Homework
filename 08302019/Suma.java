package Poljoprivreda;

public class Suma extends Parcela {
	// Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, prinos po
	// zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju
	// godina. Oznaka vrste je S. Prinos se ostvaruje formulom
	// povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
	// Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period).
	// *Ovo se ostvaruje pozivom super.toString();
	private double PpodSumom;
	private double prinospoStablu;
	private int periodSazrevanja;
	private double prinos;

	public Suma(double povrsina, double PpodSumom, double prinospoStablu, int periodSazrevanja) {
		super(povrsina);
		this.PpodSumom = PpodSumom;
		this.prinospoStablu = prinospoStablu;
		this.periodSazrevanja = periodSazrevanja;
	}

	public double Prinos() {
		return prinos = (povrsina / PpodSumom) * prinospoStablu * (3 / periodSazrevanja);

	}

	@Override
	public char getVrsta() {
		return 'S';
	}

	@Override
	public String toString() {
		return super.toString() + "| Povrsina pod sumom je: [" + PpodSumom + " m2] | Prinos po stablu je: ["
				+ prinospoStablu + " kg] | Period sazrevanja sume je: [" + periodSazrevanja
				+ "] godine \n Prinos sume u poslednje tri godine je: " + Prinos();
	}

}
