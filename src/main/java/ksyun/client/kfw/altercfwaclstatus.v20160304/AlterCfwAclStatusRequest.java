package ksyun.client.kfw.altercfwaclstatus.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AlterCfwAclStatusRequest
* @Description 请求参数
*/
@Data
public class AlterCfwAclStatusRequest{
    /**访问控制策略id集合*/
    @KsYunField(name="AclIds",type=2)
    private List<String> AclIdsList;

    /**开启：start|关闭：stop*/
    @KsYunField(name="Status")
    private String Status;

}
