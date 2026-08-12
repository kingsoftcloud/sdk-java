package ksyun.client.kpfs.describefiledeletepolicy.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileDeletePolicyRequest
* @Description 请求参数
*/
@Data
public class DescribeFileDeletePolicyRequest{
    /**文件删除策略ID*/
    @KsYunField(name="FileDeletePolicyId")
    private String FileDeletePolicyId;

    /**文件系统的实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
