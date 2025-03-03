package ksyun.client.kcrs.describeimages.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeImagesRequest
 * @Description 请求参数
 */
@Data
public class DescribeImagesRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间名称，只能包含小写字母、数字、和分隔符（“-”，“.”)，不能以分隔符开头或结尾
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 镜像仓库名称
     */
    @KsYunField(name = "RepoName")
    private String RepoName;

    /**
     * 镜像id，若不输入，则默认查询所选镜像仓库下所有镜像
     */
    @KsYunField(name = "ImageId")
    private String ImageId;

    /**
     * 单次调用所返回的最大实例数目，默认20，最大99
     */
    @KsYunField(name = "MaxResults")
    private String MaxResults;

    /**
     * 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0
     */
    @KsYunField(name = "Marker")
    private String Marker;


}