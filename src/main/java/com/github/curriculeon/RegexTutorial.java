package com.github.curriculeon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leonhunter
 * @created 12/11/2020 - 6:13 PM
 */
public class RegexTutorial implements Runnable {
    private String stringToCompareAgainst;

    public String getStringToCompareAgainst() {
        return "RegExr was created by gskinner.com, and is proudly hosted by Media Temple.\n\n" +
                "Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.\n\n" +
                "The side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community, and view patterns you create or favorite in My Patterns.\n\n" +
                "Explore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.\n";
    }

    @Override
    public void run() {
        String stringToCompareTo = getStringToCompareAgainst();
        Pattern pattern  = Pattern.compile("([A-Z]\\w+)");
        Matcher matcher = pattern.matcher(stringToCompareTo);
        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
