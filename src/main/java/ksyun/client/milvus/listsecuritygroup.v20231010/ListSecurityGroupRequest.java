package ksyun.client.milvus.listsecuritygroup.v20231010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class ListSecurityGroupRequest {
    /**
     * 起始页，默认为0
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 每页返回的条数
     */
    @KsYunField(name = "Limit")
    private Integer Limit;

}