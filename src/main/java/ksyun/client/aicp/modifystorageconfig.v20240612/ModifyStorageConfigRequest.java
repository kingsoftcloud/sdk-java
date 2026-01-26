package ksyun.client.aicp.modifystorageconfig.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyStorageConfigRequest
 * @Description 请求参数
 */
@Data
public class ModifyStorageConfigRequest {
    /**
     * 存储配置Id
     */
    @KsYunField(name = "StorageConfigId")
    private String StorageConfigId;

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
     * 挂载路径, 不能覆盖关键系统目录，包括：/、/bin、/sbin、/usr、/etc、/proc、/sys、/home等，子目录可以
     */
    @KsYunField(name = "MountPath")
    private String MountPath;

    /**
     * KS3存储信息 (修改BucketName或BucketPath时需填入)
     */
    @KsYunField(name = "Ks3Info")
    private Ks3InfoDto Ks3Info;

    @Data
    @ToString
    public static class Ks3InfoDto {
    }

    /**
     * 子账号权限信息列表（若传入，会进行全量覆盖式修改）
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
     * 访问密钥ID,对于KPFS类型的存储配置,需要用户自行保证AK/SK的有效性
     */
    @KsYunField(name = "Ak")
    private String Ak;

    /**
     * 访问密钥Secret,对于KPFS类型的存储配置,需要用户自行保证AK/SK的有效性
     */
    @KsYunField(name = "Sk")
    private String Sk;

}
