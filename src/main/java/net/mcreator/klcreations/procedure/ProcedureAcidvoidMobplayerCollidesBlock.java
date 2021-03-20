package net.mcreator.klcreations.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.klcreations.ElementsKlcreationsMod;

import java.util.Map;

@ElementsKlcreationsMod.ModElement.Tag
public class ProcedureAcidvoidMobplayerCollidesBlock extends ElementsKlcreationsMod.ModElement {
	public ProcedureAcidvoidMobplayerCollidesBlock(ElementsKlcreationsMod instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AcidvoidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 8);
	}
}
