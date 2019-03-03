package com.bdg.vkaramyan.bankaccountsystem.entity;

import java.util.Arrays;

import com.bdg.vkaramyan.bankaccountsystem.common.Country;

public class Address extends AbstractBankEntity{

		private Country country;
		private String street;
		private PhoneNumber[] phoneNumber;
	
		public Address(final int id, final Country country, final String street, final PhoneNumber[] phoneNumber) {
			super(id);
			this.country = country;
			this.street = street;
			this.phoneNumber = phoneNumber;
		}

		public Country getCountry() {
			return country;
		}

		public String getStreet() {
			return street;
		}

		public PhoneNumber[] getPhoneNumber() {
			return phoneNumber;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public void setPhoneNumber(PhoneNumber[] phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
		return "Address [country=" + country + ", street=" + street + ", phoneNumber=" + Arrays.toString(phoneNumber)
					+ "]";
		}

}
