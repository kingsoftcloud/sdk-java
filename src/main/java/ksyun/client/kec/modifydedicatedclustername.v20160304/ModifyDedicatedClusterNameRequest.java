package ksyun.client.kec.modifydedicatedclustername.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDedicatedClusterNameRequest
* @Description 请求参数
*/
@Data
public class ModifyDedicatedClusterNameRequest{
    /**专属集群id*/
    @KsYunField(name="DedicatedClusterId")
    private String DedicatedClusterId;

    /**集群名称*/
    @KsYunField(name="DedicatedClusterName")
    private String DedicatedClusterName;

}
