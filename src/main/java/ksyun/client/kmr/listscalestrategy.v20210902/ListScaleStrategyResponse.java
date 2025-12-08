package ksyun.client.kmr.listscalestrategy.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ListScaleStrategyResponse
* @Description ListScaleStrategy 返回体
*/
@Data
@ToString
public class ListScaleStrategyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
