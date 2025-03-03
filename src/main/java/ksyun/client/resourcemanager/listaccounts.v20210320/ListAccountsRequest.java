package ksyun.client.resourcemanager.listaccounts.v20210320;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListAccountsRequest
 * @Description 请求参数
 */
@Data
public class ListAccountsRequest {
    /**
     * 页码，默认第一页
     */
    @KsYunField(name = "PageNumber")
    private Integer PageNumber;

    /**
     * 每页展示多少条，默认10条
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * 是否查询所有成员账号，1-是 0否；
     * 如传1，PageNumber和PageSize无效
     */
    @KsYunField(name = "IsAll")
    private Integer IsAll;

}