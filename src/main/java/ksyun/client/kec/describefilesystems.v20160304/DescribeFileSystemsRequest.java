package ksyun.client.kec.describefilesystems.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileSystemsRequest
* @Description 请求参数
*/
@Data
public class DescribeFileSystemsRequest{
    /**预查看的文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**单次调用所返回的最大实例数目，取值为5~1000，超过1000记为1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private Integer Marker;


}