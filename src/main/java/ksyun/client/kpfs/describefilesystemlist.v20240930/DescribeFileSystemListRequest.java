package ksyun.client.kpfs.describefilesystemlist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileSystemListRequest
* @Description 请求参数
*/
@Data
public class DescribeFileSystemListRequest{
    /**文件系统所在地域，不传则返回所有地域下文件系统。*/
    @KsYunField(name="Region")
    private String Region;

    /**文件系统名称前缀，模糊查询。*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**文件系统的实例ID清单，支持批量查询，FileSystemId 以逗号分隔。*/
    @KsYunField(name="FileSystemIds")
    private String FileSystemIds;

    /**文件系统的存储类型。*/
    @KsYunField(name="StoreClasses")
    private String StoreClasses;

    /**项目制。子账号查询：若不传则返回子账号下有权限项目的文件系统列表。主账号查询：若不传则返回所有项目的文件系统列表。*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**页码。默认为1。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小。默认为10。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
