package com.akuamar1n.sweethome.block;

public enum CreamType {
    CREAM(0, "cream"),
    CREAM_COCOA(1, "cream_cocoa"),
    CREAM_PILLAR(2, "cream_pillar"),
    CREAM_COCOA_PILLAR(3, "cream_cocoa_pillar"),
    CREAM_PATTERN(4, "cream_pattern"),
    CREAM_COCOA_PATTERN(5, "cream_cocoa_pattern");

    private final int id;
    private final String name;

    CreamType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
