package ksyun.client.kpfs.createdir.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDirRequest
* @Description 请求参数
*/
@Data
public class CreateDirRequest{
    /**指定文件系统支持2种方式，建议择一使用：1.通过文件系统ID(FileSystemId)；2.输入文件系统完整信息，存储类型(StoreClass) + 存储池名称(ClusterName) + 文件系统名称(FileSystemName)同时必填。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**存储类型 取值：KPFS-P-S01（性能Ⅰ型）KPFS-P-S02（性能Ⅱ型）。*/
    @KsYunField(name="StoreClass")
    private String StoreClass;

    /**存储池名称，从控制台>文件系统详情>资源池获取。*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**文件系统名称，名称最大长度63字节。*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**目录完整路径，格式 dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/。限制：1.创建目录的上一层目录必须存在，系统不会自动创建，不存在则报错: $path dose not exist；2.若目录中包含/，系统会自动用/将目录分层，报错信息同上。补充说明：针对目录名称的限制如下：字节长度1-254字节；不允许使用 /；不能设置为.和..。针对完整路径(文件系统名:/dir)：最大1024字节。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**文件所属用户的id，不可设置负数。有效值范围：0-（不校验范围）。备注：设置为0时，为root权限。UID和GID必须同时配置，或皆不配置。否则会报错。*/
    @KsYunField(name="FileSysOwnerUserId")
    private Integer FileSysOwnerUserId;

    /**文件所属用户的用户组id，不可设置负数。有效值范围：0- (不校验范围）。备注：设置为0时，为root权限。UID和GID必须同时配置，或皆不配置。否则会报错。*/
    @KsYunField(name="FileSysOwnerGroupId")
    private Integer FileSysOwnerGroupId;

    /**文件读写权限，格式:十位二进制表示法。备注：默认为755 (-rwxr-xr-x)，拥有者有读、写、执行权限；而属组用户和其他用户只有读、执行权限。*/
    @KsYunField(name="FileSysPosixPermission")
    private Integer FileSysPosixPermission;

}
