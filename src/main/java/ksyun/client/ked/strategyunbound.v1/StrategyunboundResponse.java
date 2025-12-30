package ksyun.client.ked.strategyunbound.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StrategyunboundResponse
* @Description Strategyunbound 返回体
*/
@Data
@ToString
public class StrategyunboundResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
