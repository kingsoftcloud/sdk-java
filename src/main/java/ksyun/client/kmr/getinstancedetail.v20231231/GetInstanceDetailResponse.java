package ksyun.client.kmr.getinstancedetail.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetInstanceDetailResponse
 * @Description GetInstanceDetail 返回体
 */
@Data
@ToString
public class GetInstanceDetailResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
