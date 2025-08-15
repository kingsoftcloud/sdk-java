package ksyun.client.kce.addexistedinstances.v20190806;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AddExistedInstancesRequest @Description 请求参数
 */
@Data
public class AddExistedInstancesRequest {
  /** 集群id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /**
   * 选择已有的虚拟机（包含专属云主机）作为集群的Worker节点，其中NodeRole只能是Worker。<br>
   * N：1-99
   */
  @KsYunField(name = "ExistedInstanceKecSet")
  private List<ExistedInstanceKecSetDto> ExistedInstanceKecSetList;

  @Data
  @ToString
  public static class ExistedInstanceKecSetDto {
    /** 节点角色,有效值：Worker */
    @KsYunField(name = "NodeRole")
    private String NodeRole;

    /**
     * 云服务器产品重新安装实例操作系统的透传参数，json化字符串格式，详见主机更换或者重新安装实例操作接口ModifyInstanceImage。
     * 注意：接口中的ImageId参数替换为支持的节点操作系统，可调用容器的DescribeInstanceImage接口，获取容器服务支持的节点操作系统
     */
    @KsYunField(name = "KecPara")
    private List<String> KecParaList;

    /** 节点高级设置 */
    @KsYunField(name = "AdvancedSetting")
    private AdvancedSettingDto AdvancedSettingList;

    @Data
    @ToString
    public static class AdvancedSettingDto {
      /** 数据盘挂载设置，仅针对于第一块数据盘生效 */
      @KsYunField(name = "DataDisk")
      private DataDiskDto DataDiskList;

      @Data
      @ToString
      public static class DataDiskDto {
        /** 是否对数据盘格式化并挂载，默认值；true。若此字段填写false，则 FileSystem 和 MountTarget字段不生效 */
        @KsYunField(name = "AutoFormatAndMount")
        private Boolean AutoFormatAndMount;

        /** 数据盘的文件系统，可选值：ext3，ext4，xfs，默认值ext4。若磁盘已有文件系统，则不进行处理，若没有文件系统，则按照用户的定义进行格式化，仅对第一块磁盘生效 */
        @KsYunField(name = "FileSystem")
        private String FileSystem;

        /** 数据盘挂载点，并挂载，仅对第一块盘生效。 */
        @KsYunField(name = "MountTarget")
        private String MountTarget;
      }

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
}
