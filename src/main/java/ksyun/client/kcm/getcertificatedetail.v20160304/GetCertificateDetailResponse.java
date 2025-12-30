package ksyun.client.kcm.getcertificatedetail.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetCertificateDetailResponse
* @Description GetCertificateDetail 返回体
*/
@Data
@ToString
public class GetCertificateDetailResponse extends BaseResponseModel {

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
        private Integer CertificateStatus;

        /***/
        @JsonProperty("YearLength")
        private Integer YearLength;

        /***/
        @JsonProperty("DomainCount")
        private Integer DomainCount;

        /***/
        @JsonProperty("WildcardCount")
        private Integer WildcardCount;

        /***/
        @JsonProperty("CompanyName")
        private String CompanyName;

        /***/
        @JsonProperty("CSR")
        private String CSR;

        /***/
        @JsonProperty("State")
        private String State;

        /***/
        @JsonProperty("City")
        private String City;

        /***/
        @JsonProperty("Address")
        private String Address;

        /***/
        @JsonProperty("CompanyPhone")
        private String CompanyPhone;

        /***/
        @JsonProperty("PostalCode")
        private String PostalCode;

        /***/
        @JsonProperty("Department")
        private String Department;

        /***/
        @JsonProperty("AdditionalDomains")
        private String AdditionalDomains;

        /***/
        @JsonProperty("Wildcards")
        private String Wildcards;

        /***/
        @JsonProperty("Contact")
        private CertificateContactDto Contact;

        @Data
        @ToString
        public static class CertificateContactDto {
            /***/
            @JsonProperty("FirstName")
            private String FirstName;

            /***/
            @JsonProperty("LastName")
            private String LastName;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Phone")
            private String Phone;

            /***/
            @JsonProperty("Email")
            private String Email;

            /***/
            @JsonProperty("Title")
            private String Title;

        }

        /***/
        @JsonProperty("AuthContent")
        private CertificateAuthContentDto AuthContent;

        @Data
        @ToString
        public static class CertificateAuthContentDto {
            /***/
            @JsonProperty("CheckName")
            private String CheckName;

            /***/
            @JsonProperty("CheckValue")
            private String CheckValue;

            /***/
            @JsonProperty("RecordType")
            private String RecordType;

        }

    }

}
