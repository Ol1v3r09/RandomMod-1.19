package net.oliver.randommod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab RANDOMMOD_TAB = new CreativeModeTab("randomtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ALUMINIUM_INGOT.get());
        }
    };
}
