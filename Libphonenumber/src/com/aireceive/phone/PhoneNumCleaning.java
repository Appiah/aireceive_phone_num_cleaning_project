package com.aireceive.phone;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class PhoneNumCleaning {

	public PhoneNumCleaning() {
		
	}

	public static void main(String[] args) {
		
		String swissNumberStr = "044 668 18 00";
		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
		try {
		  PhoneNumber swissNumberProto = phoneUtil.parse(swissNumberStr, "CH");
		// Produces "+41 44 668 18 00"
		  System.out.println(phoneUtil.format(swissNumberProto, PhoneNumberFormat.INTERNATIONAL));
		  // Produces "044 668 18 00"
		 // System.out.println(phoneUtil.format(swissNumberProto, PhoneNumberFormat.NATIONAL));
		  // Produces "+41446681800"
		  //System.out.println(phoneUtil.format(swissNumberProto, PhoneNumberFormat.E164));
		} catch (NumberParseException e) {
		  System.err.println("NumberParseException was thrown: " + e.toString());
		}
		
	}

}
