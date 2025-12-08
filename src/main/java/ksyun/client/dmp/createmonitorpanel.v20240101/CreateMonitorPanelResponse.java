package ksyun.client.dmp.createmonitorpanel.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMonitorPanelResponse
* @Description CreateMonitorPanel 返回体
*/
@Data
@ToString
public class CreateMonitorPanelResponse extends BaseResponseModel {
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
        @JsonProperty("PanelId")
        private String PanelId;

        /***/
        @JsonProperty("PanelName")
        private String PanelName;

        /***/
        @JsonProperty("DatabaseType")
        private String DatabaseType;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
