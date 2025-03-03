package ksyun.client.ked.strategydelete.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StrategydeleteResponse
 * @Description Strategydelete 返回体
 */
@Data
@ToString
public class StrategydeleteResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
