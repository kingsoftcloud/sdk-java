package ksyun.client.dts.taskbirdview.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname TaskBirdViewResponse
* @Description TaskBirdView 返回体
*/
@Data
@ToString
public class TaskBirdViewResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("global")
        private DataDtoGlobalDto Global;

        @Data
        @ToString
        public static class DataDtoGlobalDto {
            /***/
            @JsonProperty("total")
            private Integer Total;

            /***/
            @JsonProperty("running")
            private Integer Running;

            /***/
            @JsonProperty("finished")
            private Integer Finished;

            /***/
            @JsonProperty("erroneous")
            private Integer Erroneous;

            /***/
            @JsonProperty("others")
            private Integer Others;

        }

        /***/
        @JsonProperty("regions")
        private List<DataDtoRegionsDto> Regions;

        @Data
        @ToString
        public static class DataDtoRegionsDto {
            /***/
            @JsonProperty("regionId")
            private Integer RegionId;

            /***/
            @JsonProperty("regionCode")
            private String RegionCode;

            /***/
            @JsonProperty("regionName")
            private String RegionName;

            /***/
            @JsonProperty("total")
            private Integer Total;

            /***/
            @JsonProperty("Statistic")
            private DataDtoRegionsDtoStatisticDto Statistic;

            @Data
            @ToString
            public static class DataDtoRegionsDtoStatisticDto {
                /***/
                @JsonProperty("running")
                private Integer Running;

                /***/
                @JsonProperty("finished")
                private Integer Finished;

                /***/
                @JsonProperty("erroneous")
                private Integer Erroneous;

                /***/
                @JsonProperty("others")
                private Integer Others;

            }

        }

    }

}
