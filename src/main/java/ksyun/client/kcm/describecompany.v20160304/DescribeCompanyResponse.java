package ksyun.client.kcm.describecompany.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCompanyResponse
* @Description DescribeCompany 返回体
*/
@Data
@ToString
public class DescribeCompanyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("CompanySet")
    private List<CompanySetDto> CompanySet;

    @Data
    @ToString
    public static class CompanySetDto {
        /***/
        @JsonProperty("CompanyId")
        private Integer CompanyId;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Phone")
        private String Phone;

        /***/
        @JsonProperty("Country")
        private String Country;

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
        @JsonProperty("Department")
        private String Department;

        /***/
        @JsonProperty("PostalCode")
        private String PostalCode;

        /***/
        @JsonProperty("LicenseUrl")
        private String LicenseUrl;

        /***/
        @JsonProperty("OrganizationCode")
        private String OrganizationCode;

    }

    /***/
    @JsonProperty("Total")
    private String Total;

}
