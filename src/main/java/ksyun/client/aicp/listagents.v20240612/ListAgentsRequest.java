package ksyun.client.aicp.listagents.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListAgentsRequest
* @Description 请求参数
*/
@Data
public class ListAgentsRequest{
    /***/
    @KsYunField(name="Page")
    private Integer Page;

    /***/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /***/
    @KsYunField(name="Name")
    private String Name;

    /***/
    @KsYunField(name="Id")
    private String Id;

    /***/
    @KsYunField(name="Status")
    private String Status;

    /***/
    @KsYunField(name="Framework")
    private String Framework;

}
