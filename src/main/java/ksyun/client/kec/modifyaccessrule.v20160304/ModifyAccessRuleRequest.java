package ksyun.client.kec.modifyaccessrule.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAccessRuleRequest
* @Description 请求参数
*/
@Data
public class ModifyAccessRuleRequest{
    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**权限组规则ID*/
    @KsYunField(name="AccessRuleId")
    private String AccessRuleId;

    /**授权地址，授权对象的 IP 地址或网段。
格式必须为 IP 地址或者 CIDR 网段*/
    @KsYunField(name="SourceCidrIp")
    private String SourceCidrIp;

    /**读写权限，支持“读写权限、禁止访问”
• RDWR：读写
• RDONLY：只读
• RDWR_NODELETE_NORENAME：读写(不支持删除和重命名)*/
    @KsYunField(name="RwAccessType")
    private String RwAccessType;

    /**授权对象的系统用户对文件系统的访问权限
取值：
• no_squash：允许使用 root 用户访问文件系统
• root_squash：以 root 用户身份访问时，映射 nobody 用户
• all_squash：无论以何种用户身份访问，均映射为 nobody 用户
nobody 用户是 Linux 系统的默认用户，只能访问服务器上的公共内容，具有低权限，高安全性的特点*/
    @KsYunField(name="UserAccessType")
    private String UserAccessType;

}
