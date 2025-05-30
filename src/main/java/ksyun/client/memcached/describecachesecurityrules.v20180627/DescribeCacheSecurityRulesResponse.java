package ksyun.client.memcached.describecachesecurityrules.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeCacheSecurityRulesResponse
 * @Description DescribeCacheSecurityRules 返回体
 */
@Data
@ToString
public class DescribeCacheSecurityRulesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
