package lucautzeri.esercizioS1G4.entities.misc;

import lombok.extern.slf4j.Slf4j;
import lucautzeri.esercizioS1G4.entities.DAOs.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ItemService {
    @Autowired
    private ItemDAO itemDAO;

    public void saveItem(Item newItem){
        itemDAO.save(newItem);
    }
}
