package ksyun.client.klog.getmonitordata.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetMonitorDataResponse
 * @Description GetMonitorData 返回体
 */
@Data
@ToString
public class GetMonitorDataResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
