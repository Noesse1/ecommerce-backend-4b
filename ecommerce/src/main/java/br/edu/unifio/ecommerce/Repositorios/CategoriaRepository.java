package br.edu.unifio.ecommerce.Repositorios;

import br.edu.unifio.ecommerce.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {
}