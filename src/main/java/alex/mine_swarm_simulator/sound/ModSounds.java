package alex.mine_swarm_simulator.sound;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

	// Item Sounds
	public static final SoundEvent COCONUT_CANISTER_SHIELD = registerSoundEvent("item.coconut_canister.shield");
	public static final SoundEvent GUMDROPS_USE = registerSoundEvent("item.gumdrops.use");
	public static final SoundEvent NIGHT_BELL_USE = registerSoundEvent("item.night_bell.use");
	public static final SoundEvent GUMMY_MORPH = registerSoundEvent("item.gummy_mask.gummy_morph");
	public static final SoundEvent GUMMY_STAR = registerSoundEvent("item.supreme_star_amulet.gummy_star");
	public static final SoundEvent POP_STAR = registerSoundEvent("item.supreme_star_amulet.pop_star");
	public static final SoundEvent SCORCHING_STAR = registerSoundEvent("item.supreme_star_amulet.scorching_star");
	public static final SoundEvent STAR_SAW = registerSoundEvent("item.supreme_star_amulet.star_saw");

	// Musics
	public static final SoundEvent ANTMARCH1 = registerSoundEvent("music.antmarch1");
	public static final RegistryKey<JukeboxSong> ANTMARCH1_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "antmarch1"));
	public static final SoundEvent BPATROL = registerSoundEvent("music.bpatrol");
	public static final RegistryKey<JukeboxSong> BPATROL_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "bpatrol"));
	public static final SoundEvent CRAWLERS = registerSoundEvent("music.crawlers");
	public static final RegistryKey<JukeboxSong> CRAWLERS_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "crawlers"));
	public static final SoundEvent DIGITIZE = registerSoundEvent("music.digitize");
	public static final RegistryKey<JukeboxSong> DIGITIZE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "digitize"));
	public static final SoundEvent DRONE = registerSoundEvent("music.drone");
	public static final RegistryKey<JukeboxSong> DRONE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "drone"));
	public static final SoundEvent GBTUNE1 = registerSoundEvent("music.gbtune1");
	public static final RegistryKey<JukeboxSong> GBTUNE1_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "gbtune1"));
	public static final SoundEvent HIBERNATION1 = registerSoundEvent("music.hibernation1");
	public static final RegistryKey<JukeboxSong> HIBERNATION1_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "hibernation1"));
	public static final SoundEvent MOUNTAINCALL = registerSoundEvent("music.mountaincall");
	public static final RegistryKey<JukeboxSong> MOUNTAINCALL_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "mountaincall"));
	public static final SoundEvent NECTAR = registerSoundEvent("music.nectar");
	public static final RegistryKey<JukeboxSong> NECTAR_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "nectar"));
	public static final SoundEvent OVERFLOWIN4 = registerSoundEvent("music.overflowin4");
	public static final RegistryKey<JukeboxSong> OVERFLOWIN4_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "overflowin4"));
	public static final SoundEvent RBCLOADING = registerSoundEvent("music.rbcloading");
	public static final RegistryKey<JukeboxSong> RBCLOADING_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "rbcloading"));
	public static final SoundEvent STARHALL = registerSoundEvent("music.starhall");
	public static final RegistryKey<JukeboxSong> STARHALL_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "starhall"));
	public static final SoundEvent STICKBUG = registerSoundEvent("music.stickbug");
	public static final RegistryKey<JukeboxSong> STICKBUG_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "stickbug"));
	public static final SoundEvent VENDOR = registerSoundEvent("music.vendor");
	public static final RegistryKey<JukeboxSong> VENDOR_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "vendor"));
	public static final SoundEvent WAX = registerSoundEvent("music.wax");
	public static final RegistryKey<JukeboxSong> WAX_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MineSwarmSimulator.MOD_ID, "wax"));

	private static SoundEvent registerSoundEvent(String name) {
		Identifier id = Identifier.of(MineSwarmSimulator.MOD_ID, name);
		return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
	}

	public static void registerModSounds() {
		MineSwarmSimulator.LOGGER.info("Registering Sounds for " + MineSwarmSimulator.MOD_ID);
	}
}
