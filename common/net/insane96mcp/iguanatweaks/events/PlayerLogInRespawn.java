package net.insane96mcp.iguanatweaks.events;

import net.insane96mcp.iguanatweaks.modules.ModuleGeneral;
import net.insane96mcp.iguanatweaks.modules.ModuleSleepRespawn;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class PlayerLogInRespawn {
	@SubscribeEvent
	public static void EventPlayerLogin(PlayerLoggedInEvent event) {
		ModuleSleepRespawn.ProcessSpawn(event.player);
		ModuleGeneral.IncreasedStepHeight(event.player);
	}
	
	@SubscribeEvent
	public static void EventPlayerRespawn(PlayerRespawnEvent event) {
		ModuleSleepRespawn.ProcessRespawn(event.player);
	}
}
