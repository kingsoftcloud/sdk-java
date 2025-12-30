package ksyun.client.dmp.modifymonitorpanelinfo.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyMonitorPanelInfoResponse
* @Description ModifyMonitorPanelInfo 返回体
*/
@Data
@ToString
public class ModifyMonitorPanelInfoResponse extends BaseResponseModel {

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
        @JsonProperty("PanelType")
        private String PanelType;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

}
