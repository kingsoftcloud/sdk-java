package ksyun.client.kec.creatededicatedcluster.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDedicatedClusterRequest
* @Description 请求参数
*/
@Data
public class CreateDedicatedClusterRequest{
    /**集群名称*/
    @KsYunField(name="DedicatedClusterName")
    private String DedicatedClusterName;

    /**集群类型*/
    @KsYunField(name="Model")
    private String Model;

    /**类型：String*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

}
