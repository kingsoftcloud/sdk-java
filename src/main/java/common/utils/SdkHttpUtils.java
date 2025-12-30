package common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SDK HTTP utilities
 */
public class SdkHttpUtils {
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Pattern ENCODED_CHARACTERS_PATTERN;

    /**
     * URL encode a string with optional path handling
     */
    public static String urlEncode(String value, boolean path) {
        if (value == null) {
            return "";
        }
        try {
            String encoded = URLEncoder.encode(value, DEFAULT_ENCODING);
            Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(encoded);
            StringBuffer buffer = new StringBuffer(encoded.length());
            while (matcher.find()) {
                String replacement = matcher.group(0);
                if ("+".equals(replacement)) {
                    replacement = "%20";
                } else if ("*".equals(replacement)) {
                    replacement = "%2A";
                } else if ("%7E".equals(replacement)) {
                    replacement = "~";
                } else if (path && "%2F".equals(replacement)) {
                    replacement = "/";
                }
                matcher.appendReplacement(buffer, replacement);
            }
            matcher.appendTail(buffer);
            return buffer.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * URL decode a string
     */
    public static String urlDecode(String value) {
        if (value == null) {
            return null;
        }
        try {
            return URLDecoder.decode(value, DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Check if URI is using non-default port
     */
    public static boolean isUsingNonDefaultPort(URI uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            scheme = scheme.toLowerCase();
        }
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if ("http".equals(scheme) && port == 80) {
            return false;
        }
        return !"https".equals(scheme) || port != 443;
    }

    /**
     * Append path to base URI
     */
    public static String appendUri(String baseUri, String path) {
        return appendUri(baseUri, path, false);
    }

    /**
     * Append path to base URI with optional double slash escaping
     */
    public static String appendUri(String baseUri, String path, boolean escapeDoubleSlash) {
        String resultUri = baseUri;
        if (path != null && path.length() > 0) {
            if (path.startsWith("/")) {
                if (baseUri.endsWith("/")) {
                    resultUri = baseUri.substring(0, baseUri.length() - 1);
                }
            } else if (!baseUri.endsWith("/")) {
                resultUri = baseUri + "/";
            }
            path = urlEncode(path, true);
            resultUri = escapeDoubleSlash ? resultUri + path.replace("//", "/%2F") : resultUri + path;
        } else if (!baseUri.endsWith("/")) {
            resultUri = baseUri + "/";
        }
        return resultUri;
    }

    static {
        StringBuilder pattern = new StringBuilder();
        pattern.append(Pattern.quote("+"))
                .append("|").append(Pattern.quote("*"))
                .append("|").append(Pattern.quote("%7E"))
                .append("|").append(Pattern.quote("%2F"));
        ENCODED_CHARACTERS_PATTERN = Pattern.compile(pattern.toString());
    }
}
