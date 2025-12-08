package ksyun.client.ked.queryclouddesksubmitshell.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryCloudDesksubmitShellRequest
* @Description 请求参数
*/
@Data
public class QueryCloudDesksubmitShellRequest{
    /***/
    @KsYunField(name="instanceIds",type=2)
    private List<String> InstanceIdsList;

    /***/
    @KsYunField(name="name")
    private String Name;

    /**脚本内容需要base64转下*/
    @KsYunField(name="shellContent")
    private String ShellContent;

}
