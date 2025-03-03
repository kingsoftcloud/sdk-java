package ksyun.client.aicp.getpodevents.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetPodEventsResponse
 * @Description GetPodEvents 返回体
 */
@Data
@ToString
public class GetPodEventsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
