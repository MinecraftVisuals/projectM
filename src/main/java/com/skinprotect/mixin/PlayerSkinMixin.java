package com.skinprotect.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.entity.player.SkinTextures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public class PlayerSkinMixin {

    @Inject(method = "getSkinTextures", at = @At("HEAD"), cancellable = true)
    private void skinprotect$forceSteve(CallbackInfoReturnable<SkinTextures> cir) {
        // Only replace the skin of the local player (you), nobody else
        if ((Object) this == MinecraftClient.getInstance().player) {
            cir.setReturnValue(DefaultSkinHelper.getSteve());
        }
    }
}
