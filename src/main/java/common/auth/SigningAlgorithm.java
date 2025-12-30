package common.auth;

/**
 * 签名算法枚举
 * 替代 com.ksc.auth.SigningAlgorithm
 */
public enum SigningAlgorithm {
    HmacSHA1("HmacSHA1"),
    HmacSHA256("HmacSHA256");

    private final String algorithmName;

    SigningAlgorithm(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    @Override
    public String toString() {
        return algorithmName;
    }
}
