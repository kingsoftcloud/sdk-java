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

    /**支持对托管集群控制面日志采集配置进行全量更新*/
    @KsYunField(name="ControlPlaneLog")
    private ControlPlaneLogDto1 ControlPlaneLog;

    @Data
    @ToString
    public static class ControlPlaneLogDto1 {
        /**集群ID*/
        @KsYunField(name="ClusterId")
        private String ClusterId;

        /**是否支持*/
        @KsYunField(name="Enable")
        private Boolean Enable;

        /**控制面日志所投递日志项目的名称，未配置但指定items时将自动创建名称为k8s-log-{clusterID}的日志项目*/
        @KsYunField(name="ProjectName")
        private String ProjectName;

        /**控制面日志采集范围，多个组件请使用英文逗号拼接，如apiserver,kcm。
有效值：["apiserver","kcm","scheduler","auditing"]*/
        @KsYunField(name="Items")
        private String Items;

    }

}
