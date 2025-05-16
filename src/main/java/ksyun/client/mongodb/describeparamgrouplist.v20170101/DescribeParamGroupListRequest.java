package ksyun.client.mongodb.describeparamgrouplist.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeParamGroupListRequest
 * @Description 请求参数
 */
@Data
public class DescribeParamGroupListRequest {
    /**
     * 实例版本
     */
    @KsYunField(name = "DbVersion")
    private String DbVersion;

    /**
     * 按名称筛选
     */
    @KsYunField(name = "NameSearch")
    private String NameSearch;

    /**
     * 偏移量
     */
    @KsYunField(name = "Offset")
    private String Offset;

    /**
     * 返回最大数据量
     */
    @KsYunField(name = "Limit")
    private String Limit;

}