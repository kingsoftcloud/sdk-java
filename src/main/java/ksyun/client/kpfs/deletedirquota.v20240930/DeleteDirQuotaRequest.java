package ksyun.client.kpfs.deletedirquota.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDirQuotaRequest
* @Description 请求参数
*/
@Data
public class DeleteDirQuotaRequest{
    /**文件系统的实例ID

性能Ⅰ型/性能Ⅱ型指定文件系统支持2种方式，建议择一使用：

通过文件系统ID(FileSystemId)

输入文件系统完整信息，文件系统信息，存储类型(StoreClass) + 存储池名称(ClusterName) + 文件系统名称(FileSystemName)同时必填。

容量Ⅰ型/容量Ⅱ型/标准型支持2种方式，建议择一使用：

通过文件系统ID(FileSystemId)

输入文件系统完整信息，存储类型(StoreClass) + 文件系统名称(FileSystemName)同时必填*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**存储类型，取值：

KPFS-capacity（容量Ⅰ型）

KPFS-capacity2（容量Ⅱ型）

KPFS-standard（标准型）

KPFS-P-S01（性能Ⅰ型）

KPFS-P-S02（性能Ⅱ型*/
    @KsYunField(name="StoreClass")
    private String StoreClass;

    /**存储池名称，从控制台>文件系统详情>资源池获取。*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**文件系统名称，名称最大长度63字节。*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**目录完整路径，格式：dir/xxx 或 /dir/××× 或 dir/×××/或/dir/×××/

注意：

性能Ⅰ型/性能Ⅱ型存储池、文件系统名称、目录完整路径不允许修改，必须与原目录相同。

容量Ⅰ型/容量Ⅱ型/标准型，必须与原目录相同。

已设置目录配额的目录，才允许删除目录配额。*/
    @KsYunField(name="DirPath")
    private String DirPath;

}
