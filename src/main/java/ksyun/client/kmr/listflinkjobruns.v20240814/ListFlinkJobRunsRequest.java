package ksyun.client.kmr.listflinkjobruns.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListFlinkJobRunsRequest
* @Description 请求参数
*/
@Data
public class ListFlinkJobRunsRequest{
    /**工作空间ID*/
    @KsYunField(name="WorkspaceId")
    private String WorkspaceId;

    /**作业名称或者作业ID*/
    @KsYunField(name="NameOrId")
    private String NameOrId;

    /**工作空间状态的过滤条件
默认空展示全部
有效值：
RUNNING：运行中
COMPLETED：完成
INIT：初始化
DELETED：已删除
SUBMITTED：已提交
CREATED_FAILED：创建失败

*/
    @KsYunField(name="Status",type=2)
    private List<String> StatusList;

    /**分页页码*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

    /**分页页大小*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}