package ksyun.client.klog.stopetltask.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StopEtlTaskResponse
 * @Description StopEtlTask 返回体
 */
@Data
@ToString
public class StopEtlTaskResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
