package ksyun.client.kcrs.describerepository.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeRepositoryRequest
 * @Description 请求参数
 */
@Data
public class DescribeRepositoryRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间名称
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 镜像仓库名称，若不输入，则默认查询所选命名空间下所有镜像仓库
     */
    @KsYunField(name = "RepoName")
    private List<String> RepoNameList;

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