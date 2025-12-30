package ksyun.client.kec.modifyaccessgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAccessGroupRequest
* @Description 请求参数
*/
@Data
public class ModifyAccessGroupRequest{
    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**权限组名称
限制：
• 长度为 3~64 个字符
• 同一区域的权限组参数名称不可重复
• 必须以大小写字母开头，可以包含英文字母、数字、下划线（_）或者短划线（-）*/
    @KsYunField(name="AccessGroupName")
    private String AccessGroupName;

    /**权限组描述
限制：
• 长度为 0~128个英文或中文字符
• 必须以大小字母或中文开头，不可包含http://和https://
• 可以包含数字、半角冒号（:）、下划线（_）或者短划号（-）*/
    @KsYunField(name="Description")
    private String Description;

}
