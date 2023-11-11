package main.java;

import java.awt.Color;
import java.util.HashMap;

public class ColorSchemeDark {

    // Colores para el modo claro
    public static final Color WINBG = new Color(0XFAF8EF);
    public static final Color GRIDBG = new Color(0XBBADA0);
    public static final Color BRIGHT = new Color(0X776E65);
    public static final Color LIGHT = new Color(0XF9F6F2);

    // Colores para el modo oscuro
    public static final Color DARK_WINBG = new Color(0x3B3939);
    public static final Color DARK_GRIDBG = new Color(0x4F4949);
    public static final Color DARK_BRIGHT = new Color(0x7C7C7C);
    public static final Color DARK_LIGHT = new Color(0X777777);

    private HashMap<Integer, Color> background = new HashMap<>();

    public ColorSchemeDark() {
        if (Game.isDarkMode) {
            initDarkBackgrounds();
        } else {
            initLightBackgrounds();
        }
    }

    private void initLightBackgrounds() {
        background.put(0, new Color(238, 228, 218, 90));
        background.put(2, new Color(0XEEE4DA));
        background.put(4, new Color(0XEDE0C8));
        background.put(8, new Color(0XF2B179));
        background.put(16, new Color(0XF59563));
        background.put(32, new Color(0XF67C5F));
        background.put(64, new Color(0XF65E3B));
        background.put(128, new Color(0XEDCF72));
        background.put(256, new Color(0XEDCC61));
        background.put(512, new Color(0XEDC850));
        background.put(1024, new Color(0XEDC53F));
        background.put(2048, new Color(0XEDC22E));
    }

    private void initDarkBackgrounds() {
        background.put(0, new Color(30, 30, 30, 90));
        background.put(2, new Color(0x87CEFA)); // Light Sky Blue
        background.put(4, new Color(0xADD8E6)); // Light Blue
        background.put(8, new Color(0xB0E0E6)); // Powder Blue
        background.put(16, new Color(0xF0F8FF)); // Alice Blue
        background.put(32, new Color(0xADD8E6)); // Light Blue
        background.put(64, new Color(0xCAE1FF)); // Light Steel Blue
        background.put(128, new Color(0xE0F0FF)); // Azure
        background.put(256, new Color(0xF0F8FF)); // Alice Blue
        background.put(512, new Color(0xE0FFFF)); // Light Cyan
        background.put(1024, new Color(0xE0FFFF)); // Light Cyan
        background.put(2048, new Color(0xF0F8FF)); // Alice Blue
    }



    public Color getTileBackground(int value) {
        updateColors();
        return background.get(value);
    }

    public Color getTileColor(int value) {
        if (Game.isDarkMode) {
            return (value <= 8) ? DARK_BRIGHT : DARK_LIGHT;
        } else {
            return (value <= 8) ? BRIGHT : LIGHT;
        }
    }

    public void updateColors() {
        if (Game.isDarkMode) {
            initDarkBackgrounds();
        } else {
            initLightBackgrounds();
        }
    }


}