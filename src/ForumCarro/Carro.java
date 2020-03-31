package ForumCarro;

public class Carro {
	private final static double CONSUMO = 0.250;
	private double combustivelNoTanqueEmLitros;
	private boolean ligado;

	public Carro(double volumeEmLitros) {
		combustivelNoTanqueEmLitros = volumeEmLitros;
		ligado = false;
	}

	public void abastecer(double volumeEmLitros) {
		this.combustivelNoTanqueEmLitros = this.combustivelNoTanqueEmLitros + volumeEmLitros;
	}

	public void ligar() {
		if (combustivelNoTanqueEmLitros - CONSUMO > 0.00) {
			this.ligado = true;
			combustivelNoTanqueEmLitros -= CONSUMO;
		}
	}

	public void desligar() {
		this.ligado = false;
	}

	public void acelerar() {
		if (combustivelNoTanqueEmLitros - CONSUMO > 0.00) {
			combustivelNoTanqueEmLitros -= CONSUMO;
		} else {
			this.desligar();
		}
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean isDesligado() {
		return !isLigado();
	}

	public double getCombustivelNoTanqueEmLitros() {
		return combustivelNoTanqueEmLitros;
	}

}
