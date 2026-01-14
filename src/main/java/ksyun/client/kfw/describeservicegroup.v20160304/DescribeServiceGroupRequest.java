package ksyun.client.kfw.describeservicegroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeServiceGroupRequest
* @Description 请求参数
*/
@Data
public class DescribeServiceGroupRequest{
    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**服务组id集合*/
    @KsYunField(name="ServiceGroupIds",type=2)
    private List<String> ServiceGroupIdsList;

}
