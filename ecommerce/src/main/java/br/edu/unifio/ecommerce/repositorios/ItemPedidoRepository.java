package br.edu.unifio.ecommerce.repositorios;

import br.edu.unifio.ecommerce.entidades.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}