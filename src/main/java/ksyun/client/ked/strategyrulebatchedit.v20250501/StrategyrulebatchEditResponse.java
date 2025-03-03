package ksyun.client.ked.strategyrulebatchedit.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StrategyrulebatchEditResponse
 * @Description StrategyrulebatchEdit 返回体
 */
@Data
@ToString
public class StrategyrulebatchEditResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
