package com.maksim2335.tacocloud.Repository;


import com.maksim2335.tacocloud.Model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
