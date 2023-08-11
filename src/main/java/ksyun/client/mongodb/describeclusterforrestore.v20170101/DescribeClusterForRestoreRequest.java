package ksyun.client.mongodb.describeclusterforrestore.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeClusterForRestoreRequest
* @Description 请求参数
*/
@Data
public class DescribeClusterForRestoreRequest{
    /**MongoDB分片集群实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**恢复时间点。*/
    @KsYunField(name="ResetTimePoint")
    private String ResetTimePoint;


}