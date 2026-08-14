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

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**单次调用可返回的最大条目数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**训练任务总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**存储配置信息*/
    @JsonProperty("StorageConfigSet")
    private List<StorageConfigSetDto> StorageConfigSet;

    @Data
    @ToString
    public static class StorageConfigSetDto {
        /**存储配置ID*/
        @JsonProperty("StorageConfigId")
        private String StorageConfigId;

        /**存储配置名称*/
        @JsonProperty("StorageConfigName")
        private String StorageConfigName;

        /**存储配置存储配置描述*/
        @JsonProperty("Description")
        private String Description;

        /**数据类型： 
 - KPFS 
 - KS3*/
        @JsonProperty("Type")
        private String Type;

        /**挂载路径*/
        @JsonProperty("MountPath")
        private String MountPath;

        /**Ak*/
        @JsonProperty("Ak")
        private String Ak;

        /**Kpfs信息*/
        @JsonProperty("KpfsInfo")
        private StorageConfigSetKpfsInfoDto KpfsInfo;

        @Data
        @ToString
        public static class StorageConfigSetKpfsInfoDto {
            /**文件系统ID*/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /**文件系统ID*/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**系统文件路径*/
            @JsonProperty("SystemFilePath")
            private String SystemFilePath;

            /**挂载协议类型(已废弃)*/
            @JsonProperty("MntProtocol")
            private String MntProtocol;

            /**文件系统集群*/
            @JsonProperty("ClusterName")
            private String ClusterName;

        }

        /**ks3信息*/
        @JsonProperty("Ks3Info")
        private StorageConfigSetKs3InfoDto Ks3Info;

        @Data
        @ToString
        public static class StorageConfigSetKs3InfoDto {
            /**KS3存储桶名称*/
            @JsonProperty("BucketName")
            private String BucketName;

            /**KS3存储桶路径，请确保KS3路径真实有效(不传入则挂载整个bucket桶)*/
            @JsonProperty("BucketPath")
            private String BucketPath;

            /**KS3存储桶路径对应的访问域名*/
            @JsonProperty("Endpoint")
            private String Endpoint;

        }

        /**创建人ID*/
        @JsonProperty("CreatorId")
        private String CreatorId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**子账号权限信息列表*/
        @JsonProperty("Users")
        private List<StorageConfigSetUsersDto> Users;

        @Data
        @ToString
        public static class StorageConfigSetUsersDto {
            /**子账号ID*/
            @JsonProperty("UserId")
            private String UserId;

            /**权限类型, 
 kpfs用户权限：[admin 创建者or主账号, writer 管理员（只读）, writer_mnt_w 管理员（读写）, reader 普通成员（只读）, reader_mnt_w 普通成员（读写）] 
ks3用户权限：[admin 创建者or主账号, writer 管理员（只读）, reader 普通成员（只读）]*/
            @JsonProperty("Permission")
            private String Permission;

        }

        /**存储配置权限，枚举值：
- Private，私有
- Specified，指定范围
指定范围权限下，权限取决于Users和SharedGroupList*/
        @JsonProperty("DatasetPermission")
        private String DatasetPermission;

        /**权限组共享列表*/
        @JsonProperty("SharedGroupList")
        private List<StorageConfigSetSharedGroupListDto> SharedGroupList;

        @Data
        @ToString
        public static class StorageConfigSetSharedGroupListDto {
            /**权限组ID，36位*/
            @JsonProperty("AccessGroupId")
            private String AccessGroupId;

            /**权限组共享角色，枚举值：
- writer，管理员（只读）
- reader，普通成员（只读）
- writer_mnt_w，管理员（读写）
- reader_mnt_w，普通成员（读写）*/
            @JsonProperty("Permission")
            private String Permission;

        }

        /**开启预取。当选择的文件系统是容量型/标准型KPFS时,可设置开启预取，开启后能提升连续读性能，但可能降低随机读性能。*/
        @JsonProperty("Prefetch")
        private Boolean Prefetch;

    }

}
