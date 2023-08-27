package net.filler.spitemod.item.custom;

import net.filler.spitemod.SpiteMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TestUsable extends Item {
    public TestUsable(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient() && entity.isAlive()) {
            PlayerEntity player = user.getCommandSource().getPlayer();
            assert player != null;

            // Remove item from hand : May make into function
            if (!player.isCreative()) {
                int i = player.getStackInHand(hand).getCount() - 1;
                ItemStack newstack = new ItemStack(stack.getItem(), i);
                player.setStackInHand(hand, newstack);
                //
            }

            player.sendMessage(Text.literal("Dead lmao"), false);
            entity.kill();
            return ActionResult.SUCCESS;

        } else {
            return ActionResult.FAIL;
        }

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.spitemod.test_usable.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}