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
public class DescribePerformanceOnePosixAclListRequest {
    /***/
    @KsYunField(name = "PosixAclId")
    private String PosixAclId;

    /***/
    @KsYunField(name = "FileSystemId")
    private String FileSystemId;

    /***/
    @KsYunField(name = "FileSystemName")
    private String FileSystemName;

    /***/
    @KsYunField(name = "Ip")
    private String Ip;

    /***/
    @KsYunField(name = "PageNum")
    private Integer PageNum;

    /***/
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}