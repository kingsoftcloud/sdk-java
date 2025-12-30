package ksyun.client.kcm.describecertificates.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCertificatesResponse
* @Description DescribeCertificates 返回体
*/
@Data
@ToString
public class DescribeCertificatesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("CertificateSet")
    private List<CertificateSetDto> CertificateSet;

    @Data
    @ToString
    public static class CertificateSetDto {
        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("CertificateName")
        private String CertificateName;

        /***/
        @JsonProperty("CertificateId")
        private String CertificateId;

        /***/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

        /***/
        @JsonProperty("CommonName")
        private String CommonName;

        /***/
        @JsonProperty("CertAuthority")
        private String CertAuthority;

        /***/
        @JsonProperty("CertType")
        private String CertType;

        /***/
        @JsonProperty("CertificateType")
        private String CertificateType;

        /***/
        @JsonProperty("PublicKey")
        private String PublicKey;

    }

}
