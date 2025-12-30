package ksyun.client.rabbitmq.describesecuritygrouprules.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSecurityGroupRulesResponse
* @Description DescribeSecurityGroupRules 返回体
*/
@Data
@ToString
public class DescribeSecurityGroupRulesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Id")
        private String Id;

        /***/
        @JsonProperty("Protocol")
        private String Protocol;

        /***/
        @JsonProperty("FromPort")
        private String FromPort;

        /***/
        @JsonProperty("ToPort")
        private String ToPort;

        /***/
        @JsonProperty("Cidr")
        private String Cidr;

    }

}
