package ksyun.client.monitor.describealerthistories.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAlertHistoriesResponse
* @Description DescribeAlertHistories 返回体
*/
@Data
@ToString
public class DescribeAlertHistoriesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /**告警历史记录列表*/
    @JsonProperty("alertHistoryList")
    private List<AlertHistoryListDto> AlertHistoryList;

    @Data
    @ToString
    public static class AlertHistoryListDto {
        /**告警历史ID。*/
        @JsonProperty("historyId")
        private Integer HistoryId;

        /**策略ID。*/
        @JsonProperty("policyId")
        private Integer PolicyId;

        /**策略名称。*/
        @JsonProperty("policyName")
        private String PolicyName;

        /**策略对应的产品类型。*/
        @JsonProperty("productType")
        private Integer ProductType;

        /**产品名称*/
        @JsonProperty("productName")
        private String ProductName;

        /***/
        @JsonProperty("instanceId")
        private String InstanceId;

        /***/
        @JsonProperty("instanceName")
        private String InstanceName;

        /***/
        @JsonProperty("instanceIP")
        private String InstanceIP;

        /***/
        @JsonProperty("region")
        private String Region;

        /***/
        @JsonProperty("groupDataId")
        private Integer GroupDataId;

        /***/
        @JsonProperty("rule")
        private String Rule;

        /***/
        @JsonProperty("curValue")
        private Integer CurValue;

        /***/
        @JsonProperty("alarmState")
        private Integer AlarmState;

        /***/
        @JsonProperty("triggerTime")
        private String TriggerTime;

        /***/
        @JsonProperty("recoveryTime")
        private String RecoveryTime;

        /***/
        @JsonProperty("duration")
        private String Duration;

        /***/
        @JsonProperty("alarmReceivers")
        private List<String> AlarmReceivers;

        /***/
        @JsonProperty("callBack")
        private String CallBack;

        /***/
        @JsonProperty("shieldVersion")
        private String ShieldVersion;

        /***/
        @JsonProperty("queryData")
        private AlertHistoryListQueryDataDto QueryData;

        @Data
        @ToString
        public static class AlertHistoryListQueryDataDto {
            /***/
            @JsonProperty("startTime")
            private Integer StartTime;

            /***/
            @JsonProperty("endTime")
            private Integer EndTime;

            /***/
            @JsonProperty("interval")
            private Integer Interval;

            /***/
            @JsonProperty("function")
            private String Function;

            /***/
            @JsonProperty("legend")
            private String Legend;

            /***/
            @JsonProperty("metricname")
            private String Metricname;

            /***/
            @JsonProperty("tags")
            private String Tags;

        }

        /***/
        @JsonProperty("callBackResult")
        private List<AlertHistoryListCallBackResultDto> CallBackResult;

        @Data
        @ToString
        public static class AlertHistoryListCallBackResultDto {
            /***/
            @JsonProperty("callBack")
            private String CallBack;

            /***/
            @JsonProperty("result")
            private String Result;

        }

    }

    /***/
    @JsonProperty("totalCount")
    private Integer TotalCount;

}
