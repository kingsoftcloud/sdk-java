package ksyun.client.kpfs.createfilesystem.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateFileSystemRequest
* @Description 请求参数
*/
@Data
public class CreateFileSystemRequest{
    /**文件系统名称。容量Ⅰ型/容量Ⅱ型/标准型限制：小写字母开头，仅可包含小写字母、数字与连线符'-'，长度3-40个字符，不可以连线符'-'结尾。性能Ⅰ型/性能Ⅱ型限制：小写字母开头，仅可包含小写字母、数字与连线符'_'，长度3-40个字符，不可以下划线'_'结尾。*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**文件系统所在地域。*/
    @KsYunField(name="Region")
    private String Region;

    /**文件系统所在可用区，需与Region参数配合使用。*/
    @KsYunField(name="AvailZone")
    private String AvailZone;

    /**文件系统计费类型。monthly（预付费，包年包月）、dailySettlement（后付费，按量付费）。*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**文件系统购买时长，仅购买包年包月时需填写。有效值：1~60，单位：月。*/
    @KsYunField(name="PurchaseTime")
    private Long PurchaseTime;

    /**文件系统存储类型。KPFS-capacity（容量Ⅰ型）、KPFS-capacity2（容量Ⅱ型）、KPFS-standard（标准型）、KPFS-P-S01（性能Ⅰ型）、KPFS-P-S02（性能Ⅱ型）。*/
    @KsYunField(name="StoreClass")
    private String StoreClass;

    /**文件系统购买容量。单位TiB。有效值：容量Ⅰ型 20~102400；容量Ⅱ型 20~102400；标准型 10~102400；性能Ⅰ型 10~102400；性能Ⅱ型 10~102400。*/
    @KsYunField(name="Capacity")
    private Long Capacity;

    /**条带块大小，仅性能Ⅰ型、性能Ⅱ型需填写。单位：Byte。枚举值：4096（4KB，小文件友好型）、32768（32KB，均衡型）、65536（64KB，大文件友好型）。*/
    @KsYunField(name="ChunkSize")
    private Long ChunkSize;

    /**存储池Code，为集群的唯一标识，仅性能Ⅰ型、性能Ⅱ型需填写。*/
    @KsYunField(name="ClusterCode")
    private String ClusterCode;

}
