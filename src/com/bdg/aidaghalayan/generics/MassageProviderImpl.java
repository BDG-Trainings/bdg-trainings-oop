package com.bdg.aidaghalayan.generics;

public class MassageProviderImpl<S> implements MassageProvider{
    private String massage;

    @Override
    public String getMassage(String massage) {

      return massage;

    }
    public static void main(String[] args) {
        MassageProviderImpl<String> provider= new MassageProviderImpl<>();
        System.out.println(provider.getMassage("String"));
        MassageProviderImpl<StringBuffer> provider1= new MassageProviderImpl<>();
        System.out.println(provider.getMassage("StringBuffer"));
        MassageProviderImpl<StringBuilder> provider2= new MassageProviderImpl<>();
        System.out.println(provider.getMassage("StringBuilder"));

    }


}
