package ksyun.client.kpfs.updatedir.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDirRequest
* @Description 请求参数
*/
@Data
public class UpdateDirRequest{
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

    /**目录完整路径，格式 dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/。注意：1.存储池、文件系统名称、目录完整路径不允许修改；2.必须与原目录相同。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**文件读写权限，格式:十位二进制表示法。备注：默认为755 (-rwxr-xr-x)，拥有者有读、写、执行权限；而属组用户和其他用户只有读、执行权限。*/
    @KsYunField(name="FileSysPosixPermission")
    private Integer FileSysPosixPermission;

    /**文件所属用户的id。备注：设置为0时，为root权限。注意：所属用户的id和所属用户的用户组id须同时修改。*/
    @KsYunField(name="FileSysOwnerUserId")
    private Integer FileSysOwnerUserId;

    /**文件所属用户的用户组id。备注：设置为0时，为root权限。注意：所属用户的id和所属用户的用户组id须同时修改。*/
    @KsYunField(name="FileSysOwnerGroupId")
    private Integer FileSysOwnerGroupId;

}
