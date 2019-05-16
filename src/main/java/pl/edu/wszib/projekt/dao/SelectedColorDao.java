package pl.edu.wszib.projekt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projekt.domain.SelectedColor;

import java.util.List;

@Repository
public interface SelectedColorDao extends CrudRepository<SelectedColor, Integer> {
    List<SelectedColor> findByColor(String color);
}
