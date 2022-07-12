package DevUruhaNagamiya.CrudSpring.repository;

import DevUruhaNagamiya.CrudSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer> {
    Product findByName(String name);
}
