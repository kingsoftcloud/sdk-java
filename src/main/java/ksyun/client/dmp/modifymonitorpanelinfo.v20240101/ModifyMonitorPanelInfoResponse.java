package ksyun.client.dmp.modifymonitorpanelinfo.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ModifyMonitorPanelInfoResponse
 * @Description ModifyMonitorPanelInfo 返回体
 */
@Data
@ToString
public class ModifyMonitorPanelInfoResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
