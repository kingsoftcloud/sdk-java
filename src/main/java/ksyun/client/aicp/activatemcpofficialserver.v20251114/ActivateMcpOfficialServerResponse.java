package ksyun.client.aicp.activatemcpofficialserver.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ActivateMcpOfficialServerResponse
* @Description ActivateMcpOfficialServer 返回体
*/
@Data
@ToString
public class ActivateMcpOfficialServerResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

}
