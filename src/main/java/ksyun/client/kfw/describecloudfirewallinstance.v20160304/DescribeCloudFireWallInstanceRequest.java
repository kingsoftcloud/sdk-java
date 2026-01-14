package ksyun.client.kfw.describecloudfirewallinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCloudFireWallInstanceRequest
* @Description 请求参数
*/
@Data
public class DescribeCloudFireWallInstanceRequest{
    /**防火墙主键id*/
    @KsYunField(name="CfwInstanceIds",type=2)
    private List<String> CfwInstanceIdsList;

}
