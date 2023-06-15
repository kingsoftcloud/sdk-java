package ksyun.client.mongodb.describemongodbshardnode.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMongoDBShardNodeRequest
* @Description 请求参数
*/
@Data
public class DescribeMongoDBShardNodeRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}