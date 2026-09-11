package ksyun.client.aicp.addskillstoskillspace.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddSkillsToSkillSpaceRequest
* @Description 请求参数
*/
@Data
public class AddSkillsToSkillSpaceRequest{
    /**skill 空间id*/
    @KsYunField(name="SkillSpaceId")
    private String SkillSpaceId;

    /***/
    @KsYunField(name="Skills")
    private SkillsDto Skills;

    @Data
    @ToString
    public static class SkillsDto {
        /**skill id*/
        @KsYunField(name="SkillId")
        private String SkillId;

        /**skill 版本id*/
        @KsYunField(name="SkillVersionId")
        private String SkillVersionId;

    }

}
