package net.mcreator.dtabliemod.procedures;

import net.minecraft.util.math.RayTraceContext;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dtabliemod.DtablieModModElements;
import net.mcreator.dtabliemod.DtablieModMod;

import java.util.Map;
import java.util.Collections;

@DtablieModModElements.ModElement.Tag
public class VentiloRedstoneOnProcedure extends DtablieModModElements.ModElement {
	public VentiloRedstoneOnProcedure(DtablieModModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DtablieModMod.LOGGER.warn("Failed to load dependency entity for procedure VentiloRedstoneOn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(
					(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
					(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
					(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection
						.setPlayerLocation(
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
												entity.getLook(1f).z * 15),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
								(entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
														entity.getLook(1f).z * 15),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
										.getPos().getY()),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
												entity.getLook(1f).z * 15),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
								_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
	}
}
