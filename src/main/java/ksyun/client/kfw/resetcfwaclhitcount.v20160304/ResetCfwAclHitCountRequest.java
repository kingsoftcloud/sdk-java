package ksyun.client.kfw.resetcfwaclhitcount.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResetCfwAclHitCountRequest
* @Description 请求参数
*/
@Data
public class ResetCfwAclHitCountRequest{
    /**访问控制策略集合*/
    @KsYunField(name="AclIds",type=2)
    private List<String> AclIdsList;

}
