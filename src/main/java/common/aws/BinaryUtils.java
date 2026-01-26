package common.aws;

import common.auth.KscClientException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

/**
 * Binary utilities for encoding, decoding, and hashing
 */
public class BinaryUtils {

    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    /**
     * Convert bytes to hex string (lowercase)
     */
    public static String toHex(byte[] data) {
        if (data == null) {
            return null;
        }
        char[] hexChars = new char[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            int v = data[i] & 0xFF;
            hexChars[i * 2] = HEX_ARRAY[v >>> 4];
            hexChars[i * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    /**
     * Convert hex string to bytes
     */
    public static byte[] fromHex(String hexData) {
        if (hexData == null) {
            return null;
        }
        int len = hexData.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexData.charAt(i), 16) << 4)
                    + Character.digit(hexData.charAt(i + 1), 16));
        }
        return data;
    }

    /**
     * Encode bytes to Base64 string
     */
    public static String toBase64(byte[] data) {
        return data == null ? null : Base64.getEncoder().encodeToString(data);
    }

    /**
     * Decode Base64 string to bytes
     */
    public static byte[] fromBase64(String b64Data) {
        return b64Data == null ? null : Base64.getDecoder().decode(b64Data);
    }

    /**
     * Convert ByteBuffer to ByteArrayInputStream
     */
    public static ByteArrayInputStream toStream(ByteBuffer byteBuffer) {
        return byteBuffer == null ? new ByteArrayInputStream(new byte[0])
                : new ByteArrayInputStream(copyBytesFrom(byteBuffer));
    }

    /**
     * Copy all bytes from ByteBuffer
     */
    public static byte[] copyAllBytesFrom(ByteBuffer bb) {
        if (bb == null) {
            return null;
        }
        if (bb.hasArray()) {
            return Arrays.copyOfRange(bb.array(), bb.arrayOffset(), bb.arrayOffset() + bb.limit());
        }
        ByteBuffer copy = bb.asReadOnlyBuffer();
        copy.rewind();
        byte[] dst = new byte[copy.remaining()];
        copy.get(dst);
        return dst;
    }

    /**
     * Copy remaining bytes from ByteBuffer
     */
    public static byte[] copyBytesFrom(ByteBuffer bb) {
        if (bb == null) {
            return null;
        }
        if (bb.hasArray()) {
            return Arrays.copyOfRange(bb.array(), bb.arrayOffset() + bb.position(),
                    bb.arrayOffset() + bb.limit());
        }
        byte[] dst = new byte[bb.remaining()];
        bb.asReadOnlyBuffer().get(dst);
        return dst;
    }

    /**
     * Hash input stream with SHA-256
     */
    public static byte[] hash(InputStream input) throws KscClientException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            DigestInputStream digestInputStream = new DigestInputStream(input, md);
            byte[] buffer = new byte[1024];
            while (digestInputStream.read(buffer) > -1) {
                // Read all data to update digest
            }
            return digestInputStream.getMessageDigest().digest();
        } catch (Exception e) {
            throw new KscClientException("Unable to compute hash while signing request: " + e.getMessage(), e);
        }
    }

    /**
     * Hash text string with SHA-256
     */
    public static byte[] hash(String text) throws KscClientException {
        return doHash(text);
    }

    /**
     * Compute SHA-256 hash of text
     */
    public static byte[] doHash(String text) throws KscClientException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes(StandardCharsets.UTF_8));
            return md.digest();
        } catch (Exception e) {
            throw new KscClientException("Unable to compute hash while signing request: " + e.getMessage(), e);
        }
    }
}
