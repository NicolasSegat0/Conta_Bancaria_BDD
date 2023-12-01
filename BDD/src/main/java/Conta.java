/**
 * @author nicolas
 */
import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * @class uma classe para tratar os erros apartir da abordagem BDD.
 */
public class Conta {
	private double valorAtual;
	@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int valor) throws Throwable {
	    this.valorAtual =- valor;
	    throw new PendingException();
	}

	@When("^foi solicitado um saque no valor de (\\d+) reais$")
	public void foi_solicitado_um_saque_no_valor_de_reais(int valorDoSaque) throws Throwable {
	    // Verifica se o valor que sera sacado não ultrapassa o saldo
		if (valorDoSaque <= Math.abs(valorAtual)) {
			valorAtual -= valorDoSaque;
		}
	    throw new PendingException();
	}

	@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int novoValor) throws Throwable {
	    // Analisar se o saldo foi atualizado de forma correta.
		assertEquals(-novoValor, valorAtual);
	    throw new PendingException();
	}

	@Then("^não deve efetuar o saque e deve retornar a mensagem saldo insuficiente$")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente(int valor) throws Throwable {
	    // Implementar os resultados adicionais nescessários.
		
		this.valorAtual =-valor;
	    throw new PendingException();
	}

}
