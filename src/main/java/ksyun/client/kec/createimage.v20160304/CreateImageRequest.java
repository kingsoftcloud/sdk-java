package ksyun.client.kec.createimage.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateImageRequest
* @Description 请求参数
*/
@Data
public class CreateImageRequest{
    /**待创建镜像的实例ID。
标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**新镜像的名称。
2-64个字符，支持中文、字母、数字以及-_@#.字符*/
    @KsYunField(name="Name")
    private String Name;

    /**自定义镜像类型，分为本地镜像和普通镜像。
LocalImage 和 CommonImage*/
    @KsYunField(name="Type")
    private String Type;

    /**实例需要制作镜像的数据盘ID。
标准UUID格式，形如[1]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$*/
    @KsYunField(name = "DataDiskIds", type = 1)
    private List<String> DataDiskIdsList;

    /**实例需要制作镜像的快照ID，里面必须包含一个系统盘快照ID。
标准UUID格式，形如[2]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$*/
    @KsYunField(name = "SnapshotIds", type = 1)
    private List<String> SnapshotIdsList;

    /**支持快速开盘/快速变更，该参数仅对本地盘/本地盘机型/本地盘快照生效*/
    @KsYunField(name="InstantAccess")
    private Boolean InstantAccess;

}
