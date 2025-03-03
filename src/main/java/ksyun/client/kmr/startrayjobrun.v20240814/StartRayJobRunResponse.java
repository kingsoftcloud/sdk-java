package ksyun.client.kmr.startrayjobrun.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StartRayJobRunResponse
 * @Description StartRayJobRun 返回体
 */
@Data
@ToString
public class StartRayJobRunResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
