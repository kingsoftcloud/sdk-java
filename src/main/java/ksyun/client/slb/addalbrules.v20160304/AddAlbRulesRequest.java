package ksyun.client.slb.addalbrules.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname AddAlbRulesRequest
 * @Description 请求参数
 */
@Data
public class AddAlbRulesRequest {
    /**
     * 转发策略的ID
     */
    @KsYunField(name = "AlbRuleGroupId")
    private String AlbRuleGroupId;

    /**
     * 匹配规则类型(domain|url|method|sourceIp|header|query|cookie)
     */
    @KsYunField(name = "AlbRuleType")
    private String AlbRuleType;

    /**
     * 匹配规则的值
     */
    @KsYunField(name = "AlbRuleValue")
    private String AlbRuleValue;

    /**
     * HTTP请求方法
     */
    @KsYunField(name = "MethodValue", type = 2)
    private List<String> MethodValueList;

    /**
     * SourceIp
     */
    @KsYunField(name = "SourceIpValue", type = 2)
    private List<String> SourceIpValueList;

    /**
     * HTTP标头
     */
    @KsYunField(name = "HeaderValue", type = 2)
    private List<HeaderValueDto> HeaderValueList;
    /**
     * 查询字符串
     */
    @KsYunField(name = "QueryValue", type = 2)
    private List<QueryValueDto> QueryValueList;
    /**
     * Cookie转发条件
     */
    @KsYunField(name = "CookieValue", type = 2)
    private List<CookieValueDto> CookieValueList;

    @Data
    @ToString
    public static class HeaderValueDto {
        /**
         * HTTP标头,查询字符串的键值
         */
        private String Key;
        /**
         * HTTP标头,查询字符串,Cookie转发条件的value值
         */
        @KsYunField(name = "Value", type = 2)
        private List<String> ValueList;
    }

    @Data
    @ToString
    public static class QueryValueDto {
        /**
         * HTTP标头,查询字符串的键值
         */
        private String Key;
        /**
         * HTTP标头,查询字符串,Cookie转发条件的value值
         */
        @KsYunField(name = "Value", type = 2)
        private List<String> ValueList;
    }

    @Data
    @ToString
    public static class CookieValueDto {
        /**
         * HTTP标头,查询字符串的键值
         */
        private String Key;
        /**
         * HTTP标头,查询字符串,Cookie转发条件的value值
         */
        @KsYunField(name = "Value", type = 2)
        private List<String> ValueList;
    }

}