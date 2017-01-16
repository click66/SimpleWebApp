package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("newton")) {
            return "Sir Isaac Newton (4 January 1643 - 31 March 1727) was an English mathematician, astronomer," +
                    " and physicist who is widely recognised as one of the most influential scientists of all time and" +
                    " a key figure in the scientific revolution.";
        }
        return "";
    }
}
