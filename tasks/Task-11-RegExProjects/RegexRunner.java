package com.regex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegexRunner {
private static final Logger logger = Logger.getLogger(RegexRunner.class.getName());

public static void main(String[] args) {
RegexProject regexProject = new RegexProject();

try {
boolean isValidMobile = regexProject.mobileNoValidation("9876543210");
logger.log(Level.INFO, "Mobile No Validation Result: " + isValidMobile);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
boolean isAlphaNumeric = regexProject.alphaNumericValidation("123abc");
logger.log(Level.INFO, "AlphaNumeric Validation Result: " + isAlphaNumeric);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
boolean startsWith = regexProject.validateStringStartsWithMatchingString("helloWorld", "hello");
logger.log(Level.INFO, "String StartsWith Validation Result: " + startsWith);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
boolean endsWith = regexProject.validateStringEndsWithMatchingString("helloWorld", "World");
logger.log(Level.INFO, "String EndsWith Validation Result: " + endsWith);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
boolean contains = regexProject.validateStringContainsMatchingString("World", "helloWorld");
logger.log(Level.INFO, "String Contains Validation Result: " + contains);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
boolean exactMatch = regexProject.validateStringExactMatchOfMatchingString("helloWorld", "helloWorld");
logger.log(Level.INFO, "String Exact Match Validation Result: " + exactMatch);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
List<String> list = Arrays.asList("regex", "rEgEx", "Regex");
boolean listMatches = regexProject.listOfString("Regex", list);
logger.log(Level.INFO, "List of String Validation Result: " + listMatches);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
boolean isValidEmail = regexProject.emailValidation("sksam.email@example.com");
logger.log(Level.INFO, "Email Validation Result: " + isValidEmail);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
List<String> stringList = Arrays.asList("abc", "123456", "Regex");
boolean isValidStringList = regexProject.stringValidation(stringList);
logger.log(Level.INFO, "String List Validation Result: " + isValidStringList);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
List<String> list1 = Arrays.asList("Java", "Python", "Regex");
List<String> list2 = Arrays.asList("Java", "C++");
Map<String, Integer> resultMap = regexProject.stringListValidation(list1, list2);
logger.log(Level.INFO, "String List Matching Result: " + resultMap);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}

try {
String htmlContent = "<html><body><h1>Hello World</h1></body></html>";
String tags = regexProject.printHTMLTags(htmlContent);
logger.log(Level.INFO, "HTML Tags Found: " + tags);
} 
catch (Exception exp) {
logger.log(Level.SEVERE, "Exception occurred: " + exp.getMessage(), exp);
}


}
}
