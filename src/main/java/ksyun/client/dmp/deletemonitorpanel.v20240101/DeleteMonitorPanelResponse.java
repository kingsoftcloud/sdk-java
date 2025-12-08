package ksyun.client.dmp.deletemonitorpanel.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteMonitorPanelResponse
* @Description DeleteMonitorPanel 返回体
*/
@Data
@ToString
public class DeleteMonitorPanelResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
