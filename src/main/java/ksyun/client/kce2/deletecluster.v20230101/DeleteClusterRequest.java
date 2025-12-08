package ksyun.client.kce2.deletecluster.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteClusterRequest
* @Description 请求参数
*/
@Data
public class DeleteClusterRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**是否删除主机*/
    @KsYunField(name="InstanceDelete")
    private Boolean InstanceDelete;

}
