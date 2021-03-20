
package net.mcreator.klcreations.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.klcreations.creativetab.TabKleyzAdditionsTab;
import net.mcreator.klcreations.ElementsDimensionAdditions;

@ElementsDimensionAdditions.ModElement.Tag
public class BlockBlackbrick extends ElementsDimensionAdditions.ModElement {
	@GameRegistry.ObjectHolder("klcreations:blackbrick")
	public static final Block block = null;
	public BlockBlackbrick(ElementsDimensionAdditions instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("blackbrick"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("klcreations:blackbrick", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("blackbrick");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(0.6F);
			setResistance(19F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabKleyzAdditionsTab.tab);
		}
	}
}
