package ksyun.client.kcm.updatecertificate.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateCertificateResponse
* @Description UpdateCertificate 返回体
*/
@Data
@ToString
public class UpdateCertificateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("UpdateCertificateResponse")
    private UpdateCertificateResponseDto UpdateCertificateResponse;

    @Data
    @ToString
    public static class UpdateCertificateResponseDto {
        /**请求ID*/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Certificate")
        private UpdateCertificateResponseCertificateDto Certificate;

        @Data
        @ToString
        public static class UpdateCertificateResponseCertificateDto {
            /**

证书ID
*/
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

            /**	

通配符域名数量
*/
            @JsonProperty("WildcardCount")
            private String WildcardCount;

            /**验证方法*/
            @JsonProperty("AuthMethod")
            private String AuthMethod;

            /**证书请求文件*/
            @JsonProperty("CSR")
            private String CSR;

            /**国家*/
            @JsonProperty("State")
            private String State;

            /**城市*/
            @JsonProperty("City")
            private String City;

            /**地址*/
            @JsonProperty("Address")
            private String Address;

            /**公司电话*/
            @JsonProperty("CompanyPhone")
            private String CompanyPhone;

            /**邮编*/
            @JsonProperty("PostalCode")
            private String PostalCode;

            /**附加域名*/
            @JsonProperty("AdditionalDomains")
            private String AdditionalDomains;

            /**通配符域名*/
            @JsonProperty("Wildcards")
            private String Wildcards;

        }

        /***/
        @JsonProperty("Contact")
        private UpdateCertificateResponseContactDto Contact;

        @Data
        @ToString
        public static class UpdateCertificateResponseContactDto {
            /**名字*/
            @JsonProperty("FirstName")
            private String FirstName;

            /**姓氏*/
            @JsonProperty("LastName")
            private String LastName;

            /**电话*/
            @JsonProperty("Phone")
            private String Phone;

            /**邮箱*/
            @JsonProperty("Email")
            private String Email;

            /**职位*/
            @JsonProperty("Title")
            private String Title;

        }

    }

}
