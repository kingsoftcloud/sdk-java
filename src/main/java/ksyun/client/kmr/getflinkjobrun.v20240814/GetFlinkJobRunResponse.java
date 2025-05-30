package ksyun.client.kmr.getflinkjobrun.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetFlinkJobRunResponse
 * @Description GetFlinkJobRun 返回体
 */
@Data
@ToString
public class GetFlinkJobRunResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
