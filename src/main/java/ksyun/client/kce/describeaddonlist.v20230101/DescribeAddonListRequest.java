package ksyun.client.kce.describeaddonlist.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeAddonListRequest
 * @Description 请求参数
 */
@Data
public class DescribeAddonListRequest {
    /**
     * 插件名称
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 分页参数，每页最大数
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 游标起始位置
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

}