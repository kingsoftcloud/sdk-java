package ksyun.client.dmp.describemonitorpanellist.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMonitorPanelListResponse
* @Description DescribeMonitorPanelList 返回体
*/
@Data
@ToString
public class DescribeMonitorPanelListResponse extends BaseResponseModel {
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
        @JsonProperty("MonitorPanels")
        private List<MonitorPanelsDto> MonitorPanels;

        @Data
        @ToString
        public static class MonitorPanelsDto {
            /***/
            @JsonProperty("PanelId")
            private String PanelId;

            /***/
            @JsonProperty("PanelName")
            private String PanelName;

            /***/
            @JsonProperty("PanelType")
            private String PanelType;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

        }

        /***/
        @JsonProperty("Page")
        private Integer Page;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

}
