package ksyun.client.kce.modifyclusterinfo.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyClusterInfoRequest
* @Description 请求参数
*/
@Data
public class ModifyClusterInfoRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**集群名称*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**集群描述信息*/
    @KsYunField(name="ClusterDesc")
    private String ClusterDesc;

    /**是否支持微服务

true：支持

false：不支持*/
    @KsYunField(name="EnableKMSE")
    private Boolean EnableKMSE;
}