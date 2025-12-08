package ksyun.client.mongodb.describeshardnode.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeShardNodeRequest
* @Description 请求参数
*/
@Data
public class DescribeShardNodeRequest{
    /**分片集群实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
