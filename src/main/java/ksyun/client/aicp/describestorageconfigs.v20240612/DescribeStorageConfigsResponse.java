package ksyun.client.aicp.describestorageconfigs.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeStorageConfigsResponse
 * @Description DescribeStorageConfigs 返回体
 */
@Data
@ToString
public class DescribeStorageConfigsResponse extends BaseResponseModel {

    /**
     * 请求ID
     */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
     * 单次调用可返回的最大条目数量
     */
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**
     * 页码
     */
    @JsonProperty("Page")
    private Integer Page;

    /**
     * 训练任务总数
     */
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**
     * 存储配置信息
     */
    @JsonProperty("StorageConfigSet")
    private List<StorageConfigSetDto> StorageConfigSet;

    @Data
    @ToString
    public static class StorageConfigSetDto {
        /**
         * 数据集ID
         */
        @JsonProperty("StorageConfigId")
        private String StorageConfigId;

        /**
         * 数据集名称
         */
        @JsonProperty("StorageConfigName")
        private String StorageConfigName;

        /**
         * 描述
         */
        @JsonProperty("Description")
        private String Description;

        /**
         * 数据类型：
         * - KPFS
         * - KS3
         */
        @JsonProperty("Type")
        private String Type;

        /**
         * 挂载路径
         */
        @JsonProperty("MountPath")
        private String MountPath;

        /**
         * Ak
         */
        @JsonProperty("Ak")
        private String Ak;

        /**
         * Kpfs信息
         */
        @JsonProperty("KpfsInfo")
        private StorageConfigSetKpfsInfoDto KpfsInfo;

        @Data
        @ToString
        public static class StorageConfigSetKpfsInfoDto {
            /**
             * 文件系统ID
             */
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /**
             * 文件系统ID
             */
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**
             * 系统文件路径
             */
            @JsonProperty("SystemFilePath")
            private String SystemFilePath;

            /**
             * 挂载协议类型
             */
            @JsonProperty("MntProtocol")
            private String MntProtocol;

            /**
             * 文件系统集群
             */
            @JsonProperty("ClusterName")
            private String ClusterName;

        }

        /**
         * ks3信息
         */
        @JsonProperty("Ks3Info")
        private StorageConfigSetKs3InfoDto Ks3Info;

        @Data
        @ToString
        public static class StorageConfigSetKs3InfoDto {
            /**
             * KS3存储桶名称
             */
            @JsonProperty("BucketName")
            private String BucketName;

            /**
             * KS3存储桶路径
             */
            @JsonProperty("BucketPath")
            private String BucketPath;

            /**
             * KS3存储桶路径对应的访问域名
             */
            @JsonProperty("Endpoint")
            private String Endpoint;

        }

        /**
         * 创建人ID
         */
        @JsonProperty("CreatorId")
        private String CreatorId;

        /**
         * 创建时间
         */
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**
         * 子账号权限信息列表
         */
        @JsonProperty("Users")
        private List<StorageConfigSetUsersDto> Users;

        @Data
        @ToString
        public static class StorageConfigSetUsersDto {
            /**
             * 子账号ID
             */
            @JsonProperty("UserId")
            private String UserId;

            /**
             * 权限类型,
             * kpfs用户权限：[admin 创建者or主账号, writer 管理员（只读）, writer_mnt_w 管理员（读写）, reader 普通成员（只读）, reader_mnt_w 普通成员（读写）]
             * ks3用户权限：[admin 创建者or主账号, writer 管理员（只读）, reader 普通成员（只读）]
             */
            @JsonProperty("Permission")
            private String Permission;

        }

    }

}
