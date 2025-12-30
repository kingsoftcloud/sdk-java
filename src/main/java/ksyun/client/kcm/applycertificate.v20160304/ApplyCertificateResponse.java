package ksyun.client.kcm.applycertificate.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ApplyCertificateResponse
* @Description ApplyCertificate 返回体
*/
@Data
@ToString
public class ApplyCertificateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ApplyCertificateResponse")
    private ApplyCertificateResponseDto ApplyCertificateResponse;

    @Data
    @ToString
    public static class ApplyCertificateResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Certificate")
        private ApplyCertificateResponseCertificateDto Certificate;

        @Data
        @ToString
        public static class ApplyCertificateResponseCertificateDto {
            /***/
            @JsonProperty("CertificateId")
            private String CertificateId;

            /***/
            @JsonProperty("MainDomain")
            private String MainDomain;

            /***/
            @JsonProperty("CertificateBrand")
            private String CertificateBrand;

            /***/
            @JsonProperty("CertificateLevel")
            private String CertificateLevel;

            /***/
            @JsonProperty("CertificateName")
            private String CertificateName;

            /***/
            @JsonProperty("CertificateCode")
            private String CertificateCode;

            /***/
            @JsonProperty("CertificateStatus")
            private String CertificateStatus;

            /***/
            @JsonProperty("YearLength")
            private String YearLength;

            /***/
            @JsonProperty("DomainCount")
            private String DomainCount;

            /***/
            @JsonProperty("WildcardCount")
            private String WildcardCount;

        }

    }

}
