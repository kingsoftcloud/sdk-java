package ksyun.client.tidb.listsecuredinstance.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListSecuredInstanceRequest
 * @Description 请求参数
 */
@Data
public class ListSecuredInstanceRequest {
    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 不填表示全部项目，多个id以逗号分隔。
     */
    @KsYunField(name = "ProjectIds")
    private String ProjectIds;

    /**
     * 模糊搜索。支持：实例ID、实例名称、项目名称、VIP。
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
     * 排序字段列表。请注意，格式：col1.asc,col2.desc。
     */
    @KsYunField(name = "OrderBy")
    private String OrderBy;

}