package com.bdg.vqertikyan.generic;

public interface MessageProvider<U> {

    <U extends CharSequence> void getMessage(U u);

}