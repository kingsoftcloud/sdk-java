package ksyun.client.memcached.deletecachesecurityrule.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteCacheSecurityRuleResponse
* @Description DeleteCacheSecurityRule 返回体
*/
@Data
@ToString
public class DeleteCacheSecurityRuleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
