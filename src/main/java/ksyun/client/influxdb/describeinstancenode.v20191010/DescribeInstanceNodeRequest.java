package ksyun.client.influxdb.describeinstancenode.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceNodeRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceNodeRequest{
    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
