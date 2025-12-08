package ksyun.client.dmp.operatemonitorpanel.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname OperateMonitorPanelResponse
* @Description OperateMonitorPanel 返回体
*/
@Data
@ToString
public class OperateMonitorPanelResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
