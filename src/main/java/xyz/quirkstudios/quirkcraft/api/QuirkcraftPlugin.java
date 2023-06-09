package xyz.quirkstudios.quirkcraft.api;

/**
 * This annotation lets Quirkcraft detect mod plugins.
 * All {@link IQuirkcraftPlugin} must have this annotation and a constructor with no arguments.
 *
 * <pre>
 * {@code
 * @QuirkcraftPlugin
 * public class MyModPlugin implements IQuirkcraftPlugin {
 *     @Override
 *     public ResourceLocation getPluginID() {
 *         return new ResourceLocation(MyMod.MOD_ID, "myPlugin");
 *     }
 * }
 * }
 * </pre>
 */
public @interface QuirkcraftPlugin {
}