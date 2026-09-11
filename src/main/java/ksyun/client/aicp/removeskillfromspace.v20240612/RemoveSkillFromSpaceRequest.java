package ksyun.client.aicp.removeskillfromspace.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveSkillFromSpaceRequest
* @Description 请求参数
*/
@Data
public class RemoveSkillFromSpaceRequest{
    /**skill 空间id*/
    @KsYunField(name="SpaceId")
    private String SpaceId;

    /**skill id*/
    @KsYunField(name="SkillId")
    private String SkillId;

}
