package com.akuamar1n.sweethome.block;

public enum FruitsType {
    CREAM_APPLEJAM(0, "cream_applejam"),
    CREAM_STRAW(1, "cream_straw"),
    CREAM_BERRY(2, "cream_berry");

    private final int id;
    private final String name;

    FruitsType(int id, String name) {
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
