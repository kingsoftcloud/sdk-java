package ksyun.client.postgresql.statisticdbinstances.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StatisticDBInstancesResponse
* @Description StatisticDBInstances 返回体
*/
@Data
@ToString
public class StatisticDBInstancesResponse extends BaseResponseModel {

    /**注意：仅供参考*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**当前Region总计数量*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("Statistic")
        private DataStatisticDto Statistic;

        @Data
        @ToString
        public static class DataStatisticDto {
            /**任务中*/
            @JsonProperty("RUNNING_TASK")
            private Integer RUNNING_TASK;

            /**运行中*/
            @JsonProperty("ACTIVE")
            private Integer ACTIVE;

            /**异常中*/
            @JsonProperty("INVALID")
            private Integer INVALID;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
