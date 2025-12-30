package ksyun.client.memcached.setcachesecurityrules.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetCacheSecurityRulesResponse
* @Description SetCacheSecurityRules 返回体
*/
@Data
@ToString
public class SetCacheSecurityRulesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
