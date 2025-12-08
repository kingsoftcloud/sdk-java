package ksyun.client.kes.clusterhealthstatistic.v20201215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ClusterHealthStatisticResponse
* @Description ClusterHealthStatistic 返回体
*/
@Data
@ToString
public class ClusterHealthStatisticResponse extends BaseResponseModel {
    /***/
    @JsonProperty("status")
    private Integer Status;

    /**诊断数据，具体信息请参考输出示例*/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**请求ID*/
        @JsonProperty("RequestId")
        private String RequestId;

        /**操作ID*/
        @JsonProperty("OperationId")
        private String OperationId;

        /***/
        @JsonProperty("HealthCheckHistory")
        private List<HealthCheckHistoryDto> HealthCheckHistory;

        @Data
        @ToString
        public static class HealthCheckHistoryDto {
            /**诊断时间*/
            @JsonProperty("StartDate")
            private String StartDate;

            /**红色诊断项*/
            @JsonProperty("Red")
            private Integer Red;

            /**绿色诊断项*/
            @JsonProperty("Green")
            private Integer Green;

            /**黄色诊断项*/
            @JsonProperty("Yellow")
            private Integer Yellow;

            /**失败项*/
            @JsonProperty("Failed")
            private Integer Failed;

            /**诊断状态*/
            @JsonProperty("Stage")
            private String Stage;

            /***/
            @JsonProperty("Status")
            private List<StatusDto> Status;

            @Data
            @ToString
            public static class StatusDto {
                /**诊断项*/
                @JsonProperty("Item")
                private String Item;

                /**状态*/
                @JsonProperty("Flag")
                private String Flag;

                /***/
                @JsonProperty("Description")
                private String Description;

                /***/
                @JsonProperty("Suggestion")
                private String Suggestion;

                /***/
                @JsonProperty("Diagnosis")
                private String Diagnosis;

            }

        }

        /***/
        @JsonProperty("StatusCode")
        private Integer StatusCode;

    }

    /***/
    @JsonProperty("message")
    private String Message;

}
