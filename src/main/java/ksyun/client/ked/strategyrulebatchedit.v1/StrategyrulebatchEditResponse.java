package ksyun.client.ked.strategyrulebatchedit.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StrategyrulebatchEditResponse
* @Description StrategyrulebatchEdit 返回体
*/
@Data
@ToString
public class StrategyrulebatchEditResponse extends BaseResponseModel {

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
