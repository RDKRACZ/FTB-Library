package dev.ftb.mods.ftblibrary.net;

import dev.ftb.mods.ftblibrary.FTBLibrary;
import me.shedaniel.architectury.networking.simple.MessageType;
import me.shedaniel.architectury.networking.simple.SimpleNetworkManager;

public interface FTBLibraryNet {
	SimpleNetworkManager NET = SimpleNetworkManager.create(FTBLibrary.MOD_ID);

	MessageType EDIT_NBT = NET.registerS2C("edit_nbt", EditNBTPacket::new);
	MessageType EDIT_NBT_RESPONSE = NET.registerC2S("edit_nbt_response", EditNBTResponsePacket::new);
	MessageType SYNC_KNOWN_SERVER_REGISTRIES = NET.registerS2C("sync_known_server_registries", SyncKnownServerRegistriesPacket::new);

	static void init() {
	}
}
