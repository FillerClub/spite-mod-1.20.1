package net.filler.spitemod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent TEST_EDIBLE = new FoodComponent.Builder().hunger(7).saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800), 1f).build();
}
