package nanu4.odyssey;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nanu4.world.gen.ModWorldGeneration;

public class Theodyssey implements ModInitializer {
	public static final String MOD_ID = "theodyssey";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModWorldGeneration.generateModWorldGeneration(); //Initialize Mod World Generator
		

		LOGGER.info("An arduous adventure awaits! (nanu4's Odyssey)");
	}
}