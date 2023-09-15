package ksyun.client.kcrs.describeimagescan.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeImageScanRequest
* @Description 请求参数
*/
@Data
public class DescribeImageScanRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**镜像仓库名称*/
    @KsYunField(name="RepoName")
    private String RepoName;

    /**镜像id*/
    @KsYunField(name="ImageId")
    private String ImageId;


}