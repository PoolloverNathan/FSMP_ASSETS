package net.timeworndevs.figcorpmain.item;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class DramaticDoorsOnlyBlockItem extends BlockItem {
    public DramaticDoorsOnlyBlockItem(Block block, Settings settings) {
        super(block, settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // default white text
        tooltip.add(Text.translatable("item.figcorp.dd_only_item.tooltip").formatted(Formatting.GRAY));

    }
}
