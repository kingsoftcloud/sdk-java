package ksyun.client.kfw.deletecfwacl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteCfwAclRequest
* @Description 请求参数
*/
@Data
public class DeleteCfwAclRequest{
    /**访问控制集合*/
    @KsYunField(name="AclIds",type=2)
    private List<String> AclIdsList;

    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

}
