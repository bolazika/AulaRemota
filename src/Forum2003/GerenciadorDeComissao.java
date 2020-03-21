package Forum2003;

public class GerenciadorDeComissao {
	public static double calcularComissaoPadrao( double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao/100.00);
	}
	
	public static double calcularComissaoComValorMinimo( double valorMinimo, double valorDaVenda, double percentualDeComissao) {
		double valorComissao = valorDaVenda * (percentualDeComissao/100.00);
		if (valorMinimo > valorComissao) {
			return valorMinimo;
		}
		return valorComissao;
	}

	public static double calcularComissaoComValorFaixa(double valorMinimo, double valorMaximo, double valorDaVenda, double percentualDeComissao) {
		double valorComissao = valorDaVenda * (percentualDeComissao/100.00);
		if (valorMinimo > valorComissao) {
			return valorMinimo;
		}else if(valorMaximo < valorComissao) {
			return valorMaximo;
		}
		return valorComissao;
	}

}
