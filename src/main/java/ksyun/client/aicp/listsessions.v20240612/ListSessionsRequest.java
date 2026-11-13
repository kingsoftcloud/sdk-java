package ksyun.client.aicp.listsessions.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSessionsRequest
* @Description 请求参数
*/
@Data
public class ListSessionsRequest{
    /***/
    @KsYunField(name="TagFilters")
    private TagFiltersDto TagFilters;

    @Data
    @ToString
    public static class TagFiltersDto {
        /***/
        @KsYunField(name="key")
        private String Key;

    }

    /***/
    @KsYunField(name="TagMatch")
    private String TagMatch;

    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="Page")
    private Integer Page;

    /***/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
