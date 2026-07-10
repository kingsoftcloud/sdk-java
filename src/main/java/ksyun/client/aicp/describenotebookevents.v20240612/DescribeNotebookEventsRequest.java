package ksyun.client.aicp.describenotebookevents.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNotebookEventsRequest
* @Description 请求参数
*/
@Data
public class DescribeNotebookEventsRequest{
    /**开发任务ID*/
    @KsYunField(name="NotebookId")
    private String NotebookId;

    /**排序字段，默认DESC
- DESC 倒序
- ASC 正序*/
    @KsYunField(name="Sort")
    private String Sort;

    /**排序字段，默认 LastSeen
- LastSeen 最后出现时间
- FirstSeen 首次出现时间*/
    @KsYunField(name="SortKey")
    private String SortKey;

}
