package ksyun.client.kmr.describemetriclist.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMetricListResponse
* @Description DescribeMetricList 返回体
*/
@Data
@ToString
public class DescribeMetricListResponse extends BaseResponseModel {

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("count")
        private Integer Count;

        /***/
        @JsonProperty("metrics")
        private List<DataMetricsDto> Metrics;

        @Data
        @ToString
        public static class DataMetricsDto {
            /**指标名称*/
            @JsonProperty("MetricName")
            private String MetricName;

            /**单位*/
            @JsonProperty("Unit")
            private String Unit;

            /**周期*/
            @JsonProperty("Period")
            private Integer Period;

            /**统计方法,
包含平均值(Average)、最大值(Max)、最小值(Min)、求和(Sum)等*/
            @JsonProperty("Statistics")
            private String Statistics;

            /**维度*/
            @JsonProperty("Dimensions")
            private String Dimensions;

            /**指标描述*/
            @JsonProperty("Description")
            private String Description;

        }

    }

    /**是否为部分结果
• true：表示返回的是部分结果，可能还有更多的数据需要获取。
• false：表示返回的为完整结果*/
    @JsonProperty("isPartial")
    private Boolean IsPartial;

    /**查询的状态
• success：查询成功
• error：查询失败*/
    @JsonProperty("status")
    private String Status;

}
