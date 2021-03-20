
package net.mcreator.klcreations.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.klcreations.creativetab.TabKleyzAdditionsTab;
import net.mcreator.klcreations.ElementsDimensionAdditions;

@ElementsDimensionAdditions.ModElement.Tag
public class ItemVoidIngot extends ElementsDimensionAdditions.ModElement {
	@GameRegistry.ObjectHolder("klcreations:voidingot")
	public static final Item block = null;
	public ItemVoidIngot(ElementsDimensionAdditions instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("klcreations:voidingot", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(1);
			maxStackSize = 64;
			setUnlocalizedName("voidingot");
			setRegistryName("voidingot");
			setCreativeTab(TabKleyzAdditionsTab.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 10;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
