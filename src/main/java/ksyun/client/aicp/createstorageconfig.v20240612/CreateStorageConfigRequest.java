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
public class CreateStorageConfigRequest {
    /**
     * 存储配置名称, 1-64个字符，允许字母 中文 数字 - _ . / ( )
     */
    @KsYunField(name = "StorageConfigName")
    private String StorageConfigName;

    /**
     * 存储配置描述
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 存储类型
     * 有效值：
     * - KPFS
     * - KS3
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 挂载路径, 不能覆盖关键系统目录，包括：/、/bin、/sbin、/usr、/etc、/proc、/sys、/home等，子目录可以
     */
    @KsYunField(name = "MountPath")
    private String MountPath;

    /**
     * KPFS存储信息 (当Type为KPFS时必填)
     */
    @KsYunField(name = "KpfsInfo")
    private KpfsInfoDto KpfsInfo;

    @Data
    @ToString
    public static class KpfsInfoDto {
        /**
         * 文件系统ID
         */
        @KsYunField(name = "FileSystemId")
        private String FileSystemId;

        /**
         * 系统文件路径
         */
        @KsYunField(name = "SystemFilePath")
        private String SystemFilePath;

        /**
         * 挂载协议类型(性能型KPFS参数，标准/容量型KPFS传入此值无效（仅支持POSIX）
         * 可选:
         * - NFS，
         * -POSIX)
         */
        @KsYunField(name = "MntProtocol")
        private String MntProtocol;

    }

    /**
     * KS3存储信息 (当Type为KS3时必填)
     */
    @KsYunField(name = "Ks3Info")
    private Ks3InfoDto Ks3Info;

    @Data
    @ToString
    public static class Ks3InfoDto {
        /**
         * KS3存储桶名称, 需要Ak,Sk拥有此存储桶的读写权限
         */
        @KsYunField(name = "BucketName")
        private String BucketName;

        /**
         * KS3存储桶路径，请确保KS3路径真实有效(不穿入则挂载整个bucket桶)
         */
        @KsYunField(name = "BucketPath")
        private String BucketPath;

    }

    /**
     * 子账号权限信息列表
     */
    @KsYunField(name = "Users", type = 2)
    private List<UsersDto> UsersList;

    @Data
    @ToString
    public static class UsersDto {
        /**
         * 子账号ID
         */
        @KsYunField(name = "UserId")
        private String UserId;

        /**
         * 权限类型,
         * kpfs用户权限：[admin 创建者or主账号, writer 管理员（只读）, writer_mnt_w 管理员（读写）, reader 普通成员（只读）, reader_mnt_w 普通成员（读写）]
         * ks3用户权限：[admin 创建者or主账号, writer 管理员（只读）, reader 普通成员（只读）]
         */
        @KsYunField(name = "Permission")
        private String Permission;

    }

    /**
     * 访问密钥ID,除性能型KPFS外，其余存储类型均需要填写
     */
    @KsYunField(name = "Ak")
    private String Ak;

    /**
     * 访问密钥Secret,除性能型KPFS外，其余存储类型均需要填写
     */
    @KsYunField(name = "Sk")
    private String Sk;

}
