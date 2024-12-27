package ksyun.client.kmr.listexecutor.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListExecutorRequest
* @Description 请求参数
*/
@Data
public class ListExecutorRequest{
    /**工作空间ID*/
    @KsYunField(name="WorkspaceId")
    private String WorkspaceId;

    /**作业ID*/
    @KsYunField(name="JobRunId")
    private String JobRunId;

    /**请求页码*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

    /**分页大小*/
    @KsYunField(name="PageSize")
    private Integer PageSize;


}