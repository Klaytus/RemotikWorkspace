
package net.mcreator.klcreations.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.klcreations.creativetab.TabKleyzAdditionsTab;
import net.mcreator.klcreations.ElementsDimensionAdditions;

@ElementsDimensionAdditions.ModElement.Tag
public class ItemVoidarmor extends ElementsDimensionAdditions.ModElement {
	@GameRegistry.ObjectHolder("klcreations:voidarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("klcreations:voidarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("klcreations:voidarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("klcreations:voidarmorboots")
	public static final Item boots = null;
	public ItemVoidarmor(ElementsDimensionAdditions instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("VOIDARMOR", "klcreations:voidarmor", 25, new int[]{2, 5, 6, 2}, 14,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.flintandsteel.use")),
				3.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("voidarmorhelmet")
				.setRegistryName("voidarmorhelmet").setCreativeTab(TabKleyzAdditionsTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("voidarmorbody")
				.setRegistryName("voidarmorbody").setCreativeTab(TabKleyzAdditionsTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("voidarmorlegs")
				.setRegistryName("voidarmorlegs").setCreativeTab(TabKleyzAdditionsTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("voidarmorboots")
				.setRegistryName("voidarmorboots").setCreativeTab(TabKleyzAdditionsTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("klcreations:voidarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("klcreations:voidarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("klcreations:voidarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("klcreations:voidarmorboots", "inventory"));
	}
}
