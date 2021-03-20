package com.Dragonking1111.Practicemod.core.init;

import com.Dragonking1111.Practicemod.PracticeMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			PracticeMod.MOD_ID);
	
	public static final RegistryObject<Item> PRACTICE_ITEM = ITEMS.register("practice_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
}
