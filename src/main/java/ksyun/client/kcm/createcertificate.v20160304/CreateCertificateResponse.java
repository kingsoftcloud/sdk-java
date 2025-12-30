package ksyun.client.kcm.createcertificate.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCertificateResponse
* @Description CreateCertificate 返回体
*/
@Data
@ToString
public class CreateCertificateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Certificate")
    private CertificateDto Certificate;

    @Data
    @ToString
    public static class CertificateDto {
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

    }

}
