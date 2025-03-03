package ksyun.client.kmr.listworkspaces.v20240814;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ListWorkspacesRequest
 * @Description 请求参数
 */
@Data
public class ListWorkspacesRequest {
    /**
     * 工作空间名称/ID
     */
    @KsYunField(name = "NameOrId")
    private String NameOrId;

    /**
     * 工作空间状态
     * RUNNING：运行中
     * TERMINATED：已删除
     * FREEZE：冻结中
     */
    @KsYunField(name = "Status", type = 2)
    private List<String> StatusList;

    /**
     * 分页页码
     */
    @KsYunField(name = "PageNumber")
    private Integer PageNumber;

    /**
     * 分页大小
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}