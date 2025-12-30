package ksyun.client.kec.describeaccessrules.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAccessRulesResponse
* @Description DescribeAccessRules 返回体
*/
@Data
@ToString
public class DescribeAccessRulesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**权限规则的总个数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**权限规则信息集合*/
    @JsonProperty("AccessRules")
    private List<AccessRulesDto> AccessRules;

    @Data
    @ToString
    public static class AccessRulesDto {
        /**权限规则ID*/
        @JsonProperty("AccessRuleId")
        private String AccessRuleId;

        /**地址或地址段*/
        @JsonProperty("SourceCidrIp")
        private String SourceCidrIp;

        /**授权对象对文件系统的读写权限
取值：
• RDWR（默认值）：读写
• RDONLY：只读*/
        @JsonProperty("RwAccessType")
        private String RwAccessType;

        /**授权对象的系统用户对文件系统的访问权限
取值：
• no_squash：允许使用 root 用户访问文件系统
• root_squash：以 root 用户身份访问时，映射 nobody 用户
• all_squash：无论以何种用户身份访问，均映射为 nobody 用户
nobody 用户是 Linux 系统的默认用户，只能访问服务器上的公共内容，具有低权限，高安全性的特点*/
        @JsonProperty("UserAccessType")
        private String UserAccessType;

    }

}
