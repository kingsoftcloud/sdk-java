package ksyun.client.kec.premigrateinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname PreMigrateInstanceRequest
* @Description 请求参数
*/
@Data
public class PreMigrateInstanceRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**目标实例类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**云盘系统盘的类型。

有效值：SSD3.0，EHDD*/
    @KsYunField(name="SystemDiskType")
    private String SystemDiskType;

    /**云盘数据盘的类型。

有效值：SSD3.0，EHDD*/
    @KsYunField(name="DataDiskType")
    private String DataDiskType;

    /**支持快速开盘/快速变更，该参数仅对本地盘/本地盘机型/本地盘快照生效*/
    @KsYunField(name="InstantAccess")
    private Boolean InstantAccess;

}
