package ksyun.client.kec.createaccessrule.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateAccessRuleRequest
* @Description 请求参数
*/
@Data
public class CreateAccessRuleRequest{
    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**授权地址，授权对象的 IP 地址或网段
格式必须为 IP 地址或者 CIDR 网段，如果批量设置则逗号分隔
备注：批量录入后需按每个IP或每条CIDR地址段来拆解为多条规则*/
    @KsYunField(name="SourceCidrIp",type=1)
    private List<String> SourceCidrIpList;

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
