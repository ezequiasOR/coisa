package lab02;

/**
* Representacao de uma Conta na cantina. Com a quantidade de itens comprados, o
* valor em centavos pagos, o nome da cantina e o valor que falta pagar
* 
* A classe permite registrar a quantidade de itens comprados, o nome da cantina
* o valor em centavos que falta pagar e o valor em centavos do que foi comprado.
*
* @author Ezequias Rocha
*/
public class ContaCantina {
	
	/**
	 * Atribui a quantidade de itens, o valor em centavos o nome da cantina e o
	 * que falta pagar.
	*/
	private int qtdItens = 0;
	private int valorCentavos = 0;
	private int faltaPagar = 0;
	private String nomeDaCantina;
	
	/**
	* Constroi a ContaCantina a partir do seu nome.
	*
	* @param nomeDaCantina uma String do nome da Cantina.
	*/
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	
	/**
	* Atribui a variavel qtdItens a quantidade de itens comprados e a variavel
	* valor centavos o preco dos valor a ser pago pelo lanche.
	* 
	* @param qtdItens um inteiro que indica a quantidade de itens comprados.
	* @param valorCentavos um inteiro que indica o preÃ§o dos lanches.
	*/
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.valorCentavos += valorCentavos;
	}
	
	/**
	* Atribui a variavel faltaPagar o valor do lanche a ser pago.
	* 
	* @param valorCentavos um inteiro que indica a o valor que foi pago
	*/
	public void pagaConta(int valorCentavos) {
		this.faltaPagar += valorCentavos;
	}
	
	/**
	 * retorna o valor a ser pago.
	 */
	public int getFaltaPagar() {
		return  valorCentavos - faltaPagar;
	}
	
	/**
	* Retorna a String com o nome da cantina a quantidade de itens comprados e
	* o valor total comprado. 
	* A representacao segue o formato: NOME DA CANTINA QUANTIDADE DE ITENS VALOR CENTAVOS.
	*
	* @return a representacao em String dos dados da Conta na Cantina.
	*/
	@Override
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorCentavos;
	}
}
