package ksyun.client.resourcemanager.moveaccount.v20210320;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname MoveAccountRequest
* @Description 请求参数
*/
@Data
public class MoveAccountRequest{
    /**成员uid，多个英文逗号分隔*/
    @KsYunField(name="Ids")
    private String Ids;

    /**当前所在资源夹ID*/
    @KsYunField(name="FromFolderId")
    private String FromFolderId;

    /**移动目标资源夹ID*/
    @KsYunField(name="ToFolderId")
    private String ToFolderId;


}