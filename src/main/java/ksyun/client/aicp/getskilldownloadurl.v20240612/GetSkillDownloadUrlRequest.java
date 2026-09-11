package ksyun.client.aicp.getskilldownloadurl.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetSkillDownloadUrlRequest
* @Description 请求参数
*/
@Data
public class GetSkillDownloadUrlRequest{
    /**skill 的id*/
    @KsYunField(name="SkillId")
    private String SkillId;

    /**skill 版本的id*/
    @KsYunField(name="VersionId")
    private String VersionId;

}
