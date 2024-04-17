package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class Loginpge {
    public static By username = By.id("username");
    public static By pwd = By.id("password");
    public static By login_btn = By.name("Login");
    public static By error_txt = By.xpath("//div[@class='loginError']");
    public static By lightning = By.xpath("//a[@class='switch-to-lightning']");
}
