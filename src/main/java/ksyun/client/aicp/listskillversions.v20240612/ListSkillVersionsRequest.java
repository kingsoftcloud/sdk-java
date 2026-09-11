package ksyun.client.aicp.listskillversions.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSkillVersionsRequest
* @Description 请求参数
*/
@Data
public class ListSkillVersionsRequest{
    /**skill 名称*/
    @KsYunField(name="SkillId")
    private String SkillId;

    /**页号*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

    /**页大小*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
