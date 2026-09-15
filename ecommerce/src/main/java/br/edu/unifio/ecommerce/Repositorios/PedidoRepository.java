package br.edu.unifio.ecommerce.Repositorios;

import br.edu.unifio.ecommerce.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}