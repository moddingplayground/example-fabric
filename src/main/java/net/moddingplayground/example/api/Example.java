package net.moddingplayground.example.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Example {
    String MOD_ID   = "example";
    String MOD_NAME = "Example";
    Logger LOGGER   = LoggerFactory.getLogger(MOD_ID);
}
