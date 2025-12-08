package ksyun.client.waf.deleteaccesscontrolrule.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAccessControlRuleResponse
* @Description DeleteAccessControlRule 返回体
*/
@Data
@ToString
public class DeleteAccessControlRuleResponse extends BaseResponseModel {
    /**

- 描述：请求ID
- 类型：String

#### */
    @JsonProperty("RequestId")
    private String RequestId;

}
