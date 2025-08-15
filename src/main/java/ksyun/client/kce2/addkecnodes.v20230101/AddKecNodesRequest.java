package ksyun.client.kce2.addkecnodes.v20230101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AddKecNodesRequest @Description 请求参数
 */
@Data
public class AddKecNodesRequest {
  /** 集群id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /** 节点信息 */
  @KsYunField(name = "NodeInstanceSet")
  private NodeInstanceSetDto NodeInstanceSetList;

  @Data
  @ToString
  public static class NodeInstanceSetDto {
    /** 实例类型 • KEC 云服务器 */
    @KsYunField(name = "Provider")
    private String Provider;

    /** 组件配置 */
    @KsYunField(name = "Components")
    private List<Object> ComponentsList;

    /** k8s节点配置 */
    @KsYunField(name = "AdvancedSetting")
    private AdvancedSettingDto AdvancedSettingList;

    @Data
    @ToString
    public static class AdvancedSettingDto {
      /** 部署前执行脚本（base64编码） */
      @KsYunField(name = "PostUserScript")
      private String PostUserScript;

      /** 部署后执行脚本（base64编码） */
      @KsYunField(name = "PreUserScript")
      private String PreUserScript;

      /** 容器相关信息 */
      @KsYunField(name = "Container")
      private ContainerDto ContainerList;

      @Data
      @ToString
      public static class ContainerDto {
        /** 容器运行时名称: • Containerd（默认） */
        @KsYunField(name = "Runtime")
        private String Runtime;

        /** 容器存储目录，默认值为：/data/container */
        @KsYunField(name = "Path")
        private String Path;

        /** 容器单个日志文件大小 单位：Mi,默认值为100 */
        @KsYunField(name = "LogMaxSize")
        private Integer LogMaxSize;

        /** 日志文件数量大小，默认值为10 */
        @KsYunField(name = "LogMaxFiles")
        private Integer LogMaxFiles;
      }
    }

    /** 节点信息 */
    @KsYunField(name = "NodeInstanceSet")
    private NodeInstanceSetDto2 NodeInstanceSetList2;

    @Data
    @ToString
    public static class NodeInstanceSetDto2 {
      /** 实例类型 • KEC 云服务器 */
      @KsYunField(name = "Provider")
      private String Provider;

      /** 组件配置 */
      @KsYunField(name = "Components")
      private List<Object> ComponentsList;

      /** k8s节点配置 */
      @KsYunField(name = "AdvancedSetting")
      private AdvancedSettingDto AdvancedSettingList;

      @Data
      @ToString
      public static class AdvancedSettingDto {
        /** 部署前执行脚本（base64编码） */
        @KsYunField(name = "PostUserScript")
        private String PostUserScript;

        /** 部署后执行脚本（base64编码） */
        @KsYunField(name = "PreUserScript")
        private String PreUserScript;

        /** 容器相关信息 */
        @KsYunField(name = "Container")
        private ContainerDto ContainerList;

        @Data
        @ToString
        public static class ContainerDto {
          /** 容器运行时名称: • Containerd（默认） */
          @KsYunField(name = "Runtime")
          private String Runtime;

          /** 容器存储目录，默认值为：/data/container */
          @KsYunField(name = "Path")
          private String Path;

          /** 容器单个日志文件大小 单位：Mi,默认值为100 */
          @KsYunField(name = "LogMaxSize")
          private Integer LogMaxSize;

          /** 日志文件数量大小，默认值为10 */
          @KsYunField(name = "LogMaxFiles")
          private Integer LogMaxFiles;
        }

        /** 标签信息 */
        @KsYunField(name = "Labels")
        private List<Object> LabelsList;

        /** 污点信息 */
        @KsYunField(name = "Taints")
        private TaintsDto TaintsList;

        @Data
        @ToString
        public static class TaintsDto {
          /** key信息 */
          @KsYunField(name = "Key")
          private String Key;

          /** value信息 */
          @KsYunField(name = "Value")
          private String Value;
        }
      }

