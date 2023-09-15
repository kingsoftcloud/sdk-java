package ksyun.client.waf.deleteaccesscontrolrule.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DeleteAccessControlRuleResponse
* @Description DeleteAccessControlRule 返回体
*/
@Data
@ToString
public class DeleteAccessControlRuleResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
