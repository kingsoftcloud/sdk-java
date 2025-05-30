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
public class CreateNotebookRequest {
    /**
     * 任务名称
     */
    @KsYunField(name = "DisplayName")
    private String DisplayName;

    /**
     * 描述信息
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 镜像ID
     */
    @KsYunField(name = "ImageId")
    private String ImageId;

    /**
     * 队列名称
     */
    @KsYunField(name = "QueueName")
    private String QueueName;

    /**
     * GPU类型
     */
    @KsYunField(name = "GPUType")
    private String GPUType;

    /**
     * GPU核数，允许范围为0~10000
     */
    @KsYunField(name = "GPUNumber")
    private Integer GPUNumber;

    /**
     * 可见范围，Creator(创建者可见)，QueueMember（队列成员可见）
     */
    @KsYunField(name = "AccessType")
    private String AccessType;

    /**
     * 是否开启公网SSH访问模式，当EnableSsh=true时可设置该参数
     */
    @KsYunField(name = "EnablePublicNetworkSsh")
    private Boolean EnablePublicNetworkSsh;

    /**
     * 弹性IP ID，当EnablePublicNetworkSsh=true时，此参数必传
     */
    @KsYunField(name = "AllocationId")
    private String AllocationId;

    /**
     * Cpu数量，允许范围为0~10000
     */
    @KsYunField(name = "CpuNum")
    private Integer CpuNum;

    /**
     * 内存G，允许范围为0~10000
     */
    @KsYunField(name = "Memory")
    private Integer Memory;

    /**
     * 是否开启SSH
     */
    @KsYunField(name = "EnableSsh")
    private Boolean EnableSsh;

    /**
     * SSH公钥，当EnableSsh=true时必传该参数
     */
    @KsYunField(name = "SshAuthorizedKeys")
    private String SshAuthorizedKeys;

    /**
     * SSH端口，默认为22，范围为1~65535
     */
    @KsYunField(name = "SshPort")
    private Integer SshPort;

    /**
     * 存储配置列表
     */
    @KsYunField(name = "StorageConfigs", type = 2)
    private List<StorageConfigsDto> StorageConfigsList;

    @Data
    @ToString
    public static class StorageConfigsDto {
        /**
         * 存储配置ID
         */
        private String StorageConfigId;
        /**
         * 挂载路径，可不设置，默认用存储配置的挂载路径
         */
        private String MountPath;
        /**
         * 挂载类型：
         * • DataSet（数据集）
         * • Output（输出）
         */
        private String StorageConfigType;
    }

    /**
     * 资源池ID
     */
    @KsYunField(name = "ResourcePoolId")
    private String ResourcePoolId;

}