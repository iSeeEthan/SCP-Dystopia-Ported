package net.ethan.scpdystopiaported.item;

import net.ethan.scpdystopiaported.scpdystopiaported;
import net.ethan.scpdystopiaported.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public  static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, scpdystopiaported.MOD_ID);

    public static final RegistryObject<CreativeModeTab> scpdystopiaported_items_tab = CREATIVE_MODE_TABS.register("scpdystopiaported_items_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.mop.get()))
                    .title(Component.translatable("creativetab.scpdystopiaported_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.mop.get());
                        pOutput.accept(ModItems.research_paper.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> scpdystopiaported_blocks_tab2 = CREATIVE_MODE_TABS.register("scpdystopiaported_items_tab2",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.exterior_brick_middle.get()))
                    .title(Component.translatable("creativetab.scpdystopiaported_tab2"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.exterior_brick_top.get());
                        pOutput.accept(ModBlocks.exterior_brick_middle.get());
                        pOutput.accept(ModBlocks.exterior_brick_bottom.get());
                        pOutput.accept(ModBlocks.white_tiles.get());
                        pOutput.accept(ModBlocks.facility_concrete_gray.get());
                        pOutput.accept(ModBlocks.facility_concrete_lightgray.get());
                        pOutput.accept(ModBlocks.duct.get());
                        pOutput.accept(ModBlocks.floor_wood.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
