package net.ethan.scpdystopiaported.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.Tags;

public class KeycardBlock extends Block {
    public KeycardBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        // Check if the player is holding an oak log
        if (pPlayer.getItemInHand(pHand).getItem() == Items.OAK_LOG) {
            // Play the sound
            pLevel.playSound(pPlayer, pPos, SoundEvents.NOTE_BLOCK_BANJO.get(), SoundSource.BLOCKS,
                    1f, 1f);
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.PASS; // No sound played if not holding an oak log
        }
    }
}
