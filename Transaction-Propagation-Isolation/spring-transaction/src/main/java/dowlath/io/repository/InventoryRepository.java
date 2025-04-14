package dowlath.io.repository;

import dowlath.io.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Product,Integer> {
}
