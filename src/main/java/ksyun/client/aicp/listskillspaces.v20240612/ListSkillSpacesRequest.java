package ksyun.client.aicp.listskillspaces.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSkillSpacesRequest
* @Description 请求参数
*/
@Data
public class ListSkillSpacesRequest{
    /**skill 空间id*/
    @KsYunField(name="SkillspaceId")
    private String SkillspaceId;

    /**skill 空间名称*/
    @KsYunField(name="Name")
    private String Name;

    /**页号*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

    /**页大小*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
