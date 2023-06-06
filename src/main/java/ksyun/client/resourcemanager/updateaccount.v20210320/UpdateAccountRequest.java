package ksyun.client.resourcemanager.updateaccount.v20210320;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateAccountRequest
* @Description 请求参数
*/
@Data
public class UpdateAccountRequest{
    /**成员UID*/
    @KsYunField(name="MemberId")
    private Integer MemberId;

    /**修改的展示名称*/
    @KsYunField(name="NewDisplayName")
    private String NewDisplayName;

    /**修改的资源夹id*/
    @KsYunField(name="FolderId")
    private String FolderId;


}