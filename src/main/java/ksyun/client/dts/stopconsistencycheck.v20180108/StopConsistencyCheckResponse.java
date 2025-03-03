package ksyun.client.dts.stopconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StopConsistencyCheckResponse
 * @Description StopConsistencyCheck 返回体
 */
@Data
@ToString
public class StopConsistencyCheckResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
