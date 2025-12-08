package ksyun.client.kcm.listcertificates.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListCertificatesResponse
* @Description ListCertificates 返回体
*/
@Data
@ToString
public class ListCertificatesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("CertificateSet")
    private List<CertificateSetDto> CertificateSet;

    @Data
    @ToString
    public static class CertificateSetDto {
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
        private Integer CertificateStatus;

        /**证书年限*/
        @JsonProperty("YearLength")
        private Integer YearLength;

        /**域名数量*/
        @JsonProperty("DomainCount")
        private Integer DomainCount;

        /**通配符域名数量*/
        @JsonProperty("WildcardCount")
        private Integer WildcardCount;

        /**到期日期*/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

        /**验证方式*/
        @JsonProperty("AuthMethod")
        private String AuthMethod;

        /***/
        @JsonProperty("AuthContent")
        private AuthContentDto AuthContent;

        @Data
        @ToString
        public static class AuthContentDto {
            /**核对名称*/
            @JsonProperty("CheckName")
            private String CheckName;

            /**核对值*/
            @JsonProperty("CheckValue")
            private String CheckValue;

            /**记录类型*/
            @JsonProperty("RecordType")
            private String RecordType;

        }

    }

}
