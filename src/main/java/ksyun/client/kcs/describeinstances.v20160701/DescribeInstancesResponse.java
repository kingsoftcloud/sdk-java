package ksyun.client.kcs.describeinstances.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstancesResponse
* @Description DescribeInstances 返回体
*/
@Data
@ToString
public class DescribeInstancesResponse extends BaseResponseModel {
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
        private List<DataDtoListDto> List;

        @Data
        @ToString
        public static class DataDtoListDto {
            /***/
            @JsonProperty("id")
            private String Id;

            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("ip")
            private String Ip;

            /***/
            @JsonProperty("mode")
            private Integer Mode;

            /***/
            @JsonProperty("created")
            private String Created;

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
