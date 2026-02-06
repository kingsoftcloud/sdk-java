package ksyun.client.kpfs.describefilesystemnfsclientinfo.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileSystemNfsClientInfoRequest
* @Description 请求参数
*/
@Data
public class DescribeFileSystemNfsClientInfoRequest{
    /**文件系统的实例ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**页码 默认值1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小 默认值1000 可选1-1000*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**该参数为公共参数，本接口取值如下：DescribeFileSystemNfsClientInfo。*/
    @KsYunField(name="Action")
    private String Action;

    /**该参数为公共参数，取值：2024-09-30。*/
    @KsYunField(name="Version")
    private String Version;

}
