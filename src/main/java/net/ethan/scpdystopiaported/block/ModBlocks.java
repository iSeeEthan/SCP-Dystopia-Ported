package net.ethan.scpdystopiaported.block;

import net.ethan.scpdystopiaported.scpdystopiaported;
import net.ethan.scpdystopiaported.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, scpdystopiaported.MOD_ID);


    public static final RegistryObject<Block> exterior_brick = registerBlock("exterior_brick",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> exterior_brick_bottom = registerBlock("exterior_brick_bottom",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> exterior_brick_top = registerBlock("exterior_brick_top",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> white_tiles = registerBlock("white_tiles",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.BONE_BLOCK)));

    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}