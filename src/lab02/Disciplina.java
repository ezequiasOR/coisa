package lab02;

	/**
	* Representacao de uma Disciplina. Com 4 notas, a media, e as horas de estudo.
	* 
	* A classe permite cadastrar as 4 notas, as horas de estudo, o nome da
	* disciplina e retorna se o aluno foi se aprovado ou nao.
	*
	* @author Ezequias Rocha
	*/
public class Disciplina {
	
	private double nota1 = 0;
	private double nota2 = 0;
	private double nota3 = 0;
	private double nota4 = 0;
	private double media;
	private int horas;
	
	private String nomeDisciplina;
	
	/**
	* Constroi a Disciplina a partir do seu nome.
	*
	* @param nomeDisciplina uma String do nome da Disciplina.
	*/
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
		
	/**
	* Atribui a variavel horas a quantidade de horas estudadas.
	* 
	* @param horas um inteiro que indica a quantidade de horas estudadas.
	*/
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	
	/**
	* Atribui a variavel horas a quantidade de horas estudadas.
	* 
	* @param valorNota valor do tipo double que representa a nota de uma avaliacao.
	* @param nota inteiro que indica para que variavel deve ir cada nota.
	*/
	public void cadastraNota(int nota, double valorNota) {
		if (nota == 1) {
			this.nota1 = valorNota;
		} else if (nota == 2) {
			this.nota2 = valorNota;
		} else if (nota == 3) {
			this.nota3 = valorNota;
		} else if (nota == 4) {
			this.nota4 = valorNota;
		}
	}
	
	/**
	* Calcula a media e retorna true caso o aluno tenha sido aprovado e false
	* caso contrario.
	*/
	public boolean aprovado() {
		this.media = (nota1 + nota2 + nota3 + nota4)/4;
		if (media >= 7.0) {
			return true;
		}
		return false;
	}
	
	/**
	* Retorna a String o nomeDiscliplina as horas de estudo a media e as quatro
	* notas do aluno. A representacao segue o formato:
	* NOME DA DISCIPLINA HORAS ESTUDADAS MEDIA [NOTA1, NOTA2, NOTA3, NOTA4].
	*
	* @return a representacao em String dos dados de uma disciplina.
	*/
	@Override
	public String toString() {
		return nomeDisciplina + " " + horas + " " + media + " [" + nota1+", " + nota2 + ", " +
				nota3 + ", " + nota4 + "]";
	}
}
