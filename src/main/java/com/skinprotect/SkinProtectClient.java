package com.skinprotect;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkinProtectClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("skinprotect");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Skin Protect loaded");
    }
}
