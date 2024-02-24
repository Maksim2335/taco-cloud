package com.maksim2335.tacocloud.Coverter;

import com.maksim2335.tacocloud.Model.Ingredient;
import com.maksim2335.tacocloud.Repository.IngredientRepository;
import lombok.Data;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Data
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepo;

//    private Map<String, Ingredient> ingredientMap = new HashMap<>();
//    public IngredientByIdConverter() {
//        ingredientMap.put("FLTO",new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
//        ingredientMap.put("COTO",
//                new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//        ingredientMap.put("GRBF",
//                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//        ingredientMap.put("CARN",
//                new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//        ingredientMap.put("TMTO",
//                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//        ingredientMap.put("LETC",
//                new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//        ingredientMap.put("CHED",
//                new Ingredient("CHED", "Cheddar", Type.CHEESE));
//        ingredientMap.put("JACK",
//                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//        ingredientMap.put("SLSA",
//                new Ingredient("SLSA", "Salsa", Type.SAUCE));
//        ingredientMap.put("SRCR",
//                new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }

    @Override
    public <U> Converter<String, U> andThen(Converter<? super Ingredient, ? extends U> after) {
        return Converter.super.andThen(after);
    }
}
