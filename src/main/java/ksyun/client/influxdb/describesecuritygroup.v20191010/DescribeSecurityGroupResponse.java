package ksyun.client.influxdb.describesecuritygroup.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSecurityGroupResponse
* @Description DescribeSecurityGroup 返回体
*/
@Data
@ToString
public class DescribeSecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Id")
        private String Id;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("SecurityRules")
        private List<DataDtoSecurityRulesDto> SecurityRules;

        @Data
        @ToString
        public static class DataDtoSecurityRulesDto {
            /***/
            @JsonProperty("Id")
            private String Id;

            /***/
            @JsonProperty("Cidr")
            private String Cidr;

            /***/
            @JsonProperty("Protocol")
            private String Protocol;

            /***/
            @JsonProperty("FromPort")
            private String FromPort;

            /***/
            @JsonProperty("ToPort")
            private String ToPort;

        }

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

}
