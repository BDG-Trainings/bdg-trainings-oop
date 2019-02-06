package com.bdg.osahakyan.abstraction.publishmnet;


public class Placement {

    private String name;
    private String description;
    private byte[] bytes;

    public Placement(final String name, final String description, final byte[] bytes) {
        this.name = name;
        this.description = description;
        this.bytes = bytes;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(final byte[] bytes) {
        this.bytes = bytes;
    }
}
