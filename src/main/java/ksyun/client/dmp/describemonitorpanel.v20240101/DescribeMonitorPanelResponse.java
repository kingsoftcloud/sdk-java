package ksyun.client.dmp.describemonitorpanel.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMonitorPanelResponse
* @Description DescribeMonitorPanel 返回体
*/
@Data
@ToString
public class DescribeMonitorPanelResponse extends BaseResponseModel {
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
        @JsonProperty("InstanceList")
        private List<DataDtoInstanceListDto> InstanceList;

        @Data
        @ToString
        public static class DataDtoInstanceListDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /***/
            @JsonProperty("InstanceRegion")
            private String InstanceRegion;

            /***/
            @JsonProperty("DatabaseType")
            private String DatabaseType;

            /***/
            @JsonProperty("Mode")
            private String Mode;

        }

        /***/
        @JsonProperty("MonitorItemList")
        private List<String> MonitorItemList;

        /***/
        @JsonProperty("PanelType")
        private String PanelType;

    }

}
