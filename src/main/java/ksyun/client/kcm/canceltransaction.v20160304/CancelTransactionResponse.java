package ksyun.client.kcm.canceltransaction.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CancelTransactionResponse
* @Description CancelTransaction 返回体
*/
@Data
@ToString
public class CancelTransactionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CancleTransactionResponse")
    private CancleTransactionResponseDto CancleTransactionResponse;

    @Data
    @ToString
    public static class CancleTransactionResponseDto {
        /**请求ID*/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Certificate")
        private CancleTransactionResponseCertificateDto Certificate;

        @Data
        @ToString
        public static class CancleTransactionResponseCertificateDto {
            /**证书ID*/
            @JsonProperty("CertificateId")
            private String CertificateId;

            /**主域名*/
            @JsonProperty("MainDomain")
            private String MainDomain;

            /**证书品牌*/
            @JsonProperty("CertificateBrand")
            private String CertificateBrand;

            /**证书等级*/
            @JsonProperty("CertificateLevel")
            private String CertificateLevel;

            /**证书名称*/
            @JsonProperty("CertificateName")
            private String CertificateName;

            /**证书代码*/
            @JsonProperty("CertificateCode")
            private String CertificateCode;

            /**证书状态*/
            @JsonProperty("CertificateStatus")
            private String CertificateStatus;

            /**证书年限*/
            @JsonProperty("YearLength")
            private String YearLength;

            /**	

域名数量
*/
            @JsonProperty("DomainCount")
            private String DomainCount;

            /**通配符域名数量*/
            @JsonProperty("WildcardCount")
            private String WildcardCount;

        }

    }

}
