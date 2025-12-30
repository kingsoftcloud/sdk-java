package ksyun.client.knad.describeknadip.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKnadIpResponse
* @Description DescribeKnadIp 返回体
*/
@Data
@ToString
public class DescribeKnadIpResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("KnadIpSet")
    private List<KnadIpSetDto> KnadIpSet;

    @Data
    @ToString
    public static class KnadIpSetDto {
        /***/
        @JsonProperty("KnadId")
        private String KnadId;

        /***/
        @JsonProperty("KnadName")
        private String KnadName;

        /***/
        @JsonProperty("EipId")
        private String EipId;

        /***/
        @JsonProperty("KnadIp")
        private String KnadIp;

        /***/
        @JsonProperty("StatusDesc")
        private String StatusDesc;

        /***/
        @JsonProperty("ProjectId")
        private Integer ProjectId;

        /***/
        @JsonProperty("Band")
        private Integer Band;

        /***/
        @JsonProperty("MaxBand")
        private Integer MaxBand;

        /***/
        @JsonProperty("TemplateId")
        private Integer TemplateId;

        /***/
        @JsonProperty("TemplateName")
        private String TemplateName;

        /***/
        @JsonProperty("EipInfo")
        private KnadIpSetEipInfoDto EipInfo;

        @Data
        @ToString
        public static class KnadIpSetEipInfoDto {
            /***/
            @JsonProperty("InstanceType")
            private String InstanceType;

        }

    }

    /***/
    @JsonProperty("KnadIpCount")
    private Integer KnadIpCount;

}
