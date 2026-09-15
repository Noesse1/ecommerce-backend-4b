package br.edu.unifio.ecommerce.Repositorios;

import br.edu.unifio.ecommerce.entidades.ItemPedido;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ItemPedidoRepositorioTest {

    @Autowired
    private ItemPedidoRepository repositorio;

    @Test
    public void testBuscarPorId() {
        Optional<ItemPedido> resultado = repositorio.findById(1);
        assertTrue(resultado.isPresent(), "O item de pedido com ID 1 deveria existir.");
    }
}