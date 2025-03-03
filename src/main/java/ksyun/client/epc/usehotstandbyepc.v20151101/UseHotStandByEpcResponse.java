package ksyun.client.epc.usehotstandbyepc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UseHotStandByEpcResponse
 * @Description UseHotStandByEpc 返回体
 */
@Data
@ToString
public class UseHotStandByEpcResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
