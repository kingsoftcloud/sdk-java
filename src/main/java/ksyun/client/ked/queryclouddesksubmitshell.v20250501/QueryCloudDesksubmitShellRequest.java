package ksyun.client.ked.queryclouddesksubmitshell.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname QueryCloudDesksubmitShellRequest
 * @Description 请求参数
 */
@Data
public class QueryCloudDesksubmitShellRequest {
    /***/
    @KsYunField(name = "instanceIds", type = 2)
    private List<String> InstanceIdsList;

    /***/
    @KsYunField(name = "name")
    private String Name;

    /***/
    @KsYunField(name = "shellContent")
    private String ShellContent;


}