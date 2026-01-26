package ksyun.client.kpfs.createdirquota.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDirQuotaRequest
* @Description 请求参数
*/
@Data
public class CreateDirQuotaRequest{
    /**文件系统的实例ID。性能Ⅰ型/性能Ⅱ型指定文件系统支持2种方式，建议择一使用：1.通过文件系统ID(FileSystemId)；2.输入文件系统完整信息，存储类型(StoreClass) + 存储池名称(ClusterName) + 文件系统名称(FileSystemName)同时必填。容量Ⅰ型/容量Ⅱ型/标准型支持2种方式，建议择一使用：1.通过文件系统ID(FileSystemId)；2.输入文件系统完整信息，存储类型(StoreClass) + 文件系统名称(FileSystemName)同时必填。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**存储类型，取值：KPFS-capacity（容量Ⅰ型）、KPFS-capacity2（容量Ⅱ型）、KPFS-standard（标准型）、KPFS-P-S01（性能Ⅰ型）、KPFS-P-S02（性能Ⅱ型）。*/
    @KsYunField(name="StoreClass")
    private String StoreClass;

    /**存储池名称，从控制台>文件系统详情>资源池获取。*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**文件系统名称，名称最大长度63字节。*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**目录完整路径，格式：dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/。注意：1.性能Ⅰ型/性能Ⅱ型存储池、文件系统名称、目录完整路径不允许修改，必须与原目录相同；2.容量Ⅰ型/容量Ⅱ型/标准型，若目录不存在，接口会自动创建新目录；3.性能Ⅰ型/性能Ⅱ型，不支持为非空目录新增配额；4.无法为文件系统根目录设置配额，仅支持子目录；5.支持为各级目录设置配额，并且嵌套配额均取最小值作为该目录的阈值。比如：设置/dir配额为1MB，设置/dir/subdir配额为10MB，那么实际使用时会递归地向上查询，确保当前目录用量满足每一级目录的配额设置。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**容量硬阈值，不可超过文件系统容量配额。单位：Bytes。*/
    @KsYunField(name="LogicalHardThreshold")
    private Long LogicalHardThreshold;

}
