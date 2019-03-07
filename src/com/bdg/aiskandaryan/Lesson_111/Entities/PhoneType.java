package com.bdg.aiskandaryan.Lesson_111.Entities;

public enum PhoneType {
    Mobile("mobile"), Work("Work"), Home("home");

    private final String phoneTypeName;

    PhoneType(final String phoneTypeName) {
        this.phoneTypeName = phoneTypeName;
    }

    public static PhoneType findByPhoneTypeName(final String phoneTypeName) {
        for (final PhoneType pt : values()) {
            if (pt.phoneTypeName.equalsIgnoreCase(phoneTypeName)) {
                return pt;
            }
        }
        throw new PhoneTypeNotFoundException(phoneTypeName);
    }

    public String getPhoneTypeName() {
        return this.phoneTypeName;
    }

}
