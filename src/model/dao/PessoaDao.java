package model.dao;

import java.util.Date;
import java.util.List;

import model.entities.Pessoa;

public interface PessoaDao {

	/**
	 * Enviando ao bd os dados
	 * Cadastrando paciente:
	 * @param pessoa
	 */
	void insert(Pessoa pessoa);
	/**----------------------------------------------------------
	 * Mostrando ao usu�rio a lista de paciente na tabela:
	 * @return
	 */
	List<Pessoa> listarPessoas();
	/**----------------------------------------------------------
	 * Inserindo a data de vacina��o(hoje) e confirmando a vacina��o (true or false):
	 * @param pessoa
	 */
	void confirmarVacina(Pessoa pessoa);
	/**----------------------------------------------------------
	 * Ordenar a fila de acordo com seu nivel de prioridade:
	 */
	List<Integer> ordenarFila();
	/**----------------------------------------------------------
	 * Pesquisando um paciente atrav�s do cpf cadastrado no banco de dados:
	 * ok
	 */
	Pessoa findByCpf(String cpf);
	/**----------------------------------------------------------
	 * Deletar paciente:
	 * @param cpf
	 */
	void deleteByCpf(String cpf);
	/**
	 * Buscar data:
	 */
	List<Date> buscarData();
}
