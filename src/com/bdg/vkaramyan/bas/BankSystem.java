package com.bdg.vkaramyan.bas;

public final class BankSystem {
	public static void main(String[] args) {
		BankService service = new BankService(10);
		// Add missing functionality
		Country countryName = Country.findByCountryName("Armenia");
		System.out.println("CountryName = " + countryName);
		Country countryCode = Country.findByNumericCode("051");
		System.out.println("CountryCode = " + countryCode);
	}

}
