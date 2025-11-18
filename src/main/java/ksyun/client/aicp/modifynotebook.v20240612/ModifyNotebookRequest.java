package ksyun.client.aicp.modifynotebook.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyNotebookRequest
* @Description 请求参数
*/
@Data
public class ModifyNotebookRequest{
    /**开发任务ID*/
    @KsYunField(name="NotebookId")
    private String NotebookId;

    /**名称*/
    @KsYunField(name="NotebookName")
    private String NotebookName;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

    /**镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**队列名称*/
    @KsYunField(name="QueueName")
    private String QueueName;

    /**GPU类型*/
    @KsYunField(name="GPUType")
    private String GPUType;

    /**GPU核数，允许范围为0~10000*/
    @KsYunField(name="GPUNumber")
    private Integer GPUNumber;

    /**Cpu数量，允许范围为0~10000*/
    @KsYunField(name="CPUNum")
    private Integer CPUNum;

    /**内存G，允许范围为0~10000	*/
    @KsYunField(name="Memory")
    private Integer Memory;

    /**可见范围:
• Creator ：仅实例创建者可见
• QueueMember ：队列内成员可见
*/
    @KsYunField(name="AccessType")
    private String AccessType;

    /**是否开启公网SSH访问模式，当EnableSsh=true时可设置该参数*/
    @KsYunField(name="EnablePublicNetworkSsh")
    private Boolean EnablePublicNetworkSsh;

    /**SSH公钥，当EnableSsh=true时必传该参数*/
    @KsYunField(name="SshAuthorizedKeys")
    private String SshAuthorizedKeys;

    /**存储配置列表
（覆盖修改，需要传入全量的配置列表）*/
    @KsYunField(name="StorageConfigs",type=2)
    private List<StorageConfigsDto> StorageConfigsList;
    @Data
    @ToString
    public static class StorageConfigsDto {
        /**存储配置ID*/
        private String StorageConfigId;
        /**挂载路径，可不设置，默认用存储配置的挂载路径*/
        private String MountPath;
        /**挂载类型： • DataSet（数据集） • Output（输出）*/
        private String StorageConfigType;
    }

    /**服务开放端口列表*/
    @KsYunField(name="ServiceConfigs",type=2)
    private List<ServiceConfigsDto> ServiceConfigsList;
    @Data
    @ToString
    public static class ServiceConfigsDto {
        /**服务名称*/
        private String Service;
        /**端口*/
        private Integer Port;
        /**是否开启公网访问*/
        private Boolean EnablePublicNetwork;
    }

    /***/
    @KsYunField(name="AutoSave")
    private Boolean AutoSave;

    /**仅调度CPU*/
    @KsYunField(name="RunOnCPU")
    private String RunOnCPU;

    /**是否开启SSH访问*/
    @KsYunField(name="EnableSSH")
    private String EnableSSH;

    /**SSH端口，范围为1~65535*/
    @KsYunField(name="SSHPort")
    private Integer SSHPort;

    /**SSH公钥，当EnableSsh=true时必传该参数*/
    @KsYunField(name="SSHAuthorizedKeys")
    private String SSHAuthorizedKeys;

    /**是否开启公网SSH访问模式，当EnableSsh=true时可设置该参数*/
    @KsYunField(name="EnablePublicNetworkSSH")
    private Boolean EnablePublicNetworkSSH;

    /**弹性IP ID，当EnablePublicNetworkSsh=true时，此参数必传*/
    @KsYunField(name="AllocationId")
    private String AllocationId;

    /**第三方镜像tagId*/
    @KsYunField(name="ImageTagId")
    private String ImageTagId;

    /**镜像来源，当改变镜像来源时，需传入该值。
- Official 官方镜像
- Personal 个人镜像
- ThirdParty 第三方镜像

当修改镜像类型为第三方镜像时，需同时传入"ImageRegistryId", "ImageRepoId", "ImageTagId"三个入参
*/
    @KsYunField(name="ImageSource")
    private String ImageSource;

    /**第三方镜像仓库ID*/
    @KsYunField(name="ImageRepoId")
    private String ImageRepoId;

    /**第三方镜像ID*/
    @KsYunField(name="ImageRegistryId")
    private String ImageRegistryId;

}