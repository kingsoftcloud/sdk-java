package ksyun.client.aicp.deleteskill.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSkillRequest
* @Description 请求参数
*/
@Data
public class DeleteSkillRequest{
    /**skill id*/
    @KsYunField(name="SkillId")
    private String SkillId;

}
