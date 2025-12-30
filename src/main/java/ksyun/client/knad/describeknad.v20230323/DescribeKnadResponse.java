package ksyun.client.knad.describeknad.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKnadResponse
* @Description DescribeKnad 返回体
*/
@Data
@ToString
public class DescribeKnadResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("KnadSet")
    private List<KnadSetDto> KnadSet;

    @Data
    @ToString
    public static class KnadSetDto {
        /***/
        @JsonProperty("KnadId")
        private String KnadId;

        /***/
        @JsonProperty("KnadName")
        private String KnadName;

        /***/
        @JsonProperty("Band")
        private Integer Band;

        /***/
        @JsonProperty("MaxBand")
        private Integer MaxBand;

        /***/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /***/
        @JsonProperty("UsedIpCount")
        private Integer UsedIpCount;

        /***/
        @JsonProperty("IpCount")
        private Integer IpCount;

        /***/
        @JsonProperty("TemplateId")
        private Integer TemplateId;

        /***/
        @JsonProperty("ExprieTime")
        private String ExprieTime;

        /***/
        @JsonProperty("UdpBlock")
        private Integer UdpBlock;

        /***/
        @JsonProperty("OnlyChinaIp")
        private Integer OnlyChinaIp;

        /***/
        @JsonProperty("IdcBand")
        private Integer IdcBand;

        /***/
        @JsonProperty("ServiceId")
        private String ServiceId;

    }

}
