package ksyun.client.pdns.describepdnszones.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePdnsZonesResponse
* @Description DescribePdnsZones 返回体
*/
@Data
@ToString
public class DescribePdnsZonesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**Zone的信息*/
    @JsonProperty("ZoneSet")
    private List<ZoneSetDto> ZoneSet;

    @Data
    @ToString
    public static class ZoneSetDto {
        /**Zone的ID*/
        @JsonProperty("ZoneId")
        private String ZoneId;

        /**Zone的名称*/
        @JsonProperty("ZoneName")
        private String ZoneName;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**项目制ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**Zone的TTL, 有效值区间为[60,86400]*/
        @JsonProperty("ZoneTtl")
        private String ZoneTtl;

        /**所绑定的VPC的信息*/
        @JsonProperty("BindVpcSet")
        private List<ZoneSetBindVpcSetDto> BindVpcSet;

        @Data
        @ToString
        public static class ZoneSetBindVpcSetDto {
            /**绑定VPC所属的region*/
            @JsonProperty("RegionName")
            private String RegionName;

            /**VPC的ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**状态(building|active|deleting|error)*/
            @JsonProperty("Status")
            private String Status;

            /**VPC的名称*/
            @JsonProperty("VpcName")
            private String VpcName;

        }

    }

}
