package ksyun.client.kcrs.describeretentionrule.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRetentionRuleResponse
* @Description DescribeRetentionRule 返回体
*/
@Data
@ToString
public class DescribeRetentionRuleResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**响应实体类*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**ruleId*/
        @JsonProperty("Id")
        private Integer Id;

        /**是否禁用*/
        @JsonProperty("Disabled")
        private Boolean Disabled;

        /**仓库生效范围*/
        @JsonProperty("RegistryScope")
        private String RegistryScope;

        /**byTagPatten:镜像版本

byNum:镜像数量*/
        @JsonProperty("Type")
        private String Type;

        /**是否匹配版本镜像
*/
        @JsonProperty("UnTagged")
        private Boolean UnTagged;

        /**保留策略
*/
        @JsonProperty("Template")
        private String Template;

        /**规则类型为镜像版本时，镜像版本匹配规则
*/
        @JsonProperty("TagPatten")
        private String TagPatten;

        /**规则类型为镜像数量时，镜像数量参数
*/
        @JsonProperty("Param")
        private Integer Param;

    }

}
