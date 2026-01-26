package ksyun.client.kpfs.describedirquotalist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDirQuotaListRequest
* @Description 请求参数
*/
@Data
public class DescribeDirQuotaListRequest{
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

    /**目录路径模糊查询关键字，支持中间路径的模糊匹配，比如，存在目录配额/dir/subdir，查询关键字为subdir，那么会返回/dir/subdir的目录配额信息。注意：若不传入该参数，则返回文件系统下的目录配额列表。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**是否模糊查询，默认 true；精确查询时，格式：dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/。*/
    @KsYunField(name="FuzzySearch")
    private Boolean FuzzySearch;

    /**分页大小。默认为10。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**页码。默认为1。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

}
