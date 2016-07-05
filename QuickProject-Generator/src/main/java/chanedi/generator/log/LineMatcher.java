package chanedi.generator.log;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jijingyu625 on 2016/5/2.
 */
class LineMatcher {

    @Getter
    private MatcherType matcherType;
    @Getter
    private Matcher matcher;

    private LineMatcher(MatcherType matcherType, Matcher matcher) {
        this.matcherType = matcherType;
        this.matcher = matcher;
    }

    public static LineMatcher matcher(String line) {
        Matcher matcher = methodSignatureMatcher(line);
        if (matcher != null) {
            return new LineMatcher(MatcherType.METHOD, matcher);
        }
        matcher = endMethodSignatureMatcher(line);
        if (matcher != null) {
            return new LineMatcher(MatcherType.END_METHOD, matcher);
        }
        matcher = daoResultMatcher(line);
        if (matcher != null) {
            return new LineMatcher(MatcherType.DAO_RESULT, matcher);
        }
        matcher = logMatcher(line);
        if (matcher != null) {
            return new LineMatcher(MatcherType.LOG, matcher);
        }
        matcher = returnMatcher(line);
        if (matcher != null) {
            return new LineMatcher(MatcherType.RETURN, matcher);
        }
        return null;
    }

    private static Matcher methodSignatureMatcher(String line) {
        Pattern methodSignaturePattern = Pattern.compile("\\s+public (\\S+) ([^\\(]+)\\((.*)\\) .*\\{");
        Matcher matcher = methodSignaturePattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        methodSignaturePattern = Pattern.compile("\\s+public static (\\S+) ([^\\(]+)\\((.*)\\) .*\\{");
        matcher = methodSignaturePattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        methodSignaturePattern = Pattern.compile("\\s+protected (\\S+) ([^\\(]+)\\((.*)\\) .*\\{");
        matcher = methodSignaturePattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        methodSignaturePattern = Pattern.compile("\\s+protected static (\\S+) ([^\\(]+)\\((.*)\\) .*\\{");
        matcher = methodSignaturePattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        methodSignaturePattern = Pattern.compile("\\s+private (\\S+) ([^\\(]+)\\((.*)\\) .*\\{");
        matcher = methodSignaturePattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        methodSignaturePattern = Pattern.compile("\\s+private static (\\S+) ([^\\(]+)\\((.*)\\) .*\\{");
        matcher = methodSignaturePattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    private static Matcher endMethodSignatureMatcher(String line) {
        Pattern returnPattern = Pattern.compile("    }");
        Matcher matcher = returnPattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    private static Matcher daoResultMatcher(String line) {
        Pattern daoResultPattern = Pattern.compile("\\s+(\\S+) (\\S+) = \\S+DAO.+;");
        Matcher matcher = daoResultPattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    private static Matcher logMatcher(String line) {
        Pattern returnPattern = Pattern.compile("\\s+Log(.+);");
        Matcher matcher = returnPattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    private static Matcher returnMatcher(String line) {
        Pattern returnPattern = Pattern.compile("\\s+return (.+);");
        Matcher matcher = returnPattern.matcher(line);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public static enum MatcherType {
        PUBLIC_METHOD, METHOD, DAO_RESULT, LOG, RETURN, END_METHOD
    }

}
