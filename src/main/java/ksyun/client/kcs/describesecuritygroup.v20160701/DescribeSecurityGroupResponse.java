package ksyun.client.kcs.describesecuritygroup.v20160701;

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
        @JsonProperty("securityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("description")
        private String Description;

        /***/
        @JsonProperty("resourceNum")
        private Integer ResourceNum;

        /***/
        @JsonProperty("rules")
        private List<RulesDto> Rules;

        @Data
        @ToString
        public static class RulesDto {
            /***/
            @JsonProperty("id")
            private String Id;

            /***/
            @JsonProperty("cidr")
            private String Cidr;

            /***/
            @JsonProperty("createAt")
            private String CreateAt;

            /***/
            @JsonProperty("fromPort")
            private Integer FromPort;

            /***/
            @JsonProperty("toPort")
            private Integer ToPort;

            /***/
            @JsonProperty("protocol")
            private String Protocol;

        }

        /***/
        @JsonProperty("total")
        private Integer Total;

        /***/
        @JsonProperty("created")
        private String Created;

        /***/
        @JsonProperty("updated")
        private String Updated;

    }

}
