package ksyun.client.kpfs.updatedirquota.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDirQuotaRequest
* @Description 请求参数
*/
@Data
public class UpdateDirQuotaRequest{
    /**文件系统的实例ID。性能Ⅰ型/性能Ⅱ型指定文件系统支持2种方式，建议择一使用：1. 通过文件系统ID(FileSystemId)；2. 输入文件系统完整信息，存储类型(StoreClass) + 存储池名称(ClusterName) + 文件系统名称(FileSystemName)同时必填。容量Ⅰ型/容量Ⅱ型/标准型支持2种方式，建议择一使用：1. 通过文件系统ID(FileSystemId)；2. 输入文件系统完整信息，存储类型(StoreClass) + 文件系统名称(FileSystemName)同时必填。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**存储类型*/
    @KsYunField(name="StoreClass")
    private String StoreClass;

    /**存储池名称，从控制台>文件系统详情>资源池获取*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**文件系统名称，名称最大长度63字节*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**目录完整路径，格式：dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/。注意：1. 性能Ⅰ型/性能Ⅱ型存储池、文件系统名称、目录完整路径不允许修改，必须与原目录相同；2. 容量Ⅰ型/容量Ⅱ型/标准型，必须与原目录相同；3. 为已设置目录配额的目录，才允许修改目录配额。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**容量配额的设置方式，若不传，则默认为limit。参数取值：

none：无设置，该条目录配额不进行容量设置。仅KPFS性能型支持。

statistics：仅统计，设置后将统计该目录容量情况但不限制容量。仅KPFS性能型支持。

limit：限制类型，设置后将统计该目录容量情况且限制容量。KPFS容量型、标准型、性能型均支持。*/
    @KsYunField(name="LogicalCapacityType")
    private String LogicalCapacityType;

    /**容量硬阈值，正整数，不可超过文件系统容量配额，仅LogicalCapacityType取值为limit时支持设置该参数。

单位：Bytes。*/
    @KsYunField(name="LogicalHardThreshold")
    private Long LogicalHardThreshold;

    /**Inodes配额的设置方式，若不传，则默认为none，仅KPFS性能型支持。参数取值：

none：无设置

statistics：仅统计，设置后将统计该目录Inodes情况但不限制Inodes。

limit：限制类型，设置后将统计该目录Inodes情况且限制Inodes。*/
    @KsYunField(name="LogicalInodesType")
    private String LogicalInodesType;

    /**Inodes硬阈值，正整数。仅LogicalInodesTypee取值为limit时支持设置该参数。仅KPFS性能型支持。

单位：个。*/
    @KsYunField(name="LogicalHardInodes")
    private Long LogicalHardInodes;

}
