package ksyun.client.mongodb.describemongodbsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMongoDBSnapshotRequest
* @Description 请求参数
*/
@Data
public class DescribeMongoDBSnapshotRequest{
    /**实例Id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}