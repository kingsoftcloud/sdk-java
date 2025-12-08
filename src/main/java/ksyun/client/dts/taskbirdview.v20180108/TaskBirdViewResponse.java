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
        private GlobalDto Global;

        @Data
        @ToString
        public static class GlobalDto {
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
        private List<RegionsDto> Regions;

        @Data
        @ToString
        public static class RegionsDto {
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
            private StatisticDto Statistic;

            @Data
            @ToString
            public static class StatisticDto {
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
