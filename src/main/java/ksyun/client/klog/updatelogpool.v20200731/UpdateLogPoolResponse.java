package ksyun.client.klog.updatelogpool.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateLogPoolResponse
 * @Description UpdateLogPool 返回体
 */
@Data
@ToString
public class UpdateLogPoolResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
