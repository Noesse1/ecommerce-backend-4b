package br.edu.unifio.ecommerce.Repositorios;

import br.edu.unifio.ecommerce.entidades.Pedido;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PedidoRepositorioTest {

    @Autowired
    private PedidoRepository repositorio;

    @Test
    public void testBuscarPorId() {
        Optional<Pedido> resultado = repositorio.findById(1);
        assertTrue(resultado.isPresent(), "O pedido com ID 1 deveria existir.");
    }
}