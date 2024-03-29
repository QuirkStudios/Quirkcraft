package xyz.quirkstudios.quirkcraft.api.event;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.LivingEntity;

public class QuirkEvents {

    public static final Event<PreRender> QUIRK_PRE_RENDER_EVENT = new Event<>(PreRender.class,
            listeners -> (livingEntity, renderer, partialTick, postStack, multiBufferSource, packedLight) ->
                    Event.result(listeners, preRender -> preRender.onRender(livingEntity, renderer, partialTick, postStack, multiBufferSource, packedLight)));

    public static final Event<KeyEvent> QUIRK_KEY_TRIGGER_EVENT = new Event<>(KeyEvent.class,
            listeners -> (livingEntity) ->
                    Event.voidedResult(listeners, keyEvent -> keyEvent));

    @FunctionalInterface
    public interface PreRender {
        // Called before the entity is rendered.
        EventResult onRender(LivingEntity livingEntity,
                      LivingEntityRenderer<LivingEntity, HumanoidModel<LivingEntity>> renderer,
                      float partialTick,
                      PoseStack poseStack,
                      MultiBufferSource multiBufferSource,
                      int packedLight);
    }

    @FunctionalInterface
    public interface KeyEvent {
        // Called when a key is triggered
        void trigger(LivingEntity livingEntity);
    }
}
