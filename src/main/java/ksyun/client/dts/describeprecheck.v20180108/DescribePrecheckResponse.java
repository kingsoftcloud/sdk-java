package ksyun.client.dts.describeprecheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePrecheckResponse
* @Description DescribePrecheck 返回体
*/
@Data
@ToString
public class DescribePrecheckResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Progress")
        private Integer Progress;

        /***/
        @JsonProperty("SubPrecheck")
        private List<DataDtoSubPrecheckDto> SubPrecheck;

        @Data
        @ToString
        public static class DataDtoSubPrecheckDto {
            /***/
            @JsonProperty("Id")
            private String Id;

            /***/
            @JsonProperty("PrecheckId")
            private String PrecheckId;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("ChineseName")
            private String ChineseName;

            /***/
            @JsonProperty("Solution")
            private String Solution;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
