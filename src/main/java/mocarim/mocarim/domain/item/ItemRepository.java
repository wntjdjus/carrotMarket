package mocarim.mocarim.domain.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    @Query("select a from Item a join fetch a.user where a.category = :category")
    List<Item> findByCategory(String category);

    @Query("select a from Item a join fetch a.user")
    List<Item> findAll();
}
