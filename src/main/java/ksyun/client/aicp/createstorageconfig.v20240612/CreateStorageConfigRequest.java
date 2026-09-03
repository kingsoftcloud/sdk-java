package ksyun.client.aicp.createstorageconfig.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateStorageConfigRequest
* @Description 请求参数
*/
@Data
public class CreateStorageConfigRequest{
    /**存储配置名称, 1-64个字符，允许字母 中文 数字 - _ . / ( )*/
    @KsYunField(name="StorageConfigName")
    private String StorageConfigName;

    /**存储配置描述*/
    @KsYunField(name="Description")
    private String Description;

    /**存储类型 
 有效值： 
 - KPFS 
 - KS3*/
    @KsYunField(name="Type")
    private String Type;

    /**挂载路径, 不能覆盖关键系统目录，包括：/、/bin、/sbin、/usr、/etc、/proc、/sys、/home等，子目录可以*/
    @KsYunField(name="MountPath")
    private String MountPath;

    /**KPFS存储信息 (当Type为KPFS时必填)*/
    @KsYunField(name="KpfsInfo")
    private KpfsInfoDto KpfsInfo;

    @Data
    @ToString
    public static class KpfsInfoDto {
        /**文件系统ID*/
        @KsYunField(name="FileSystemId")
        private String FileSystemId;

        /**系统文件路径*/
        @KsYunField(name="SystemFilePath")
        private String SystemFilePath;

        /**挂载协议类型(已废弃)*/
        @KsYunField(name="MntProtocol")
        private String MntProtocol;

    }

    /**KS3存储信息 (当Type为KS3时必填)*/
    @KsYunField(name="Ks3Info")
    private Ks3InfoDto Ks3Info;

    @Data
    @ToString
    public static class Ks3InfoDto {
        /**KS3存储桶名称, 需要Ak,Sk拥有此存储桶的读写权限*/
        @KsYunField(name="BucketName")
        private String BucketName;

        /**KS3存储桶路径，请确保KS3路径真实有效(不穿入则挂载整个bucket桶)*/
        @KsYunField(name="BucketPath")
        private String BucketPath;

    }

    /**子账号权限信息列表*/
    @KsYunField(name="Users",type=2)
    private List<UsersDto> UsersList;

    @Data
    @ToString
    public static class UsersDto {
        /**子账号ID*/
        @KsYunField(name="UserId")
        private String UserId;

        /**权限类型
KPFS存储配置权限枚举值：
- writer_mnt_w 管理员（读写）
- writer 管理员（只读）
- reader_mnt_w 普通成员（读写）
- reader普通成员（只读）

KS3存储配置权限枚举值：
- writer 管理员
- reader普通成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

    /**存储配置权限，枚举值：
- Private，私有
- Specified，指定范围（默认）
指定范围权限下，权限取决于Users和SharedGroupList*/
    @KsYunField(name="DatasetPermission")
    private String DatasetPermission;

    /**权限组共享列表，DatasetPermission为Specified时，Users或SharedGroupList至少传一个*/
    @KsYunField(name="SharedGroupList",type=2)
    private List<SharedGroupListDto> SharedGroupListList;

    @Data
    @ToString
    public static class SharedGroupListDto {
        /**权限组ID，36位*/
        @KsYunField(name="AccessGroupId")
        private String AccessGroupId;

        /**权限类型
KPFS存储配置权限枚举值：
- writer_mnt_w 管理员（读写）
- writer 管理员（只读）
- reader_mnt_w 普通成员（读写）
- reader普通成员（只读）

KS3存储配置权限枚举值：
- writer 管理员
- reader普通成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

    /**开启预取。当选择的文件系统是容量型/标准型KPFS时,可设置开启预取，开启后能提升连续读性能，但可能降低随机读性能。*/
    @KsYunField(name="Prefetch")
    private Boolean Prefetch;

    /**访问密钥ID,除性能型KPFS外，其余存储类型均需要填写*/
    @KsYunField(name="Ak")
    private String Ak;

    /**访问密钥Secret,除性能型KPFS外，其余存储类型均需要填写*/
    @KsYunField(name="Sk")
    private String Sk;

}
