package com.xsz.javabase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	private static String REGEX = "to_timestamp(.*)ssm\\)'";
    private static String INPUT = "insert value table sdfsf (sdf,sdfs,'sdfddds') "
    		+ "values ('34535d','sdfs','to_timestamp(sdfss,454584,4545, ssm)',555sdfsdf)dog says meow. " +
                                    "All dogs say meow.";
    private static String REPLACE = "Sytemtimestap";
 
    public static void main(String[] args) {
       Pattern p = Pattern.compile(REGEX);
       // get a matcher object
       Matcher m = p.matcher(INPUT); 
       INPUT = m.replaceAll(REPLACE);
       System.out.println(INPUT);
   }

}
