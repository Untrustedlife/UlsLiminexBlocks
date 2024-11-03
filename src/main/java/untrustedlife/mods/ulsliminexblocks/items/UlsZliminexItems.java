package untrustedlife.mods.ulsliminexblocks.items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import untrustedlife.mods.ulsliminexblocks.UlsZliminex;
import untrustedlife.mods.ulsliminexblocks.blocks.UlsZliminexBlocks;


/**
 * Registers this mod's {@link Item}s.
 *
 * @author Untrustedlife
 */
public class UlsZliminexItems {
    // Set up the DeferredRegister for items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UlsZliminex.MODID);

    // Create a custom Creative Mode Tab
    public static final CreativeModeTab LIMINEX_TAB = new CreativeModeTab("liminextab") {
        @Override
        public ItemStack makeIcon() {
            // Set the item icon for the tab (using the broom as an example)
            return new ItemStack(UlsZliminexBlocks.FALSE_SKY_ITEM.get());
        }
    };

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}