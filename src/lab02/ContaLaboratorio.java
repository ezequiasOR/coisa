package lab02;

/**
* Representação de um laboratorio. Com o nome do laboratorio, a cota, e o espaço
* consumido (mbytes).
* 
* A classe permite atualizar o espaço consumido, aumentando ou subtraindo e se o
* aluno atingiu a cota.
*
* @author Ezequias Rocha
*/
public class ContaLaboratorio {
	
	private String nomeLaboratorio;
	private int cota = 2000;
	private int mbytes = 0;
	
	/**
	* Constroi um labortorio a partir do seu nome.
	*
	* @param nomeLaboratorio uma String do nome do laboratorio
	*/
	public ContaLaboratorio (String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}
	
	/**
	* Constroi um labortorio a partir do seu nome e sua cota.
	*
	* @param nomeLaboratorio uma String do nome do labortorio.
	* @param cota o limite do espaço.
	*/
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	
	/**
	 * Soma o valor passado como parametro no espaco consumido pelo aluno.
	 * 
	 * @param mbytes valor que sera somado no espaço utilizado pelo aluno.
	 */
	public void consomeEspaco(int mbytes) {
		this.mbytes += mbytes;
	}
	
	/**
	 * Diminui o valor passado do espaco consumido pelo aluno.
	 * 
	 * @param mbytes valor que sera subtraido do espaco utilizado pelo aluno.
	 */
	public void liberaEspaco(int mbytes) {
		this.mbytes -= mbytes;
	}
	
	/**
	* Retorna um valor boolean indicando se o aluno atingiu a cota do laboratorio.
	* True --> atingiu a cota.
	* false --> nao atingiu a cota.
	*
	* @return um valor boolean.
	*/
	public boolean atingiuCota() {
		if (mbytes >= cota) {
			return true;
		}
		return false;
	}
	
	/**
	* Retorna a String o Nome do Laboratorio o espaco usado e a cota. A representacao
	* segue o formato: NOME DO LABORATORIO  ESPACO USADO / COTA.
	*
	* @return a representacao em String dos dados de um labortorio.
	*/
	
	@Override
	public String toString() {
		return nomeLaboratorio + " " + mbytes + "/" + cota;
	}
}
