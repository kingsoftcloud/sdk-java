package ksyun.client.kce.deleteaddoninstance.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAddonInstanceRequest
* @Description 请求参数
*/
@Data
public class DeleteAddonInstanceRequest{
    /**集群名称*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**插件ID*/
    @KsYunField(name="AddonId")
    private String AddonId;

    /**插件实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
