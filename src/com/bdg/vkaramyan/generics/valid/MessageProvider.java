package com.bdg.vkaramyan.generics.valid;


public interface MessageProvider<T extends CharSequence> {

    T provideMessage();
}
