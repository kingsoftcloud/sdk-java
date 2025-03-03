package ksyun.client.memcached.setcachesecurityrules.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname SetCacheSecurityRulesResponse
 * @Description SetCacheSecurityRules 返回体
 */
@Data
@ToString
public class SetCacheSecurityRulesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
