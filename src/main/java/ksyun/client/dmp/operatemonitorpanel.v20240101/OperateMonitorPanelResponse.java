package ksyun.client.dmp.operatemonitorpanel.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname OperateMonitorPanelResponse
* @Description OperateMonitorPanel 返回体
*/
@Data
@ToString
public class OperateMonitorPanelResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
