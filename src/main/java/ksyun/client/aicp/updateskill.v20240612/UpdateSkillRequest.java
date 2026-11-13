package ksyun.client.aicp.updateskill.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateSkillRequest
* @Description 请求参数
*/
@Data
public class UpdateSkillRequest{
    /***/
    @KsYunField(name="SkillId")
    private String SkillId;

    /***/
    @KsYunField(name="Name")
    private String Name;

    /***/
    @KsYunField(name="Description")
    private String Description;

}
