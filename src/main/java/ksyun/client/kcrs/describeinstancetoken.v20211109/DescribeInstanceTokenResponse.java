package ksyun.client.kcrs.describeinstancetoken.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceTokenResponse
* @Description DescribeInstanceToken 返回体
*/
@Data
@ToString
public class DescribeInstanceTokenResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**访问凭证数量
*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0
*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**单次调用返回的最大数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**响应实体类*/
    @JsonProperty("TokenSet")
    private List<TokenSetDto> TokenSet;

    @Data
    @ToString
    public static class TokenSetDto {
        /**实例访问凭证的id
*/
        @JsonProperty("TokenId")
        private String TokenId;

        /**实例访问凭证启用状态，有效值：
True：已启用
False：已禁用*/
        @JsonProperty("Enable")
        private Boolean Enable;

        /**访问凭证描述信息
*/
        @JsonProperty("Desc")
        private String Desc;

        /**访问凭证创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**访问凭证过期时间*/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

    }

}
