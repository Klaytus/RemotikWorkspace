package net.mcreator.klcreations.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.klcreations.ElementsDimensionAdditions;

@ElementsDimensionAdditions.ModElement.Tag
public class ProcedureAcidvoidMobplayerCollidesBlock extends ElementsDimensionAdditions.ModElement {
	public ProcedureAcidvoidMobplayerCollidesBlock(ElementsDimensionAdditions instance) {
		super(instance, 32);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AcidvoidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 8);
	}
}
