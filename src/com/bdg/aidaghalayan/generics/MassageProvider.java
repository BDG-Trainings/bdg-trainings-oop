package com.bdg.aidaghalayan.generics;

public interface MassageProvider <T extends CharSequence>{

    public <T>  void getMassage(T t);


}
