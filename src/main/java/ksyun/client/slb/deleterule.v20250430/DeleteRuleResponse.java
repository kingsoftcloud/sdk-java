package ksyun.client.slb.deleterule.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DeleteRuleResponse
* @Description DeleteRule 返回体
*/
@Data
@ToString
public class DeleteRuleResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
