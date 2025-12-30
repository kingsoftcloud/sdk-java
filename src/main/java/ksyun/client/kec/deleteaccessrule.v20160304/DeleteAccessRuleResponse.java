package ksyun.client.kec.deleteaccessrule.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAccessRuleResponse
* @Description DeleteAccessRule 返回体
*/
@Data
@ToString
public class DeleteAccessRuleResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
