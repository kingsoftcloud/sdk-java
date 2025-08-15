package ksyun.client.kce.addclusterepcinstances.v20190806;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AddClusterEpcInstancesRequest @Description 请求参数
 */
@Data
public class AddClusterEpcInstancesRequest {
  /** 集群id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /**
   * 移入集群的裸金属服务器实例id，即HostId
   *
   * <p>注：参数InstanceId.N和EpcPara.N必须填写一个，不能同时填写，也不能同时为空
   */
  @KsYunField(name = "InstanceId")
  private List<String> InstanceIdList;

  /**
   * 裸金属服务器产品重新安装操作系统的透传参数，json化字符串格式，详见[重装租赁裸金属服务器](https://apiexplorer.ksyun.com/#/api/44/ReinstallEpc/2015-11-01/1003)。
   */
  @KsYunField(name = "EpcPara")
  private List<String> EpcParaList;

  /** 节点高级设置 */
  @KsYunField(name = "AdvancedSetting")
  private AdvancedSettingDto AdvancedSettingList;

  @Data
  @ToString
  public static class AdvancedSettingDto {
    /**
     * 容器运行时，根据集群版本和需求选择 Kubernetes版本＜1.24时，有效值： - docker - containerd
     *
     * <p>Kubernetes版本≥1.24时，有效值： - contained 默认值：docker
     */
    @KsYunField(name = "ContainerRuntime")
    private String ContainerRuntime;

    /** 容器的存储路径，不填写的话默认为/data/container */
    @KsYunField(name = "ContainerPath")
    private String ContainerPath;

    /**
     * base64 编码的用户脚本, 此脚本会在 节点上k8s 组件运行后执行,
     * 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/userscript路径查看
     */
    @KsYunField(name = "UserScript")
    private String UserScript;

    /**
     * base64 编码的用户脚本, 此脚本会在节点上 k8s 组件运行前执行,
     * 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/pre_userscript路径查看
     */
    @KsYunField(name = "PreUserScript")
    private String PreUserScript;

    /** 节点加入集群后是否可以正常调度，默认值：true */
    @KsYunField(name = "Schedulable")
    private Boolean Schedulable;

    /** 节点加入集群时预置的标签 */
    @KsYunField(name = "Label")
    private List<Object> LabelList;

    /** 自定义节点上k8s组件的参数 */
    @KsYunField(name = "ExtraArg")
    private ExtraArgDto ExtraArgList;

    @Data
    @ToString
    public static class ExtraArgDto {
      /** 用户自定义kubelet的参数 */
      @KsYunField(name = "Kubelet")
      private List<Object> KubeletList;
    }

    /** 自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m */
    @KsYunField(name = "ContainerLogMaxSize")
    private Integer ContainerLogMaxSize;

    /** 自定义容器日志采集文件最大数量，默认值为10个 */
    @KsYunField(name = "ContainerLogMaxFiles")
    private Integer ContainerLogMaxFiles;

    /** 节点加入集群时预置污点，匹配污点容忍进行调度 */
    @KsYunField(name = "Taints")
    private List<Object> TaintsList;
  }
}
