package ksyun.client.kec.createfilesystem.v20160304;

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
    /**产品服务地点，在支持可用区的Region下有效；<br>cn-beijing-6a：华北1（北京）可用区A*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**主网卡VPC ID。标准UUID格式，[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**文件系统类型，当前支持容量型。有效值： Capacity*/
    @KsYunField(name="StorageType")
    private String StorageType;

    /**协议类型，支持NFS，CIFS*/
    @KsYunField(name="ProtocolType")
    private String ProtocolType;

    /**文件系统名称，有效值：长度2-64字符，支持中文，字母，数字，以及-_；*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**项目制id*/
    @KsYunField(name="ProjectId")
    private Long ProjectId;

    /**• 回收站功能是否开启，默认不开启
    ◦ TRUE ：表示回收站功能开启
    ◦ FALSE：表示回收站功能不开启*/
    @KsYunField(name="IsTrashEnable")
    private Boolean IsTrashEnable;

    /**• 回收站目录是否可见，默认不可见
    ◦ TRUE ：表示回收站目录可见
    ◦ FALSE：表示回收站目录不可见*/
    @KsYunField(name="IsTrashVisible")
    private Boolean IsTrashVisible;

    /**• 回收站内数据保留时长，默认1天
    ◦ 0：表示“永久保留”，不自动删除。
    ◦ 1：表示“固定周期保留”，取值范围：
        ▪ 天：[1,  180]*/
    @KsYunField(name="IntervalTrash")
    private Integer IntervalTrash;

    /**• 可以选择操作回收站内文件的用户权限，默认“普通用户”
    ◦ 0：表示“root用户”，只有root用户具有操作所有用户目录的权限
    ◦ 1：表示“普通用户”，系统根据用户名和用户ID为每个用户创建自己的目录，用户有操作个人目录下文件的权限*/
    @KsYunField(name="RecycleOpPermission")
    private Integer RecycleOpPermission;

}
