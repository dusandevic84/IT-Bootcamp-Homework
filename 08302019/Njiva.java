package Poljoprivreda;

public class Njiva extends Parcela {
	// Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. Prinos
	// po kvadratnom metru moze da se promeni. Oznaka vrste je N. Prinos njive se
	// racuna po formuli: povrsina_parcele*prinosPoKvM. Tekstualni oblik je
	// Parcela:PrinosPoKvM.
	private double prinos;
	private double Ukupanprinos;

	public Njiva(double povrsina, double prinos) {
		super(povrsina);
		this.prinos = prinos;
	}

	public void setPrinos(double prinos) {
		this.prinos = prinos;
	}

	public double UkupanPrinos() {
		return Ukupanprinos = povrsina * prinos * 3;

	}

	@Override
	public char getVrsta() {
		return 'N';
	}

	@Override
	public String toString() {
		return super.toString() + " | prinos njive je: [" + prinos
				+ " m2]\n Ukupan prinos njive u poslednje tri godine je: " + UkupanPrinos();
	}

}
