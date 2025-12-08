package ksyun.client.memcached.describecachesecurityrules.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCacheSecurityRulesResponse
* @Description DescribeCacheSecurityRules 返回体
*/
@Data
@ToString
public class DescribeCacheSecurityRulesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
    }

}
