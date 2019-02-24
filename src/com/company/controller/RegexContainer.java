package com.company.controller;

/**
 * Created by student on 26.09.2017.
 */
public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    /**NickName.*/
    String REGEX_NICKNAME = "^.{1,15}$";
    /**LandLine phone.*/
    String REGEX_HOME_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    /**Mobile phone.*/
    String REGEX_MOBILE_NUMBER1 = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    /**Mobile phone #2.*/
    String REGEX_MOBILE_NUMBER2 = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|next$";
    /**E-mail.*/
    String REGEX_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    /**Skype.*/
    String REGEX_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    /**Post code.*/
    String REGEX_POSTCODE = "^[\\d]{5}$";
    /**City.*/
    String REGEX_CITY = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    /**Street.*/
    String REGEX_STREET = "^[A-Z]{1}[a-z]{1,20}$";
    /**House number.*/
    String REGEX_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    /**Apartment number.*/
    String REGEX_APARTMENT_NUMBER = "^[\\d]{1,3}";
}
