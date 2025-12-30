package ksyun.client.kcs.describesecuritygroups.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSecurityGroupsResponse
* @Description DescribeSecurityGroups 返回体
*/
@Data
@ToString
public class DescribeSecurityGroupsResponse extends BaseResponseModel {

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
        @JsonProperty("list")
        private List<DataListDto> List;

        @Data
        @ToString
        public static class DataListDto {
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
            @JsonProperty("created")
            private String Created;

            /***/
            @JsonProperty("updated")
            private String Updated;

        }

        /***/
        @JsonProperty("offset")
        private Integer Offset;

        /***/
        @JsonProperty("limit")
        private Integer Limit;

        /***/
        @JsonProperty("total")
        private Integer Total;

    }

}
