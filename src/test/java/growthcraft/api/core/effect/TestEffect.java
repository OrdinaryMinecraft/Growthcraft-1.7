package growthcraft.api.core.effect;

import java.util.Random;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

/**
 * Test Effect, use this as apart of larger effects, and check if it was touched.
 */
public class TestEffect implements IEffect
{
	public int touched;

	public void apply(World world, Entity entity, Random random, Object data)
	{
		touched++;
	}

	public void getDescription(List<String> list)
	{
		list.add("TestEffect");
	}
}
