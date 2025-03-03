package ksyun.client.kmr.listexecutor.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListExecutorResponse
 * @Description ListExecutor 返回体
 */
@Data
@ToString
public class ListExecutorResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
