package github.mcdatapack.more_tools_and_armor.mixns;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.block.entity.BrushableBlockEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = BrushableBlockEntity.class, remap = false)
public class BrushableBlockEntityMixin {
    @Redirect(method = "generateItem", at = @At(value = "INVOKE", target = "Lit/unimi/dsi/fastutil/objects/ObjectArrayList;size()I"))
    private int generateItem(ObjectArrayList<ItemStack> instance) {
        if (instance.size() == 2 && (instance.get(1).getItem().equals(ItemInit.ANCIENT_COIN) || instance.get(1).getItem().equals(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE))) {
            instance.set(0, instance.get(1));
        }
        return 1;
    }
}
