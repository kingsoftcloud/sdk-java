package ksyun.client.kmr.describemetriclist.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMetricListRequest
* @Description 请求参数
*/
@Data
public class DescribeMetricListRequest{
    /**工作空间ID*/
    @KsYunField(name="WorkspaceId")
    private String WorkspaceId;

    /**作业类型：flink，spark，ray*/
    @KsYunField(name="ProductType")
    private String ProductType;

}