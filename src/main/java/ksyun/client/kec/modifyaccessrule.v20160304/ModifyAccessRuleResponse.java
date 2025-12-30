package ksyun.client.kec.modifyaccessrule.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyAccessRuleResponse
* @Description ModifyAccessRule 返回体
*/
@Data
@ToString
public class ModifyAccessRuleResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
