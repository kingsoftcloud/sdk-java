package ksyun.client.mongodb.addsecuritygrouprule.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddSecurityGroupRuleResponse
* @Description AddSecurityGroupRule 返回体
*/
@Data
@ToString
public class AddSecurityGroupRuleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MongoDBSecurityGroupRule")
    private List<MongoDBSecurityGroupRuleDto> MongoDBSecurityGroupRule;

    @Data
    @ToString
    public static class MongoDBSecurityGroupRuleDto {
        /***/
        @JsonProperty("to_port")
        private String To_port;

        /***/
        @JsonProperty("cidr")
        private String Cidr;

        /***/
        @JsonProperty("from_port")
        private String From_port;

        /***/
        @JsonProperty("protocol")
        private String Protocol;

        /***/
        @JsonProperty("id")
        private String Id;

    }

}
