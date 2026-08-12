package ksyun.client.kpfs.describeperformanceoneposixacllist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePerformanceOnePosixAclListRequest
* @Description 请求参数
*/
@Data
public class DescribePerformanceOnePosixAclListRequest{
    /**文件系统实例ID，筛选条件，非必填*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**文件系统名称，筛选条件，非必填*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

    /**授权IP，模糊筛选条件，非必填*/
    @KsYunField(name="Ip")
    private String Ip;

    /**分页页码，默认1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页每页条数，默认10*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
