package net.ethan.scpdystopiaported.item;

import net.ethan.scpdystopiaported.scpdystopiaported;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, scpdystopiaported.MOD_ID);

public static final RegistryObject<Item> mop = ITEMS.register("mop",
        ()-> new Item(new Item.Properties()));
public static final RegistryObject<Item> research_paper = ITEMS.register("research_paper",
        ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_lvl0 = ITEMS.register("keycard_lvl0",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_lvl1 = ITEMS.register("keycard_lvl1",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_lvl2 = ITEMS.register("keycard_lvl2",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_lvl3 = ITEMS.register("keycard_lvl3",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_lvl4 = ITEMS.register("keycard_lvl4",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_lvl5 = ITEMS.register("keycard_lvl5",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_o5 = ITEMS.register("keycard_o5",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> keycard_omni = ITEMS.register("keycard_omni",
            ()-> new Item(new Item.Properties()));


public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
