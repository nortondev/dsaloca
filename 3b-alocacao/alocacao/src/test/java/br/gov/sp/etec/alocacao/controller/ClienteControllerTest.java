package br.gov.sp.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.gov.sp.etec.alocacao.model.Cliente;

@ExtendWith(SpringExtension.class)
public class ClienteControllerTest {
	
	@InjectMocks
	ClienteController controller;
	
	@Test
	public void clientesTestes() {
		 List<Cliente> clientes = controller.clientes();
		 assertNotNull(clientes);
	}
	

}
