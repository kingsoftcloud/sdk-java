package ksyun.client.aicp.deleteskillversion.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSkillVersionRequest
* @Description 请求参数
*/
@Data
public class DeleteSkillVersionRequest{
    /**skill id*/
    @KsYunField(name="SkillId")
    private String SkillId;

    /**skill 版本id*/
    @KsYunField(name="VersionId")
    private String VersionId;

}
