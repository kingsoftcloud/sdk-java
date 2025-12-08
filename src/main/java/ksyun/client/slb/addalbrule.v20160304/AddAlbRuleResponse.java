package ksyun.client.slb.addalbrule.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddAlbRuleResponse
* @Description AddAlbRule 返回体
*/
@Data
@ToString
public class AddAlbRuleResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**规则的信息*/
    @JsonProperty("AlbRule")
    private AlbRuleDto AlbRule;

    @Data
    @ToString
    public static class AlbRuleDto {
        /**匹配规则类型(domain|url)*/
        @JsonProperty("AlbRuleType")
        private String AlbRuleType;

        /**匹配规则的值*/
        @JsonProperty("AlbRuleValue")
        private String AlbRuleValue;

    }

}
