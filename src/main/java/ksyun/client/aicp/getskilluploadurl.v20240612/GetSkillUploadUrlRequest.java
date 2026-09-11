package ksyun.client.aicp.getskilluploadurl.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetSkillUploadUrlRequest
* @Description 请求参数
*/
@Data
public class GetSkillUploadUrlRequest{
    /**skill压缩包的文件名称*/
    @KsYunField(name="FileName")
    private String FileName;

    /**skill 名称*/
    @KsYunField(name="SkillName")
    private String SkillName;

}
