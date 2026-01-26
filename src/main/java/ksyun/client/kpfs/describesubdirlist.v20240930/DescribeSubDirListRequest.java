package ksyun.client.kpfs.describesubdirlist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSubDirListRequest
* @Description 请求参数
*/
@Data
public class DescribeSubDirListRequest{
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

    /**目录完整路径，格式 dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/；文件系统传入：/；目录传入路径：dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/；目录最大深度255层，根目录是第一层。*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**目录名称*/
    @KsYunField(name="Name")
    private String Name;

    /**当前页码，最小值1，无上限*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**每页数量，默认值1000，最小值1，最大值1000*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
