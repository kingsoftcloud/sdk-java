package ksyun.client.rabbitmq.describeinstance.v20191017;

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
    /**实例Id。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}