package br.edu.unifio.ecommerce.repositorios;

import br.edu.unifio.ecommerce.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}