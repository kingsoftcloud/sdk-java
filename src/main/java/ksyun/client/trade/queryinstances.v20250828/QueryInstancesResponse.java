package ksyun.client.trade.queryinstances.v20250828;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname QueryInstancesResponse
* @Description QueryInstances 返回体
*/
@Data
@ToString
public class QueryInstancesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