      /** 节点通用配置 */
      @KsYunField(name = "BasicSetting")
      private BasicSettingDto BasicSettingList;

      @Data
      @ToString
      public static class BasicSettingDto {
        /** 是否为新建节点 true为新建节点 false为已有节点 */
        @KsYunField(name = "IsNew")
        private Boolean IsNew;

        /** 可用区信息，示例：cn-beijing-6a（新建必填） */
        @KsYunField(name = "AvailabilityZone")
        private String AvailabilityZone;

        /** 如果是已有节点，填写已有实例的id 云主机已有节点要求： 1. 跟集群在同一个vpc下 2. 云主机处于关机状态 3. 未加入其他集群 */
        @KsYunField(name = "ExistedInstances")
        private List<String> ExistedInstancesList;

        /** 添加节点的数量（新建节点时必填） */
        @KsYunField(name = "Num")
        private Integer Num;

        /** 云主机的实例类型 ，示例：S6.4B 具体值参照云主机文档：https://docs.ksyun.com/documents/1528?type=6（新建节点时必填） */
        @KsYunField(name = "InstanceType")
        private String InstanceType;

        /** 镜像id */
        @KsYunField(name = "ImageID")
        private String ImageID;

        /** 系统盘信息（新建节点必填） */
        @KsYunField(name = "SystemDisk")
        private SystemDiskDto SystemDiskList;

        @Data
        @ToString
        public static class SystemDiskDto {
          /** 系统盘类型 具体值参考云主机文档：https://docs.ksyun.com/documents/1528?type=6 */
          @KsYunField(name = "Type")
          private String Type;

          /** 系统盘大小，单位：G 具体值参考云主机文档：https://docs.ksyun.com/documents/1528?type=6 */
          @KsYunField(name = "Size")
          private Integer Size;
        }

        /** 数据盘信息 */
        @KsYunField(name = "DataDisk")
        private List<Object> DataDiskList;

        /** 实例名称（新建节点必填）有效值：2-64个字符，支持中文，英文，数字，以及特殊字符-_ */
        @KsYunField(name = "InstanceName")
        private String InstanceName;

        /** 子网id（新建节点必填），子网id必须为集群vpc下的 */
        @KsYunField(name = "SubnetID")
        private String SubnetID;

        /** 节点命名方式 • INTERNAL_IP 以实例ip作为节点名称 • HOST_NAME 以实例hostName作为节点名称 */
        @KsYunField(name = "NodeNameMode")
        private String NodeNameMode;

        /** 节点登录信息（云主机节点为必填字段） （查询时，该字段为敏感信息，不返回） */
        @KsYunField(name = "LoginSetting")
        private LoginSettingDto LoginSettingList;

        @Data
        @ToString
        public static class LoginSettingDto {
          /** 登录密码（明文）跟秘钥二选一 有效值：8-32个字符，必须包含大小写字母和数字 */
          @KsYunField(name = "Password")
          private String Password;

          /** 实例登录秘钥Id信息 跟密码二选一 */
          @KsYunField(name = "SSHKeyId")
          private String SSHKeyId;
        }

        /**
         * 安全组Id，为集群所选vpc下的安全组id（如果为空，则会创建一个新的安全组id）
         * 如果为已有云主机实例，该字段为空时，会判断是否已有5个安全组，如果已有5个安全组会报错（云主机实例安全组上限为5个）
         */
        @KsYunField(name = "SecurityGroupID")
        private String SecurityGroupID;

        /**
         * 计费方式（新建实例为必填项） • monthly 包年包月 • dailysettlement 按量付费（按日月结） •
         * hourlyInstantSettlement(按小时结）
         */
        @KsYunField(name = "ChargeType")
        private String ChargeType;

        /** 购买时长单位，当计费方式为包年包月时必填 • 2 单位月 */
        @KsYunField(name = "Unit")
        private Integer Unit;

        /** 购买时长，当计费方式为包年包月时必填，单位为月 有效值1-36 其他计费类型可不填，若填只能为0 */
        @KsYunField(name = "PurchaseTime")
        private Integer PurchaseTime;
      }
    }
  }
}
