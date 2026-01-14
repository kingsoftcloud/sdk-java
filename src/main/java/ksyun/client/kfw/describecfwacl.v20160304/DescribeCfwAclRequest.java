package ksyun.client.kfw.describecfwacl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCfwAclRequest
* @Description 请求参数
*/
@Data
public class DescribeCfwAclRequest{
    /**云防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**访问控制id集合*/
    @KsYunField(name="AclIds",type=2)
    private List<String> AclIdsList;

    /**5到1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**下一页token*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
