package untrustedlife.mods.ulsliminexblocks.items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class PlushieItem extends BlockItem {
    int burnTicks;
    public PlushieItem(Block block,int burnTimeInTicks, Properties properties) {
        super(block, properties);
        this.burnTicks = burnTimeInTicks;
    }

    // Override to provide custom burn time
    @Override
    public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
        return this.burnTicks;
    }
}