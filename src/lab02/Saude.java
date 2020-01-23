package lab02;

/**
* Representacao da saude fisica e mental de um aluno. Recebe o estado da saude
* mental e fisica e avalia a saude de forma geral.
*
* @author Ezequias Rocha
*/
public class Saude {
	
	/**
	 * Recebe 2 Strings representando a saude mental e a saude fisica
	*/
	private String saudeMental;
	private String saudeFisica;
	
	/**
	* Constroi a Saude a partir da classificacao da saude fisica e mental.
	*/
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
	}
	
	/**
	* Atribui a variavel saudeMental a qualidade da saude mental que foi
	* passada em valor.
	* 
	* @param valor uma string que indica a qualidade da saude mental
	*/
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	/**
	* Atribui a variavel saudeFisica a qualidade da saude fisica que foi passada
	* em valor.
	* 
	* @param valor uma string que indica a qualidade da saude fisica
	*/
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	/**
	* Retorna a String o "boa", "fraca" ou "ok", de acordo com a avaliacao das
	* qualidade das saudes passadas.
	*
	* @return a representação em String dos dados de uma disciplina.
	*/
	public String getStatusGeral() {
		if (this.saudeMental.equals("boa") && this.saudeFisica.equals("boa")) {
			return "boa";
		}
		else if (this.saudeMental.equals("fraca") && this.saudeFisica.equals("fraca")) {
			return "fraca";
		}
		return "ok";
	}
}
