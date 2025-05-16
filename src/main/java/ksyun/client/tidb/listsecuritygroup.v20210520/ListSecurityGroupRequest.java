package ksyun.client.tidb.listsecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class ListSecurityGroupRequest {
    /**
     * 模糊查找。支持：安全组名称、安全组描述。
     */
    @KsYunField(name = "FuzzySearch")
    private String FuzzySearch;

    /**
     * 第几页，从0开始。默认为0。
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 每页最大记录数。默认为10。
     */
    @KsYunField(name = "Limit")
    private Integer Limit;

    /**
     * 排序字段。格式：col1.asc,col2.desc。
     */
    @KsYunField(name = "OrderBy")
    private String OrderBy;

}