package ksyun.client.tidb.opentimonitor.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname OpenTiMonitorResponse
* @Description OpenTiMonitor 返回体
*/
@Data
@ToString
public class OpenTiMonitorResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
