package ksyun.client.kmr.restartflinkjobrun.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname RestartFlinkJobRunResponse
 * @Description RestartFlinkJobRun 返回体
 */
@Data
@ToString
public class RestartFlinkJobRunResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
