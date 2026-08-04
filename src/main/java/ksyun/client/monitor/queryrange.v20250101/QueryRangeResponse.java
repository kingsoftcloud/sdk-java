package ksyun.client.monitor.queryrange.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryRangeResponse
* @Description QueryRange 返回体
*/
@Data
@ToString
public class QueryRangeResponse extends BaseResponseModel {

    /**请求的处理状态。*/
    @JsonProperty("status")
    private String Status;

    /***/
    @JsonProperty("isPartial")
    private Boolean IsPartial;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("resultType")
        private String ResultType;

        /***/
        @JsonProperty("result")
        private List<DataResultDto> Result;

        @Data
        @ToString
        public static class DataResultDto {
            /***/
            @JsonProperty("metric")
            private DataResultMetricDto Metric;

            @Data
            @ToString
            public static class DataResultMetricDto {
                /**指标名称。

> **★ 特别注意**：指标格式规范
> 所有指标名称统一使用下划线 "_" 作为连接符。


> **示例**：将 eip.bps.in 转换为 eip_bps_in。*/
                @JsonProperty("__name__")
                private String __name__;

                /**系统内部实例ID。*/
                @JsonProperty("__kcm_uuid__")
                private String __kcm_uuid__;

                /**实例名称。*/
                @JsonProperty("name")
                private String Name;

                /**产品线名称（即：Namespace）。*/
                @JsonProperty("product")
                private String Product;

                /**地域信息。*/
                @JsonProperty("region")
                private String Region;

                /**账户ID。*/
                @JsonProperty("user_id")
                private String User_id;

                /**实例ID。*/
                @JsonProperty("uuid")
                private String Uuid;

            }

            /**时序数据点。*/
            @JsonProperty("values")
            private List<String> Values;

        }

    }

    /***/
    @JsonProperty("stats")
    private StatsDto Stats;

    @Data
    @ToString
    public static class StatsDto {
        /***/
        @JsonProperty("seriesFetched")
        private String SeriesFetched;

        /***/
        @JsonProperty("executionTimeMsec")
        private Integer ExecutionTimeMsec;

    }

}
