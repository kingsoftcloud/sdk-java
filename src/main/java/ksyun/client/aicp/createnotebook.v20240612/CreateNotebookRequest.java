package ksyun.client.aicp.createnotebook.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateNotebookRequest
* @Description 请求参数
*/
@Data
public class CreateNotebookRequest{
    /**任务名称*/
    @KsYunField(name="NotebookName")
    private String NotebookName;

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**资源池ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**队列名称*/
    @KsYunField(name="QueueName")
    private String QueueName;

    /**GPU类型*/
    @KsYunField(name="GPUType")
    private String GPUType;

    /**GPU卡数，当GPUType不为空时，此值有效，允许范围为0~10000, 如果可虚拟化，支持[0.1,0.9]*/
    @KsYunField(name="GPUNumber")
    private String GPUNumber;

    /**CPU核数，允许范围为0~10000*/
    @KsYunField(name="CPUNum")
    private Integer CPUNum;

    /**内存Gi，允许范围为0~10000*/
    @KsYunField(name="Memory")
    private Integer Memory;

    /**可见范围，Creator(个人私有)，QueueMember（队列内共享）*/
    @KsYunField(name="AccessType")
    private String AccessType;

    /**存储配置列表*/
    @KsYunField(name="StorageConfigs",type=2)
    private List<StorageConfigsDto> StorageConfigsList;

    @Data
    @ToString
    public static class StorageConfigsDto {
        /**存储配置ID*/
        @KsYunField(name="StorageConfigId")
        private String StorageConfigId;

        /**挂载路径，可不设置，默认用存储配置的挂载路径*/
        @KsYunField(name="MountPath")
        private String MountPath;

        /**挂载类型：
• DataSet（数据集）
• Output（输出）*/
        @KsYunField(name="StorageConfigType")
        private String StorageConfigType;

    }

    /**是否自动保存镜像*/
    @KsYunField(name="AutoSave")
    private Boolean AutoSave;

    /**开放服务端口列表*/
    @KsYunField(name="ServiceConfigs",type=2)
    private List<ServiceConfigsDto> ServiceConfigsList;

    @Data
    @ToString
    public static class ServiceConfigsDto {
        /**服务名称*/
        @KsYunField(name="Service")
        private String Service;

        /**端口*/
        @KsYunField(name="Port")
        private Integer Port;

        /**是否开放公网*/
        @KsYunField(name="EnablePublicNetwork")
        private Boolean EnablePublicNetwork;

    }

    /**镜像来源
- 官方镜像 Official
- 个人镜像 Personal
- 第三方镜像 ThirdParty

当传入值为ThirdParty时，"ImageRegistryId", "ImageRepoId", "ImageTagId"必须传入*/
    @KsYunField(name="ImageSource")
    private String ImageSource;

    /**镜像ID
当镜像来源为第三方来源时，此参数不传递，其他镜像来源，此参数为必填项*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**第三方镜像配置ID*/
    @KsYunField(name="ImageRegistryId")
    private String ImageRegistryId;

    /**第三方镜像仓库ID*/
    @KsYunField(name="ImageRepoId")
    private String ImageRepoId;

    /**第三方镜像版本ID*/
    @KsYunField(name="ImageTagId")
    private String ImageTagId;

    /**是否开启SSH*/
    @KsYunField(name="EnableSSH")
    private Boolean EnableSSH;

    /**SSH公钥，当EnableSsh=true时必传该参数*/
    @KsYunField(name="SSHAuthorizedKeys")
    private String SSHAuthorizedKeys;

    /**SSH端口，默认为22，范围为1~65535*/
    @KsYunField(name="SSHPort")
    private Integer SSHPort;

    /**是否开启公网SSH访问模式，当EnableSsh=true时可设置该参数*/
    @KsYunField(name="EnablePublicNetworkSSH")
    private Boolean EnablePublicNetworkSSH;

    /**弹性IP ID，当EnablePublicNetworkSsh=true时，此参数必传*/
    @KsYunField(name="AllocationId")
    private String AllocationId;

    /**开启后，仅调度CPU*/
    @KsYunField(name="RunOnCPU")
    private String RunOnCPU;

}
