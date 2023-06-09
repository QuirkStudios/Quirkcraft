package xyz.quirkstudios.quirkcraft.api;

import net.minecraft.resources.ResourceLocation;

/**
 * The main class to implement to create a Quirkcraft plugin. Everything communicated between Quirkcraft and your mod should be done through this class.
 * IQuirkcraftPlugins must have the {@link QuirkcraftPlugin} annotation to get loaded by Quirkcraft.
 */
public interface IQuirkcraftPlugin {

    /**
     * The ID for this plugin.
     * The namespace should be in your mod's modId.
     *
     * @return ResourceLocation representing the ID for this plugin.
     */
    ResourceLocation getPluginID();
}
