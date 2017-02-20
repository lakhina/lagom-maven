package org.codecomm;

/**
 * Created by anuj on 20/2/17.
 */
public class Greet {

    private String lang;
    private String greeting;

    public Greet(String lang, String greeting) {
        this.lang = lang;
        this.greeting = greeting;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
