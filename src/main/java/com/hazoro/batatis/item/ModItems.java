package com.hazoro.batatis.item;

import com.hazoro.batatis.batatis;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, batatis.MOD_ID);

    public static final RegistryObject<Item> BATATIS = ITEMS.register("batatis", () -> new Item(
            new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .alwaysEdible()
                            .nutrition(1)
                            .saturationModifier(2f)
                            .build()
                    )
                    .setId(ITEMS.key("batatis")


                    )));
}
