package ksyun.client.influxdb.createsecurityrule.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSecurityRuleResponse
* @Description CreateSecurityRule 返回体
*/
@Data
@ToString
public class CreateSecurityRuleResponse extends BaseResponseModel {

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

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
