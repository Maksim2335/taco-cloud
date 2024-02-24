package com.maksim2335.tacocloud.Repository;


import com.maksim2335.tacocloud.Model.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository {
    List<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
