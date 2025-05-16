package ksyun.client.kmr.detailworkspace.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DetailWorkspaceRequest
 * @Description 请求参数
 */
@Data
public class DetailWorkspaceRequest {
    /**
     * 工作空间ID
     */
    @KsYunField(name = "WorkspaceId")
    private String WorkspaceId;

}