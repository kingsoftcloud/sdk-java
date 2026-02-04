package ksyun.client.kpfs.describeperformanceonenfsacllist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePerformanceOneNfsAclListRequest
* @Description 请求参数
*/
@Data
public class DescribePerformanceOneNfsAclListRequest{
    /**文件系统名称。*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**规则ID。*/
    @KsYunField(name="NfsAclId")
    private String NfsAclId;

    /**页码。默认为1。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小。默认为10。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
