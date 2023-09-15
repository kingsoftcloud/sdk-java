package ksyun.client.resourcemanager.listaccountsforparent.v20210320;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListAccountsForParentRequest
* @Description 请求参数
*/
@Data
public class ListAccountsForParentRequest{
    /**资源夹ID*/
    @KsYunField(name="FolderId")
    private String FolderId;

    /**搜索成员名称/账号ID/用户名*/
    @KsYunField(name="Search")
    private String Search;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页显示条数*/
    @KsYunField(name="PageSize")
    private Integer PageSize;


}