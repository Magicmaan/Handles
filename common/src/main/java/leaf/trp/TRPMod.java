package leaf.trp;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registries;
import leaf.trp.registries.BlockEntityRegistry;
import leaf.trp.registries.BlockRegistry;
import leaf.trp.registries.ItemRegistry;

import java.util.function.Supplier;

public class TRPMod
{
	public static final String MOD_ID = "trp";

	public static void init()
	{
		//blocks have to go first
		BlockRegistry.BLOCKS.register();
		//then items
		ItemRegistry.ITEMS.register();
		BlockEntityRegistry.BLOCK_ENTITIES.register();

		System.out.println(TRPExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
	}
}
