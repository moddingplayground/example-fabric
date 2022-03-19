package net.moddingplayground.example.impl;

import net.fabricmc.api.ModInitializer;
import net.moddingplayground.example.api.Example;
import net.moddingplayground.frame.api.util.InitializationLogger;

public final class ExampleImpl implements Example, ModInitializer {
	private final InitializationLogger initializer;

	public ExampleImpl() {
		this.initializer = new InitializationLogger(LOGGER, MOD_NAME);
	}

	@Override
	public void onInitialize() {
		this.initializer.start();

		//

		this.initializer.finish();
	}
}
