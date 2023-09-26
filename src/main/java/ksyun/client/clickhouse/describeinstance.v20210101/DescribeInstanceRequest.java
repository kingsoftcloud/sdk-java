package ksyun.client.clickhouse.describeinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceRequest{
    /**实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}