package ksyun.client.kce.createcluster.v20201231;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateClusterRequest @Description 请求参数
 */
@Data
public class CreateClusterRequest {
  /**
   * 集群名称<br>
   * 有效值：2-64个字符，支持中文，英文，数字，以及特殊字符-,.!$^*()%#&+/:;<=>[]_`{}~
   */
  @KsYunField(name = "ClusterName")
  private String ClusterName;

  /**
   * 集群类型，默认值 VirtualMachine，该字段已无实际意义，可忽略
   *
   * <p>- VirtualMachine 云服务器 - BareMetal 裸金属
   */
  @KsYunField(name = "ClusterType")
  private String ClusterType;

  /**
   * 集群管理模式，默认DedicatedCluster
   *
   * <p>- DedicatedCluster 独立部署集群 - ManagedCluster 托管集群 - ServerlessCluster serverless集群
   */
  @KsYunField(name = "ClusterManageMode")
  private String ClusterManageMode;

  /** 集群描述 */
  @KsYunField(name = "ClusterDesc")
  private String ClusterDesc;

  /** 集群所在的vpcid */
  @KsYunField(name = "VpcId")
  private String VpcId;

  /**
   * 集群pod的网段，如：10.0.0.0/16
   *
   * <p>- 不能与Service网段冲突 - 不能与VPC网段冲突 - 托管集群不支持33网段
   */
  @KsYunField(name = "PodCidr")
  private String PodCidr;

  /**
   * 集群Service的网段，如10.254.0.0/16
   *
   * <p>- 不能与Pod网段冲突 - 不能与Vpc网段冲突
   */
  @KsYunField(name = "ServiceCidr")
  private String ServiceCidr;

  /**
   * 集群的网络模型
   *
   * <p>- Flannel - Canal - Calico
   */
  @KsYunField(name = "NetworkType")
  private String NetworkType;

  /**
   * 容器服务支持的k8s的集群版本号<br>
   * 有效值：v1.17.6、v1.19.3、v1.21.3
   */
  @KsYunField(name = "K8sVersion")
  private String K8sVersion;

  /** 集群所在vpc终端子网id */
  @KsYunField(name = "ReserveSubnetId")
  private String ReserveSubnetId;

  /**
   * 是否将apiserver暴露到公网，仅针对独立部署集群生效。若不需要暴露，则不填写此选项；若选择暴露，则会创建公网SLB和EIP用于开启集群的Api
   * Server公网访问。需要用户传递弹性EIP创建透传参数，json化字符串格，详见[创建弹性IP](https://docs.ksyun.com/documents/687)。
   */
  @KsYunField(name = "PublicApiServer")
  private String PublicApiServer;

  /** 托管集群或者Serverless集群是否将apiserver暴露到公网 */
  @KsYunField(name = "ExposePublicApiServer")
  private Boolean ExposePublicApiServer;

  /**
   * 每个节点上运行的pod数量上限<br>
   * 默认值：128 <br>
   * 可选值：16，32，64，128，256
   */
  @KsYunField(name = "MaxPodPerNode")
  private String MaxPodPerNode;

  /**
   * 该字段仅针对于独立部署集群生效，托管集群不生效。集群Master和Etcd组件部署方式，有效值： True：Master和Etcd组件独享节点部署
   * False：Master和Etcd组件共享节点部署 默认值：False
   */
  @KsYunField(name = "MasterEtcdSeparate")
  private Boolean MasterEtcdSeparate;

  /** 当集群类型为托管集群时生效，为托管集群控制面进行子网和安全组配置，支持配置多个 */
  @KsYunField(name = "ManagedClusterMultiMaster")
  private List<ManagedClusterMultiMasterDto> ManagedClusterMultiMasterList;

  @Data
  @ToString
  public static class ManagedClusterMultiMasterDto {
    /** master.N所在子网的id */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /** master.N的安全组id */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;
  }

  /** 新建节点创建集群，定义节点角色和配置，支持云服务器机和专属云服务器。 */
  @KsYunField(name = "InstanceForNode")
  private List<InstanceForNodeDto> InstanceForNodeList;

  @Data
  @ToString
  public static class InstanceForNodeDto {
    /**
     * 节点角色,有效值： - Worker - Master_Etcd - Master - Etcd
     *
     * <p>ClusterManageMode字段为DedicatedCluster时 -
     * MasterEtcdSeparate字段设置为False时，Worker和Master_Etcd需要同时指定 -
     * MasterEtcdSeparate字段设置为True时，Master、Etcd和Worker角色需要同时指定。 -
     * Master_Etcd、Master、Etcd目前只能是3个或者5个。 - Master_Etcd、Master、Etcd建议配置4C8G起，数据盘建议SSD，50G起。
     */
    @KsYunField(name = "NodeRole")
    private String NodeRole;

    /** 定义节点的配置，支持普通云主机和专属云主机。 */
    @KsYunField(name = "NodeConfig")
    private List<Object> NodeConfigList;
  }

  /** 使用已有的云物理机创建集群，定义节点角色和配置 */
  @KsYunField(name = "ExistedInstanceForEpc")
  private List<ExistedInstanceForEpcDto> ExistedInstanceForEpcList;

  @Data
  @ToString
  public static class ExistedInstanceForEpcDto {
    /**
     * 节点角色,有效值：
     *
     * <p>- Worker - Master_Etcd - Master - Etcd
     *
     * <p>ClusterManageMode字段为DedicatedCluster时
     *
     * <p>- MasterEtcdSeparate字段设置为False时，Worker和Master_Etcd需要同时指定 -
     * MasterEtcdSeparate字段设置为True时，Master、Etcd和Worker角色需要同时指定。 -
     * Master_Etcd、Master、Etcd目前只能是3个或者5个。 - Master_Etcd、Master、Etcd建议配置4C8G起，数据盘建议SSD，50G起。
     */
    @KsYunField(name = "NodeRole")
    private String NodeRole;

    /** 裸金属节点配置 */
    @KsYunField(name = "EpcConfig")
    private List<Object> EpcConfigList;
  }

  /** 不推荐使用接口进行安装，集群会安装默认的组件，如需安装其它增强组件，请在集群创建完成后，在控制台选择安装。 */
  @KsYunField(name = "Component")
  private List<ComponentDto> ComponentList;

  @Data
  @ToString
  public static class ComponentDto {
    /** 组件名称 */
    @KsYunField(name = "Name")
    private String Name;

    /** 组件相关参数 */
    @KsYunField(name = "Config")
    private String Config;
  }

  /** 控制面日志采集,当用户选择的是独立部署集群时，此选项填写无效；当选择是托管时，可选 */
  @KsYunField(name = "ControlPlaneLog")
  private ControlPlaneLogDto ControlPlaneLogList;

  @Data
  @ToString
  public static class ControlPlaneLogDto {
    /** 集群ID */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /** 控制面日志采集是否开启 */
    @KsYunField(name = "Enable")
    private Boolean Enable;

    /** 指定控制面日志所投递日志项目的名称，未配置但指定items时将自动创建名称为k8s-log-{clusterID}的日志项目 */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 指定哪些控制面日志需要被采集，多个组件请采用英文逗号拼接，如apiserver,kcm，有效值
     *
     * <p>- apiserver - kcm - scheduler - auditing"
     */
    @KsYunField(name = "Items")
    private String Items;
  }

  /** 开启删除保护 默认值：True */
  @KsYunField(name = "EnableDelProtection")
  private Boolean EnableDelProtection;
}
