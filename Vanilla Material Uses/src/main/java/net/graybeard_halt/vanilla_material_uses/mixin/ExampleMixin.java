package net.graybeard_halt.vanilla_material_uses.mixin;

import net.graybeard_halt.vanilla_material_uses.Vanilla_Material_Uses;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Vanilla_Material_Uses.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
