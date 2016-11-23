package com.ibatis.jpetstore.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mybatis.jpetstore.domain.Account;
import org.mybatis.jpetstore.persistence.AccountMapper;


public class TestSurefire {

	private String default_value = null;
	Account oAccount = new Account();

	@Test
	public void testcaseFirst() {
		// AccountService oAccountService=new AccountService();
		Account oAccount = new Account();

		String strUsername = "Junit";
		String strPassword = "Junit";

		String strFirstname = "FTEST";
		String strLastname = "LTEST";
		String strEmail = "FTEST.LTEST@cognizant.com";
		String strPhone = "121212122121";
		String strAddress1 = "AD1";
		String strAddress2 = "AD2";
		String strCity = "Palo Alto";
		String strState = "CA";
		String strZip = "94303";
		String strCountry = "USA";
		String strLanguagePreference = "english";
		String strFavouriteCategory = "DOGS";
		String strStatus = "TEST";
		String strBannerName = "BANNER1";

		oAccount.setUsername(strUsername);
		oAccount.setPassword(strPassword);
		oAccount.setFirstName(strFirstname);
		oAccount.setLastName(strLastname);
		oAccount.setEmail(strEmail);
		oAccount.setPhone(strPhone);
		oAccount.setAddress1(strAddress1);
		oAccount.setAddress2(strAddress2);
		oAccount.setCity(strCity);
		oAccount.setState(strState);
		oAccount.setZip(strZip);
		oAccount.setCountry(strCountry);
		oAccount.setLanguagePreference(strLanguagePreference);
		oAccount.setFavouriteCategoryId(strFavouriteCategory);
		oAccount.setBannerOption(true);
		oAccount.setListOption(true);
		oAccount.setStatus(strStatus);
		oAccount.setBannerName(strBannerName);

		AccountMapper oAccountMapper = new AccountMapper() {

			public Account getAccountByUsername(String username) {
				return null;
			}

			public Account getAccountByUsernameAndPassword(String username,
					String password) {
				return null;
			}

			public void insertAccount(Account account) {
				System.out.println("Called insertAccount of Interface !");
			}

			public void insertProfile(Account account) {
			}

			public void insertSignon(Account account) {
			}

			public void updateAccount(Account account) {
				System.out.println("Testing" + account.getUsername());
			}

			public void updateProfile(Account account) {
			}

			public void updateSignon(Account account) {
			}
		};

		oAccountMapper.insertAccount(oAccount);

		strUsername = oAccount.getUsername();
		oAccount.setUsername(strUsername);

		strPassword = oAccount.getPassword();
		oAccount.setPassword(strPassword);

		strFirstname = oAccount.getFirstName();
		oAccount.setFirstName(strFirstname);

		strLastname = oAccount.getLastName();
		oAccount.setLastName(strLastname);

		strEmail = oAccount.getEmail();
		oAccount.setEmail(strEmail);

		strPhone = oAccount.getPhone();
		oAccount.setPhone(strPhone);

		strAddress1 = oAccount.getAddress1();
		oAccount.setAddress1(strAddress1);

		strAddress2 = oAccount.getAddress2();
		oAccount.setAddress2(strAddress2);

		strCity = oAccount.getCity();
		oAccount.setCity(strCity);

		strState = oAccount.getState();
		oAccount.setState(strState);

		strZip = oAccount.getZip();
		oAccount.setZip(strZip);

		strCountry = oAccount.getCountry();
		oAccount.setCountry(strCountry);

		strLanguagePreference = oAccount.getLanguagePreference();
		oAccount.setLanguagePreference(strLanguagePreference);

		strFavouriteCategory = oAccount.getFavouriteCategoryId();
		oAccount.setFavouriteCategoryId(strFavouriteCategory);

		oAccount.isBannerOption();
		oAccount.setBannerOption(true);

		oAccount.isListOption();
		oAccount.setListOption(true);

		strStatus = oAccount.getStatus();
		oAccount.setStatus(strStatus);

		strBannerName = oAccount.getBannerName();
		oAccount.setBannerName(strBannerName);

		oAccountMapper.updateAccount(oAccount);
	}

	
	@Test
	public void testcaseSecond() {

		System.out.println("getEmailTest executed");
		// String email = null;
		String acc_email = oAccount.getEmail();
		assertEquals(acc_email, default_value);

	}

	@Test
	public void testcaseThird() {

		System.out.println("getStatusTest executed");
		// String status = null;
		String acc_status = oAccount.getStatus();
		assertEquals(acc_status, default_value);

	}

	@Test
	public void testcaseFourth() {

		System.out.println("getPasswordTest executed");
		// String status = null;
		String acc_Pass = oAccount.getPassword();
		assertEquals(acc_Pass, default_value);

	}

	@Test
	public void testcaseFifth() {

		System.out.println("getFirstNameTest executed");
		// String status = null;
		String acc_fName = oAccount.getFirstName();
		assertEquals(acc_fName, default_value);

	}
	
	@Test
	public void testcaseSixth() {

		System.out.println("getUsernameTest executed");
		// String name = null;
		String acc_name = oAccount.getUsername();
		assertEquals(acc_name, default_value);

	}


}
