package com.bdg.aidaghalayan.generics;

public interface MassageProvider <T extends String>{

    String getMassage(String massage);
}
