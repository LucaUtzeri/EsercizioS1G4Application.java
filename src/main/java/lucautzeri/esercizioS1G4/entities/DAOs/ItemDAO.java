package lucautzeri.esercizioS1G4.entities.DAOs;

import lucautzeri.esercizioS1G4.entities.misc.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemDAO extends JpaRepository<Item, Long> {
    Optional<Item> findById(Long id);
}
