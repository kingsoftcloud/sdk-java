package ksyun.client.aicp.describenotebooks.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeNotebooksRequest
 * @Description 请求参数
 */
@Data
public class DescribeNotebooksRequest {
    /**
     * 开发任务ID
     */
    @KsYunField(name = "NotebookId")
    private List<String> NotebookIdList;

    /**
     * 开发任务名称
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 页数
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 每页查询数目
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 开发任务状态
     */
    @KsYunField(name = "State")
    private String State;

    /**
     * 条件过滤
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 过滤条件 notebook-status
         */
        @KsYunField(name = "Name")
        private String Name;
        /**
         * 值
         */
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

}